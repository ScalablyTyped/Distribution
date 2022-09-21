package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Locations")
@js.native
open class ResourceProjectsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var content: ResourceProjectsLocationsContent = js.native
  
  var context: APIRequestContext = js.native
  
  var deidentifyTemplates: ResourceProjectsLocationsDeidentifytemplates = js.native
  
  var dlpJobs: ResourceProjectsLocationsDlpjobs = js.native
  
  var image: ResourceProjectsLocationsImage = js.native
  
  var inspectTemplates: ResourceProjectsLocationsInspecttemplates = js.native
  
  var jobTriggers: ResourceProjectsLocationsJobtriggers = js.native
  
  var storedInfoTypes: ResourceProjectsLocationsStoredinfotypes = js.native
}
