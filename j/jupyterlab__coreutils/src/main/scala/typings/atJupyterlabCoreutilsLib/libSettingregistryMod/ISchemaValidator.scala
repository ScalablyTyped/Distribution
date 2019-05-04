package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISchemaValidator extends js.Object {
  /**
    * Validate a plugin's schema and user data; populate the `composite` data.
    *
    * @param plugin - The plugin being validated. Its `composite` data will be
    * populated by reference.
    *
    * @param populate - Whether plugin data should be populated, defaults to
    * `true`.
    *
    * @return A list of errors if either the schema or data fail to validate or
    * `null` if there are no errors.
    */
  def validateData(plugin: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin): js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs.IError] | scala.Null = js.native
  def validateData(
    plugin: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin,
    populate: scala.Boolean
  ): js.Array[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidatorNs.IError] | scala.Null = js.native
}

