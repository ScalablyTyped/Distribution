package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "deploymentmanager_v2")
@js.native
object deploymentmanager_v2 extends js.Object {
  /**
    * Google Cloud Deployment Manager API
    *
    * Declares, configures, and deploys complex solutions on Google Cloud
    * Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const deploymentmanager = google.deploymentmanager('v2');
    *
    * @namespace deploymentmanager
    * @type {Function}
    * @version v2
    * @variation v2
    * @param {object=} options Options for Deploymentmanager
    */
  @js.native
  class Deploymentmanager protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Deployments protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Resource$Deployments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Manifests protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Resource$Manifests {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resources protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Resource$Resources {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Types protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2.Resource$Types {
    def this(context: APIRequestContext) = this()
  }
  
}

