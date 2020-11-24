package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s read-only membership in a group.
  */
@js.native
trait SchemaMembership extends js.Object {
  
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
  implicit class SchemaMembershipOps[Self <: SchemaMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContactGroupMembership(value: SchemaContactGroupMembership): Self = this.set("contactGroupMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroupMembership: Self = this.set("contactGroupMembership", js.undefined)
    
    @scala.inline
    def setDomainMembership(value: SchemaDomainMembership): Self = this.set("domainMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMembership: Self = this.set("domainMembership", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
