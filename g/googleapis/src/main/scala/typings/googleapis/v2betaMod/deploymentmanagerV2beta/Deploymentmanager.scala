package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Cloud Deployment Manager API V2Beta Methods
  *
  * The Deployment Manager API allows users to declaratively configure, deploy
  * and run complex solutions on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('v2beta');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version v2beta
  * @variation v2beta
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis/build/src/apis/deploymentmanager/v2beta", "deploymentmanager_v2beta.Deploymentmanager")
@js.native
class Deploymentmanager protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var compositeTypes: ResourceCompositetypes = js.native
  
  var context: APIRequestContext = js.native
  
  var deployments: ResourceDeployments = js.native
  
  var manifests: ResourceManifests = js.native
  
  var operations: ResourceOperations = js.native
  
  var resources: ResourceResources = js.native
  
  var typeProviders: ResourceTypeproviders = js.native
  
  var types: ResourceTypes = js.native
}
