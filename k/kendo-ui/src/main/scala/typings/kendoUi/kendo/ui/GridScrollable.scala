package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridScrollable extends StObject {
  
  var endless: js.UndefOr[Boolean] = js.undefined
  
  var virtual: js.UndefOr[Boolean | String] = js.undefined
}
object GridScrollable {
  
  inline def apply(): GridScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridScrollable]
  }
  
  extension [Self <: GridScrollable](x: Self) {
    
    inline def setEndless(value: Boolean): Self = StObject.set(x, "endless", value.asInstanceOf[js.Any])
    
    inline def setEndlessUndefined: Self = StObject.set(x, "endless", js.undefined)
    
    inline def setVirtual(value: Boolean | String): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
