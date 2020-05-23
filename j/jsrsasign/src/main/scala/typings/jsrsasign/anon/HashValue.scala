package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashValue extends js.Object {
  var hashAlg: String
  var hashValue: String
}

object HashValue {
  @scala.inline
  def apply(hashAlg: String, hashValue: String): HashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashValue]
  }
}

