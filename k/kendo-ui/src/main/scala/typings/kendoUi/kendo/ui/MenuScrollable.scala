package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuScrollable extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
}
object MenuScrollable {
  
  inline def apply(): MenuScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuScrollable]
  }
  
  extension [Self <: MenuScrollable](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
  }
}
