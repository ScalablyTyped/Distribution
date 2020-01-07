package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "admin_reports_v1")
@js.native
object admin_reports_v1 extends js.Object {
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
  @js.native
  class Admin protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Activities protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Resource$Activities {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Channels protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Resource$Channels {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Customerusagereports protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Resource$Customerusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Entityusagereports protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Resource$Entityusagereports {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Userusagereport protected ()
    extends typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1.Resource$Userusagereport {
    def this(context: APIRequestContext) = this()
  }
  
}

