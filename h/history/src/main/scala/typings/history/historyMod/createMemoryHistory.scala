package typings.history.historyMod

import typings.history.createMemoryHistoryMod.MemoryHistory
import typings.history.createMemoryHistoryMod.MemoryHistoryBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("history", "createMemoryHistory")
@js.native
object createMemoryHistory extends js.Object {
  def apply[S](): MemoryHistory[S] = js.native
  def apply[S](options: MemoryHistoryBuildOptions): MemoryHistory[S] = js.native
}

