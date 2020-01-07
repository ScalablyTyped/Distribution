package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "deploymentmanager_v2beta")
@js.native
object deploymentmanager_v2beta extends js.Object {
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
  @js.native
  class Deploymentmanager protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Compositetypes protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Compositetypes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Deployments protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Deployments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Manifests protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Manifests {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resources protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Resources {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Typeproviders protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Typeproviders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Types protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta.Resource$Types {
    def this(context: APIRequestContext) = this()
  }
  
}

