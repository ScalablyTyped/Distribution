package typings.googleapis.mod.bigtableadminV1

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
  * const bigtableadmin = google.bigtableadmin('v1');
  *
  * @namespace bigtableadmin
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Bigtableadmin
  */
@JSImport("googleapis", "bigtableadmin_v1.Bigtableadmin")
@js.native
class Bigtableadmin protected ()
  extends typings.googleapis.bigtableadminV1Mod.bigtableadminV1.Bigtableadmin {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
