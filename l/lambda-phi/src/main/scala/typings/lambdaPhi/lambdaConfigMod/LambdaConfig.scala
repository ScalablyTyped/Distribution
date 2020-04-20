package typings.lambdaPhi.lambdaConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaConfig extends js.Object {
  var allowNullInjection: Boolean
}

object LambdaConfig {
  @scala.inline
  def apply(allowNullInjection: Boolean): LambdaConfig = {
    val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfig]
  }
}

