package typings.googleapis.mod.cloudresourcemanagerV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Resource Manager API
  *
  * Creates, reads, and updates metadata for Google Cloud Platform resource
  * containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudresourcemanager = google.cloudresourcemanager('v2');
  *
  * @namespace cloudresourcemanager
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Cloudresourcemanager
  */
@JSImport("googleapis", "cloudresourcemanager_v2.Cloudresourcemanager")
@js.native
class Cloudresourcemanager protected ()
  extends typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2.Cloudresourcemanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
