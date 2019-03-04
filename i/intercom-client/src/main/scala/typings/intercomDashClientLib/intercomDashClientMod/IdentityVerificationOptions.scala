package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityVerificationOptions extends js.Object {
  var identifier: java.lang.String
  var secretKey: java.lang.String
}

object IdentityVerificationOptions {
  @scala.inline
  def apply(identifier: java.lang.String, secretKey: java.lang.String): IdentityVerificationOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier, secretKey = secretKey)
  
    __obj.asInstanceOf[IdentityVerificationOptions]
  }
}

