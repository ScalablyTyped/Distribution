package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePretargetingconfigUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to update the pretargeting config for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The specific id of the configuration to update.
    */
  var configId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPretargetingConfig] = js.undefined
}
object ParamsResourcePretargetingconfigUpdate {
  
  inline def apply(): ParamsResourcePretargetingconfigUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePretargetingconfigUpdate]
  }
  
  extension [Self <: ParamsResourcePretargetingconfigUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
    
    inline def setRequestBody(value: SchemaPretargetingConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
