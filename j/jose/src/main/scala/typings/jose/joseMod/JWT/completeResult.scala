package typings.jose.joseMod.JWT

import typings.jose.joseMod.JWK.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait completeResult extends js.Object {
  var header: js.Object
  var key: Key
  var payload: js.Object
  var signature: String
}

object completeResult {
  @scala.inline
  def apply(header: js.Object, key: Key, payload: js.Object, signature: String): completeResult = {
    val __obj = js.Dynamic.literal(header = header, key = key, payload = payload, signature = signature)
  
    __obj.asInstanceOf[completeResult]
  }
}

