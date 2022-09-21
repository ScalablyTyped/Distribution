package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainAliases extends StObject {
  
  /**
    * List of domain alias objects.
    */
  var domainAliases: js.UndefOr[js.Array[SchemaDomainAlias]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDomainAliases {
  
  inline def apply(): SchemaDomainAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainAliases]
  }
  
  extension [Self <: SchemaDomainAliases](x: Self) {
    
    inline def setDomainAliases(value: js.Array[SchemaDomainAlias]): Self = StObject.set(x, "domainAliases", value.asInstanceOf[js.Any])
    
    inline def setDomainAliasesUndefined: Self = StObject.set(x, "domainAliases", js.undefined)
    
    inline def setDomainAliasesVarargs(value: SchemaDomainAlias*): Self = StObject.set(x, "domainAliases", js.Array(value*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
