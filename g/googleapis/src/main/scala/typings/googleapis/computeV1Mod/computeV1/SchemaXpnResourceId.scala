package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service resource (a.k.a service project) ID.
  */
@js.native
trait SchemaXpnResourceId extends js.Object {
  /**
    * The ID of the service resource. In the case of projects, this field
    * supports project id (e.g., my-project-123) and project number (e.g.
    * 12345678).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of the service resource.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaXpnResourceId {
  @scala.inline
  def apply(): SchemaXpnResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXpnResourceId]
  }
  @scala.inline
  implicit class SchemaXpnResourceIdOps[Self <: SchemaXpnResourceId] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

