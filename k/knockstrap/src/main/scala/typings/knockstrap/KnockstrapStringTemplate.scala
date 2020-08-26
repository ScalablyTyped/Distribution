package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutTemplateSourcesDomElement * / any */ @js.native
trait KnockstrapStringTemplate extends js.Object {
  var templateName: String = js.native
}

object KnockstrapStringTemplate {
  @scala.inline
  def apply(templateName: String): KnockstrapStringTemplate = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapStringTemplate]
  }
  @scala.inline
  implicit class KnockstrapStringTemplateOps[Self <: KnockstrapStringTemplate] (val x: Self) extends AnyVal {
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
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
  }
  
}

