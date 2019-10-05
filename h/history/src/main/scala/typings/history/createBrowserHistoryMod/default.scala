package typings.history.createBrowserHistoryMod

import typings.history.historyMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history/createBrowserHistory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

