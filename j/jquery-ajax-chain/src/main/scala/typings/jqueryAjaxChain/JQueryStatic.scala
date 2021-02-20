package typings.jqueryAjaxChain

import typings.jqueryAjaxChain.ajaxChain.JQueryAjaxChainStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * JQueryAjaxChain constructor
    */
  var AjaxChain: JQueryAjaxChainStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(AjaxChain: JQueryAjaxChainStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(AjaxChain = AjaxChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxChain(value: JQueryAjaxChainStatic): Self = StObject.set(x, "AjaxChain", value.asInstanceOf[js.Any])
  }
}
