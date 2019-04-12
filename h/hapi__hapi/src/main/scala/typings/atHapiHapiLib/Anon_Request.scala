package typings
package atHapiHapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  /**
    * decorations on the request object.
    */
  var request: js.Array[java.lang.String]
  /**
    * decorations on the server object.
    */
  var server: js.Array[java.lang.String]
  /**
    * decorations on the response toolkit.
    */
  var toolkit: js.Array[java.lang.String]
}

object Anon_Request {
  @scala.inline
  def apply(
    request: js.Array[java.lang.String],
    server: js.Array[java.lang.String],
    toolkit: js.Array[java.lang.String]
  ): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request, server = server, toolkit = toolkit)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

