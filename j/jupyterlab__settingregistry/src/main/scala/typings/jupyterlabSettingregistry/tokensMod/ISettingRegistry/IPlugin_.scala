package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The settings for a specific plugin.
  */
trait IPlugin_ extends PartialJSONObject {
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

object IPlugin_ {
  @scala.inline
  def apply(data: ISettingBundle, id: String, raw: String, schema: ISchema, version: String): IPlugin_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin_]
  }
}

