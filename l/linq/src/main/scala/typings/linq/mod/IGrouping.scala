package typings.linq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGrouping[TKey, TElement] extends IEnumerable[TElement] {
  
  def getSource(): js.Array[TElement] = js.native
  
  def key(): TKey = js.native
}
