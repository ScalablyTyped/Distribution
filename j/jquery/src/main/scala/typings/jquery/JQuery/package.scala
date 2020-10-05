package typings.jquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JQuery {
  /**
    * @deprecated ​ Deprecated since 1.8. Use \`{@link Tween.propHooks jQuery.Tween.propHooks}\`.
    *
    * `jQuery.fx.step` functions are being replaced by `jQuery.Tween.propHooks` and may eventually be removed, but are still supported via the default tween propHook.
    */
  type AnimationHook[TElement] = js.Function1[/* fx */ typings.jquery.JQuery.Tween[TElement], scala.Unit]
  // #endregion
  // region CSS hooks
  // #region CSS hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CSSHook[TElement] = typings.std.Partial[typings.jquery.JQuery._CSSHook[TElement]] with (typings.std.Pick[
    typings.jquery.JQuery._CSSHook[TElement], 
    typings.jquery.jqueryStrings.get | typings.jquery.jqueryStrings.set
  ])
  type CSSHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typings.jquery.JQuery.CSSHook[typings.std.HTMLElement]]
  // #endregion
  // region Callbacks
  // #region Callbacks
  type CallbacksStatic = js.Function1[
    /* flags */ js.UndefOr[java.lang.String], 
    typings.jquery.JQuery.Callbacks[js.Function]
  ]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.anon.PickCoordinatesleft
    - typings.jquery.anon.PickCoordinatestop
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type CoordinatesPartial = typings.jquery.JQuery._CoordinatesPartial | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // #endregion
  // region Effects
  // #region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.jquery.jqueryStrings.fast
    - typings.jquery.jqueryStrings.slow
  */
  type Duration = typings.jquery.JQuery._Duration | scala.Double
  // #endregion
  // region Easing
  // #region Easing
  type EasingMethod = js.Function1[/* percent */ scala.Double, scala.Double]
  type Easings = org.scalablytyped.runtime.StringDictionary[typings.jquery.JQuery.EasingMethod]
  type EventHandler[TCurrentTarget, TData] = typings.jquery.JQuery.EventHandlerBase[
    TCurrentTarget, 
    typings.jquery.JQuery.TriggeredEvent[TCurrentTarget, TData, js.Any, js.Any]
  ]
  // Extra parameters can be passed from trigger()
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, js.Any]
  // #endregion
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.jqueryBooleans.`false`
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typings.jquery.jqueryNumbers.`0`
    - typings.jquery.jqueryStrings._empty
    - typings.std.HTMLAllCollection
  */
  type Falsy = js.UndefOr[typings.jquery.JQuery._Falsy | scala.Null | typings.std.HTMLAllCollection]
  type Node = typings.std.Element | typings.std.Text | typings.std.Comment | typings.std.Document | typings.std.DocumentFragment
  /**
    * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain object is, in other words, an Object object. It is designated "plain" in jQuery documentation to distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and host objects such as document, all of which have a typeof value of "object."
    *
    * **Note**: The type declaration of PlainObject is imprecise. It includes host objects and user-defined arrays which do not match jQuery's definition.
    */
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise[TR, TJ, TN] = typings.jquery.JQuery.PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always, pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    * @see \`{@link https://api.jquery.com/Types/#Promise }\`
    */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = typings.jquery.JQuery.PromiseBase[
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
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = typings.jquery.JQuery.PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.anon.Get[TElement]
    - typings.jquery.anon.Set[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type PropHook[TElement] = typings.jquery.JQuery._PropHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  type PropHooks = org.scalablytyped.runtime.StringDictionary[typings.jquery.JQuery.PropHook[typings.jquery.JQuery.Node]]
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
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.anon.NoBubble
    - typings.jquery.anon.BindType
    - typings.jquery.anon.DelegateType
    - typings.jquery.anon.Setup[TTarget, TData]
    - typings.jquery.anon.Teardown[TTarget]
    - typings.jquery.anon.Add[TTarget, TData]
    - typings.jquery.anon.Remove[TTarget, TData]
    - typings.jquery.anon.Trigger[TTarget, TData]
    - typings.jquery.anon.Default[TTarget, TData]
    - typings.jquery.anon.Handle[TTarget, TData]
    - typings.jquery.anon.PreDispatch[TTarget]
    - typings.jquery.anon.PostDispatch[TTarget]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpecialEventHook[TTarget, TData] = (typings.jquery.JQuery._SpecialEventHook[TTarget, TData]) | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type SpecialEventHooks = org.scalablytyped.runtime.StringDictionary[typings.jquery.JQuery.SpecialEventHook[typings.std.EventTarget, js.Any]]
  // #endregion
  // region Speed
  // #region Speed
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.anon.Duration
    - typings.jquery.anon.Easing
    - typings.jquery.anon.Complete[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type SpeedSettings[TElement] = typings.jquery.JQuery._SpeedSettings[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
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
    /* this */ typings.jquery.JQuery.Animation[TElement], 
    /* propName */ java.lang.String, 
    /* finalValue */ scala.Double, 
    typings.jquery.JQuery.Tween[TElement]
  ]
  type TypeEventHandler[TDelegateTarget, TData, TCurrentTarget, TTarget, TType /* <: /* keyof jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget> */ typings.jquery.jqueryStrings.change | typings.jquery.jqueryStrings.resize | typings.jquery.jqueryStrings.scroll | typings.jquery.jqueryStrings.select | typings.jquery.jqueryStrings.submit | typings.jquery.jqueryStrings.click | typings.jquery.jqueryStrings.contextmenu | typings.jquery.jqueryStrings.dblclick | typings.jquery.jqueryStrings.mousedown | typings.jquery.jqueryStrings.mouseenter | typings.jquery.jqueryStrings.mouseleave | typings.jquery.jqueryStrings.mousemove | typings.jquery.jqueryStrings.mouseout | typings.jquery.jqueryStrings.mouseover | typings.jquery.jqueryStrings.mouseup | typings.jquery.jqueryStrings.drag | typings.jquery.jqueryStrings.dragend | typings.jquery.jqueryStrings.dragenter | typings.jquery.jqueryStrings.dragexit | typings.jquery.jqueryStrings.dragleave | typings.jquery.jqueryStrings.dragover | typings.jquery.jqueryStrings.dragstart | typings.jquery.jqueryStrings.drop | typings.jquery.jqueryStrings.keydown | typings.jquery.jqueryStrings.keypress | typings.jquery.jqueryStrings.keyup | typings.jquery.jqueryStrings.touchcancel | typings.jquery.jqueryStrings.touchend | typings.jquery.jqueryStrings.touchmove | typings.jquery.jqueryStrings.touchstart | typings.jquery.jqueryStrings.blur | typings.jquery.jqueryStrings.focus | typings.jquery.jqueryStrings.focusin | typings.jquery.jqueryStrings.focusout */] = typings.jquery.JQuery.EventHandlerBase[
    TCurrentTarget, 
    /* import warning: importer.ImportType#apply Failed type conversion: jquery.JQuery.TypeToTriggeredEventMap<TDelegateTarget, TData, TCurrentTarget, TTarget>[TType] */ js.Any
  ]
  type TypeOrArray[T] = T | js.Array[T]
  // #endregion
  // region Val hooks
  // #region Val hooks
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  /* Rewritten from type alias, can be one of: 
    - typings.jquery.anon.`0`[TElement]
    - typings.jquery.anon.`1`[TElement]
    - org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  */
  type ValHook[TElement] = typings.jquery.JQuery._ValHook[TElement] | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  type ValHooks = // Set to HTMLElement to minimize breaks but should probably be Element.
  org.scalablytyped.runtime.StringDictionary[typings.jquery.JQuery.ValHook[typings.std.HTMLElement]]
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more DOM elements, typically to be created and inserted in the document. When passed as an argument of the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it contained <tag ... > anywhere within the string.
    */
  type htmlString = java.lang.String
}
