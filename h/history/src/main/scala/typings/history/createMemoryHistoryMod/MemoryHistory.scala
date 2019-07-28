package typings.history.createMemoryHistoryMod

import typings.history.historyMod.History
import typings.history.historyMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryHistory[HistoryLocationState] extends History[HistoryLocationState] {
  var entries: js.Array[Location[HistoryLocationState]] = js.native
  var index: Double = js.native
  def canGo(n: Double): Boolean = js.native
}

