package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutNativeTemplateEngine * / any */ trait KnockstrapStringTemplateEngine extends StObject {
  
  def addTemplate(name: String, template: Any): Unit
  
  var allowTemplateRewriting: Boolean
  
  def getTemplate(name: String): Any
  
  def isTemplateExist(name: String): Boolean
  
  def makeTemplateSource(template: String): KnockstrapStringTemplate
  
  def removeTemplate(name: String): Unit
}
object KnockstrapStringTemplateEngine {
  
  inline def apply(
    addTemplate: (String, Any) => Unit,
    allowTemplateRewriting: Boolean,
    getTemplate: String => Any,
    isTemplateExist: String => Boolean,
    makeTemplateSource: String => KnockstrapStringTemplate,
    removeTemplate: String => Unit
  ): KnockstrapStringTemplateEngine = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), allowTemplateRewriting = allowTemplateRewriting.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), isTemplateExist = js.Any.fromFunction1(isTemplateExist), makeTemplateSource = js.Any.fromFunction1(makeTemplateSource), removeTemplate = js.Any.fromFunction1(removeTemplate))
    __obj.asInstanceOf[KnockstrapStringTemplateEngine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockstrapStringTemplateEngine] (val x: Self) extends AnyVal {
    
    inline def setAddTemplate(value: (String, Any) => Unit): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2(value))
    
    inline def setAllowTemplateRewriting(value: Boolean): Self = StObject.set(x, "allowTemplateRewriting", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: String => Any): Self = StObject.set(x, "getTemplate", js.Any.fromFunction1(value))
    
    inline def setIsTemplateExist(value: String => Boolean): Self = StObject.set(x, "isTemplateExist", js.Any.fromFunction1(value))
    
    inline def setMakeTemplateSource(value: String => KnockstrapStringTemplate): Self = StObject.set(x, "makeTemplateSource", js.Any.fromFunction1(value))
    
    inline def setRemoveTemplate(value: String => Unit): Self = StObject.set(x, "removeTemplate", js.Any.fromFunction1(value))
  }
}
