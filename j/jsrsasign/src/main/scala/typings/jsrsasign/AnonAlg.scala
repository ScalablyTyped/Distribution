package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlg extends js.Object {
  var alg: String
  var hash: String
}

object AnonAlg {
  @scala.inline
  def apply(alg: String, hash: String): AnonAlg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlg]
  }
}

