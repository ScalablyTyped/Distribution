package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersSubscriptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the subscription resource to retrieve. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersSubscriptionsGet {
  
  inline def apply(): ParamsResourcePartnersSubscriptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersSubscriptionsGet]
  }
  
  extension [Self <: ParamsResourcePartnersSubscriptionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
