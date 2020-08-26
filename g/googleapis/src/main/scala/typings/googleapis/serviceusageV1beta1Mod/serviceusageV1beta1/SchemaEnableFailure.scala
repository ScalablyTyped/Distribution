package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides error messages for the failing services.
  */
@js.native
trait SchemaEnableFailure extends js.Object {
  /**
    * An error message describing why the service could not be enabled.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The service id of a service that could not be enabled.
    */
  var serviceId: js.UndefOr[String] = js.native
}

object SchemaEnableFailure {
  @scala.inline
  def apply(): SchemaEnableFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableFailure]
  }
  @scala.inline
  implicit class SchemaEnableFailureOps[Self <: SchemaEnableFailure] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
  
}

