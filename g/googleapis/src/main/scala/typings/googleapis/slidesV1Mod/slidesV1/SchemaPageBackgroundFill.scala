package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPageBackgroundFill extends StObject {
  
  /**
    * The background fill property state. Updating the fill on a page will implicitly update this field to `RENDERED`, unless another value is specified in the same request. To have no fill on a page, set this field to `NOT_RENDERED`. In this case, any other fill fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Solid color fill.
    */
  var solidFill: js.UndefOr[SchemaSolidFill] = js.undefined
  
  /**
    * Stretched picture fill.
    */
  var stretchedPictureFill: js.UndefOr[SchemaStretchedPictureFill] = js.undefined
}
object SchemaPageBackgroundFill {
  
  inline def apply(): SchemaPageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageBackgroundFill]
  }
  
  extension [Self <: SchemaPageBackgroundFill](x: Self) {
    
    inline def setPropertyState(value: String): Self = StObject.set(x, "propertyState", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateNull: Self = StObject.set(x, "propertyState", null)
    
    inline def setPropertyStateUndefined: Self = StObject.set(x, "propertyState", js.undefined)
    
    inline def setSolidFill(value: SchemaSolidFill): Self = StObject.set(x, "solidFill", value.asInstanceOf[js.Any])
    
    inline def setSolidFillUndefined: Self = StObject.set(x, "solidFill", js.undefined)
    
    inline def setStretchedPictureFill(value: SchemaStretchedPictureFill): Self = StObject.set(x, "stretchedPictureFill", value.asInstanceOf[js.Any])
    
    inline def setStretchedPictureFillUndefined: Self = StObject.set(x, "stretchedPictureFill", js.undefined)
  }
}
