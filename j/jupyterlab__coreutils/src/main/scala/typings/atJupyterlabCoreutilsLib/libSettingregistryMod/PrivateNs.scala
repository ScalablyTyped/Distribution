package typings
package atJupyterlabCoreutilsLib.libSettingregistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/settingregistry", "Private")
@js.native
object PrivateNs extends js.Object {
  /**
    * Returns an annotated (JSON with comments) version of a schema's defaults.
    */
  def annotatedDefaults(schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.ISchema, plugin: java.lang.String): java.lang.String = js.native
  /**
    * Returns an annotated (JSON with comments) version of a plugin's
    * setting data.
    */
  def annotatedPlugin(
    plugin: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin,
    data: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): java.lang.String = js.native
  /**
    * Create a fully extrapolated default value for a root key in a schema.
    */
  def reifyDefault(schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IProperty): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
  def reifyDefault(schema: atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IProperty, root: java.lang.String): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
}

