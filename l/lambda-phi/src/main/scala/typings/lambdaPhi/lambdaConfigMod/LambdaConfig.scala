package typings.lambdaPhi.lambdaConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaConfig extends js.Object {
  var allowNullInjection: Boolean = js.native
}

object LambdaConfig {
  @scala.inline
  def apply(allowNullInjection: Boolean): LambdaConfig = {
    val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfig]
  }
  @scala.inline
  implicit class LambdaConfigOps[Self <: LambdaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowNullInjection(value: Boolean): Self = this.set("allowNullInjection", value.asInstanceOf[js.Any])
  }
  
}

