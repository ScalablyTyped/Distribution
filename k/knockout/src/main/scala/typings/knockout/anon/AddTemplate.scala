package typings.knockout.anon

import typings.knockout.KnockoutBindingContext
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit
  def createJavaScriptEvaluatorBlock(script: String): String
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node]
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
}

