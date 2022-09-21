package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCreativefieldvaluesUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Creative field ID for this creative field value.
    */
  var creativeFieldId: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreativeFieldValue] = js.undefined
}
object ParamsResourceCreativefieldvaluesUpdate {
  
  inline def apply(): ParamsResourceCreativefieldvaluesUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativefieldvaluesUpdate]
  }
  
  extension [Self <: ParamsResourceCreativefieldvaluesUpdate](x: Self) {
    
    inline def setCreativeFieldId(value: String): Self = StObject.set(x, "creativeFieldId", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldIdUndefined: Self = StObject.set(x, "creativeFieldId", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setRequestBody(value: SchemaCreativeFieldValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
