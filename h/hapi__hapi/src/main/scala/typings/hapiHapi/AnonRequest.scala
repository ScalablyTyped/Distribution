package typings.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  /**
    * decorations on the request object.
    */
  var request: js.Array[String]
  /**
    * decorations on the server object.
    */
  var server: js.Array[String]
  /**
    * decorations on the response toolkit.
    */
  var toolkit: js.Array[String]
}

object AnonRequest {
  @scala.inline
  def apply(request: js.Array[String], server: js.Array[String], toolkit: js.Array[String]): AnonRequest = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], toolkit = toolkit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequest]
  }
}

