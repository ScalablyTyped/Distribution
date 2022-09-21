package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateBandingRequest extends StObject {
  
  /**
    * The banded range to update with the new properties.
    */
  var bandedRange: js.UndefOr[SchemaBandedRange] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `bandedRange` is implied and should not be specified. A single `"*"` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpdateBandingRequest {
  
  inline def apply(): SchemaUpdateBandingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateBandingRequest]
  }
  
  extension [Self <: SchemaUpdateBandingRequest](x: Self) {
    
    inline def setBandedRange(value: SchemaBandedRange): Self = StObject.set(x, "bandedRange", value.asInstanceOf[js.Any])
    
    inline def setBandedRangeUndefined: Self = StObject.set(x, "bandedRange", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
