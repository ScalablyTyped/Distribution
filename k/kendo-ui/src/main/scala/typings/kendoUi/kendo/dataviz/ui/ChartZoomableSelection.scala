package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomableSelection extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var lock: js.UndefOr[String] = js.undefined
}
object ChartZoomableSelection {
  
  inline def apply(): ChartZoomableSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomableSelection]
  }
  
  extension [Self <: ChartZoomableSelection](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLock(value: String): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
  }
}
