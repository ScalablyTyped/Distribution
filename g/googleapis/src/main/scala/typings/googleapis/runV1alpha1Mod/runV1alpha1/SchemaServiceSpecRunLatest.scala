package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceSpecRunLatest contains the options for always having a route to the
  * latest configuration. See ServiceSpec for more details.
  */
@js.native
trait SchemaServiceSpecRunLatest extends js.Object {
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
}

object SchemaServiceSpecRunLatest {
  @scala.inline
  def apply(configuration: SchemaConfigurationSpec = null): SchemaServiceSpecRunLatest = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceSpecRunLatest]
  }
}

