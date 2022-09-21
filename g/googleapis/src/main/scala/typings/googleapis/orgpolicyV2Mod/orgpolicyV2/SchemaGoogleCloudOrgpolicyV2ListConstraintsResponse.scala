package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse extends StObject {
  
  /**
    * The collection of constraints that are available on the targeted resource.
    */
  var constraints: js.UndefOr[js.Array[SchemaGoogleCloudOrgpolicyV2Constraint]] = js.undefined
  
  /**
    * Page token used to retrieve the next page. This is currently not used.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2ListConstraintsResponse](x: Self) {
    
    inline def setConstraints(value: js.Array[SchemaGoogleCloudOrgpolicyV2Constraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    
    inline def setConstraintsVarargs(value: SchemaGoogleCloudOrgpolicyV2Constraint*): Self = StObject.set(x, "constraints", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
