package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to create a tenancy unit for a service consumer of a managed
  * service.
  */
@js.native
trait SchemaCreateTenancyUnitRequest extends js.Object {
  
  /**
    * Optional service producer-provided identifier of the tenancy unit. Must
    * be no longer than 40 characters and preferably URI friendly. If it
    * isn&#39;t provided, a UID for the tenancy unit is automatically
    * generated. The identifier must be unique across a managed service. If the
    * tenancy unit already exists for the managed service and service consumer
    * pair, calling `CreateTenancyUnit` returns the existing tenancy unit if
    * the provided identifier is identical or empty, otherwise the call fails.
    */
  var tenancyUnitId: js.UndefOr[String] = js.native
}
object SchemaCreateTenancyUnitRequest {
  
  @scala.inline
  def apply(): SchemaCreateTenancyUnitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTenancyUnitRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateTenancyUnitRequestOps[Self <: SchemaCreateTenancyUnitRequest] (val x: Self) extends AnyVal {
    
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
    def setTenancyUnitId(value: String): Self = this.set("tenancyUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancyUnitId: Self = this.set("tenancyUnitId", js.undefined)
  }
}
