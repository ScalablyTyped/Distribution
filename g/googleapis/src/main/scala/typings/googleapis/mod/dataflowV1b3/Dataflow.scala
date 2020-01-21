package typings.googleapis.mod.dataflowV1b3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dataflow API
  *
  * Manages Google Cloud Dataflow projects on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const dataflow = google.dataflow('v1b3');
  *
  * @namespace dataflow
  * @type {Function}
  * @version v1b3
  * @variation v1b3
  * @param {object=} options Options for Dataflow
  */
@JSImport("googleapis", "dataflow_v1b3.Dataflow")
@js.native
class Dataflow protected ()
  extends typings.googleapis.v1b3Mod.dataflowV1b3.Dataflow {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

