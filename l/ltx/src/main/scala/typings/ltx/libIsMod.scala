package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsMod {
  
  @JSImport("ltx/lib/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElement(el: Any): /* is ltx.ltx/src/Element.default */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/src/Element.default */ Boolean]
  
  inline def isNode(el: Any): /* is ltx.ltx/src/Element.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/src/Element.Node */ Boolean]
  
  inline def isText(el: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(el.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
