package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for UndeleteService method.
  */
@js.native
trait SchemaUndeleteServiceResponse extends js.Object {
  /**
    * Revived service resource.
    */
  var service: js.UndefOr[SchemaManagedService] = js.native
}

object SchemaUndeleteServiceResponse {
  @scala.inline
  def apply(): SchemaUndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceResponse]
  }
  @scala.inline
  implicit class SchemaUndeleteServiceResponseOps[Self <: SchemaUndeleteServiceResponse] (val x: Self) extends AnyVal {
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
    def setService(value: SchemaManagedService): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

