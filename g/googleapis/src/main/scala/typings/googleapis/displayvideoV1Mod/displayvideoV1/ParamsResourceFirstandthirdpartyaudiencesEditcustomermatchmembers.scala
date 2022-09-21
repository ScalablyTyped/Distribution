package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the Customer Match FirstAndThirdPartyAudience whose members will be edited.
    */
  var firstAndThirdPartyAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEditCustomerMatchMembersRequest] = js.undefined
}
object ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers {
  
  inline def apply(): ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers]
  }
  
  extension [Self <: ParamsResourceFirstandthirdpartyaudiencesEditcustomermatchmembers](x: Self) {
    
    inline def setFirstAndThirdPartyAudienceId(value: String): Self = StObject.set(x, "firstAndThirdPartyAudienceId", value.asInstanceOf[js.Any])
    
    inline def setFirstAndThirdPartyAudienceIdUndefined: Self = StObject.set(x, "firstAndThirdPartyAudienceId", js.undefined)
    
    inline def setRequestBody(value: SchemaEditCustomerMatchMembersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
