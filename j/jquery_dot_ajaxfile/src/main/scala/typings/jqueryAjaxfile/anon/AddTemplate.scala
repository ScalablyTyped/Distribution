package typings.jqueryAjaxfile.anon

import typings.jqueryAjaxfile.KnockoutBindingContext
import typings.jqueryAjaxfile.Object
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTemplate extends StObject {
  
  def addTemplate(templateName: String, templateMarkup: String): Unit
  
  def createJavaScriptEvaluatorBlock(script: String): String
  
  def renderTemplateSource(templateSource: Object, bindingContext: KnockoutBindingContext, options: Object): js.Array[Node]
}
object AddTemplate {
  
  inline def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (Object, KnockoutBindingContext, Object) => js.Array[Node]
  ): AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AddTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTemplate] (val x: Self) extends AnyVal {
    
    inline def setAddTemplate(value: (String, String) => Unit): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2(value))
    
    inline def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
    
    inline def setRenderTemplateSource(value: (Object, KnockoutBindingContext, Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
  }
}
