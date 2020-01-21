package typings.history.mod

import typings.history.createBrowserHistoryMod.BrowserHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", "createBrowserHistory")
@js.native
object createBrowserHistory extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

