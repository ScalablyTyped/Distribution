package typings.googleapis.mod.firebasedynamiclinksV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Firebase Dynamic Links API
  *
  * Programmatically creates and manages Firebase Dynamic Links.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebasedynamiclinks = google.firebasedynamiclinks('v1');
  *
  * @namespace firebasedynamiclinks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Firebasedynamiclinks
  */
@JSImport("googleapis", "firebasedynamiclinks_v1.Firebasedynamiclinks")
@js.native
class Firebasedynamiclinks protected ()
  extends typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1.Firebasedynamiclinks {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
