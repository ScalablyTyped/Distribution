package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlsZoom extends StObject {
  
  var position: js.UndefOr[String] = js.undefined
}
object MapControlsZoom {
  
  inline def apply(): MapControlsZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlsZoom]
  }
  
  extension [Self <: MapControlsZoom](x: Self) {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
