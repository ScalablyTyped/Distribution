package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jquery {
  import typings.jquery.JQuery.AjaxSettings
  import typings.jquery.JQuery.Callbacks
  import typings.jquery.JQuery.Coordinates
  import typings.jquery.JQuery.Deferred
  import typings.jquery.JQuery.EffectsOptions
  import typings.jquery.JQuery.EventStatic
  import typings.jquery.JQuery.NameValuePair
  import typings.jquery.JQuery.PlainObject
  import typings.jquery.JQuery.Promise
  import typings.jquery.JQuery.Thenable
  import typings.jquery.JQuery.TypeOrArray
  import typings.jquery.JQuery.jqXHR
  import typings.std.DragEvent
  import typings.std.Element
  import typings.std.Event
  import typings.std.FocusEvent
  import typings.std.KeyboardEvent
  import typings.std.MouseEvent
  import typings.std.TouchEvent
  import typings.std.UIEvent

  type JQuery[TElement] = JQuery_[TElement]
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = AjaxSettings[js.Any]
  type JQueryAnimationOptions = EffectsOptions[Element]
  type JQueryCallback = Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = Coordinates
  type JQueryDeferred[T] = Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ Double, Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = EventStatic
  type JQueryGenericPromise[T] = Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[Boolean], String]
  type JQueryPromise[T] = Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ TypeOrArray[JQueryPromiseCallback[T]], 
    /* repeated */ TypeOrArray[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = jqXHR[js.Any]
  type _DragEvent = DragEvent
  type _Event = Event
  type _FocusEvent = FocusEvent
  type _KeyboardEvent = KeyboardEvent
  type _MouseEvent = MouseEvent
  type _TouchEvent = TouchEvent
  type _UIEvent = UIEvent
}
