package typings.htmlDomParser

import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClientDomparserMod {
  
  @JSImport("html-dom-parser/lib/client/domparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): NodeList = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[NodeList]
}
