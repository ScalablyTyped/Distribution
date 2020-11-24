package typings.googleapis.mod.sqladminV1beta4

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud SQL Admin API
  *
  * Creates and manages Cloud SQL instances, which provide fully managed MySQL
  * or PostgreSQL databases.
  *
  * @example
  * const {google} = require('googleapis');
  * const sqladmin = google.sqladmin('v1beta4');
  *
  * @namespace sqladmin
  * @type {Function}
  * @version v1beta4
  * @variation v1beta4
  * @param {object=} options Options for Sqladmin
  */
@JSImport("googleapis", "sqladmin_v1beta4.Sqladmin")
@js.native
class Sqladmin protected ()
  extends typings.googleapis.v1beta4Mod.sqladminV1beta4.Sqladmin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
