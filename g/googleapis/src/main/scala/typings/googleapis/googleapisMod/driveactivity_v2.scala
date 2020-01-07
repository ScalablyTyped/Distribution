package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "driveactivity_v2")
@js.native
object driveactivity_v2 extends js.Object {
  /**
    * Drive Activity API
    *
    * Provides a historical view of activity in Google Drive.
    *
    * @example
    * const {google} = require('googleapis');
    * const driveactivity = google.driveactivity('v2');
    *
    * @namespace driveactivity
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Driveactivity
    */
  @js.native
  class Driveactivity protected ()
    extends typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2.Driveactivity {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Activity protected ()
    extends typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2.Resource$Activity {
    def this(context: APIRequestContext) = this()
  }
  
}

