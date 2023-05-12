package typings.htmlToPdfmake

import typings.htmlToPdfmake.anon.PartialwindowDOMWindowdef
import typings.pdfmake.interfacesMod.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(html: String): Content = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[Content]
  inline def apply(html: String, options: PartialwindowDOMWindowdef): Content = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Content]
  
  @JSImport("html-to-pdfmake", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
