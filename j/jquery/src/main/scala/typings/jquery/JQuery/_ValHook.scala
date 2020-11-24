package typings.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ValHook[TElement] extends js.Object
object _ValHook {
  
  @scala.inline
  def `0`[TElement](get: TElement => js.Any): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[_ValHook[TElement]]
  }
  
  @scala.inline
  def `1`[TElement](set: (TElement, js.Any) => js.Any): _ValHook[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[_ValHook[TElement]]
  }
}
