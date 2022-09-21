package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHmacKeyMetadata extends StObject {
  
  /**
    * The ID of the HMAC Key.
    */
  var accessId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the HMAC key.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the HMAC key, including the Project ID and the Access ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project ID owning the service account to which the key authenticates.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to this resource.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address of the key's associated service account.
    */
  var serviceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The creation time of the HMAC key in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last modification time of the HMAC key metadata in RFC 3339 format.
    */
  var updated: js.UndefOr[String | Null] = js.undefined
}
object SchemaHmacKeyMetadata {
  
  inline def apply(): SchemaHmacKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHmacKeyMetadata]
  }
  
  extension [Self <: SchemaHmacKeyMetadata](x: Self) {
    
    inline def setAccessId(value: String): Self = StObject.set(x, "accessId", value.asInstanceOf[js.Any])
    
    inline def setAccessIdNull: Self = StObject.set(x, "accessId", null)
    
    inline def setAccessIdUndefined: Self = StObject.set(x, "accessId", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailNull: Self = StObject.set(x, "serviceAccountEmail", null)
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedNull: Self = StObject.set(x, "timeCreated", null)
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedNull: Self = StObject.set(x, "updated", null)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
