package typings.jqueryBlockui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /** block user activity for the page */
  var blockUI: js.UndefOr[JQBlockUIStatic] = js.undefined
  
  /** unblock the page */
  var unblockUI: js.UndefOr[JQBlockUIStatic] = js.undefined
}
object JQueryStatic {
  
  inline def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setBlockUI(value: JQBlockUIStatic): Self = StObject.set(x, "blockUI", value.asInstanceOf[js.Any])
    
    inline def setBlockUIUndefined: Self = StObject.set(x, "blockUI", js.undefined)
    
    inline def setUnblockUI(value: JQBlockUIStatic): Self = StObject.set(x, "unblockUI", value.asInstanceOf[js.Any])
    
    inline def setUnblockUIUndefined: Self = StObject.set(x, "unblockUI", js.undefined)
  }
}
