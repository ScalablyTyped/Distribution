package typings.knockoutAmdHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var amdTemplateEngine: KnockoutAMDTemplate = js.native
}

object KnockoutStatic {
  @scala.inline
  def apply(amdTemplateEngine: KnockoutAMDTemplate): KnockoutStatic = {
    val __obj = js.Dynamic.literal(amdTemplateEngine = amdTemplateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  @scala.inline
  implicit class KnockoutStaticOps[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
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
    def setAmdTemplateEngine(value: KnockoutAMDTemplate): Self = this.set("amdTemplateEngine", value.asInstanceOf[js.Any])
  }
  
}

