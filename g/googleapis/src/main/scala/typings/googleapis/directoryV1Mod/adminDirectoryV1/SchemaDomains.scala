package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Domain object in Directory API.
  */
@js.native
trait SchemaDomains extends StObject {
  
  /**
    * Creation time of the domain. (Read-only).
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * List of domain alias objects. (Read-only)
    */
  var domainAliases: js.UndefOr[js.Array[SchemaDomainAlias]] = js.native
  
  /**
    * The domain name of the customer.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the domain is a primary domain (Read-only).
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Indicates the verification state of a domain. (Read-only).
    */
  var verified: js.UndefOr[Boolean] = js.native
}
object SchemaDomains {
  
  @scala.inline
  def apply(): SchemaDomains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomains]
  }
  
  @scala.inline
  implicit class SchemaDomainsMutableBuilder[Self <: SchemaDomains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDomainAliases(value: js.Array[SchemaDomainAlias]): Self = StObject.set(x, "domainAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAliasesUndefined: Self = StObject.set(x, "domainAliases", js.undefined)
    
    @scala.inline
    def setDomainAliasesVarargs(value: SchemaDomainAlias*): Self = StObject.set(x, "domainAliases", js.Array(value :_*))
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
