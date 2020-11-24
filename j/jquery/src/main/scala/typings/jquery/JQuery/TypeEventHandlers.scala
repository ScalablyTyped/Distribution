package typings.jquery.JQuery

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
  extends _TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
     with // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
// derived types of Event are not assignable to Event.
/* type */ StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, String]) | `false` | js.Object
      ]
    ]
object TypeEventHandlers {
  
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](): TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}
