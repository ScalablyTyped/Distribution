package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/paymentsresellersubscription/v1", "paymentsresellersubscription_v1.Resource$Partners")
@js.native
open class ResourcePartners protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var products: ResourcePartnersProducts = js.native
  
  var promotions: ResourcePartnersPromotions = js.native
  
  var subscriptions: ResourcePartnersSubscriptions = js.native
}
