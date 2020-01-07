package typings.googleapis.googleapisMod.ml_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Machine Learning Engine
  *
  * An API to enable creating and using machine learning models.
  *
  * @example
  * const {google} = require('googleapis');
  * const ml = google.ml('v1');
  *
  * @namespace ml
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Ml
  */
@JSImport("googleapis", "ml_v1.Ml")
@js.native
class Ml protected ()
  extends typings.googleapis.buildSrcApisMlV1Mod.ml_v1.Ml {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

