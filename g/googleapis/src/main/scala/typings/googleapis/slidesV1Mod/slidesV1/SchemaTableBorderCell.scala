package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of each border cell.
  */
trait SchemaTableBorderCell extends StObject {
  
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.undefined
  
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.undefined
}
object SchemaTableBorderCell {
  
  inline def apply(): SchemaTableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderCell]
  }
  
  extension [Self <: SchemaTableBorderCell](x: Self) {
    
    inline def setLocation(value: SchemaTableCellLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTableBorderProperties(value: SchemaTableBorderProperties): Self = StObject.set(x, "tableBorderProperties", value.asInstanceOf[js.Any])
    
    inline def setTableBorderPropertiesUndefined: Self = StObject.set(x, "tableBorderProperties", js.undefined)
  }
}
