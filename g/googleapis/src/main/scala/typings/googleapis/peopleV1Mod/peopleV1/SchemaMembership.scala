package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only membership in a group.
  */
@js.native
trait SchemaMembership extends StObject {
  
  /**
    * The contact group membership.
    */
  var contactGroupMembership: js.UndefOr[SchemaContactGroupMembership] = js.native
  
  /**
    * The domain membership.
    */
  var domainMembership: js.UndefOr[SchemaDomainMembership] = js.native
  
  /**
    * Metadata about the membership.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
}
object SchemaMembership {
  
  @scala.inline
  def apply(): SchemaMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembership]
  }
  
  @scala.inline
  implicit class SchemaMembershipMutableBuilder[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroupMembership(value: SchemaContactGroupMembership): Self = StObject.set(x, "contactGroupMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupMembershipUndefined: Self = StObject.set(x, "contactGroupMembership", js.undefined)
    
    @scala.inline
    def setDomainMembership(value: SchemaDomainMembership): Self = StObject.set(x, "domainMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMembershipUndefined: Self = StObject.set(x, "domainMembership", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
