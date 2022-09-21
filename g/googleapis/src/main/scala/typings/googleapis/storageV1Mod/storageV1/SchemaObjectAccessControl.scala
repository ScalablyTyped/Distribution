package typings.googleapis.storageV1Mod.storageV1

import typings.googleapis.anon.ProjectNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectAccessControl extends StObject {
  
  /**
    * The name of the bucket.
    */
  var bucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The domain associated with the entity, if any.
    */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address associated with the entity, if any.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The entity holding the permission, in one of the following forms:
    * - user-userId
    * - user-email
    * - group-groupId
    * - group-email
    * - domain-domain
    * - project-team-projectId
    * - allUsers
    * - allAuthenticatedUsers Examples:
    * - The user liz@example.com would be user-liz@example.com.
    * - The group example@googlegroups.com would be group-example@googlegroups.com.
    * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
    */
  var entity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID for the entity, if any.
    */
  var entityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the access-control entry.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content generation of the object, if applied to an object.
    */
  var generation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the access-control entry.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the object, if applied to an object.
    */
  var `object`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project team associated with the entity, if any.
    */
  var projectTeam: js.UndefOr[ProjectNumber | Null] = js.undefined
  
  /**
    * The access permission for the entity.
    */
  var role: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to this access-control entry.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectAccessControl {
  
  inline def apply(): SchemaObjectAccessControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectAccessControl]
  }
  
  extension [Self <: SchemaObjectAccessControl](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketNull: Self = StObject.set(x, "bucket", null)
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdNull: Self = StObject.set(x, "entityId", null)
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setEntityNull: Self = StObject.set(x, "entity", null)
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationNull: Self = StObject.set(x, "generation", null)
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectNull: Self = StObject.set(x, "object", null)
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    inline def setProjectTeam(value: ProjectNumber): Self = StObject.set(x, "projectTeam", value.asInstanceOf[js.Any])
    
    inline def setProjectTeamNull: Self = StObject.set(x, "projectTeam", null)
    
    inline def setProjectTeamUndefined: Self = StObject.set(x, "projectTeam", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
