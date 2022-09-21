package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddSheetRequest extends StObject {
  
  /**
    * The properties the new sheet should have. All properties are optional. The sheetId field is optional; if one is not set, an id will be randomly generated. (It is an error to specify the ID of a sheet that already exists.)
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.undefined
}
object SchemaAddSheetRequest {
  
  inline def apply(): SchemaAddSheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSheetRequest]
  }
  
  extension [Self <: SchemaAddSheetRequest](x: Self) {
    
    inline def setProperties(value: SchemaSheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
