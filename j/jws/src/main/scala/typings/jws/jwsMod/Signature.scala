package typings.jws.jwsMod

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
    val __obj = js.Dynamic.literal(header = header, payload = payload, signature = signature)
  
    __obj.asInstanceOf[Signature]
  }
}

