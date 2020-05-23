package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryAjaxfile {
  type IAjaxFileResultCallback[T] = js.Function1[/* result */ typings.jqueryAjaxfile.IAjaxFileResult[T], js.Any]
  /**
    * Interface for the JQuery promise/deferred callbacks
    */
  type JQueryPromiseCallback[T] = js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, scala.Unit]
  type JQueryPromiseOperator[T, U] = js.Function2[
    /* callback1 */ typings.jqueryAjaxfile.JQueryPromiseCallback[T] | js.Array[typings.jqueryAjaxfile.JQueryPromiseCallback[T]], 
    /* repeated */ typings.jqueryAjaxfile.JQueryPromiseCallback[js.Any] | js.Array[typings.jqueryAjaxfile.JQueryPromiseCallback[js.Any]], 
    typings.jqueryAjaxfile.JQueryPromise[U]
  ]
  type Mocha = typings.jqueryAjaxfile.Mocha_
  type MochaDone = js.Function1[/* error */ js.UndefOr[typings.std.Error], scala.Unit]
}
