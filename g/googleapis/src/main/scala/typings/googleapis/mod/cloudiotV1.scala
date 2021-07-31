package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudiotV1 {
  
  /**
    * Cloud IoT API
    *
    * Registers and manages IoT (Internet of Things) devices that connect to the
    * Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const cloudiot = google.cloudiot('v1');
    *
    * @namespace cloudiot
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Cloudiot
    */
  @JSImport("googleapis", "cloudiot_v1.Cloudiot")
  @js.native
  class Cloudiot protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.Cloudiot {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries")
  @js.native
  class ResourceProjectsLocationsRegistries protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices")
  @js.native
  class ResourceProjectsLocationsRegistriesDevices protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesDevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$Configversions")
  @js.native
  class ResourceProjectsLocationsRegistriesDevicesConfigversions protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesDevicesConfigversions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Devices$States")
  @js.native
  class ResourceProjectsLocationsRegistriesDevicesStates protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesDevicesStates {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups")
  @js.native
  class ResourceProjectsLocationsRegistriesGroups protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesGroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups$Devices")
  @js.native
  class ResourceProjectsLocationsRegistriesGroupsDevices protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesGroupsDevices {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups$Devices$Configversions")
  @js.native
  class ResourceProjectsLocationsRegistriesGroupsDevicesConfigversions protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesGroupsDevicesConfigversions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "cloudiot_v1.Resource$Projects$Locations$Registries$Groups$Devices$States")
  @js.native
  class ResourceProjectsLocationsRegistriesGroupsDevicesStates protected ()
    extends typings.googleapis.cloudiotV1Mod.cloudiotV1.ResourceProjectsLocationsRegistriesGroupsDevicesStates {
    def this(context: APIRequestContext) = this()
  }
}
