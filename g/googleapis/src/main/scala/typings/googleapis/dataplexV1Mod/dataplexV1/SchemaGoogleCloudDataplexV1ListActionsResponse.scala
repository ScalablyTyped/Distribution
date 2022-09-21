package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1ListActionsResponse extends StObject {
  
  /**
    * Actions under the given parent lake/zone/asset.
    */
  var actions: js.UndefOr[js.Array[SchemaGoogleCloudDataplexV1Action]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1ListActionsResponse {
  
  inline def apply(): SchemaGoogleCloudDataplexV1ListActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1ListActionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1ListActionsResponse](x: Self) {
    
    inline def setActions(value: js.Array[SchemaGoogleCloudDataplexV1Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: SchemaGoogleCloudDataplexV1Action*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
