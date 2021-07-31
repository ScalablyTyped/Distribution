package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1beta1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis/build/src/apis/servicebroker/v1beta1", "servicebroker_v1beta1.Servicebroker")
@js.native
class Servicebroker protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var projects: ResourceProjects = js.native
  
  var v1beta1: ResourceV1beta1 = js.native
}
