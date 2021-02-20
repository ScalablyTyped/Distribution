package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Logging API
  *
  * Writes log entries and manages your Logging configuration.
  *
  * @example
  * const {google} = require('googleapis');
  * const logging = google.logging('v2beta1');
  *
  * @namespace logging
  * @type {Function}
  * @version v2beta1
  * @variation v2beta1
  * @param {object=} options Options for Logging
  */
@JSImport("googleapis/build/src/apis/logging/v2beta1", "logging_v2beta1.Logging")
@js.native
class Logging protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var entries: ResourceEntries = js.native
  
  var monitoredResourceDescriptors: ResourceMonitoredresourcedescriptors = js.native
  
  var projects: ResourceProjects = js.native
}
