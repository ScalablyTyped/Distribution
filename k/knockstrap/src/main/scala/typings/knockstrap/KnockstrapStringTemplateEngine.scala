package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutNativeTemplateEngine * / any */ @js.native
trait KnockstrapStringTemplateEngine extends js.Object {
  
  def addTemplate(name: String, template: js.Any): Unit = js.native
  
  var allowTemplateRewriting: Boolean = js.native
  
  def getTemplate(name: String): js.Any = js.native
  
  def isTemplateExist(name: String): Boolean = js.native
  
  def makeTemplateSource(template: String): KnockstrapStringTemplate = js.native
  
  def removeTemplate(name: String): Unit = js.native
}
object KnockstrapStringTemplateEngine {
  
  @scala.inline
  def apply(
    addTemplate: (String, js.Any) => Unit,
    allowTemplateRewriting: Boolean,
    getTemplate: String => js.Any,
    isTemplateExist: String => Boolean,
    makeTemplateSource: String => KnockstrapStringTemplate,
    removeTemplate: String => Unit
  ): KnockstrapStringTemplateEngine = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), allowTemplateRewriting = allowTemplateRewriting.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), isTemplateExist = js.Any.fromFunction1(isTemplateExist), makeTemplateSource = js.Any.fromFunction1(makeTemplateSource), removeTemplate = js.Any.fromFunction1(removeTemplate))
    __obj.asInstanceOf[KnockstrapStringTemplateEngine]
  }
  
  @scala.inline
  implicit class KnockstrapStringTemplateEngineOps[Self <: KnockstrapStringTemplateEngine] (val x: Self) extends AnyVal {
    
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
    def setAddTemplate(value: (String, js.Any) => Unit): Self = this.set("addTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAllowTemplateRewriting(value: Boolean): Self = this.set("allowTemplateRewriting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTemplate(value: String => js.Any): Self = this.set("getTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsTemplateExist(value: String => Boolean): Self = this.set("isTemplateExist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeTemplateSource(value: String => KnockstrapStringTemplate): Self = this.set("makeTemplateSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTemplate(value: String => Unit): Self = this.set("removeTemplate", js.Any.fromFunction1(value))
  }
}
