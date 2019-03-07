package typings
package html5DashHistoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html5-history", JSImport.Namespace)
@js.native
object html5DashHistoryMod extends js.Object {
  def getCurrentIndex(): scala.Double = js.native
  def getHash(doc: js.Any): js.Any = js.native
  def getState(): js.Any = js.native
  def getState(friendly: js.Any): js.Any = js.native
  def getState(friendly: js.Any, create: js.Any): js.Any = js.native
  def getStateByIndex(index: scala.Double): js.Any = js.native
  def init(): scala.Boolean = js.native
  def init(options: js.Any): scala.Boolean = js.native
  def normalizeHash(hash: js.Any): js.Any = js.native
  def setHash(hash: js.Any, queue: js.Any): scala.Boolean = js.native
  def unescapeHash(hash: js.Any): js.Any = js.native
}

