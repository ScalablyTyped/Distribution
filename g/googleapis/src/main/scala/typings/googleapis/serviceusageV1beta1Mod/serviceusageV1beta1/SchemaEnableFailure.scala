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
  def apply(errorMessage: String = null, serviceId: String = null): SchemaEnableFailure = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnableFailure]
  }
}

