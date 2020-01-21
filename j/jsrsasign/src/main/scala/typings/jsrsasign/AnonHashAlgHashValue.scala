package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashAlgHashValue extends js.Object {
  var hashAlg: String
  var hashValue: String
}

object AnonHashAlgHashValue {
  @scala.inline
  def apply(hashAlg: String, hashValue: String): AnonHashAlgHashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], hashValue = hashValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashAlgHashValue]
  }
}

