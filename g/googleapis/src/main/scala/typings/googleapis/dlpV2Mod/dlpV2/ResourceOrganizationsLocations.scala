package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations$Locations")
@js.native
open class ResourceOrganizationsLocations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var deidentifyTemplates: ResourceOrganizationsLocationsDeidentifytemplates = js.native
  
  var dlpJobs: ResourceOrganizationsLocationsDlpjobs = js.native
  
  var inspectTemplates: ResourceOrganizationsLocationsInspecttemplates = js.native
  
  var jobTriggers: ResourceOrganizationsLocationsJobtriggers = js.native
  
  var storedInfoTypes: ResourceOrganizationsLocationsStoredinfotypes = js.native
}
