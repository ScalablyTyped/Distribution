package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HashAlgHashValue extends js.Object {
  var hashAlg: String
  var hashValue: String
}

object Anon_HashAlgHashValue {
  @scala.inline
  def apply(hashAlg: String, hashValue: String): Anon_HashAlgHashValue = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg, hashValue = hashValue)
  
    __obj.asInstanceOf[Anon_HashAlgHashValue]
  }
}

