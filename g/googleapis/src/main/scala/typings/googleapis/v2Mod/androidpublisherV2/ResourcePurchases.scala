package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleapisCommon.apiMod.APIRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v2", "androidpublisher_v2.Resource$Purchases")
@js.native
class ResourcePurchases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var products: ResourcePurchasesProducts = js.native
  
  var subscriptions: ResourcePurchasesSubscriptions = js.native
  
  var voidedpurchases: ResourcePurchasesVoidedpurchases = js.native
}
