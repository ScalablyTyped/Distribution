package typings.googleapis.mod.licensingV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enterprise License Manager API
  *
  * Views and manages licenses for your domain.
  *
  * @example
  * const {google} = require('googleapis');
  * const licensing = google.licensing('v1');
  *
  * @namespace licensing
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Licensing
  */
@JSImport("googleapis", "licensing_v1.Licensing")
@js.native
class Licensing protected ()
  extends typings.googleapis.licensingV1Mod.licensingV1.Licensing {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

