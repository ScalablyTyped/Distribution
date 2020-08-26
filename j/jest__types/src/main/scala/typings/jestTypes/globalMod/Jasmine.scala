package typings.jestTypes.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jasmine extends js.Object {
  var _DEFAULT_TIMEOUT_INTERVAL: js.UndefOr[Double] = js.native
  var addMatchers: js.Function = js.native
}

object Jasmine {
  @scala.inline
  def apply(addMatchers: js.Function): Jasmine = {
    val __obj = js.Dynamic.literal(addMatchers = addMatchers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
  @scala.inline
  implicit class JasmineOps[Self <: Jasmine] (val x: Self) extends AnyVal {
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
    def setAddMatchers(value: js.Function): Self = this.set("addMatchers", value.asInstanceOf[js.Any])
    @scala.inline
    def set_DEFAULT_TIMEOUT_INTERVAL(value: Double): Self = this.set("_DEFAULT_TIMEOUT_INTERVAL", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_DEFAULT_TIMEOUT_INTERVAL: Self = this.set("_DEFAULT_TIMEOUT_INTERVAL", js.undefined)
  }
  
}

