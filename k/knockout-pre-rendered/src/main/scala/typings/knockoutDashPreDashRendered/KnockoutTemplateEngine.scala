package typings.knockoutDashPreDashRendered

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// templateEngine.js
//////////////////////////////////
@js.native
trait KnockoutTemplateEngine extends KnockoutNativeTemplateEngine {
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  def isTemplateRewritten(template: js.Any, templateDocument: Document): Boolean = js.native
  def makeTemplateSource(template: js.Any): js.Any = js.native
  def makeTemplateSource(template: js.Any, templateDocument: Document): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    bindingContext: KnockoutBindingContext,
    options: js.Object,
    templateDocument: Document
  ): js.Any = js.native
  def rewriteTemplate(template: js.Any, rewriterCallback: js.Function, templateDocument: Document): Unit = js.native
}

