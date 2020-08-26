package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `BatchEnableServices` method.
  */
@js.native
trait SchemaBatchEnableServicesRequest extends js.Object {
  /**
    * The identifiers of the services to enable on the project.  A valid
    * identifier would be: serviceusage.googleapis.com  Enabling services
    * requires that each service is public or is shared with the user enabling
    * the service.  Two or more services must be specified. To enable a single
    * service, use the `EnableService` method instead.  A single request can
    * enable a maximum of 20 services at a time. If more than 20 services are
    * specified, the request will fail, and no state changes will occur.
    */
  var serviceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchEnableServicesRequest {
  @scala.inline
  def apply(): SchemaBatchEnableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchEnableServicesRequest]
  }
  @scala.inline
  implicit class SchemaBatchEnableServicesRequestOps[Self <: SchemaBatchEnableServicesRequest] (val x: Self) extends AnyVal {
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
    def setServiceIdsVarargs(value: String*): Self = this.set("serviceIds", js.Array(value :_*))
    @scala.inline
    def setServiceIds(value: js.Array[String]): Self = this.set("serviceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceIds: Self = this.set("serviceIds", js.undefined)
  }
  
}

