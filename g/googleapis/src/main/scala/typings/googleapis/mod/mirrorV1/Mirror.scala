package typings.googleapis.mod.mirrorV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Mirror API
  *
  * Interacts with Glass users via the timeline.
  *
  * @example
  * const {google} = require('googleapis');
  * const mirror = google.mirror('v1');
  *
  * @namespace mirror
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Mirror
  */
@JSImport("googleapis", "mirror_v1.Mirror")
@js.native
class Mirror protected ()
  extends typings.googleapis.mirrorV1Mod.mirrorV1.Mirror {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

