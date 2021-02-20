package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminDatatransferV1 {
  
  /**
    * Admin Data Transfer API
    *
    * Transfers user data from one user to another.
    *
    * @example
    * const {google} = require('googleapis');
    * const admin = google.admin('datatransfer_v1');
    *
    * @namespace admin
    * @type {Function}
    * @version datatransfer_v1
    * @variation datatransfer_v1
    * @param {object=} options Options for Admin
    */
  @JSImport("googleapis", "admin_datatransfer_v1.Admin")
  @js.native
  class Admin protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.Admin {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "admin_datatransfer_v1.Resource$Applications")
  @js.native
  class ResourceApplications protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.ResourceApplications {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "admin_datatransfer_v1.Resource$Transfers")
  @js.native
  class ResourceTransfers protected ()
    extends typings.googleapis.datatransferV1Mod.adminDatatransferV1.ResourceTransfers {
    def this(context: APIRequestContext) = this()
  }
}
