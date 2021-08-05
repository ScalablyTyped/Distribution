package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for EntityTypes.ListEntityTypes.
  */
trait SchemaGoogleCloudDialogflowV2ListEntityTypesResponse extends StObject {
  
  /**
    * The list of agent entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityType]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListEntityTypesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListEntityTypesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListEntityTypesResponse](x: Self) {
    
    inline def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
