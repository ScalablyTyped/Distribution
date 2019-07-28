package typings.lambdaDashPhi.libLambdaDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaConfig extends js.Object {
  var allowNullInjection: Boolean
}

object LambdaConfig {
  @scala.inline
  def apply(allowNullInjection: Boolean): LambdaConfig = {
    val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection)
  
    __obj.asInstanceOf[LambdaConfig]
  }
}

