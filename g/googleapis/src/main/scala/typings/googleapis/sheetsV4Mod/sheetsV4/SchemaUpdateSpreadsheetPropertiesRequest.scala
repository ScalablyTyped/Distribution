package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Updates properties of a spreadsheet.
  */
trait SchemaUpdateSpreadsheetPropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated.  At least one field must be specified.
    * The root &#39;properties&#39; is implied and should not be specified. A
    * single `&quot;*&quot;` can be used as short-hand for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The properties to update.
    */
  var properties: js.UndefOr[SchemaSpreadsheetProperties] = js.undefined
}
object SchemaUpdateSpreadsheetPropertiesRequest {
  
  inline def apply(): SchemaUpdateSpreadsheetPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSpreadsheetPropertiesRequest]
  }
  
  extension [Self <: SchemaUpdateSpreadsheetPropertiesRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setProperties(value: SchemaSpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
