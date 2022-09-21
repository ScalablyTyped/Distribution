package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Logging")
@js.native
open class Logging protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var billingAccounts: ResourceBillingaccounts = js.native
  
  var context: APIRequestContext = js.native
  
  var entries: ResourceEntries = js.native
  
  var exclusions: ResourceExclusions = js.native
  
  var folders: ResourceFolders = js.native
  
  var locations: ResourceLocations = js.native
  
  var logs: ResourceLogs = js.native
  
  var monitoredResourceDescriptors: ResourceMonitoredresourcedescriptors = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
  
  var sinks: ResourceSinks = js.native
  
  var v2: ResourceV2 = js.native
}
