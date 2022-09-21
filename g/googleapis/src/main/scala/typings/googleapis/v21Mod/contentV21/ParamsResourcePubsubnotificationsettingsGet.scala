package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePubsubnotificationsettingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account for which to get pubsub notification settings.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePubsubnotificationsettingsGet {
  
  inline def apply(): ParamsResourcePubsubnotificationsettingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePubsubnotificationsettingsGet]
  }
  
  extension [Self <: ParamsResourcePubsubnotificationsettingsGet](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
