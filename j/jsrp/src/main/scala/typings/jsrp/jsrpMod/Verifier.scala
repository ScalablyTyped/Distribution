package typings.jsrp.jsrpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verifier extends js.Object {
  var salt: String
  var verifier: String
}

object Verifier {
  @scala.inline
  def apply(salt: String, verifier: String): Verifier = {
    val __obj = js.Dynamic.literal(salt = salt.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Verifier]
  }
}

