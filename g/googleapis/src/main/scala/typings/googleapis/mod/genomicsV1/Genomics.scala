package typings.googleapis.mod.genomicsV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Genomics API
  *
  * Uploads, processes, queries, and searches Genomics data in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const genomics = google.genomics('v1');
  *
  * @namespace genomics
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis", "genomics_v1.Genomics")
@js.native
class Genomics protected ()
  extends typings.googleapis.genomicsV1Mod.genomicsV1.Genomics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

