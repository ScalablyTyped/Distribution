package typings.googleapis.mod.bigtableadminV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Bigtable Admin API
  *
  * Administer your Cloud Bigtable tables and instances.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigtableadmin = google.bigtableadmin('v2');
  *
  * @namespace bigtableadmin
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Bigtableadmin
  */
@JSImport("googleapis", "bigtableadmin_v2.Bigtableadmin")
@js.native
class Bigtableadmin protected ()
  extends typings.googleapis.bigtableadminV2Mod.bigtableadminV2.Bigtableadmin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
