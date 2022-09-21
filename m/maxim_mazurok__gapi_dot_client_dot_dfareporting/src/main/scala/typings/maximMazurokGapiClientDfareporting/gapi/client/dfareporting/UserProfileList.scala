package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserProfileList extends StObject {
  
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The user profiles returned in this response. */
  var items: js.UndefOr[js.Array[UserProfile]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#userProfileList". */
  var kind: js.UndefOr[String] = js.undefined
}
object UserProfileList {
  
  inline def apply(): UserProfileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfileList]
  }
  
  extension [Self <: UserProfileList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[UserProfile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: UserProfile*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
