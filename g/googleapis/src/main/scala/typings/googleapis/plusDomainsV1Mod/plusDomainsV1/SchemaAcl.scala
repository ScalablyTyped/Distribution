package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAcl extends StObject {
  
  /**
    * Description of the access granted, suitable for display.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether access is restricted to the domain.
    */
  var domainRestricted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of access entries.
    */
  var items: js.UndefOr[js.Array[SchemaPlusDomainsAclentryResource]] = js.undefined
  
  /**
    * Identifies this resource as a collection of access controls. Value:
    * &quot;plus#acl&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAcl {
  
  inline def apply(): SchemaAcl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcl]
  }
  
  extension [Self <: SchemaAcl](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomainRestricted(value: Boolean): Self = StObject.set(x, "domainRestricted", value.asInstanceOf[js.Any])
    
    inline def setDomainRestrictedUndefined: Self = StObject.set(x, "domainRestricted", js.undefined)
    
    inline def setItems(value: js.Array[SchemaPlusDomainsAclentryResource]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaPlusDomainsAclentryResource*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
