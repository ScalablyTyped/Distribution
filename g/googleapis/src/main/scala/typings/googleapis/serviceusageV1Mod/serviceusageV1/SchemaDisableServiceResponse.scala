package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `DisableService` method. This response message is
  * assigned to the `response` field of the returned Operation when that
  * operation is done.
  */
@js.native
trait SchemaDisableServiceResponse extends js.Object {
  /**
    * The new state of the service after disabling.
    */
  var service: js.UndefOr[SchemaGoogleApiServiceusageV1Service] = js.native
}

object SchemaDisableServiceResponse {
  @scala.inline
  def apply(): SchemaDisableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceResponse]
  }
  @scala.inline
  implicit class SchemaDisableServiceResponseOps[Self <: SchemaDisableServiceResponse] (val x: Self) extends AnyVal {
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
    def setService(value: SchemaGoogleApiServiceusageV1Service): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

