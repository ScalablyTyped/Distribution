package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistry

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

/**
  * A namespace for plugin functionality.
  */
@JSImport("@jupyterlab/coreutils/lib/tokens", "ISettingRegistry.IPlugin")
@js.native
object IPlugin extends js.Object {
  /**
    * The phases during which a transformation may be applied to a plugin.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.compose
    - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.fetch
  */
  trait Phase extends js.Object
  
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[/* plugin */ IPlugin, IPlugin]
}

