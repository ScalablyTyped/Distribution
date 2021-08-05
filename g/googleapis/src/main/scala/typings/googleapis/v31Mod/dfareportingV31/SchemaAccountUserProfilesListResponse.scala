package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Account User Profile List Response
  */
trait SchemaAccountUserProfilesListResponse extends StObject {
  
  /**
    * Account user profile collection.
    */
  var accountUserProfiles: js.UndefOr[js.Array[SchemaAccountUserProfile]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountUserProfilesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaAccountUserProfilesListResponse {
  
  inline def apply(): SchemaAccountUserProfilesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUserProfilesListResponse]
  }
  
  extension [Self <: SchemaAccountUserProfilesListResponse](x: Self) {
    
    inline def setAccountUserProfiles(value: js.Array[SchemaAccountUserProfile]): Self = StObject.set(x, "accountUserProfiles", value.asInstanceOf[js.Any])
    
    inline def setAccountUserProfilesUndefined: Self = StObject.set(x, "accountUserProfiles", js.undefined)
    
    inline def setAccountUserProfilesVarargs(value: SchemaAccountUserProfile*): Self = StObject.set(x, "accountUserProfiles", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
