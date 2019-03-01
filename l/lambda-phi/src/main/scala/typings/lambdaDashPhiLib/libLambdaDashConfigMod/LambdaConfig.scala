package typings
package lambdaDashPhiLib.libLambdaDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaConfig extends js.Object {
  var allowNullInjection: scala.Boolean
}

object LambdaConfig {
  @scala.inline
  def apply(allowNullInjection: scala.Boolean): LambdaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowNullInjection")(allowNullInjection)
    __obj.asInstanceOf[LambdaConfig]
  }
}

