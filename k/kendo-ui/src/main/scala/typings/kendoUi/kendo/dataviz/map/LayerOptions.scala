package typings.kendoUi.kendo.dataviz.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object LayerOptions {
  
  inline def apply(): LayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptions]
  }
  
  extension [Self <: LayerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
