package typings.keystonejsListPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AtTrackingPluginProvider = js.Function1[
    /* options */ js.UndefOr[typings.keystonejsListPlugins.mod.AtTrackingOptions], 
    typings.keystonejsKeystone.mod.Plugin
  ]
  type ByTrackingPluginProvider = js.Function1[
    /* options */ js.UndefOr[typings.keystonejsListPlugins.mod.ByTrackingOptions], 
    typings.keystonejsKeystone.mod.Plugin
  ]
}
