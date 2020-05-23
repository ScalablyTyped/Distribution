package typings.jqueryAjaxfile.anon

import typings.jqueryAjaxfile.KnockoutBindingContext
import typings.jqueryAjaxfile.Object
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit
  def createJavaScriptEvaluatorBlock(script: String): String
  def renderTemplateSource(templateSource: Object, bindingContext: KnockoutBindingContext, options: Object): js.Array[Node]
}

object AddTemplate {
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (Object, KnockoutBindingContext, Object) => js.Array[Node]
  ): AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AddTemplate]
  }
}

