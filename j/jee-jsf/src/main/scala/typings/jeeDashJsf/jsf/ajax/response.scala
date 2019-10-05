package typings.jeeDashJsf.jsf.ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsf.ajax.response")
@js.native
object response extends js.Object {
  /**
    * Receive an Ajax response from the server.
    * @param request The XMLHttpRequest instance that contains the status code and response message from the server.
    * @param context An object containing the request context, including the following properties: the source element, per call onerror callback function, and per call onevent callback function.
    * @throws EmptyResponse error if request contains no data
    */
  def apply(request: js.Any, context: js.Any): Unit = js.native
}

