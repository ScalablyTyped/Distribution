package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridGroupableMessages extends StObject {
  
  var empty: js.UndefOr[String] = js.undefined
}
object GridGroupableMessages {
  
  inline def apply(): GridGroupableMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGroupableMessages]
  }
  
  extension [Self <: GridGroupableMessages](x: Self) {
    
    inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
  }
}
