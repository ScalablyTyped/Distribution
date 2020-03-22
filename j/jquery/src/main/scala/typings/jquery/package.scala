package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jquery {
  type DragEvent = typings.std.DragEvent
  type Event = typings.std.Event_
  type FocusEvent = typings.std.FocusEvent
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = typings.jquery.JQuery_.AjaxSettings[js.Any]
  type JQueryAnimationOptions = typings.jquery.JQuery_.EffectsOptions[typings.std.Element]
  type JQueryCallback = typings.jquery.JQuery_.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = typings.jquery.JQuery_.Coordinates
  type JQueryDeferred[T] = typings.jquery.JQuery_.Deferred[T, js.Any, js.Any]
  /**
    * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
    */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = typings.jquery.JQuery_.EventStatic
  type JQueryGenericPromise[T] = typings.jquery.JQuery_.Thenable[T]
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
    */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = typings.jquery.JQuery_.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
    * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  /**
    * @deprecated ​ Deprecated.
    */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typings.jquery.JQuery_.TypeOrArray[typings.jquery.JQueryPromiseCallback[T]], 
    /* repeated */ typings.jquery.JQuery_.TypeOrArray[typings.jquery.JQueryPromiseCallback[js.Any]], 
    typings.jquery.JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = typings.jquery.JQuery_.NameValuePair
  /**
    * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
    */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = typings.jquery.JQuery_.PlainObject[js.Any]
  type JQuery_[TElement] = typings.jquery.JQuery__[TElement]
  type KeyboardEvent = typings.std.KeyboardEvent
  type MouseEvent = typings.std.MouseEvent
  type TouchEvent = typings.std.TouchEvent
  type UIEvent = typings.std.UIEvent
}
