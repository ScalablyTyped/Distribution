package typings.jeeJsf.jsf.ajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsf.ajax.request")
@js.native
object request extends js.Object {
  /**
    * Send an asynchronous Ajax request to the server.
    * @param source The DOM element that triggered this Ajax request, or an id string of the element to use as the triggering element.
    * @param event The DOM event that triggered this Ajax request. The event argument is optional.
    * @param options The set of available options that can be sent as request parameters to control client and/or server side request processing.
    */
  def apply(source: js.Any): Unit = js.native
  def apply(source: js.Any, event: String): Unit = js.native
  def apply(source: js.Any, event: String, options: RequestOptions): Unit = js.native
}

