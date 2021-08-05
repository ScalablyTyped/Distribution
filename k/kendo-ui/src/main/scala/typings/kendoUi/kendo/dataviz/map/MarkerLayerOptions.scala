package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object MarkerLayerOptions {
  
  inline def apply(): MarkerLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerLayerOptions]
  }
  
  extension [Self <: MarkerLayerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
