package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembership extends StObject {
  
  /**
    * The contact group membership.
    */
  var contactGroupMembership: js.UndefOr[SchemaContactGroupMembership] = js.undefined
  
  /**
    * Output only. The domain membership.
    */
  var domainMembership: js.UndefOr[SchemaDomainMembership] = js.undefined
  
  /**
    * Metadata about the membership.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
}
object SchemaMembership {
  
  inline def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  extension [Self <: SchemaMembership](x: Self) {
    
    inline def setContactGroupMembership(value: SchemaContactGroupMembership): Self = StObject.set(x, "contactGroupMembership", value.asInstanceOf[js.Any])
    
    inline def setContactGroupMembershipUndefined: Self = StObject.set(x, "contactGroupMembership", js.undefined)
    
    inline def setDomainMembership(value: SchemaDomainMembership): Self = StObject.set(x, "domainMembership", value.asInstanceOf[js.Any])
    
    inline def setDomainMembershipUndefined: Self = StObject.set(x, "domainMembership", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
