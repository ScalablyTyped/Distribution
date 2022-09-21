package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDomainAlias extends StObject {
  
  /**
    * The creation time of the domain alias. (Read-only).
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The domain alias name.
    */
  var domainAliasName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The parent domain name that the domain alias is associated with. This can either be a primary or secondary domain name within a customer.
    */
  var parentDomainName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the verification state of a domain alias. (Read-only)
    */
  var verified: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDomainAlias {
  
  inline def apply(): SchemaDomainAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainAlias]
  }
  
  extension [Self <: SchemaDomainAlias](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDomainAliasName(value: String): Self = StObject.set(x, "domainAliasName", value.asInstanceOf[js.Any])
    
    inline def setDomainAliasNameNull: Self = StObject.set(x, "domainAliasName", null)
    
    inline def setDomainAliasNameUndefined: Self = StObject.set(x, "domainAliasName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParentDomainName(value: String): Self = StObject.set(x, "parentDomainName", value.asInstanceOf[js.Any])
    
    inline def setParentDomainNameNull: Self = StObject.set(x, "parentDomainName", null)
    
    inline def setParentDomainNameUndefined: Self = StObject.set(x, "parentDomainName", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedNull: Self = StObject.set(x, "verified", null)
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
