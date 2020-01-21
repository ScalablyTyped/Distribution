package typings.googleapis.mod.adminDirectoryV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Admin Directory API
  *
  * Manages enterprise resources such as users and groups, administrative
  * notifications, security features, and more.
  *
  * @example
  * const {google} = require('googleapis');
  * const admin = google.admin('directory_v1');
  *
  * @namespace admin
  * @type {Function}
  * @version directory_v1
  * @variation directory_v1
  * @param {object=} options Options for Admin
  */
@JSImport("googleapis", "admin_directory_v1.Admin")
@js.native
class Admin protected ()
  extends typings.googleapis.directoryV1Mod.adminDirectoryV1.Admin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

