package typings.jws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var header: Header
  var payload: js.Any
  var signature: String
}

object Signature {
  @scala.inline
  def apply(header: Header, payload: js.Any, signature: String): Signature = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Signature]
  }
}

