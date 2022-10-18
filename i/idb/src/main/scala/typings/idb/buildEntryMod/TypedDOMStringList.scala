package typings.idb.buildEntryMod

import typings.std.DOMStringList
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedDOMStringList[T /* <: String */]
  extends StObject
     with DOMStringList {
  
  def contains(string: T): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator_TypedDOMStringList: js.Function0[IterableIterator[T]] = js.native
}
