package typings.googleapis.v32Mod.dfareportingV32

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
  
  @scala.inline
  def apply(): SchemaUserProfileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserProfileList]
  }
  
  @scala.inline
  implicit class SchemaUserProfileListMutableBuilder[Self <: SchemaUserProfileList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaUserProfile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaUserProfile*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
