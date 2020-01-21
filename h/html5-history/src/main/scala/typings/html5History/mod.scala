package typings.html5History

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html5-history", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCurrentIndex(): Double = js.native
  def getHash(doc: js.Any): js.Any = js.native
  def getState(): js.Any = js.native
  def getState(friendly: js.Any): js.Any = js.native
  def getState(friendly: js.Any, create: js.Any): js.Any = js.native
  def getStateByIndex(index: Double): js.Any = js.native
  def init(): Boolean = js.native
  def init(options: js.Any): Boolean = js.native
  def normalizeHash(hash: js.Any): js.Any = js.native
  def setHash(hash: js.Any, queue: js.Any): Boolean = js.native
  def unescapeHash(hash: js.Any): js.Any = js.native
}

