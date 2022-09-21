package typings.googleapis.contentV2Mod.contentV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Content")
@js.native
open class Content protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var accountstatuses: ResourceAccountstatuses = js.native
  
  var accounttax: ResourceAccounttax = js.native
  
  var context: APIRequestContext = js.native
  
  var datafeeds: ResourceDatafeeds = js.native
  
  var datafeedstatuses: ResourceDatafeedstatuses = js.native
  
  var liasettings: ResourceLiasettings = js.native
  
  var orderinvoices: ResourceOrderinvoices = js.native
  
  var orderreports: ResourceOrderreports = js.native
  
  var orderreturns: ResourceOrderreturns = js.native
  
  var orders: ResourceOrders = js.native
  
  var pos: ResourcePos = js.native
  
  var products: ResourceProducts = js.native
  
  var productstatuses: ResourceProductstatuses = js.native
  
  var shippingsettings: ResourceShippingsettings = js.native
}
