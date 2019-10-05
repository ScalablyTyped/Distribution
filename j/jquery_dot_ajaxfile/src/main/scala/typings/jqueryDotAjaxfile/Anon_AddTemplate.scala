package typings.jqueryDotAjaxfile

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit
  def createJavaScriptEvaluatorBlock(script: String): String
  def renderTemplateSource(templateSource: Object, bindingContext: KnockoutBindingContext, options: Object): js.Array[Node]
}

object Anon_AddTemplate {
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (Object, KnockoutBindingContext, Object) => js.Array[Node]
  ): Anon_AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
  
    __obj.asInstanceOf[Anon_AddTemplate]
  }
}

