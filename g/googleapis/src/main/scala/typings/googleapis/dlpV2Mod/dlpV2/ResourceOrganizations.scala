package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var deidentifyTemplates: ResourceOrganizationsDeidentifytemplates = js.native
  
  var inspectTemplates: ResourceOrganizationsInspecttemplates = js.native
  
  var locations: ResourceOrganizationsLocations = js.native
  
  var storedInfoTypes: ResourceOrganizationsStoredinfotypes = js.native
}
