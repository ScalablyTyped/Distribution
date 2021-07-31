package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template to list domain aliases in Directory API.
  */
trait SchemaDomainAliases extends StObject {
  
  /**
    * List of domain alias objects.
    */
  var domainAliases: js.UndefOr[js.Array[SchemaDomainAlias]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaDomainAliases {
  
  @scala.inline
  def apply(): SchemaDomainAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainAliases]
  }
  
  @scala.inline
  implicit class SchemaDomainAliasesMutableBuilder[Self <: SchemaDomainAliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainAliases(value: js.Array[SchemaDomainAlias]): Self = StObject.set(x, "domainAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAliasesUndefined: Self = StObject.set(x, "domainAliases", js.undefined)
    
    @scala.inline
    def setDomainAliasesVarargs(value: SchemaDomainAlias*): Self = StObject.set(x, "domainAliases", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
