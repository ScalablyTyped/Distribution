package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs

import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs.IPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPluginNs {
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[/* plugin */ IPlugin, IPlugin]
}
