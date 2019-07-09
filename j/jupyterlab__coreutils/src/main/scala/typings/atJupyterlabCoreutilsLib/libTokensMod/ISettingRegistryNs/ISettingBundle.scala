package typings
package atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setting values for a plugin.
  */
trait ISettingBundle
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * A composite of the user setting values and the plugin schema defaults.
    *
    * #### Notes
    * The `composite` values will always be a superset of the `user` values.
    */
  var composite: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  /**
    * The user setting values.
    */
  var user: atPhosphorCoreutilsLib.libJsonMod.JSONObject
}

object ISettingBundle {
  @scala.inline
  def apply(
    composite: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    user: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): ISettingBundle = {
    val __obj = js.Dynamic.literal(composite = composite, user = user)
  
    __obj.asInstanceOf[ISettingBundle]
  }
}

