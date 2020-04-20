package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashValue extends js.Object {
  var hashAlg: String
  var hashValue: String
}

object AnonHashValue {
  @scala.inline
  def apply(hashAlg: String, hashValue: String): AnonHashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHashValue]
  }
}

