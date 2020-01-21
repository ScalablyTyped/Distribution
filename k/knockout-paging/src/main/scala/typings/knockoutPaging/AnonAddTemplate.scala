package typings.knockoutPaging

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddTemplate extends js.Object {
  def addTemplate(templateName: String, templateMarkup: String): Unit
  def createJavaScriptEvaluatorBlock(script: String): String
  def renderTemplateSource(templateSource: js.Object, bindingContext: KnockoutBindingContext, options: js.Object): js.Array[Node]
}

object AnonAddTemplate {
  @scala.inline
  def apply(
    addTemplate: (String, String) => Unit,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (js.Object, KnockoutBindingContext, js.Object) => js.Array[Node]
  ): AnonAddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2(addTemplate), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
  
    __obj.asInstanceOf[AnonAddTemplate]
  }
}

