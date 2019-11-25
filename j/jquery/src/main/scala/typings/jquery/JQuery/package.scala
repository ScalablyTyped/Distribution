package typings.jquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuery {
  import org.scalablytyped.runtime.StringDictionary
  import typings.jquery.Anon_0
  import typings.jquery.jqueryStrings.get
  import typings.jquery.jqueryStrings.left
  import typings.jquery.jqueryStrings.set
  import typings.jquery.jqueryStrings.top
  import typings.std.Comment
  import typings.std.DocumentFragment
  import typings.std.Element
  import typings.std.EventTarget
  import typings.std.HTMLAllCollection
  import typings.std.HTMLElement
  import typings.std.Partial
  import typings.std.Pick
  import typings.std.Text

  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  type AnimationHook[TElement] = js.Function1[/* fx */ Tween[TElement], Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = Partial[_CSSHook[TElement]] with (Pick[_CSSHook[TElement], get | set])
  type CSSHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  StringDictionary[CSSHook[HTMLElement]]
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[/* flags */ js.UndefOr[String], Callbacks[js.Function]]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CoordinatesPartial = (Pick[Coordinates, left | top]) | StringDictionary[scala.Nothing]
  // #endregion
  // region Effects
  // #region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.jquery.jqueryStrings.fast
    - typings.jquery.jqueryStrings.slow
  */
  type Duration = _Duration | Double
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ Double, Double]
  type Easings = StringDictionary[EasingMethod]
  type EventHandler[TCurrentTarget, TData] = EventHandlerBase[TCurrentTarget, TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, js.Any]
  type Node = Element | Text | Comment | DocumentFragment
  /**
    * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain object is, in other words, an Object object. It is designated "plain" in jQuery documentation to distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and host objects such as document, all of which have a typeof value of "object."
    *
    * **Note**: The type declaration of PlainObject is imprecise. It includes host objects and user-defined arrays which do not match jQuery's definition.
    */
  type PlainObject[T] = StringDictionary[T]
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
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.Anon_Get[TElement]
    - typings.jquery.Anon_Set[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type PropHook[TElement] = _PropHook[TElement] | StringDictionary[scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  type PropHooks = StringDictionary[PropHook[Node]]
  // #endregion
  // region Queue
  // #region Queue
  // TODO: Is the first element always a string or is that specific to the 'fx' queue?
  type Queue[TElement] = Anon_0 with js.Array[QueueFunction[TElement]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[Unit], Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = String
  // region Special event hooks
  // #region Special event hooks
  /**
    * The jQuery special event hooks are a set of per-event-name functions and properties that allow code to control the behavior of event processing within jQuery. The mechanism is similar to `fixHooks` in that the special event information is stored in `jQuery.event.special.NAME`, where `NAME` is the name of the special event. Event names are case sensitive.
    *
    * As with `fixHooks`, the special event hooks design assumes it will be very rare that two unrelated pieces of code want to process the same event name. Special event authors who need to modify events with existing hooks will need to take precautions to avoid introducing unwanted side-effects by clobbering those hooks.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#special-event-hooks }\`
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.Anon_NoBubble
    - typings.jquery.Anon_BindType
    - typings.jquery.Anon_DelegateType
    - typings.jquery.Anon_Data[TTarget, TData]
    - typings.jquery.Anon_False[TTarget]
    - typings.jquery.Anon_Add[TTarget, TData]
    - typings.jquery.Anon_HandleObj[TTarget, TData]
    - typings.jquery.Anon_DataEvent[TTarget, TData]
    - typings.jquery.Anon_DataDefault[TTarget, TData]
    - typings.jquery.Anon_DataEventHandle[TTarget, TData]
    - typings.jquery.Anon_Event[TTarget]
    - typings.jquery.Anon_EventPostDispatch[TTarget]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpecialEventHook[TTarget, TData] = (_SpecialEventHook[TTarget, TData]) | StringDictionary[scala.Nothing]
  type SpecialEventHooks = StringDictionary[SpecialEventHook[EventTarget, js.Any]]
  // #endregion
  // region Speed
  // #region Speed
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.Anon_Duration
    - typings.jquery.Anon_Easing
    - typings.jquery.Anon_Complete[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpeedSettings[TElement] = _SpeedSettings[TElement] | StringDictionary[scala.Nothing]
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
    /* propName */ String, 
    /* finalValue */ Double, 
    Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: String */] = EventHandlerBase[
    TCurrentTarget, 
    /* import warning: importer.ImportType#apply Failed type conversion: jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget>[TType] */ js.Any
  ]
  type TypeOrArray[T] = T | js.Array[T]
  // #endregion
  // region Val hooks
  // #region Val hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.Anon_Elem[TElement]
    - typings.jquery.Anon_ElemSet[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type ValHook[TElement] = _ValHook[TElement] | StringDictionary[scala.Nothing]
  type ValHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  StringDictionary[ValHook[HTMLElement]]
  // #endregion
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.jqueryNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - typings.jquery.jqueryNumbers.`0`
    - typings.jquery.jqueryStrings.Empty
    - typings.std.HTMLAllCollection
  */
  type _Falsy = js.UndefOr[__Falsy | Null | HTMLAllCollection]
  type _TypeEventHandlers[TDelegateTarget, TData, TCurrentTarget, TTarget] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ TType in keyof jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> ]:? jquery.JQuery.TypeEventHandler<TDelegateTarget, TData, TCurrentTarget, TTarget, TType> | false | object}
    */ typings.jquery.jqueryStrings._TypeEventHandlers with js.Any
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
    */
  type htmlString = String
}
