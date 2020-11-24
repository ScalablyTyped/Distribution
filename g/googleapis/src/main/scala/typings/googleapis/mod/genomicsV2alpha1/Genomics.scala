package typings.googleapis.mod.genomicsV2alpha1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Genomics API
  *
  * Uploads, processes, queries, and searches Genomics data in the cloud.
  *
  * @example
  * const {google} = require('googleapis');
  * const genomics = google.genomics('v2alpha1');
  *
  * @namespace genomics
  * @type {Function}
  * @version v2alpha1
  * @variation v2alpha1
  * @param {object=} options Options for Genomics
  */
@JSImport("googleapis", "genomics_v2alpha1.Genomics")
@js.native
class Genomics protected ()
  extends typings.googleapis.v2alpha1Mod.genomicsV2alpha1.Genomics {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
