package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRunV2ListExecutionsResponse extends StObject {
  
  /**
    * The resulting list of Executions.
    */
  var executions: js.UndefOr[js.Array[SchemaGoogleCloudRunV2Execution]] = js.undefined
  
  /**
    * A token indicating there are more items than page_size. Use it in the next ListExecutions request to continue.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRunV2ListExecutionsResponse {
  
  inline def apply(): SchemaGoogleCloudRunV2ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRunV2ListExecutionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRunV2ListExecutionsResponse](x: Self) {
    
    inline def setExecutions(value: js.Array[SchemaGoogleCloudRunV2Execution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: SchemaGoogleCloudRunV2Execution*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
