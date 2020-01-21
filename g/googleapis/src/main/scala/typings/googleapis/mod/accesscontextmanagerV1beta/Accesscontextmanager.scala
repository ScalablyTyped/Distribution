package typings.googleapis.mod.accesscontextmanagerV1beta

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access Context Manager API
  *
  * An API for setting attribute based access control to requests to GCP
  * services.
  *
  * @example
  * const {google} = require('googleapis');
  * const accesscontextmanager = google.accesscontextmanager('v1beta');
  *
  * @namespace accesscontextmanager
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Accesscontextmanager
  */
@JSImport("googleapis", "accesscontextmanager_v1beta.Accesscontextmanager")
@js.native
class Accesscontextmanager protected ()
  extends typings.googleapis.v1betaMod.accesscontextmanagerV1beta.Accesscontextmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

