package typings.googleapis.googleapisMod.script_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends typings.googleapis.buildSrcApisScriptV1Mod.script_v1.Script {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

