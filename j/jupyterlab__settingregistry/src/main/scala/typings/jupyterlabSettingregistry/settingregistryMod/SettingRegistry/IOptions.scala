package typings.jupyterlabSettingregistry.settingregistryMod.SettingRegistry

import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a setting registry
  */
trait IOptions extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  var connector: IDataConnector[IPlugin, String, String, String]
  /**
    * Preloaded plugin data to populate the setting registry.
    */
  var plugins: js.UndefOr[js.Array[IPlugin]] = js.undefined
  /**
    * The number of milliseconds before a `load()` call to the registry waits
    * before timing out if it requires a transformation that has not been
    * registered.
    *
    * #### Notes
    * The default value is 7000.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * The validator used to enforce the settings JSON schema.
    */
  var validator: js.UndefOr[ISchemaValidator] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    connector: IDataConnector[IPlugin, String, String, String],
    plugins: js.Array[IPlugin] = null,
    timeout: js.UndefOr[Double] = js.undefined,
    validator: ISchemaValidator = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

