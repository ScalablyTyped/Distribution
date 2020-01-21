package typings.googleapis.mod.bigqueryV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BigQuery API
  *
  * A data platform for customers to create, manage, share and query data.
  *
  * @example
  * const {google} = require('googleapis');
  * const bigquery = google.bigquery('v2');
  *
  * @namespace bigquery
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Bigquery
  */
@JSImport("googleapis", "bigquery_v2.Bigquery")
@js.native
class Bigquery protected ()
  extends typings.googleapis.bigqueryV2Mod.bigqueryV2.Bigquery {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

