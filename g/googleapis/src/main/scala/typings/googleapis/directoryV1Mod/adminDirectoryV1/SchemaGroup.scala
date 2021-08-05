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
  
  inline def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  
  extension [Self <: SchemaGroup](x: Self) {
    
    inline def setAdminCreated(value: Boolean): Self = StObject.set(x, "adminCreated", value.asInstanceOf[js.Any])
    
    inline def setAdminCreatedUndefined: Self = StObject.set(x, "adminCreated", js.undefined)
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDirectMembersCount(value: String): Self = StObject.set(x, "directMembersCount", value.asInstanceOf[js.Any])
    
    inline def setDirectMembersCountUndefined: Self = StObject.set(x, "directMembersCount", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNonEditableAliases(value: js.Array[String]): Self = StObject.set(x, "nonEditableAliases", value.asInstanceOf[js.Any])
    
    inline def setNonEditableAliasesUndefined: Self = StObject.set(x, "nonEditableAliases", js.undefined)
    
    inline def setNonEditableAliasesVarargs(value: String*): Self = StObject.set(x, "nonEditableAliases", js.Array(value :_*))
  }
}
