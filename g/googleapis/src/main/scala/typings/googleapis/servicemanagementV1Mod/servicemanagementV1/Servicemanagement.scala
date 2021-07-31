package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Management API
  *
  * Google Service Management allows service producers to publish their
  * services on Google Cloud Platform so that they can be discovered and used
  * by service consumers.
  *
  * @example
  * const {google} = require('googleapis');
  * const servicemanagement = google.servicemanagement('v1');
  *
  * @namespace servicemanagement
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Servicemanagement
  */
@JSImport("googleapis/build/src/apis/servicemanagement/v1", "servicemanagement_v1.Servicemanagement")
@js.native
class Servicemanagement protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var operations: ResourceOperations = js.native
  
  var services: ResourceServices = js.native
}
