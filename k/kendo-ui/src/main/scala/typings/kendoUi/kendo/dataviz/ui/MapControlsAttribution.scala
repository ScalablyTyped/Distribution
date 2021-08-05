package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlsAttribution extends StObject {
  
  var position: js.UndefOr[String] = js.undefined
}
object MapControlsAttribution {
  
  inline def apply(): MapControlsAttribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlsAttribution]
  }
  
  extension [Self <: MapControlsAttribution](x: Self) {
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
