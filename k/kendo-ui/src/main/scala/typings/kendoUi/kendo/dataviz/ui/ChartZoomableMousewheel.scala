package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartZoomableMousewheel extends StObject {
  
  var lock: js.UndefOr[String] = js.undefined
}
object ChartZoomableMousewheel {
  
  inline def apply(): ChartZoomableMousewheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartZoomableMousewheel]
  }
  
  extension [Self <: ChartZoomableMousewheel](x: Self) {
    
    inline def setLock(value: String): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
  }
}
