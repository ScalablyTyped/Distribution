package typings.googleapis.googleapisMod

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "deploymentmanager_alpha")
@js.native
object deploymentmanager_alpha extends js.Object {
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
  @js.native
  class Deploymentmanager protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Deploymentmanager {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Compositetypes protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Compositetypes {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Deployments protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Deployments {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Manifests protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Manifests {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Operations protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Operations {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Resources protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Resources {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Typeproviders protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Typeproviders {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Types protected ()
    extends typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha.Resource$Types {
    def this(context: APIRequestContext) = this()
  }
  
}

