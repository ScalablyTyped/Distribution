package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
trait SchemaGdataDiffVersionResponse extends StObject {
  
  /**
    * gdata
    */
  var objectSizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * gdata
    */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object SchemaGdataDiffVersionResponse {
  
  inline def apply(): SchemaGdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataDiffVersionResponse]
  }
  
  extension [Self <: SchemaGdataDiffVersionResponse](x: Self) {
    
    inline def setObjectSizeBytes(value: String): Self = StObject.set(x, "objectSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeBytesUndefined: Self = StObject.set(x, "objectSizeBytes", js.undefined)
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
