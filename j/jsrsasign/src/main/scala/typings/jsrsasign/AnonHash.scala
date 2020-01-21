package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  var hash: AnonAlg
  var oid: String
}

object AnonHash {
  @scala.inline
  def apply(hash: AnonAlg, oid: String): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHash]
  }
}

