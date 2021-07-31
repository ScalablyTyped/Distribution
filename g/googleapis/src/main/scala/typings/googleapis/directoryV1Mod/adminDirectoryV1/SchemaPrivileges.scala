package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List privileges operation in Directory API.
  */
trait SchemaPrivileges extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Privilege resources.
    */
  var items: js.UndefOr[js.Array[SchemaPrivilege]] = js.undefined
  
  /**
    * The type of the API resource. This is always admin#directory#privileges.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPrivileges {
  
  @scala.inline
  def apply(): SchemaPrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivileges]
  }
  
  @scala.inline
  implicit class SchemaPrivilegesMutableBuilder[Self <: SchemaPrivileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaPrivilege]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaPrivilege*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
