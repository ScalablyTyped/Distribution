package typings.googleapis.googleapisMod.storage_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Storage JSON API
  *
  * Stores and retrieves potentially large, immutable data objects.
  *
  * @example
  * const {google} = require('googleapis');
  * const storage = google.storage('v1');
  *
  * @namespace storage
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Storage
  */
@JSImport("googleapis", "storage_v1.Storage")
@js.native
class Storage protected ()
  extends typings.googleapis.buildSrcApisStorageV1Mod.storage_v1.Storage {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

