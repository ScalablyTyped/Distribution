package typings.htmlDomParser

import typings.domhandler.mod.Comment
import typings.domhandler.mod.DomHandlerOptions
import typings.domhandler.mod.Element
import typings.domhandler.mod.ProcessingInstruction
import typings.domhandler.mod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServerHtmlToDomMod {
  
  @JSImport("html-dom-parser/lib/server/html-to-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): js.Array[Comment | Element | ProcessingInstruction | Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
  inline def default(html: String, options: DomHandlerOptions): js.Array[Comment | Element | ProcessingInstruction | Text] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment | Element | ProcessingInstruction | Text]]
}
