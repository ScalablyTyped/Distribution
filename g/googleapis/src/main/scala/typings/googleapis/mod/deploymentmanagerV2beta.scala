package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deploymentmanagerV2beta {
  
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
  @JSImport("googleapis", "deploymentmanager_v2beta.Deploymentmanager")
  @js.native
  class Deploymentmanager protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Compositetypes")
  @js.native
  class ResourceCompositetypes protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceCompositetypes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Deployments")
  @js.native
  class ResourceDeployments protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceDeployments {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Manifests")
  @js.native
  class ResourceManifests protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceManifests {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Operations")
  @js.native
  class ResourceOperations protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Resources")
  @js.native
  class ResourceResources protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceResources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Typeproviders")
  @js.native
  class ResourceTypeproviders protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceTypeproviders {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "deploymentmanager_v2beta.Resource$Types")
  @js.native
  class ResourceTypes protected ()
    extends typings.googleapis.v2betaMod.deploymentmanagerV2beta.ResourceTypes {
    def this(context: APIRequestContext) = this()
  }
}
