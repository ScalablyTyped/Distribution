package typings.googleapis.mod.fusiontablesV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fusion Tables API
  *
  * API for working with Fusion Tables data.
  *
  * @example
  * const {google} = require('googleapis');
  * const fusiontables = google.fusiontables('v1');
  *
  * @namespace fusiontables
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Fusiontables
  */
@JSImport("googleapis", "fusiontables_v1.Fusiontables")
@js.native
class Fusiontables protected ()
  extends typings.googleapis.fusiontablesV1Mod.fusiontablesV1.Fusiontables {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
