package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListZonesResponse extends StObject {
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * All GTM Zones of a GTM Container.
    */
  var zone: js.UndefOr[js.Array[SchemaZone]] = js.undefined
}
object SchemaListZonesResponse {
  
  inline def apply(): SchemaListZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListZonesResponse]
  }
  
  extension [Self <: SchemaListZonesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setZone(value: js.Array[SchemaZone]): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    
    inline def setZoneVarargs(value: SchemaZone*): Self = StObject.set(x, "zone", js.Array(value :_*))
  }
}
