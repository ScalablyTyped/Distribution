package typings.googleapis.mod.composerV1beta1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Composer API
  *
  * Manages Apache Airflow environments on Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const composer = google.composer('v1beta1');
  *
  * @namespace composer
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Composer
  */
@JSImport("googleapis", "composer_v1beta1.Composer")
@js.native
class Composer protected ()
  extends typings.googleapis.composerV1beta1Mod.composerV1beta1.Composer {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
