package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The fill of the outline.
  */
trait SchemaOutlineFill extends StObject {
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
}
object SchemaOutlineFill {
  
  inline def apply(): SchemaOutlineFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutlineFill]
  }
  
  extension [Self <: SchemaOutlineFill](x: Self) {
    
    inline def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
  }
}
