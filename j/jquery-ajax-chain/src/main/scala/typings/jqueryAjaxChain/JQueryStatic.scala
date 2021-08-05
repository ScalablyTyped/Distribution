package typings.jqueryAjaxChain

import typings.jqueryAjaxChain.ajaxChain.JQueryAjaxChainStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * JQueryAjaxChain constructor
    */
  var AjaxChain: JQueryAjaxChainStatic
}
object JQueryStatic {
  
  inline def apply(AjaxChain: JQueryAjaxChainStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(AjaxChain = AjaxChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setAjaxChain(value: JQueryAjaxChainStatic): Self = StObject.set(x, "AjaxChain", value.asInstanceOf[js.Any])
  }
}
