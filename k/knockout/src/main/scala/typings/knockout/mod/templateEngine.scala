package typings.knockout.mod

import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("knockout", "templateEngine")
@js.native
open class templateEngine () extends StObject {
  
  var allowTemplateRewriting: Boolean = js.native
  
  def createJavaScriptEvaluatorBlock(script: String): String = js.native
  
  def isTemplateRewritten(template: String): Boolean = js.native
  def isTemplateRewritten(template: String, templateDocument: Document): Boolean = js.native
  def isTemplateRewritten(template: Node): Boolean = js.native
  def isTemplateRewritten(template: Node, templateDocument: Document): Boolean = js.native
  
  def makeTemplateSource(template: String): TemplateSource = js.native
  def makeTemplateSource(template: String, templateDocument: Document): TemplateSource = js.native
  def makeTemplateSource(template: Node): TemplateSource = js.native
  def makeTemplateSource(template: Node, templateDocument: Document): TemplateSource = js.native
  
  def renderTemplate(template: String, bindingContext: BindingContext[Any], options: TemplateOptions[Any]): js.Array[Node] = js.native
  def renderTemplate(
    template: String,
    bindingContext: BindingContext[Any],
    options: TemplateOptions[Any],
    templateDocument: Document
  ): js.Array[Node] = js.native
  def renderTemplate(template: Node, bindingContext: BindingContext[Any], options: TemplateOptions[Any]): js.Array[Node] = js.native
  def renderTemplate(
    template: Node,
    bindingContext: BindingContext[Any],
    options: TemplateOptions[Any],
    templateDocument: Document
  ): js.Array[Node] = js.native
  
  def renderTemplateSource(templateSource: TemplateSource, bindingContext: BindingContext[Any], options: TemplateOptions[Any]): js.Array[Node] = js.native
  def renderTemplateSource(
    templateSource: TemplateSource,
    bindingContext: BindingContext[Any],
    options: TemplateOptions[Any],
    templateDocument: Document
  ): js.Array[Node] = js.native
  
  def rewriteTemplate(template: String, rewriterCallback: js.Function1[/* val */ String, String]): Unit = js.native
  def rewriteTemplate(
    template: String,
    rewriterCallback: js.Function1[/* val */ String, String],
    templateDocument: Document
  ): Unit = js.native
  def rewriteTemplate(template: Node, rewriterCallback: js.Function1[/* val */ String, String]): Unit = js.native
  def rewriteTemplate(
    template: Node,
    rewriterCallback: js.Function1[/* val */ String, String],
    templateDocument: Document
  ): Unit = js.native
}
