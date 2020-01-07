package typings.googleapis.googleapisMod.composer_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Composer API
  *
  * Manages Apache Airflow environments on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const composer = google.composer('v1');
  *
  * @namespace composer
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Composer
  */
@JSImport("googleapis", "composer_v1.Composer")
@js.native
class Composer protected ()
  extends typings.googleapis.buildSrcApisComposerV1Mod.composer_v1.Composer {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

