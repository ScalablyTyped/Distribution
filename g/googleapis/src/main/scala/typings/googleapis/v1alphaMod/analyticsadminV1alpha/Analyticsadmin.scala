package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Analyticsadmin")
@js.native
open class Analyticsadmin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accountSummaries: ResourceAccountsummaries = js.native
  
  var accounts: ResourceAccounts = js.native
  
  var context: APIRequestContext = js.native
  
  var properties: ResourceProperties = js.native
}
