package typings.linq.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGrouping[TKey, TElement] extends IEnumerable[TElement] {
  def getSource(): js.Array[TElement] = js.native
  def key(): TKey = js.native
}

