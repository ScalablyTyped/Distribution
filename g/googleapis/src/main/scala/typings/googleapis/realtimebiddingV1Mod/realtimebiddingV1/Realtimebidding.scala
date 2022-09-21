package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/realtimebidding/v1", "realtimebidding_v1.Realtimebidding")
@js.native
open class Realtimebidding protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var bidders: ResourceBidders = js.native
  
  var buyers: ResourceBuyers = js.native
  
  var context: APIRequestContext = js.native
}
