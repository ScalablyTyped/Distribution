package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object healthcareV1alpha {
  
  /**
    * Cloud Healthcare API
    *
    * Manage, store, and access healthcare data in Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1alpha');
    *
    * @namespace healthcare
    * @type {Function}
    * @version v1alpha
    * @variation v1alpha
    * @param {object=} options Options for Healthcare
    */
  @JSImport("googleapis", "healthcare_v1alpha.Healthcare")
  @js.native
  class Healthcare protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.Healthcare {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets")
  @js.native
  class ResourceProjectsLocationsDatasets protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Annotationstores")
  @js.native
  class ResourceProjectsLocationsDatasetsAnnotationstores protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsAnnotationstores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Annotationstores$Annotations")
  @js.native
  class ResourceProjectsLocationsDatasetsAnnotationstoresAnnotations protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsAnnotationstoresAnnotations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Dicomstores")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstores protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsDicomstores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstoresDicomweb protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsDicomstoresDicomweb {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstores protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsFhirstores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Resources")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresResources protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsFhirstoresResources {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Resources$_history")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresResourcesHistory protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsFhirstoresResourcesHistory {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Resources$Patient")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresResourcesPatient protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsFhirstoresResourcesPatient {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Securitylabels")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresSecuritylabels protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsFhirstoresSecuritylabels {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Hl7v2stores")
  @js.native
  class ResourceProjectsLocationsDatasetsHl7v2stores protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsHl7v2stores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Hl7v2stores$Messages")
  @js.native
  class ResourceProjectsLocationsDatasetsHl7v2storesMessages protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsHl7v2storesMessages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Operations")
  @js.native
  class ResourceProjectsLocationsDatasetsOperations protected ()
    extends typings.googleapis.healthcareV1alphaMod.healthcareV1alpha.ResourceProjectsLocationsDatasetsOperations {
    def this(context: APIRequestContext) = this()
  }
}
