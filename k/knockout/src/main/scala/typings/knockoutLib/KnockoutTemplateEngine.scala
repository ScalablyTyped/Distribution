package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////
// templateEngine.js
//////////////////////////////////
@js.native
trait KnockoutTemplateEngine extends js.Object {
  def createJavaScriptEvaluatorBlock(script: java.lang.String): java.lang.String = js.native
  def isTemplateRewritten(template: js.Any, templateDocument: stdLib.Document): scala.Boolean = js.native
  def makeTemplateSource(template: js.Any): js.Any = js.native
  def makeTemplateSource(template: js.Any, templateDocument: stdLib.Document): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    bindingContext: KnockoutBindingContext,
    options: js.Object,
    templateDocument: stdLib.Document
  ): js.Any = js.native
  def rewriteTemplate(template: js.Any, rewriterCallback: js.Function, templateDocument: stdLib.Document): scala.Unit = js.native
}

