package typings
package atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPluginNs {
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[
    /* plugin */ atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin, 
    atJupyterlabCoreutilsLib.libTokensMod.ISettingRegistryNs.IPlugin
  ]
}
