package typings.jupyterlabCoreutils.mod

import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.IProperty
import typings.jupyterlabCoreutils.tokensMod.ISettingRegistry.ISchema
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Private")
@js.native
object Private extends js.Object {
  /**
    * Returns an annotated (JSON with comments) version of a schema's defaults.
    */
  def annotatedDefaults(schema: ISchema, plugin: String): String = js.native
  /**
    * Returns an annotated (JSON with comments) version of a plugin's
    * setting data.
    */
  def annotatedPlugin(plugin: IPlugin, data: JSONObject): String = js.native
  /**
    * Create a fully extrapolated default value for a root key in a schema.
    */
  def reifyDefault(schema: IProperty): js.UndefOr[JSONValue] = js.native
  def reifyDefault(schema: IProperty, root: String): js.UndefOr[JSONValue] = js.native
}

