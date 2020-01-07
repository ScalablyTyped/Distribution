package typings.googleapis.googleapisMod.servicebroker_v1alpha1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service Broker API
  *
  * The Google Cloud Platform Service Broker API provides Google hosted
  * implementation of the Open Service Broker API
  * (https://www.openservicebrokerapi.org/).
  *
  * @example
  * const {google} = require('googleapis');
  * const servicebroker = google.servicebroker('v1alpha1');
  *
  * @namespace servicebroker
  * @type {Function}
  * @version v1alpha1
  * @variation v1alpha1
  * @param {object=} options Options for Servicebroker
  */
@JSImport("googleapis", "servicebroker_v1alpha1.Servicebroker")
@js.native
class Servicebroker protected ()
  extends typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1.Servicebroker {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

