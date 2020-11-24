package typings.googleapis.mod.driveactivityV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("googleapis", "driveactivity_v2.Driveactivity")
@js.native
class Driveactivity protected ()
  extends typings.googleapis.driveactivityV2Mod.driveactivityV2.Driveactivity {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
