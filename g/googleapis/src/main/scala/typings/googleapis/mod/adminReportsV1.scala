package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminReportsV1 {
  
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
  @JSImport("googleapis", "admin_reports_v1.Admin")
  @js.native
  class Admin protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "admin_reports_v1.Resource$Activities")
  @js.native
  class ResourceActivities protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceActivities {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_reports_v1.Resource$Channels")
  @js.native
  class ResourceChannels protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceChannels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_reports_v1.Resource$Customerusagereports")
  @js.native
  class ResourceCustomerusagereports protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceCustomerusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_reports_v1.Resource$Entityusagereports")
  @js.native
  class ResourceEntityusagereports protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceEntityusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_reports_v1.Resource$Userusagereport")
  @js.native
  class ResourceUserusagereport protected ()
    extends typings.googleapis.reportsV1Mod.adminReportsV1.ResourceUserusagereport {
    def this(context: APIRequestContext) = this()
  }
}
