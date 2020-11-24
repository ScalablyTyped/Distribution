package typings.googleapis.mod.driveV3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Drive API
  *
  * Manages files in Drive including uploading, downloading, searching,
  * detecting changes, and updating sharing permissions.
  *
  * @example
  * const {google} = require('googleapis');
  * const drive = google.drive('v3');
  *
  * @namespace drive
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Drive
  */
@JSImport("googleapis", "drive_v3.Drive")
@js.native
class Drive protected ()
  extends typings.googleapis.driveV3Mod.driveV3.Drive {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
