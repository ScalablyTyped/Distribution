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
  
  inline def apply(): SchemaPrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivileges]
  }
  
  extension [Self <: SchemaPrivileges](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaPrivilege]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPrivilege*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
