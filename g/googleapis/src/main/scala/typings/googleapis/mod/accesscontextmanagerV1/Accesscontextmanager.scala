package typings.googleapis.mod.accesscontextmanagerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access Context Manager API
  *
  * An API for setting attribute based access control to requests to GCP
  * services.
  *
  * @example
  * const {google} = require('googleapis');
  * const accesscontextmanager = google.accesscontextmanager('v1');
  *
  * @namespace accesscontextmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Accesscontextmanager
  */
@JSImport("googleapis", "accesscontextmanager_v1.Accesscontextmanager")
@js.native
class Accesscontextmanager protected ()
  extends typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1.Accesscontextmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
