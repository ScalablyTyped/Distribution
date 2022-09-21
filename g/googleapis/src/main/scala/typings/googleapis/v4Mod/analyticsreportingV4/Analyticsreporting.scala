package typings.googleapis.v4Mod.analyticsreportingV4

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Analyticsreporting")
@js.native
open class Analyticsreporting protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var reports: ResourceReports = js.native
  
  var userActivity: ResourceUseractivity = js.native
}
