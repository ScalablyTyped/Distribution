package typings
package jsrpLib.jsrpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verifier extends js.Object {
  var salt: java.lang.String
  var verifier: java.lang.String
}

object Verifier {
  @scala.inline
  def apply(salt: java.lang.String, verifier: java.lang.String): Verifier = {
    val __obj = js.Dynamic.literal(salt = salt, verifier = verifier)
  
    __obj.asInstanceOf[Verifier]
  }
}

