package typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IPluginNs {
  import typings.atJupyterlabCoreutils.libTokensMod.ISettingRegistryNs.IPlugin

  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[/* plugin */ IPlugin, IPlugin]
}
