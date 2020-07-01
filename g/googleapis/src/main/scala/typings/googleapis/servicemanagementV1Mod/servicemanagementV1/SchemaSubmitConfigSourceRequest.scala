package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for SubmitConfigSource method.
  */
@js.native
trait SchemaSubmitConfigSourceRequest extends js.Object {
  /**
    * The source configuration for the service.
    */
  var configSource: js.UndefOr[SchemaConfigSource] = js.native
  /**
    * Optional. If set, this will result in the generation of a
    * `google.api.Service` configuration based on the `ConfigSource` provided,
    * but the generated config and the sources will NOT be persisted.
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}

object SchemaSubmitConfigSourceRequest {
  @scala.inline
  def apply(configSource: SchemaConfigSource = null, validateOnly: js.UndefOr[Boolean] = js.undefined): SchemaSubmitConfigSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (configSource != null) __obj.updateDynamic("configSource")(configSource.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubmitConfigSourceRequest]
  }
}

