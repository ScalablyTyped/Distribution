package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Firebase Hosting API
  *
  * The Firebase Hosting REST API enables programmatic and customizable
  * deployments to your Firebase-hosted sites. Use this REST API to deploy new
  * or updated hosting configurations and content files.
  *
  * @example
  * const {google} = require('googleapis');
  * const firebasehosting = google.firebasehosting('v1beta1');
  *
  * @namespace firebasehosting
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Firebasehosting
  */
@JSImport("googleapis/build/src/apis/firebasehosting/v1beta1", "firebasehosting_v1beta1.Firebasehosting")
@js.native
class Firebasehosting protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var sites: ResourceSites = js.native
}
