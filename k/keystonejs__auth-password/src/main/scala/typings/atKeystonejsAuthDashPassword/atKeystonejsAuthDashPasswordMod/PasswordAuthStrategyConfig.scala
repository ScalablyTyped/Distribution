package typings.atKeystonejsAuthDashPassword.atKeystonejsAuthDashPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordAuthStrategyConfig extends js.Object {
  var identityField: String
  var secretField: String
}

object PasswordAuthStrategyConfig {
  @scala.inline
  def apply(identityField: String, secretField: String): PasswordAuthStrategyConfig = {
    val __obj = js.Dynamic.literal(identityField = identityField, secretField = secretField)
  
    __obj.asInstanceOf[PasswordAuthStrategyConfig]
  }
}

