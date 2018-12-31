package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryDotAjaxfileLib {
  type IAjaxFileResultCallback[T] = js.Function1[/* result */ IAjaxFileResult[T], js.Any]
  /**
    * Interface for the JQuery promise/deferred callbacks
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], 
    /* repeated */ JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  type MochaDone = js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
}
