package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The border styling properties of the TableBorderCell.
  */
trait SchemaTableBorderProperties extends StObject {
  
  /**
    * The dash style of the border.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The fill of the table border.
    */
  var tableBorderFill: js.UndefOr[SchemaTableBorderFill] = js.undefined
  
  /**
    * The thickness of the border.
    */
  var weight: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaTableBorderProperties {
  
  inline def apply(): SchemaTableBorderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderProperties]
  }
  
  extension [Self <: SchemaTableBorderProperties](x: Self) {
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setTableBorderFill(value: SchemaTableBorderFill): Self = StObject.set(x, "tableBorderFill", value.asInstanceOf[js.Any])
    
    inline def setTableBorderFillUndefined: Self = StObject.set(x, "tableBorderFill", js.undefined)
    
    inline def setWeight(value: SchemaDimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
