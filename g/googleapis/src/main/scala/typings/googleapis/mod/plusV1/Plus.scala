package typings.googleapis.mod.plusV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google+ API
  *
  * Builds on top of the Google+ platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const plus = google.plus('v1');
  *
  * @namespace plus
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Plus
  */
@JSImport("googleapis", "plus_v1.Plus")
@js.native
class Plus protected ()
  extends typings.googleapis.plusV1Mod.plusV1.Plus {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
