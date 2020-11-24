package typings.knockoutPaging.anon

import typings.knockoutPaging.KnockoutBindingContext
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTemplate extends js.Object {
  
  def addTemplate(templateName: String, templateMarkup: String): Unit = js.native
  
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node] = js.native
}
object AddTemplate {
  
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
  ): AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AddTemplate]
  }
  
  @scala.inline
  implicit class AddTemplateOps[Self <: AddTemplate] (val x: Self) extends AnyVal {
    
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
    def setAddTemplate(value: (String, String) => Unit): Self = this.set("addTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = this.set("createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTemplateSource(value: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]): Self = this.set("renderTemplateSource", js.Any.fromFunction3(value))
  }
}
