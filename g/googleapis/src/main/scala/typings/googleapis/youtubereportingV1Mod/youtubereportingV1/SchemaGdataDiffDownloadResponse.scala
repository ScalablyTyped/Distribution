package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGdataDiffDownloadResponse extends StObject {
  
  /**
    * gdata
    */
  var objectLocation: js.UndefOr[SchemaGdataCompositeMedia] = js.undefined
}
object SchemaGdataDiffDownloadResponse {
  
  inline def apply(): SchemaGdataDiffDownloadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffDownloadResponse]
  }
  
  extension [Self <: SchemaGdataDiffDownloadResponse](x: Self) {
    
    inline def setObjectLocation(value: SchemaGdataCompositeMedia): Self = StObject.set(x, "objectLocation", value.asInstanceOf[js.Any])
    
    inline def setObjectLocationUndefined: Self = StObject.set(x, "objectLocation", js.undefined)
  }
}
