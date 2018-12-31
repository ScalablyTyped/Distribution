package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(jquery.JQuery._TypeEventHandlers<TDelegateTarget, TData, TCurrentTarget, TTarget>) */ trait TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget]
  extends // No idea why it's necessary to include `object` in the union but otherwise TypeScript complains that
// derived types of Event are not assignable to Event.
/* type */ org.scalablytyped.runtime.StringDictionary[
      js.UndefOr[
        (TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, java.lang.String]) | jqueryLib.jqueryLibNumbers.`false` | js.Object
      ]
    ]

