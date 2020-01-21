package typings.jquery.JQuery_

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.jqueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ TType in keyof jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> ]:? jquery.JQuery.TypeEventHandler<TDelegateTarget, TData, TCurrentTarget, TTarget, TType> | false | object} */ trait TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
  extends // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
// derived types of Event are not assignable to Event.
/* type */ StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, String]) | `false` | js.Object
      ]
    ]

object TypeEventHandlers {
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    StringDictionary: // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
  // derived types of Event are not assignable to Event.
  /* type */ StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, String]) | `false` | js.Object
      ]
    ] = null
  ): TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
}

