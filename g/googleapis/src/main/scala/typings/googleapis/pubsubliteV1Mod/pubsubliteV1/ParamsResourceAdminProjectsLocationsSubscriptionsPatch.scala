package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdminProjectsLocationsSubscriptionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the subscription. Structured like: projects/{project_number\}/locations/{location\}/subscriptions/{subscription_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscription] = js.undefined
  
  /**
    * Required. A mask specifying the subscription fields to change.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdminProjectsLocationsSubscriptionsPatch {
  
  inline def apply(): ParamsResourceAdminProjectsLocationsSubscriptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdminProjectsLocationsSubscriptionsPatch]
  }
  
  extension [Self <: ParamsResourceAdminProjectsLocationsSubscriptionsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
