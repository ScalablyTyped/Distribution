package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The settings for a specific plugin.
  */
trait IPlugin extends JSONObject {
  /**
    * The collection of values for a specified plugin.
    */
  var data: ISettingBundle
  /**
    * The name of the plugin.
    */
  var id: String
  /**
    * The raw user settings data as a string containing JSON with comments.
    */
  var raw: String
  /**
    * The JSON schema for the plugin.
    */
  var schema: ISchema
  /**
    * The published version of the NPM package containing the plugin.
    */
  var version: String
}

object IPlugin {
  @scala.inline
  def apply(data: ISettingBundle, id: String, raw: String, schema: ISchema, version: String): IPlugin = {
    val __obj = js.Dynamic.literal(data = data, id = id, raw = raw, schema = schema, version = version)
  
    __obj.asInstanceOf[IPlugin]
  }
}

