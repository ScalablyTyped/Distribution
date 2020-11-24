package typings.googleapis.mod.scriptV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Apps Script API
  *
  * Manages and executes Google Apps Script projects.
  *
  * @example
  * const {google} = require('googleapis');
  * const script = google.script('v1');
  *
  * @namespace script
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Script
  */
@JSImport("googleapis", "script_v1.Script")
@js.native
class Script protected ()
  extends typings.googleapis.scriptV1Mod.scriptV1.Script {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
