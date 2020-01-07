package typings.googleapis.googleapisMod.file_v1beta1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Filestore API
  *
  * The Cloud Filestore API is used for creating and managing cloud file
  * servers.
  *
  * @example
  * const {google} = require('googleapis');
  * const file = google.file('v1beta1');
  *
  * @namespace file
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for File
  */
@JSImport("googleapis", "file_v1beta1.File")
@js.native
class File protected ()
  extends typings.googleapis.buildSrcApisFileV1beta1Mod.file_v1beta1.File {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

