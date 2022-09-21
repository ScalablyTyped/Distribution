package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPretargetingConfigsResponse extends StObject {
  
  /**
    * A token which can be passed to a subsequent call to the `ListPretargetingConfigs` method to retrieve the next page of results in ListPretargetingConfigsRequest.pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of pretargeting configurations.
    */
  var pretargetingConfigs: js.UndefOr[js.Array[SchemaPretargetingConfig]] = js.undefined
}
object SchemaListPretargetingConfigsResponse {
  
  inline def apply(): SchemaListPretargetingConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPretargetingConfigsResponse]
  }
  
  extension [Self <: SchemaListPretargetingConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPretargetingConfigs(value: js.Array[SchemaPretargetingConfig]): Self = StObject.set(x, "pretargetingConfigs", value.asInstanceOf[js.Any])
    
    inline def setPretargetingConfigsUndefined: Self = StObject.set(x, "pretargetingConfigs", js.undefined)
    
    inline def setPretargetingConfigsVarargs(value: SchemaPretargetingConfig*): Self = StObject.set(x, "pretargetingConfigs", js.Array(value*))
  }
}
