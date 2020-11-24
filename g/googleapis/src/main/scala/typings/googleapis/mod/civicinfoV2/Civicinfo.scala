package typings.googleapis.mod.civicinfoV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Civic Information API
  *
  * Provides polling places, early vote locations, contest data, election
  * officials, and government representatives for U.S. residential addresses.
  *
  * @example
  * const {google} = require('googleapis');
  * const civicinfo = google.civicinfo('v2');
  *
  * @namespace civicinfo
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Civicinfo
  */
@JSImport("googleapis", "civicinfo_v2.Civicinfo")
@js.native
class Civicinfo protected ()
  extends typings.googleapis.civicinfoV2Mod.civicinfoV2.Civicinfo {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
