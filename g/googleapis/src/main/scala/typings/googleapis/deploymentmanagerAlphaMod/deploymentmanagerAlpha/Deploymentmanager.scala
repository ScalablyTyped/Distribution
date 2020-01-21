package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Deployment Manager Alpha API
  *
  * The Deployment Manager API allows users to declaratively configure, deploy
  * and run complex solutions on the Google Cloud Platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const deploymentmanager = google.deploymentmanager('alpha');
  *
  * @namespace deploymentmanager
  * @type {Function}
  * @version alpha
  * @variation alpha
  * @param {object=} options Options for Deploymentmanager
  */
@JSImport("googleapis/build/src/apis/deploymentmanager/alpha", "deploymentmanager_alpha.Deploymentmanager")
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

