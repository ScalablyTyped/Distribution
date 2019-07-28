package typings.atJupyterlabCoreutils.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "DefaultSchemaValidator")
@js.native
/**
  * Instantiate a schema validator.
  */
class DefaultSchemaValidator () extends ISchemaValidator {
  /**
    * Add a schema to the validator.
    *
    * @param plugin - The plugin ID.
    *
    * @param schema - The schema being added.
    *
    * @return A list of errors if the schema fails to validate or `null` if there
    * are no errors.
    *
    * #### Notes
    * It is safe to call this function multiple times with the same plugin name.
    */
  var _addSchema: js.Any = js.native
  var _composer: js.Any = js.native
  var _validator: js.Any = js.native
}

