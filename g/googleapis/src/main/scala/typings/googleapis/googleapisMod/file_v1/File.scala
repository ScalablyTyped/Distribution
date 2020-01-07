package typings.googleapis.googleapisMod.file_v1

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
  * const file = google.file('v1');
  *
  * @namespace file
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for File
  */
@JSImport("googleapis", "file_v1.File")
@js.native
class File protected ()
  extends typings.googleapis.buildSrcApisFileV1Mod.file_v1.File {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

