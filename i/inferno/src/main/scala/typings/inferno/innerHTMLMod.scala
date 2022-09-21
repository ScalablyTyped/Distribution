package typings.inferno

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object innerHTMLMod {
  
  @JSImport("inferno/dist/DOM/utils/innerHTML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSameInnerHTML(dom: Element, innerHTML: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSameInnerHTML")(dom.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
