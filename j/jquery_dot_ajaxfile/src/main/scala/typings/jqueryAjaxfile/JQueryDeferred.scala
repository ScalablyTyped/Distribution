package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the JQuery deferred, part of callbacks
  */
@js.native
trait JQueryDeferred[T]
  extends StObject
     with JQueryGenericPromise[T] {
  
  def always(
    alwaysCallback1: js.Array[JQueryPromiseCallback[js.Any]],
    alwaysCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  def always(
    alwaysCallback1: Unit,
    alwaysCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    * 
    * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    */
  def always(
    alwaysCallback1: JQueryPromiseCallback[js.Any],
    alwaysCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  
  def done(
    doneCallback1: js.Array[JQueryPromiseCallback[T]],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryDeferred[T] = js.native
  def done(
    doneCallback1: Unit,
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved.
    * 
    * @param doneCallbacks1 A function, or array of functions, that are called when the Deferred is resolved.
    * @param doneCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
    */
  def done(
    doneCallback1: JQueryPromiseCallback[T],
    doneCallbackN: (JQueryPromiseCallback[T] | js.Array[JQueryPromiseCallback[T]])*
  ): JQueryDeferred[T] = js.native
  
  def fail(
    failCallback1: js.Array[JQueryPromiseCallback[js.Any]],
    failCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  def fail(
    failCallback1: Unit,
    failCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    * 
    * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    */
  def fail(
    failCallback1: JQueryPromiseCallback[js.Any],
    failCallbacksN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  
  /**
    * Call the progressCallbacks on a Deferred object with the given args.
    * 
    * @param args Optional arguments that are passed to the progressCallbacks.
    */
  def notify(value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  def notify(value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  /**
    * Call the progressCallbacks on a Deferred object with the given context and args.
    * 
    * @param context Context passed to the progressCallbacks as the this object.
    * @param args Optional arguments that are passed to the progressCallbacks.
    */
  def notifyWith(context: js.Any, value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  def notifyWith(context: js.Any, value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  // Deprecated - given no typings
  def pipe(): JQueryPromise[js.Any] = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise[js.Any] = js.native
  def pipe(doneFilter: js.Function1[/* x */ js.Any, js.Any], failFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise[js.Any] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ js.Any, js.Any],
    failFilter: js.Function1[/* x */ js.Any, js.Any],
    progressFilter: js.Function1[/* x */ js.Any, js.Any]
  ): JQueryPromise[js.Any] = js.native
  def pipe(
    doneFilter: js.Function1[/* x */ js.Any, js.Any],
    failFilter: Unit,
    progressFilter: js.Function1[/* x */ js.Any, js.Any]
  ): JQueryPromise[js.Any] = js.native
  def pipe(doneFilter: Unit, failFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise[js.Any] = js.native
  def pipe(
    doneFilter: Unit,
    failFilter: js.Function1[/* x */ js.Any, js.Any],
    progressFilter: js.Function1[/* x */ js.Any, js.Any]
  ): JQueryPromise[js.Any] = js.native
  def pipe(doneFilter: Unit, failFilter: Unit, progressFilter: js.Function1[/* x */ js.Any, js.Any]): JQueryPromise[js.Any] = js.native
  
  def progress(
    progressCallback1: js.Array[JQueryPromiseCallback[js.Any]],
    progressCallbackN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  def progress(
    progressCallback1: Unit,
    progressCallbackN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    * 
    * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
    */
  def progress(
    progressCallback1: JQueryPromiseCallback[js.Any],
    progressCallbackN: (JQueryPromiseCallback[js.Any] | js.Array[JQueryPromiseCallback[js.Any]])*
  ): JQueryDeferred[T] = js.native
  
  /**
    * Return a Deferred's Promise object.
    * 
    * @param target Object onto which the promise methods have to be attached
    */
  def promise(): JQueryPromise[T] = js.native
  def promise(target: js.Any): JQueryPromise[T] = js.native
  
  /**
    * Reject a Deferred object and call any failCallbacks with the given args.
    * 
    * @param args Optional arguments that are passed to the failCallbacks.
    */
  def reject(value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  def reject(value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  /**
    * Reject a Deferred object and call any failCallbacks with the given context and args.
    * 
    * @param context Context passed to the failCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the failCallbacks.
    */
  def rejectWith(context: js.Any, value: js.Any, args: js.Any*): JQueryDeferred[T] = js.native
  def rejectWith(context: js.Any, value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given args.
    * 
    * @param value First argument passed to doneCallbacks.
    * @param args Optional subsequent arguments that are passed to the doneCallbacks.
    */
  def resolve(value: T, args: js.Any*): JQueryDeferred[T] = js.native
  def resolve(value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given context and args.
    * 
    * @param context Context passed to the doneCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the doneCallbacks.
    */
  def resolveWith(context: js.Any, value: T, args: js.Any*): JQueryDeferred[T] = js.native
  def resolveWith(context: js.Any, value: Unit, args: js.Any*): JQueryDeferred[T] = js.native
  
  /**
    * Determine the current state of a Deferred object.
    */
  def state(): String = js.native
}
