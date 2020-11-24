package typings.googleapis.mod.groupsmigrationV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Groups Migration API
  *
  * Groups Migration Api.
  *
  * @example
  * const {google} = require('googleapis');
  * const groupsmigration = google.groupsmigration('v1');
  *
  * @namespace groupsmigration
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Groupsmigration
  */
@JSImport("googleapis", "groupsmigration_v1.Groupsmigration")
@js.native
class Groupsmigration protected ()
  extends typings.googleapis.groupsmigrationV1Mod.groupsmigrationV1.Groupsmigration {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
