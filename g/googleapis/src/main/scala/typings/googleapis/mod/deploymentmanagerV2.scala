package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentmanagerV2 {
  
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
  @JSImport("googleapis", "deploymentmanager_v2.Deploymentmanager")
  @js.native
  class Deploymentmanager protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2.Resource$Deployments")
  @js.native
  class ResourceDeployments protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceDeployments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2.Resource$Manifests")
  @js.native
  class ResourceManifests protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceManifests {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2.Resource$Resources")
  @js.native
  class ResourceResources protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceResources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2.Resource$Types")
  @js.native
  class ResourceTypes protected ()
    extends typings.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2.ResourceTypes {
    def this(context: APIRequestContext) = this()
  }
}
