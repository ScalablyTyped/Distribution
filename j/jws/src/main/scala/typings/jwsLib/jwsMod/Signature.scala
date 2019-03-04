package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var header: Header
  var payload: js.Any
  var signature: java.lang.String
}

object Signature {
  @scala.inline
  def apply(header: Header, payload: js.Any, signature: java.lang.String): Signature = {
    val __obj = js.Dynamic.literal(header = header, payload = payload, signature = signature)
  
    __obj.asInstanceOf[Signature]
  }
}

