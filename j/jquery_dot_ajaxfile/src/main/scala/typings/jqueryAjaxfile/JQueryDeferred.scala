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
    alwaysCallback1: js.Array[JQueryPromiseCallback[Any]],
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  def always(
    alwaysCallback1: Unit,
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    * 
    * @param alwaysCallbacks1 A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    */
  def always(
    alwaysCallback1: JQueryPromiseCallback[Any],
    alwaysCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
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
    failCallback1: js.Array[JQueryPromiseCallback[Any]],
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  def fail(
    failCallback1: Unit,
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    * 
    * @param failCallbacks1 A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks2 Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    */
  def fail(
    failCallback1: JQueryPromiseCallback[Any],
    failCallbacksN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  
  /**
    * Call the progressCallbacks on a Deferred object with the given args.
    * 
    * @param args Optional arguments that are passed to the progressCallbacks.
    */
  def notify(value: Any, args: Any*): JQueryDeferred[T] = js.native
  def notify(value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
  /**
    * Call the progressCallbacks on a Deferred object with the given context and args.
    * 
    * @param context Context passed to the progressCallbacks as the this object.
    * @param args Optional arguments that are passed to the progressCallbacks.
    */
  def notifyWith(context: Any, value: Any, args: Any*): JQueryDeferred[T] = js.native
  def notifyWith(context: Any, value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
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
  ): JQueryDeferred[T] = js.native
  def progress(
    progressCallback1: Unit,
    progressCallbackN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    * 
    * @param progressCallbacks A function, or array of functions, to be called when the Deferred generates progress notifications.
    */
  def progress(
    progressCallback1: JQueryPromiseCallback[Any],
    progressCallbackN: (JQueryPromiseCallback[Any] | js.Array[JQueryPromiseCallback[Any]])*
  ): JQueryDeferred[T] = js.native
  
  /**
    * Return a Deferred's Promise object.
    * 
    * @param target Object onto which the promise methods have to be attached
    */
  def promise(): JQueryPromise[T] = js.native
  def promise(target: Any): JQueryPromise[T] = js.native
  
  /**
    * Reject a Deferred object and call any failCallbacks with the given args.
    * 
    * @param args Optional arguments that are passed to the failCallbacks.
    */
  def reject(value: Any, args: Any*): JQueryDeferred[T] = js.native
  def reject(value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
  /**
    * Reject a Deferred object and call any failCallbacks with the given context and args.
    * 
    * @param context Context passed to the failCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the failCallbacks.
    */
  def rejectWith(context: Any, value: Any, args: Any*): JQueryDeferred[T] = js.native
  def rejectWith(context: Any, value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given args.
    * 
    * @param value First argument passed to doneCallbacks.
    * @param args Optional subsequent arguments that are passed to the doneCallbacks.
    */
  def resolve(value: T, args: Any*): JQueryDeferred[T] = js.native
  def resolve(value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
  /**
    * Resolve a Deferred object and call any doneCallbacks with the given context and args.
    * 
    * @param context Context passed to the doneCallbacks as the this object.
    * @param args An optional array of arguments that are passed to the doneCallbacks.
    */
  def resolveWith(context: Any, value: T, args: Any*): JQueryDeferred[T] = js.native
  def resolveWith(context: Any, value: Unit, args: Any*): JQueryDeferred[T] = js.native
  
  /**
    * Determine the current state of a Deferred object.
    */
  def state(): String = js.native
}
