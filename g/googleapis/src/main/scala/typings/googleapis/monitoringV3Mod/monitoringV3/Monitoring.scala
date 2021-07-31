package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stackdriver Monitoring API
  *
  * Manages your Stackdriver Monitoring data and configurations. Most projects
  * must be associated with a Stackdriver account, with a few exceptions as
  * noted on the individual method pages.
  *
  * @example
  * const {google} = require('googleapis');
  * const monitoring = google.monitoring('v3');
  *
  * @namespace monitoring
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Monitoring
  */
@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Monitoring")
@js.native
class Monitoring protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
  
  var uptimeCheckIps: ResourceUptimecheckips = js.native
}
