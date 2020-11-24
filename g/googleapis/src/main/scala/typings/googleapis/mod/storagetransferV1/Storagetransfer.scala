package typings.googleapis.mod.storagetransferV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Storage Transfer API
  *
  * Transfers data from external data sources to a Google Cloud Storage bucket
  * or between Google Cloud Storage buckets.
  *
  * @example
  * const {google} = require('googleapis');
  * const storagetransfer = google.storagetransfer('v1');
  *
  * @namespace storagetransfer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storagetransfer
  */
@JSImport("googleapis", "storagetransfer_v1.Storagetransfer")
@js.native
class Storagetransfer protected ()
  extends typings.googleapis.storagetransferV1Mod.storagetransferV1.Storagetransfer {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
