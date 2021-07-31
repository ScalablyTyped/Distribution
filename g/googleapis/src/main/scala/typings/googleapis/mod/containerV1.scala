package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerV1 {
  
  /**
    * Kubernetes Engine API
    *
    * Builds and manages container-based applications, powered by the open source
    * Kubernetes technology.
    *
    * @example
    * const {google} = require('googleapis');
    * const container = google.container('v1');
    *
    * @namespace container
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Container
    */
  @JSImport("googleapis", "container_v1.Container")
  @js.native
  class Container protected ()
    extends typings.googleapis.containerV1Mod.containerV1.Container {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Locations$Clusters")
  @js.native
  class ResourceProjectsLocationsClusters protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsLocationsClusters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Locations$Clusters$Nodepools")
  @js.native
  class ResourceProjectsLocationsClustersNodepools protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsLocationsClustersNodepools {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Locations$Clusters$WellKnown")
  @js.native
  class ResourceProjectsLocationsClustersWellKnown protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsLocationsClustersWellKnown {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Locations$Operations")
  @js.native
  class ResourceProjectsLocationsOperations protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsLocationsOperations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Zones")
  @js.native
  class ResourceProjectsZones protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsZones {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Zones$Clusters")
  @js.native
  class ResourceProjectsZonesClusters protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsZonesClusters {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Zones$Clusters$Nodepools")
  @js.native
  class ResourceProjectsZonesClustersNodepools protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsZonesClustersNodepools {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "container_v1.Resource$Projects$Zones$Operations")
  @js.native
  class ResourceProjectsZonesOperations protected ()
    extends typings.googleapis.containerV1Mod.containerV1.ResourceProjectsZonesOperations {
    def this(context: APIRequestContext) = this()
  }
}
