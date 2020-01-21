package typings.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * An object containing any HTTP headers where each key is a header name and value is the header content
    */
  var headers: js.Object
  /**
    * The formatted object used as the response payload (stringified)
    */
  var payload: Payload
  /**
    * The HTTP status code
    */
  var statusCode: Double
}

object Output {
  @scala.inline
  def apply(headers: js.Object, payload: Payload, statusCode: Double): Output = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Output]
  }
}

