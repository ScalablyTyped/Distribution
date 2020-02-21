package typings.jose.mod.JWT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeResult[T] extends js.Object {
  var header: js.Object
  var key: T
  var payload: js.Object
  var signature: String
}

object completeResult {
  @scala.inline
  def apply[T](header: js.Object, key: T, payload: js.Object, signature: String): completeResult[T] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[completeResult[T]]
  }
}

