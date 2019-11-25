package typings.leadfoot.leadfoot

import typings.leadfoot.Anon_Method
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An error from the remote WebDriver server.
	 */
trait WebDriverError extends Error {
  /**
  		 * The raw detail of the error returned by the WebDriver server.
  		 */
  var detail: js.Any
  /**
  		 * The parameters for the request.
  		 */
  var request: Anon_Method
  /**
  		 * The response object for the request.
  		 */
  //		response: request.IResponse;
  var response: js.Any
  /**
  		 * The stack trace for the request.
  		 */
  @JSName("stack")
  var stack_WebDriverError: String
  /**
  		 * The raw error status code returned by the WebDriver server.
  		 */
  var status: Double
}

object WebDriverError {
  @scala.inline
  def apply(
    detail: js.Any,
    message: String,
    name: String,
    request: Anon_Method,
    response: js.Any,
    stack: String,
    status: Double
  ): WebDriverError = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebDriverError]
  }
}

