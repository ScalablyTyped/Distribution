package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fill of the border.
  */
trait SchemaTableBorderFill extends StObject {
  
  /**
    * Solid fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
}
object SchemaTableBorderFill {
  
  inline def apply(): SchemaTableBorderFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderFill]
  }
  
  extension [Self <: SchemaTableBorderFill](x: Self) {
    
    inline def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
