package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddSheetResponse extends StObject {
  
  /**
    * The properties of the newly added sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.undefined
}
object SchemaAddSheetResponse {
  
  inline def apply(): SchemaAddSheetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetResponse]
  }
  
  extension [Self <: SchemaAddSheetResponse](x: Self) {
    
    inline def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
