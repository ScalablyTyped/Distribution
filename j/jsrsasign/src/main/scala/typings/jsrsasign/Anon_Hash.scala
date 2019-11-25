package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: Anon_Alg
  var oid: String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: Anon_Alg, oid: String): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hash]
  }
}

