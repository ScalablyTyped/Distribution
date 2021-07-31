package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Control API
  *
  * Provides control plane functionality to managed services, such as logging,
  * monitoring, and status checks.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicecontrol = google.servicecontrol('v1');
  *
  * @namespace servicecontrol
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicecontrol
  */
@JSImport("googleapis/build/src/apis/servicecontrol/v1", "servicecontrol_v1.Servicecontrol")
@js.native
class Servicecontrol protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var services: ResourceServices = js.native
}
