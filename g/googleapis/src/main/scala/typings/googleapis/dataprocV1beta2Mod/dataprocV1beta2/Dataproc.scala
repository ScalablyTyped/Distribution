package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
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
@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Dataproc")
@js.native
class Dataproc protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var projects: ResourceProjects = js.native
}

