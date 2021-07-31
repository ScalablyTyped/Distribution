package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Admin Reports API
  *
  * Fetches reports for the administrators of G Suite customers about the
  * usage, collaboration, security, and risk for their users.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('reports_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version reports_v1
  * @variation reports_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Admin")
@js.native
class Admin protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var activities: ResourceActivities = js.native
  
  var channels: ResourceChannels = js.native
  
  var context: APIRequestContext = js.native
  
  var customerUsageReports: ResourceCustomerusagereports = js.native
  
  var entityUsageReports: ResourceEntityusagereports = js.native
  
  var userUsageReport: ResourceUserusagereport = js.native
}
