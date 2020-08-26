package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapDefaultsTemplateBase extends js.Object {
  var name: String = js.native
  var templateEngine: KnockstrapStringTemplateEngine = js.native
}

object KnockstrapDefaultsTemplateBase {
  @scala.inline
  def apply(name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapDefaultsTemplateBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapDefaultsTemplateBase]
  }
  @scala.inline
  implicit class KnockstrapDefaultsTemplateBaseOps[Self <: KnockstrapDefaultsTemplateBase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateEngine(value: KnockstrapStringTemplateEngine): Self = this.set("templateEngine", value.asInstanceOf[js.Any])
  }
  
}

