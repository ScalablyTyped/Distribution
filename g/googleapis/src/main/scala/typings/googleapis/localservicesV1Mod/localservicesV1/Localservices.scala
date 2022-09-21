package typings.googleapis.localservicesV1Mod.localservicesV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/localservices/v1", "localservices_v1.Localservices")
@js.native
open class Localservices protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var accountReports: ResourceAccountreports = js.native
  
  var context: APIRequestContext = js.native
  
  var detailedLeadReports: ResourceDetailedleadreports = js.native
}
