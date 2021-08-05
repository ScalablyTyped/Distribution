package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template to list aliases in Directory API.
  */
trait SchemaAliases extends StObject {
  
  /**
    * List of alias objects.
    */
  var aliases: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAliases {
  
  inline def apply(): SchemaAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliases]
  }
  
  extension [Self <: SchemaAliases](x: Self) {
    
    inline def setAliases(value: js.Array[js.Any]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: js.Any*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
