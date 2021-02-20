package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Domain Alias object in Directory API.
  */
@js.native
trait SchemaDomainAlias extends StObject {
  
  /**
    * The creation time of the domain alias. (Read-only).
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * The domain alias name.
    */
  var domainAliasName: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The parent domain name that the domain alias is associated with. This can
    * either be a primary or secondary domain name within a customer.
    */
  var parentDomainName: js.UndefOr[String] = js.native
  
  /**
    * Indicates the verification state of a domain alias. (Read-only)
    */
  var verified: js.UndefOr[Boolean] = js.native
}
object SchemaDomainAlias {
  
  @scala.inline
  def apply(): SchemaDomainAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainAlias]
  }
  
  @scala.inline
  implicit class SchemaDomainAliasMutableBuilder[Self <: SchemaDomainAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setDomainAliasName(value: String): Self = StObject.set(x, "domainAliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainAliasNameUndefined: Self = StObject.set(x, "domainAliasName", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setParentDomainName(value: String): Self = StObject.set(x, "parentDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentDomainNameUndefined: Self = StObject.set(x, "parentDomainName", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
