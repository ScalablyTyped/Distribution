package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response containing a list of auditable services for a resource.
  */
@js.native
trait SchemaQueryAuditableServicesResponse extends js.Object {
  /**
    * The auditable services for a resource.
    */
  var services: js.UndefOr[js.Array[SchemaAuditableService]] = js.native
}

object SchemaQueryAuditableServicesResponse {
  @scala.inline
  def apply(): SchemaQueryAuditableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAuditableServicesResponse]
  }
  @scala.inline
  implicit class SchemaQueryAuditableServicesResponseOps[Self <: SchemaQueryAuditableServicesResponse] (val x: Self) extends AnyVal {
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
    def setServicesVarargs(value: SchemaAuditableService*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[SchemaAuditableService]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

