package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryNs {
  /**
       * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
       *
       * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
       */
  type AnimationHook[TElement] = js.Function1[/* fx */ Tween[TElement], scala.Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = stdLib.Partial[_CSSHook[TElement]] with ((stdLib.Pick[_CSSHook[TElement], jqueryLib.jqueryLibStrings.get]) | (stdLib.Pick[_CSSHook[TElement], jqueryLib.jqueryLibStrings.set]))
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[/* flags */ js.UndefOr[java.lang.String], Callbacks[js.Function]]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CoordinatesPartial = (stdLib.Pick[Coordinates, jqueryLib.jqueryLibStrings.left]) | (stdLib.Pick[Coordinates, jqueryLib.jqueryLibStrings.top]) | ScalablyTyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Effects
  // #region Effects
  type Duration = scala.Double | jqueryLib.jqueryLibStrings.fast | jqueryLib.jqueryLibStrings.slow
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ scala.Double, scala.Double]
  type EventHandler[TCurrentTarget, TData] = EventHandlerBase[TCurrentTarget, TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */js.Any, js.Any]
  type Node = stdLib.Element | stdLib.Text | stdLib.Comment | stdLib.DocumentFragment
  /**
       * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
       * @see \`{@link https://api.jquery.com/Types/#Promise }\`
       */
  type Promise[TR, TJ, TN] = PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
       * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
       * @see \`{@link https://api.jquery.com/Types/#Promise }\`
       */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = PromiseBase[
    TR, 
    TJ, 
    TN, 
    UR, 
    UJ, 
    UN, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing
  ]
  /**
       * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
       * @see \`{@link https://api.jquery.com/Types/#Promise }\`
       */
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  /**
       * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
       * @since 1.8
       */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type PropHook[TElement] = jqueryLib.Anon_Get[TElement] | jqueryLib.Anon_Set[TElement] | ScalablyTyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Queue
  // #region Queue
  // TODO: Is the first element always a string or is that specific to the 'fx' queue?
  type Queue[TElement] = jqueryLib.Anon_0 with js.Array[QueueFunction[TElement]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[scala.Unit], scala.Unit]
  /**
       * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
       */
  type Selector = java.lang.String
  // region Special event hooks
  // #region Special event hooks
  /**
       * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
       *
       * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
       * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
       */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type SpecialEventHook[TTarget, TData] = jqueryLib.Anon_NoBubble | jqueryLib.Anon_BindType | jqueryLib.Anon_DelegateType | (jqueryLib.Anon_Setup[TTarget, TData]) | jqueryLib.Anon_Teardown[TTarget] | (jqueryLib.Anon_Add[TTarget, TData]) | (jqueryLib.Anon_Remove[TTarget, TData]) | (jqueryLib.Anon_Trigger[TTarget, TData]) | (jqueryLib.Anon_Default[TTarget, TData]) | (jqueryLib.Anon_Handle[TTarget, TData]) | jqueryLib.Anon_PreDispatch[TTarget] | jqueryLib.Anon_PostDispatch[TTarget] | ScalablyTyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Speed
  // #region Speed
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type SpeedSettings[TElement] = jqueryLib.Anon_Duration | jqueryLib.Anon_Easing | jqueryLib.Anon_Complete[TElement] | ScalablyTyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Deferred
  // #region Deferred
  /**
       * Any object that has a then method.
       */
  type Thenable[T] = js.Thenable[T]
  /**
       * A "Tweener" is a function responsible for creating a tween object, and you might want to override these if you want to implement complex values ( like a clip/transform array matrix ) in a single property.
       * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tweeners }\`
       * @since 1.8
       */
  type Tweener[TElement] = js.ThisFunction2[
    /* this */ Animation[TElement], 
    /* propName */ java.lang.String, 
    /* finalValue */ scala.Double, 
    Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: java.lang.String */] = EventHandlerBase[TCurrentTarget, js.Any]
  type TypeOrArray[T] = T | js.Array[T]
  // #endregion
  // region Val hooks
  // #region Val hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type ValHook[TElement] = jqueryLib.Anon_GetElem[TElement] | jqueryLib.Anon_SetElem[TElement] | ScalablyTyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  type _Falsy = js.UndefOr[
    jqueryLib.jqueryLibNumbers.`false` | scala.Null | jqueryLib.jqueryLibNumbers.`0` | jqueryLib.jqueryLibStrings.Empty | js.Any
  ]
  type _TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget] = jqueryLib.jqueryLibStrings._TypeEventHandlers with js.Any
  /**
       * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
       */
  type htmlString = java.lang.String
}
