package typings.keystonejsAuthPassword.mod

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
    val __obj = js.Dynamic.literal(identityField = identityField.asInstanceOf[js.Any], secretField = secretField.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordAuthStrategyConfig]
  }
}

