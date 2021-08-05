package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the list of user profiles.
  */
trait SchemaUserProfileList extends StObject {
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The user profiles returned in this response.
    */
  var items: js.UndefOr[js.Array[SchemaUserProfile]] = js.undefined
  
  /**
    * The kind of list this is, in this case dfareporting#userProfileList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaUserProfileList {
  
  inline def apply(): SchemaUserProfileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfileList]
  }
  
  extension [Self <: SchemaUserProfileList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaUserProfile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaUserProfile*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
