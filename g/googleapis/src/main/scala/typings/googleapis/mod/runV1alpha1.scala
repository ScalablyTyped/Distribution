package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runV1alpha1 {
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces")
  @js.native
  class ResourceNamespaces protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespaces {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Authorizeddomains")
  @js.native
  class ResourceNamespacesAuthorizeddomains protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesAuthorizeddomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Configurations")
  @js.native
  class ResourceNamespacesConfigurations protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesConfigurations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Domainmappings")
  @js.native
  class ResourceNamespacesDomainmappings protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesDomainmappings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Revisions")
  @js.native
  class ResourceNamespacesRevisions protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesRevisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Routes")
  @js.native
  class ResourceNamespacesRoutes protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesRoutes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Namespaces$Services")
  @js.native
  class ResourceNamespacesServices protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceNamespacesServices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Authorizeddomains")
  @js.native
  class ResourceProjectsLocationsAuthorizeddomains protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsAuthorizeddomains {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Configurations")
  @js.native
  class ResourceProjectsLocationsConfigurations protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsConfigurations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Domainmappings")
  @js.native
  class ResourceProjectsLocationsDomainmappings protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsDomainmappings {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Revisions")
  @js.native
  class ResourceProjectsLocationsRevisions protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsRevisions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Routes")
  @js.native
  class ResourceProjectsLocationsRoutes protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsRoutes {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "run_v1alpha1.Resource$Projects$Locations$Services")
  @js.native
  class ResourceProjectsLocationsServices protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.ResourceProjectsLocationsServices {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Cloud Run API
    *
    * Deploy and manage user provided container images that scale automatically
    * based on HTTP traffic.
    *
    * @example
    * const {google} = require('googleapis');
    * const run = google.run('v1alpha1');
    *
    * @namespace run
    * @type {Function}
    * @version v1alpha1
    * @variation v1alpha1
    * @param {object=} options Options for Run
    */
  @JSImport("googleapis", "run_v1alpha1.Run")
  @js.native
  class Run protected ()
    extends typings.googleapis.runV1alpha1Mod.runV1alpha1.Run {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
