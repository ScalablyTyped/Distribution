package typings.history.createBrowserHistoryMod

import typings.history.mod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("history/createBrowserHistory", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[S](): History[S] = js.native
  def apply[S](options: BrowserHistoryBuildOptions): History[S] = js.native
}

