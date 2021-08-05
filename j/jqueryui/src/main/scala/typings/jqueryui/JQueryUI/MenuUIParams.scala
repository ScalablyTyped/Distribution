package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuUIParams extends StObject {
  
  var item: js.UndefOr[JQuery] = js.undefined
}
object MenuUIParams {
  
  inline def apply(): MenuUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuUIParams]
  }
  
  extension [Self <: MenuUIParams](x: Self) {
    
    inline def setItem(value: JQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
