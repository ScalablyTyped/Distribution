package typings.googleapis.mod.digitalassetlinksV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Digital Asset Links API
  *
  * Discovers relationships between online assets such as websites or mobile
  * apps.
  *
  * @example
  * const {google} = require('googleapis');
  * const digitalassetlinks = google.digitalassetlinks('v1');
  *
  * @namespace digitalassetlinks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Digitalassetlinks
  */
@JSImport("googleapis", "digitalassetlinks_v1.Digitalassetlinks")
@js.native
class Digitalassetlinks protected ()
  extends typings.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1.Digitalassetlinks {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
