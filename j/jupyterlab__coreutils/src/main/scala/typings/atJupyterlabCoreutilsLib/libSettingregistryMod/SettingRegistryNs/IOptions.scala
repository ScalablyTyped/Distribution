package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.SettingRegistryNs

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
  var connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
    atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin, 
    java.lang.String, 
    java.lang.String
  ]
  /**
    * The validator used to enforce the settings JSON schema.
    */
  var validator: js.UndefOr[atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidator] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    connector: atJupyterlabCoreutilsLib.libInterfacesMod.IDataConnector[
      atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin, 
      java.lang.String, 
      java.lang.String
    ],
    validator: atJupyterlabCoreutilsLib.libSettingregistryMod.ISchemaValidator = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(connector = connector)
    if (validator != null) __obj.updateDynamic("validator")(validator)
    __obj.asInstanceOf[IOptions]
  }
}

