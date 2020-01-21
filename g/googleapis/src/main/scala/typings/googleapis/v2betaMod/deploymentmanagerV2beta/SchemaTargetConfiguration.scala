package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetConfiguration extends js.Object {
  /**
    * The configuration to use for this deployment.
    */
  var config: js.UndefOr[SchemaConfigFile] = js.native
  /**
    * Specifies any files to import for this configuration. This can be used to
    * import templates or other files. For example, you might import a text
    * file in order to use the file in a template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.native
}

object SchemaTargetConfiguration {
  @scala.inline
  def apply(config: SchemaConfigFile = null, imports: js.Array[SchemaImportFile] = null): SchemaTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetConfiguration]
  }
}

