package typings
package jeeDashJsfLib.jsfNs.ajaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsf.ajax")
@js.native
object ajaxNsMembers extends js.Object {
  /**
           * Register a callback for error handling.
           * @param callback a reference to a function to call on an error
           */
  def addOnError(callback: js.Function1[/* data */ RequestData, scala.Unit]): scala.Unit = js.native
  /**
           * Register a callback for event handling.
           * @param callback a reference to a function to call on an event
           */
  def addOnEvent(callback: js.Function1[/* data */ RequestData, scala.Unit]): scala.Unit = js.native
  /**
           * Send an asynchronous Ajax request to the server.
           * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
           * @param event The DOM event that triggered this Ajax request. The event argument is optional.
           * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
           */
  def request(source: js.Any): scala.Unit = js.native
  /**
           * Send an asynchronous Ajax request to the server.
           * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
           * @param event The DOM event that triggered this Ajax request. The event argument is optional.
           * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
           */
  def request(source: js.Any, event: java.lang.String): scala.Unit = js.native
  /**
           * Send an asynchronous Ajax request to the server.
           * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
           * @param event The DOM event that triggered this Ajax request. The event argument is optional.
           * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
           */
  def request(source: js.Any, event: java.lang.String, options: RequestOptions): scala.Unit = js.native
  /**
           * Receive an Ajax response from the server.
           * @param request The XMLHttpRequest instance that contains the status code and response message from the server.
           * @param context An object containing the request context, including the following properties: the source element, per call onerror callback function, and per call onevent callback function.
           * @throws EmptyResponse error if request contains no data
           */
  def response(request: js.Any, context: js.Any): scala.Unit = js.native
}

