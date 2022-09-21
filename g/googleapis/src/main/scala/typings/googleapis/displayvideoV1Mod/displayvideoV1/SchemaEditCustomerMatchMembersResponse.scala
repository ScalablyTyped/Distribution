package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEditCustomerMatchMembersResponse extends StObject {
  
  /**
    * Required. The ID of the updated Customer Match FirstAndThirdPartyAudience.
    */
  var firstAndThirdPartyAudienceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEditCustomerMatchMembersResponse {
  
  inline def apply(): SchemaEditCustomerMatchMembersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEditCustomerMatchMembersResponse]
  }
  
  extension [Self <: SchemaEditCustomerMatchMembersResponse](x: Self) {
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdNull: Self = StObject.set(x, "firstAndThirdPartyAudienceId", null)
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
  }
}
