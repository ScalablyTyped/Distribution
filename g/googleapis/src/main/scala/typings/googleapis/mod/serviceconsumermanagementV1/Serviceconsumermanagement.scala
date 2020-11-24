package typings.googleapis.mod.serviceconsumermanagementV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Consumer Management API
  *
  * Manages the service consumers of a Service Infrastructure service.
  *
  * @example
  * const {google} = require('googleapis');
  * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
  *
  * @namespace serviceconsumermanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Serviceconsumermanagement
  */
@JSImport("googleapis", "serviceconsumermanagement_v1.Serviceconsumermanagement")
@js.native
class Serviceconsumermanagement protected ()
  extends typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1.Serviceconsumermanagement {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
