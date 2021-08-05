package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Member resource in Directory API.
  */
trait SchemaMember extends StObject {
  
  /**
    * Delivery settings of member
    */
  var delivery_settings: js.UndefOr[String] = js.undefined
  
  /**
    * Email of member (Read-only)
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of customer member (Read-only) Unique identifier of
    * group (Read-only) Unique identifier of member (Read-only)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Role of member
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Status of member (Immutable)
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Type of member (Immutable)
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaMember {
  
  inline def apply(): SchemaMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMember]
  }
  
  extension [Self <: SchemaMember](x: Self) {
    
    inline def setDelivery_settings(value: String): Self = StObject.set(x, "delivery_settings", value.asInstanceOf[js.Any])
    
    inline def setDelivery_settingsUndefined: Self = StObject.set(x, "delivery_settings", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
