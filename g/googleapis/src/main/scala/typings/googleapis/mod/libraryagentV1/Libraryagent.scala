package typings.googleapis.mod.libraryagentV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Library Agent API
  *
  * A simple Google Example Library API.
  *
  * @example
  * const {google} = require('googleapis');
  * const libraryagent = google.libraryagent('v1');
  *
  * @namespace libraryagent
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Libraryagent
  */
@JSImport("googleapis", "libraryagent_v1.Libraryagent")
@js.native
class Libraryagent protected ()
  extends typings.googleapis.libraryagentV1Mod.libraryagentV1.Libraryagent {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
