package typings.intercomDashClient.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityVerificationOptions extends js.Object {
  var identifier: String
  var secretKey: String
}

object IdentityVerificationOptions {
  @scala.inline
  def apply(identifier: String, secretKey: String): IdentityVerificationOptions = {
    val __obj = js.Dynamic.literal(identifier = identifier, secretKey = secretKey)
  
    __obj.asInstanceOf[IdentityVerificationOptions]
  }
}

