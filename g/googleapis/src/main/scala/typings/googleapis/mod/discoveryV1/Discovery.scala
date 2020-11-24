package typings.googleapis.mod.discoveryV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API Discovery Service
  *
  * Provides information about other Google APIs, such as what APIs are
  * available, the resource, and method details for each API.
  *
  * @example
  * const {google} = require('googleapis');
  * const discovery = google.discovery('v1');
  *
  * @namespace discovery
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Discovery
  */
@JSImport("googleapis", "discovery_v1.Discovery")
@js.native
class Discovery protected ()
  extends typings.googleapis.discoveryV1Mod.discoveryV1.Discovery {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
