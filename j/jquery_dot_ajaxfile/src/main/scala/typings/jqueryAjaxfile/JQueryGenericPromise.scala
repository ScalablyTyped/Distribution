package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows jQuery Promises to interop with non-jQuery promises
  */
@js.native
trait JQueryGenericPromise[T] extends js.Object {
  
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    * 
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    */
  def `then`(doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit]): JQueryPromise[Unit] = js.native
  def `then`(
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit],
    failFilter: js.UndefOr[scala.Nothing],
    progressFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[Unit] = js.native
  def `then`(
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit],
    failFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[Unit] = js.native
  def `then`(
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, Unit],
    failFilter: js.Function1[/* repeated */ js.Any, _],
    progressFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[Unit] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    * 
    * @param doneFilter A function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    */
  @JSName("then")
  def then_U[U](doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, U | JQueryPromise[U]]): JQueryPromise[U] = js.native
  @JSName("then")
  def then_U[U](
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, U | JQueryPromise[U]],
    failFilter: js.UndefOr[scala.Nothing],
    progressFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[U] = js.native
  @JSName("then")
  def then_U[U](
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, U | JQueryPromise[U]],
    failFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[U] = js.native
  @JSName("then")
  def then_U[U](
    doneFilter: js.Function2[/* value */ js.UndefOr[T], /* repeated */ js.Any, U | JQueryPromise[U]],
    failFilter: js.Function1[/* repeated */ js.Any, _],
    progressFilter: js.Function1[/* repeated */ js.Any, _]
  ): JQueryPromise[U] = js.native
}
