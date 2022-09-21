package typings.googleapis.osconfigV1Mod.osconfigV1

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/osconfig/v1", "osconfig_v1.Resource$Projects$Locations$Instances")
@js.native
open class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var inventories: ResourceProjectsLocationsInstancesInventories = js.native
  
  var osPolicyAssignments: ResourceProjectsLocationsInstancesOspolicyassignments = js.native
  
  var vulnerabilityReports: ResourceProjectsLocationsInstancesVulnerabilityreports = js.native
}
