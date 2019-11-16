package typings.atKeystonejsListDashPlugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atKeystonejsListDashPluginsMod {
  import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.Plugin

  type AtTrackingPluginProvider = js.Function1[/* options */ js.UndefOr[AtTrackingOptions], Plugin]
  type ByTrackingPluginProvider = js.Function1[/* options */ js.UndefOr[ByTrackingOptions], Plugin]
}
