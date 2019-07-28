package typings

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryDotAjaxfile {
  type IAjaxFileResultCallback[T] = js.Function1[/* result */ IAjaxFileResult[T], js.Any]
  /**
    * Interface for the JQuery promise/deferred callbacks
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit]
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]], 
    /* repeated */ JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]], 
    JQueryPromise[U]
  ]
  type MochaDone = js.Function1[/* error */ js.UndefOr[Error], Unit]
}
