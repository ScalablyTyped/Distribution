package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompositeTypesListResponse extends StObject {
  
  /**
    * Output only. A list of resource composite types supported by Deployment Manager.
    */
  var compositeTypes: js.UndefOr[js.Array[SchemaCompositeType]] = js.undefined
  
  /**
    * A token used to continue a truncated list request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaCompositeTypesListResponse {
  
  inline def apply(): SchemaCompositeTypesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompositeTypesListResponse]
  }
  
  extension [Self <: SchemaCompositeTypesListResponse](x: Self) {
    
    inline def setCompositeTypes(value: js.Array[SchemaCompositeType]): Self = StObject.set(x, "compositeTypes", value.asInstanceOf[js.Any])
    
    inline def setCompositeTypesUndefined: Self = StObject.set(x, "compositeTypes", js.undefined)
    
    inline def setCompositeTypesVarargs(value: SchemaCompositeType*): Self = StObject.set(x, "compositeTypes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
