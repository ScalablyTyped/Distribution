package typings.googleapis.mod.sheetsV4

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Sheets API
  *
  * Reads and writes Google Sheets.
  *
  * @example
  * const {google} = require('googleapis');
  * const sheets = google.sheets('v4');
  *
  * @namespace sheets
  * @type {Function}
  * @version v4
  * @variation v4
  * @param {object=} options Options for Sheets
  */
@JSImport("googleapis", "sheets_v4.Sheets")
@js.native
class Sheets protected ()
  extends typings.googleapis.sheetsV4Mod.sheetsV4.Sheets {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

