package typings.knockoutPreRendered

import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////////////////
// templateEngine.js
//////////////////////////////////
@js.native
trait KnockoutTemplateEngine
  extends StObject
     with KnockoutNativeTemplateEngine {
  
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  
  def isTemplateRewritten(template: Any, templateDocument: Document): Boolean = js.native
  
  def makeTemplateSource(template: Any): Any = js.native
  def makeTemplateSource(template: Any, templateDocument: Document): Any = js.native
  
  def renderTemplate(
    template: Any,
    bindingContext: KnockoutBindingContext,
    options: js.Object,
    templateDocument: Document
  ): Any = js.native
  
  def rewriteTemplate(template: Any, rewriterCallback: js.Function, templateDocument: Document): Unit = js.native
}
