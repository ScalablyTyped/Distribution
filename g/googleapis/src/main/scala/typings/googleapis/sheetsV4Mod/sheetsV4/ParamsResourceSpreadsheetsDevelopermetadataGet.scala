package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSpreadsheetsDevelopermetadataGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the developer metadata to retrieve.
    */
  var metadataId: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of the spreadsheet to retrieve metadata from.
    */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSpreadsheetsDevelopermetadataGet {
  
  inline def apply(): ParamsResourceSpreadsheetsDevelopermetadataGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSpreadsheetsDevelopermetadataGet]
  }
  
  extension [Self <: ParamsResourceSpreadsheetsDevelopermetadataGet](x: Self) {
    
    inline def setMetadataId(value: Double): Self = StObject.set(x, "metadataId", value.asInstanceOf[js.Any])
    
    inline def setMetadataIdUndefined: Self = StObject.set(x, "metadataId", js.undefined)
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
