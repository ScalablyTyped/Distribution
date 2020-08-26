package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deployment Manager will call these methods during the events of
  * creation/deletion/update/get/setIamPolicy
  */
@js.native
trait SchemaMethodMap extends js.Object {
  /**
    * The action identifier for the create method to be used for this
    * collection
    */
  var create: js.UndefOr[String] = js.native
  /**
    * The action identifier for the delete method to be used for this
    * collection
    */
  var delete: js.UndefOr[String] = js.native
  /**
    * The action identifier for the get method to be used for this collection
    */
  var get: js.UndefOr[String] = js.native
  /**
    * The action identifier for the setIamPolicy method to be used for this
    * collection
    */
  var setIamPolicy: js.UndefOr[String] = js.native
  /**
    * The action identifier for the update method to be used for this
    * collection
    */
  var update: js.UndefOr[String] = js.native
}

object SchemaMethodMap {
  @scala.inline
  def apply(): SchemaMethodMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMethodMap]
  }
  @scala.inline
  implicit class SchemaMethodMapOps[Self <: SchemaMethodMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: String): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setSetIamPolicy(value: String): Self = this.set("setIamPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetIamPolicy: Self = this.set("setIamPolicy", js.undefined)
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

