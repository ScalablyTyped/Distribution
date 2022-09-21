package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the JQuery promise, part of callbacks
  */
@js.native
trait JQueryPromise[T]
  extends StObject
     with JQueryGenericPromise[T] {
  
  def always(
    alwaysCallback1: js.Array[JQueryPromiseCallback[Any]],
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  def always(
    alwaysCallback1: Unit,
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    * 
    * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    */
  def always(
    alwaysCallback1: JQueryPromiseCallback[Any],
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  
  def done(
    doneCallback1: js.Array[JQueryPromiseCallback[T]],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryPromise[T] = js.native
  def done(
    doneCallback1: Unit,
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
    failCallback1: js.Array[JQueryPromiseCallback[Any]],
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  def fail(
    failCallback1: Unit,
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    * 
    * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    */
  def fail(
    failCallback1: JQueryPromiseCallback[Any],
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  
  // Deprecated - given no typings
  def pipe(): JQueryPromise[Any] = js.native
  def pipe(doneFilter: js.Function1[/* x */ Any, Any]): JQueryPromise[Any] = js.native
  def pipe(doneFilter: js.Function1[/* x */ Any, Any], failFilter: js.Function1[/* x */ Any, Any]): JQueryPromise[Any] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ Any, Any],
    failFilter: js.Function1[/* x */ Any, Any],
    progressFilter: js.Function1[/* x */ Any, Any]
  ): JQueryPromise[Any] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ Any, Any],
    failFilter: Unit,
    progressFilter: js.Function1[/* x */ Any, Any]
  ): JQueryPromise[Any] = js.native
  def pipe(doneFilter: Unit, failFilter: js.Function1[/* x */ Any, Any]): JQueryPromise[Any] = js.native
  def pipe(
    doneFilter: Unit,
    failFilter: js.Function1[/* x */ Any, Any],
    progressFilter: js.Function1[/* x */ Any, Any]
  ): JQueryPromise[Any] = js.native
  def pipe(doneFilter: Unit, failFilter: Unit, progressFilter: js.Function1[/* x */ Any, Any]): JQueryPromise[Any] = js.native
  
  def progress(
    progressCallback1: js.Array[JQueryPromiseCallback[Any]],
    progressCallbackN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  def progress(
    progressCallback1: Unit,
    progressCallbackN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    * 
    * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
    */
  def progress(
    progressCallback1: JQueryPromiseCallback[Any],
    progressCallbackN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryPromise[T] = js.native
  
  /**
    * Determine the current state of a Deferred object.
    */
  def state(): String = js.native
}
