package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `DisableService` method.
  */
@js.native
trait SchemaDisableServiceRequest extends js.Object {
  /**
    * Indicates if services that are enabled and which depend on this service
    * should also be disabled. If not set, an error will be generated if any
    * enabled services depend on the service to be disabled. When set, the
    * service, and any enabled services that depend on it, will be disabled
    * together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.native
}

object SchemaDisableServiceRequest {
  @scala.inline
  def apply(): SchemaDisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisableServiceRequest]
  }
  @scala.inline
  implicit class SchemaDisableServiceRequestOps[Self <: SchemaDisableServiceRequest] (val x: Self) extends AnyVal {
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
    def setDisableDependentServices(value: Boolean): Self = this.set("disableDependentServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDependentServices: Self = this.set("disableDependentServices", js.undefined)
  }
  
}

