package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrinterModel extends StObject {
  
  /**
    * Display name. eq. "Brother MFC-8840D"
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Make and model as represented in "make_and_model" field in Printer object. eq. "brother mfc-8840d"
    */
  var makeAndModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Manufacturer. eq. "Brother"
    */
  var manufacturer: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrinterModel {
  
  inline def apply(): SchemaPrinterModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrinterModel]
  }
  
  extension [Self <: SchemaPrinterModel](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMakeAndModel(value: String): Self = StObject.set(x, "makeAndModel", value.asInstanceOf[js.Any])
    
    inline def setMakeAndModelNull: Self = StObject.set(x, "makeAndModel", null)
    
    inline def setMakeAndModelUndefined: Self = StObject.set(x, "makeAndModel", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerNull: Self = StObject.set(x, "manufacturer", null)
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
  }
}
