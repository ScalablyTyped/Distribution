package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1beta1", "playdeveloperreporting_v1beta1.Playdeveloperreporting")
@js.native
open class Playdeveloperreporting protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var anomalies: ResourceAnomalies = js.native
  
  var context: APIRequestContext = js.native
  
  var vitals: ResourceVitals = js.native
}
