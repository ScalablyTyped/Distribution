package typings.jestCore

import typings.jestTypes.configMod.GlobalConfig
import typings.jestWatcher.typesMod.UsageData
import typings.jestWatcher.typesMod.WatchPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/watch_plugins_helpers", JSImport.Namespace)
@js.native
object watchPluginsHelpersMod extends js.Object {
  def filterInteractivePlugins(watchPlugins: js.Array[WatchPlugin], globalConfig: GlobalConfig): js.Array[WatchPlugin] = js.native
  def getSortedUsageRows(watchPlugins: js.Array[WatchPlugin], globalConfig: GlobalConfig): js.Array[UsageData] = js.native
}

