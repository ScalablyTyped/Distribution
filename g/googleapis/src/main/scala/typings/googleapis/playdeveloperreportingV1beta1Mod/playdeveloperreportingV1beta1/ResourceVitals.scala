package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/playdeveloperreporting/v1beta1", "playdeveloperreporting_v1beta1.Resource$Vitals")
@js.native
open class ResourceVitals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var anrrate: ResourceVitalsAnrrate = js.native
  
  var context: APIRequestContext = js.native
  
  var crashrate: ResourceVitalsCrashrate = js.native
  
  var excessivewakeuprate: ResourceVitalsExcessivewakeuprate = js.native
  
  var stuckbackgroundwakelockrate: ResourceVitalsStuckbackgroundwakelockrate = js.native
}
