package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryLib {
  // tslint:disable-next-line:no-empty-interface
  type JQueryAjaxSettings = jqueryLib.JQueryNs.AjaxSettings[js.Any]
  type JQueryAnimationOptions = jqueryLib.JQueryNs.EffectsOptions[stdLib.Element]
  type JQueryCallback = jqueryLib.JQueryNs.Callbacks[js.Function]
  // tslint:disable-next-line:no-empty-interface
  type JQueryCoordinates = jqueryLib.JQueryNs.Coordinates
  type JQueryDeferred[T] = jqueryLib.JQueryNs.Deferred[T, js.Any, js.Any]
  /**
   * @deprecated ​ Deprecated. Internal. See \`{@link https://github.com/jquery/api.jquery.com/issues/912 }\`.
   */
  type JQueryEasingFunction = js.Function1[/* percent */ scala.Double, scala.Double]
  // tslint:disable-next-line:no-empty-interface
  type JQueryEventConstructor = jqueryLib.JQueryNs.EventStatic
  type JQueryGenericPromise[T] = jqueryLib.JQueryNs.Thenable[T]
  /**
   * @deprecated ​ Deprecated. Use \`{@link JQueryStatic.param JQueryStatic&#91;'param'&#93;}\`.
   */
  type JQueryParam = js.Function2[/* obj */ js.Any, /* traditional */ js.UndefOr[scala.Boolean], java.lang.String]
  type JQueryPromise[T] = jqueryLib.JQueryNs.Promise[T, js.Any, js.Any]
  // Legacy types that are not represented in the current type definitions are marked deprecated.
  /**
   * @deprecated ​ Deprecated. Use \`{@link JQuery.Deferred.Callback }\` or \`{@link JQuery.Deferred.CallbackBase }\`.
   */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */js.Any, scala.Unit]
  /**
   * @deprecated ​ Deprecated.
   */
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ jqueryLib.JQueryNs.TypeOrArray[JQueryPromiseCallback[T]], 
    /* repeated */jqueryLib.JQueryNs.TypeOrArray[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  // tslint:disable-next-line:no-empty-interface
  type JQuerySerializeArrayElement = jqueryLib.JQueryNs.NameValuePair
  /**
   * @deprecated ​ Deprecated since 1.9. See \`{@link https://api.jquery.com/jQuery.support/ }\`.
   */
  // tslint:disable-next-line:no-empty-interface
  type JQuerySupport = jqueryLib.JQueryNs.PlainObject[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type JQueryXHR = jqueryLib.JQueryNs.jqXHR[js.Any]
  // Used by JQuery.Event
  type _Event = stdLib.Event
}
