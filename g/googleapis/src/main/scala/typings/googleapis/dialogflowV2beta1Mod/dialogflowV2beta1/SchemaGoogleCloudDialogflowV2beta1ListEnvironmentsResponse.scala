package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListEnvironmentsResponse extends StObject {
  
  /**
    * The list of agent environments. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var environments: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Environment]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListEnvironmentsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListEnvironmentsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironments(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Environment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Environment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
