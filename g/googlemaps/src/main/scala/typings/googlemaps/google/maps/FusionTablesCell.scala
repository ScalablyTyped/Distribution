package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesCell extends StObject {
  
  var columnName: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object FusionTablesCell {
  
  inline def apply(): FusionTablesCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesCell]
  }
  
  extension [Self <: FusionTablesCell](x: Self) {
    
    inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
