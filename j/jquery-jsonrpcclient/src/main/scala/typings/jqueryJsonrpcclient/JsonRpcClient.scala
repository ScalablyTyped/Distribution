package typings.jqueryJsonrpcclient

import typings.jquery.JQueryDeferred
import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonRpcClient extends StObject {
  
  /**
    * Make a batch-call by using a callback.
    *
    * The callback will get an object "batch" as only argument.  On batch, you can call the methods
    * "call" and "notify" just as if it was a normal JsonRpcClient object, and all calls will be
    * sent as a batch call then the callback is done.
    *
    * @fn batch
    * @memberof JsonRpcClient
    *
    * @param {function} callback   This function will get a batch handler to run call and notify on.
    * @param {function} allDoneCb  A callback function to call after all results have been handled.
    * @param {function} errorCb    A callback function to call if there is an error from the server.
    *                    Note, that batch calls should always get an overall success, and the
    *                    only error
    */
  def batch(
    callback: js.Function1[/* batch */ this.type, Unit],
    allDoneCb: js.Function1[/* result */ js.Any, Unit],
    errorCb: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  
  def call(
    method: String,
    params: js.Array[_],
    successCb: js.Function1[/* result */ js.Any, Unit],
    errorCb: js.Function1[/* result */ js.Any, Unit]
  ): JQueryDeferred[JQueryXHR] = js.native
  /**
    * @fn call
    * @memberof JsonRpcClient
    *
    * @param {string}       method     The method to run on JSON-RPC server.
    * @param {object|array} params     The params; an array or object.
    * @param {function}     successCb  A callback for successful request.
    * @param {function}     errorCb    A callback for error.
    *
    * @return {object} Returns the deferred object that $.ajax returns or {null} for websockets
    */
  def call(
    method: String,
    params: js.Object,
    successCb: js.Function1[/* result */ js.Any, Unit],
    errorCb: js.Function1[/* result */ js.Any, Unit]
  ): JQueryDeferred[JQueryXHR] = js.native
  
  def notify(method: String, params: js.Array[_]): JQueryDeferred[JQueryXHR] = js.native
  /**
    * Notify sends a command to the server that won't need a response.  In http, there is probably
    * an empty response - that will be dropped, but in ws there should be no response at all.
    *
    * This is very similar to call, but has no id and no handling of callbacks.
    *
    * @fn notify
    * @memberof JsonRpcClient
    *
    * @param {string} method       The method to run on JSON-RPC server.
    * @param {object|array} params The params; an array or object.
    *
    * @return {object} Returns the deferred object that $.ajax returns or {null} for websockets
    */
  def notify(method: String, params: js.Object): JQueryDeferred[JQueryXHR] = js.native
}
