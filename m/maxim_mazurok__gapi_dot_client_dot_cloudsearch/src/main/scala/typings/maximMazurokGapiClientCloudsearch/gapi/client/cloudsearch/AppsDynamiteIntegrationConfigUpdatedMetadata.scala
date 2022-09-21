package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteIntegrationConfigUpdatedMetadata extends StObject {
  
  /** The user whose action triggered this system message. */
  var initiatorId: js.UndefOr[AppsDynamiteUserId] = js.undefined
  
  /** A list of updates applied on the integration config. */
  var mutations: js.UndefOr[js.Array[AppsDynamiteIntegrationConfigMutation]] = js.undefined
}
object AppsDynamiteIntegrationConfigUpdatedMetadata {
  
  inline def apply(): AppsDynamiteIntegrationConfigUpdatedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteIntegrationConfigUpdatedMetadata]
  }
  
  extension [Self <: AppsDynamiteIntegrationConfigUpdatedMetadata](x: Self) {
    
    inline def setInitiatorId(value: AppsDynamiteUserId): Self = StObject.set(x, "initiatorId", value.asInstanceOf[js.Any])
    
    inline def setInitiatorIdUndefined: Self = StObject.set(x, "initiatorId", js.undefined)
    
    inline def setMutations(value: js.Array[AppsDynamiteIntegrationConfigMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setMutationsVarargs(value: AppsDynamiteIntegrationConfigMutation*): Self = StObject.set(x, "mutations", js.Array(value*))
  }
}
