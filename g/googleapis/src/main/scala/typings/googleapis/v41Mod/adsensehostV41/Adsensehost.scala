package typings.googleapis.v41Mod.adsensehostV41

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Adsensehost")
@js.native
open class Adsensehost protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accounts: ResourceAccounts = js.native
  
  var adclients: ResourceAdclients = js.native
  
  var associationsessions: ResourceAssociationsessions = js.native
  
  var context: APIRequestContext = js.native
  
  var customchannels: ResourceCustomchannels = js.native
  
  var reports: ResourceReports = js.native
  
  var urlchannels: ResourceUrlchannels = js.native
}
