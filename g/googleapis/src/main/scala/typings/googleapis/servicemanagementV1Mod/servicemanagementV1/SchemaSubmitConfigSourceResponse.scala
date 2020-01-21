package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for SubmitConfigSource method.
  */
@js.native
trait SchemaSubmitConfigSourceResponse extends js.Object {
  /**
    * The generated service configuration.
    */
  var serviceConfig: js.UndefOr[SchemaService] = js.native
}

object SchemaSubmitConfigSourceResponse {
  @scala.inline
  def apply(serviceConfig: SchemaService = null): SchemaSubmitConfigSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceConfig != null) __obj.updateDynamic("serviceConfig")(serviceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubmitConfigSourceResponse]
  }
}

