package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2');
  *
  * @namespace logging
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Logging")
@js.native
class Logging protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var billingAccounts: ResourceBillingaccounts = js.native
  
  var context: APIRequestContext = js.native
  
  var entries: ResourceEntries = js.native
  
  var exclusions: ResourceExclusions = js.native
  
  var folders: ResourceFolders = js.native
  
  var logs: ResourceLogs = js.native
  
  var monitoredResourceDescriptors: ResourceMonitoredresourcedescriptors = js.native
  
  var organizations: ResourceOrganizations = js.native
  
  var projects: ResourceProjects = js.native
  
  var sinks: ResourceSinks = js.native
}
