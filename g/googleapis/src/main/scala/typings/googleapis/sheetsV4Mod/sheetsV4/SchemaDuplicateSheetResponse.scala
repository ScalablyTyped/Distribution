package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDuplicateSheetResponse extends StObject {
  
  /**
    * The properties of the duplicate sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.undefined
}
object SchemaDuplicateSheetResponse {
  
  inline def apply(): SchemaDuplicateSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDuplicateSheetResponse]
  }
  
  extension [Self <: SchemaDuplicateSheetResponse](x: Self) {
    
    inline def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
