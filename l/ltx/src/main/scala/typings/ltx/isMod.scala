package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMod {
  
  @JSImport("ltx/lib/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isElement(el: js.Any): /* is ltx.ltx/lib/Element.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/lib/Element.Element */ Boolean]
  
  @scala.inline
  def isNode(el: js.Any): /* is ltx.ltx/lib/Element.Node */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(el.asInstanceOf[js.Any]).asInstanceOf[/* is ltx.ltx/lib/Element.Node */ Boolean]
  
  @scala.inline
  def isText(el: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(el.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
}
