package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List roleAssignments operation in Directory API.
  */
trait SchemaRoleAssignments extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * A list of RoleAssignment resources.
    */
  var items: js.UndefOr[js.Array[SchemaRoleAssignment]] = js.undefined
  
  /**
    * The type of the API resource. This is always
    * admin#directory#roleAssignments.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaRoleAssignments {
  
  @scala.inline
  def apply(): SchemaRoleAssignments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoleAssignments]
  }
  
  @scala.inline
  implicit class SchemaRoleAssignmentsMutableBuilder[Self <: SchemaRoleAssignments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaRoleAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaRoleAssignment*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
