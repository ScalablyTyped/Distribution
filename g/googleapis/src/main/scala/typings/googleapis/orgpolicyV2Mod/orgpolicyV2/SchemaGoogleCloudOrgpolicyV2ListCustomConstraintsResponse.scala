package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse extends StObject {
  
  /**
    * All `CustomConstraints` that exist on the organization resource. It will be empty if no `CustomConstraints` are set.
    */
  var customConstraints: js.UndefOr[js.Array[SchemaGoogleCloudOrgpolicyV2CustomConstraint]] = js.undefined
  
  /**
    * Page token used to retrieve the next page. This is currently not used, but the server may at any point start supplying a valid token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2ListCustomConstraintsResponse](x: Self) {
    
    inline def setCustomConstraints(value: js.Array[SchemaGoogleCloudOrgpolicyV2CustomConstraint]): Self = StObject.set(x, "customConstraints", value.asInstanceOf[js.Any])
    
    inline def setCustomConstraintsUndefined: Self = StObject.set(x, "customConstraints", js.undefined)
    
    inline def setCustomConstraintsVarargs(value: SchemaGoogleCloudOrgpolicyV2CustomConstraint*): Self = StObject.set(x, "customConstraints", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
