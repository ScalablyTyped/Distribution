package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the JQuery promise, part of callbacks
  */
@js.native
trait JQueryPromise[T] extends JQueryGenericPromise[T] {
  
  def always(
    alwaysCallback1: js.UndefOr[scala.Nothing],
    alwaysCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  def always(
    alwaysCallback1: js.Array[JQueryPromiseCallback[_]],
    alwaysCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    * 
    * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    */
  def always(
    alwaysCallback1: JQueryPromiseCallback[_],
    alwaysCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  
  def done(
    doneCallback1: js.UndefOr[scala.Nothing],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryPromise[T] = js.native
  def done(
    doneCallback1: js.Array[JQueryPromiseCallback[T]],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved.
    * 
    * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
    * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
    */
  def done(
    doneCallback1: JQueryPromiseCallback[T],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryPromise[T] = js.native
  
  def fail(
    failCallback1: js.UndefOr[scala.Nothing],
    failCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  def fail(
    failCallback1: js.Array[JQueryPromiseCallback[_]],
    failCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    * 
    * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    */
  def fail(
    failCallback1: JQueryPromiseCallback[_],
    failCallbacksN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  
  // Deprecated - given no typings
  def pipe(): JQueryPromise[_] = js.native
  def pipe(
    doneFilter: js.UndefOr[scala.Nothing],
    failFilter: js.UndefOr[scala.Nothing],
    progressFilter: js.Function1[/* x */ js.Any, _]
  ): JQueryPromise[_] = js.native
  def pipe(doneFilter: js.UndefOr[scala.Nothing], failFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise[_] = js.native
  def pipe(
    doneFilter: js.UndefOr[scala.Nothing],
    failFilter: js.Function1[/* x */ js.Any, _],
    progressFilter: js.Function1[/* x */ js.Any, _]
  ): JQueryPromise[_] = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise[_] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ js.Any, _],
    failFilter: js.UndefOr[scala.Nothing],
    progressFilter: js.Function1[/* x */ js.Any, _]
  ): JQueryPromise[_] = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, _], failFilter: js.Function1[/* x */ js.Any, _]): JQueryPromise[_] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ js.Any, _],
    failFilter: js.Function1[/* x */ js.Any, _],
    progressFilter: js.Function1[/* x */ js.Any, _]
  ): JQueryPromise[_] = js.native
  
  def progress(
    progressCallback1: js.UndefOr[scala.Nothing],
    progressCallbackN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  def progress(
    progressCallback1: js.Array[JQueryPromiseCallback[_]],
    progressCallbackN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    * 
    * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
    */
  def progress(
    progressCallback1: JQueryPromiseCallback[_],
    progressCallbackN: (JQueryPromiseCallback[_] | js.Array[JQueryPromiseCallback[_]])*
  ): JQueryPromise[T] = js.native
  
  /**
    * Determine the current state of a Deferred object.
    */
  def state(): String = js.native
}
