package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp extends StObject {
  
  /**
    * Description of the Idp
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id the of Idp
    */
  var idpId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2DefaultSupportedIdp](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdpId(value: String): Self = StObject.set(x, "idpId", value.asInstanceOf[js.Any])
    
    inline def setIdpIdNull: Self = StObject.set(x, "idpId", null)
    
    inline def setIdpIdUndefined: Self = StObject.set(x, "idpId", js.undefined)
  }
}
