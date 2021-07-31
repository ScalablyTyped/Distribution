package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Group resource in Directory API.
  */
trait SchemaGroup extends StObject {
  
  /**
    * Is the group created by admin (Read-only) *
    */
  var adminCreated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of aliases (Read-only)
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Description of the group
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Group direct members count
    */
  var directMembersCount: js.UndefOr[String] = js.undefined
  
  /**
    * Email of Group
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of Group (Read-only)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Group name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * List of non editable aliases (Read-only)
    */
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGroup {
  
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  @scala.inline
  implicit class SchemaGroupMutableBuilder[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminCreated(value: Boolean): Self = StObject.set(x, "adminCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminCreatedUndefined: Self = StObject.set(x, "adminCreated", js.undefined)
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDirectMembersCount(value: String): Self = StObject.set(x, "directMembersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectMembersCountUndefined: Self = StObject.set(x, "directMembersCount", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNonEditableAliases(value: js.Array[String]): Self = StObject.set(x, "nonEditableAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEditableAliasesUndefined: Self = StObject.set(x, "nonEditableAliases", js.undefined)
    
    @scala.inline
    def setNonEditableAliasesVarargs(value: String*): Self = StObject.set(x, "nonEditableAliases", js.Array(value :_*))
  }
}
