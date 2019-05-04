package typings
package atJupyterlabCoreutilsLib.atJupyterlabCoreutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils", "Private")
@js.native
object PrivateNs extends js.Object {
  /**
    * The schema for settings.
    */
  val SCHEMA: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema = js.native
  /**
    * Returns an annotated (JSON with comments) version of a schema's defaults.
    */
  def annotatedDefaults(
    schema: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema,
    plugin: java.lang.String
  ): java.lang.String = js.native
  /**
    * Returns an annotated (JSON with comments) version of a plugin's
    * setting data.
    */
  def annotatedPlugin(
    plugin: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.IPlugin,
    data: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): java.lang.String = js.native
  /**
    * Create a fully extrapolated default value for a root key in a schema.
    */
  def reifyDefault(schema: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
  def reifyDefault(
    schema: atJupyterlabCoreutilsLib.libSettingregistryMod.ISettingRegistryNs.ISchema,
    root: java.lang.String
  ): js.UndefOr[atPhosphorCoreutilsLib.libJsonMod.JSONValue] = js.native
}

