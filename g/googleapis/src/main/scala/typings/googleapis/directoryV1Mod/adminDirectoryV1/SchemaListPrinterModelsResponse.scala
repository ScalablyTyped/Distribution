package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPrinterModelsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Printer models that are currently allowed to be configured for ChromeOs. Some printers may be added or removed over time.
    */
  var printerModels: js.UndefOr[js.Array[SchemaPrinterModel]] = js.undefined
}
object SchemaListPrinterModelsResponse {
  
  inline def apply(): SchemaListPrinterModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPrinterModelsResponse]
  }
  
  extension [Self <: SchemaListPrinterModelsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPrinterModels(value: js.Array[SchemaPrinterModel]): Self = StObject.set(x, "printerModels", value.asInstanceOf[js.Any])
    
    inline def setPrinterModelsUndefined: Self = StObject.set(x, "printerModels", js.undefined)
    
    inline def setPrinterModelsVarargs(value: SchemaPrinterModel*): Self = StObject.set(x, "printerModels", js.Array(value*))
  }
}
