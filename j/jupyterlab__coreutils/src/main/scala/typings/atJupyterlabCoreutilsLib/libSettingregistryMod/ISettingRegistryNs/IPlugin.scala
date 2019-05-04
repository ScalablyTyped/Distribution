package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The settings for a specific plugin.
  */
trait IPlugin
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The collection of values for a specified setting.
    */
  var data: ISettingBundle
  /**
    * The name of the plugin.
    */
  var id: java.lang.String
  /**
    * The raw user settings data as a string containing JSON with comments.
    */
  var raw: java.lang.String
  /**
    * The JSON schema for the plugin.
    */
  var schema: ISchema
}

object IPlugin {
  @scala.inline
  def apply(data: ISettingBundle, id: java.lang.String, raw: java.lang.String, schema: ISchema): IPlugin = {
    val __obj = js.Dynamic.literal(data = data, id = id, raw = raw, schema = schema)
  
    __obj.asInstanceOf[IPlugin]
  }
}

