package typings.jqueryAjaxfile.anon

import typings.jqueryAjaxfile.KnockoutTemplateEngine
import typings.std.Document
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyMemoizedBindingsToNextSibling extends StObject {
  
  def applyMemoizedBindingsToNextSibling(bindings: Any, nodeName: String): String = js.native
  
  def ensureTemplateIsRewritten(template: String, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
  def ensureTemplateIsRewritten(template: Node, templateEngine: KnockoutTemplateEngine, templateDocument: Document): Any = js.native
  
  def memoizeBindingAttributeSyntax(htmlString: String, templateEngine: KnockoutTemplateEngine): Any = js.native
}
