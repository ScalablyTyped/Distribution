package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListScansResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Available scans based on the list query parameters.
    */
  var scans: js.UndefOr[js.Array[SchemaScan]] = js.undefined
}
object SchemaListScansResponse {
  
  inline def apply(): SchemaListScansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScansResponse]
  }
  
  extension [Self <: SchemaListScansResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScans(value: js.Array[SchemaScan]): Self = StObject.set(x, "scans", value.asInstanceOf[js.Any])
    
    inline def setScansUndefined: Self = StObject.set(x, "scans", js.undefined)
    
    inline def setScansVarargs(value: SchemaScan*): Self = StObject.set(x, "scans", js.Array(value*))
  }
}
