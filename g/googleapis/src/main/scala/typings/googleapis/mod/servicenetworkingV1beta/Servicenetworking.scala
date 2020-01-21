package typings.googleapis.mod.servicenetworkingV1beta

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Networking API
  *
  * Provides automatic management of network configurations necessary for
  * certain services.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicenetworking = google.servicenetworking('v1beta');
  *
  * @namespace servicenetworking
  * @type {Function}
  * @version v1beta
  * @variation v1beta
  * @param {object=} options Options for Servicenetworking
  */
@JSImport("googleapis", "servicenetworking_v1beta.Servicenetworking")
@js.native
class Servicenetworking protected ()
  extends typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta.Servicenetworking {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

