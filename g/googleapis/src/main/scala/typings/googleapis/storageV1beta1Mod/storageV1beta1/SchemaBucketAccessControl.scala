package typings.googleapis.storageV1beta1Mod.storageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An access-control entry.
  */
trait SchemaBucketAccessControl extends StObject {
  
  /**
    * The name of the bucket.
    */
  var bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The domain associated with the entity, if any.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * The email address associated with the entity, if any.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The entity holding the permission, in one of the following forms:  -
    * user-userId  - user-email  - group-groupId  - group-email  -
    * domain-domain  - allUsers  - allAuthenticatedUsers Examples:  - The user
    * liz@example.com would be user-liz@example.com.  - The group
    * example@googlegroups.com would be group-example@googlegroups.com.  - To
    * refer to all members of the Google Apps for Business domain example.com,
    * the entity would be domain-example.com.
    */
  var entity: js.UndefOr[String] = js.undefined
  
  /**
    * The ID for the entity, if any.
    */
  var entityId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the access-control entry.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For bucket access control entries, this is
    * always storage#bucketAccessControl.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The access permission for the entity. Can be READER, WRITER, or OWNER.
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * The link to this access-control entry.
    */
  var selfLink: js.UndefOr[String] = js.undefined
}
object SchemaBucketAccessControl {
  
  @scala.inline
  def apply(): SchemaBucketAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucketAccessControl]
  }
  
  @scala.inline
  implicit class SchemaBucketAccessControlMutableBuilder[Self <: SchemaBucketAccessControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
