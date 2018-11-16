package typings
package historyLib.createMemoryHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryHistory[HistoryLocationState]
  extends historyLib.historyMod.History[HistoryLocationState] {
  var entries: js.Array[historyLib.historyMod.Location[HistoryLocationState]] = js.native
  var index: scala.Double = js.native
  def canGo(n: scala.Double): scala.Boolean = js.native
}

