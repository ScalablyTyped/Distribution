package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Organizations")
@js.native
class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exclusions: ResourceOrganizationsExclusions = js.native
  
  var logs: ResourceOrganizationsLogs = js.native
  
  var sinks: ResourceOrganizationsSinks = js.native
}
