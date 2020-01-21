package typings.googleapis.mod.cloudresourcemanagerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Resource Manager API
  *
  * Creates, reads, and updates metadata for Google Cloud Platform resource
  * containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudresourcemanager = google.cloudresourcemanager('v1');
  *
  * @namespace cloudresourcemanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Cloudresourcemanager
  */
@JSImport("googleapis", "cloudresourcemanager_v1.Cloudresourcemanager")
@js.native
class Cloudresourcemanager protected ()
  extends typings.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1.Cloudresourcemanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

