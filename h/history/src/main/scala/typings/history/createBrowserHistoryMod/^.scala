package typings.history.createBrowserHistoryMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/createBrowserHistory", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default(): History[LocationState] = js.native
  def default(options: BrowserHistoryBuildOptions): History[LocationState] = js.native
}

