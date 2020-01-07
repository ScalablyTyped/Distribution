package typings.googleapis.googleapisMod.dataproc_v1beta2

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Dataproc API
  *
  * Manages Hadoop-based clusters and jobs on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataproc = google.dataproc('v1beta2');
  *
  * @namespace dataproc
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Dataproc
  */
@JSImport("googleapis", "dataproc_v1beta2.Dataproc")
@js.native
class Dataproc protected ()
  extends typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2.Dataproc {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

