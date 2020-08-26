package typings.handsontable.anon

import typings.handsontable.handsontableStrings.custom
import typings.handsontable.mod.Handsontable.plugins.Endpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFunction extends js.Object {
  var `type`: custom = js.native
  def customFunction(endpoint: Endpoint): Double = js.native
}

object CustomFunction {
  @scala.inline
  def apply(customFunction: Endpoint => Double, `type`: custom): CustomFunction = {
    val __obj = js.Dynamic.literal(customFunction = js.Any.fromFunction1(customFunction))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFunction]
  }
  @scala.inline
  implicit class CustomFunctionOps[Self <: CustomFunction] (val x: Self) extends AnyVal {
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
    def setCustomFunction(value: Endpoint => Double): Self = this.set("customFunction", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: custom): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

