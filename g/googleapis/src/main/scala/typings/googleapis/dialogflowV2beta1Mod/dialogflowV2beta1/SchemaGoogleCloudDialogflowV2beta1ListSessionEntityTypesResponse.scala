package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for SessionEntityTypes.ListSessionEntityTypes.
  */
trait SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of session entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    inline def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    inline def setSessionEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
  }
}
