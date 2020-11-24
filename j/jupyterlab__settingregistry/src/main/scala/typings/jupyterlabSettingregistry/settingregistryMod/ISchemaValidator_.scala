package typings.jupyterlabSettingregistry.settingregistryMod

import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator.IError
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISchemaValidator_ extends js.Object {
  
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
  def validateData(plugin: IPlugin): js.Array[IError] | Null = js.native
  def validateData(plugin: IPlugin, populate: Boolean): js.Array[IError] | Null = js.native
}
