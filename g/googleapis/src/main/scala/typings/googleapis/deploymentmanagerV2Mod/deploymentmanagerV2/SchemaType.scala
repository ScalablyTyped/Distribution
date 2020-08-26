package typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource type supported by Deployment Manager.
  */
@js.native
trait SchemaType extends js.Object {
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Name of the type.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The Operation that most recently ran, or is currently
    * running, on this type.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
  /**
    * Output only. Server defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaType {
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  @scala.inline
  implicit class SchemaTypeOps[Self <: SchemaType] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOperation(value: SchemaOperation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperation: Self = this.set("operation", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

