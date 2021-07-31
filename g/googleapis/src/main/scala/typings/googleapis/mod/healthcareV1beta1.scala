package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object healthcareV1beta1 {
  
  /**
    * Cloud Healthcare API
    *
    * Manage, store, and access healthcare data in Google Cloud Platform.
    *
    * @example
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * @namespace healthcare
    * @type {Function}
    * @version v1beta1
    * @variation v1beta1
    * @param {object=} options Options for Healthcare
    */
  @JSImport("googleapis", "healthcare_v1beta1.Healthcare")
  @js.native
  class Healthcare protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.Healthcare {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects")
  @js.native
  class ResourceProjects protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjects {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations")
  @js.native
  class ResourceProjectsLocations protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets")
  @js.native
  class ResourceProjectsLocationsDatasets protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstores protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsDicomstores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstoresStudies protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsDicomstoresStudies {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstoresStudiesSeries protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsDicomstoresStudiesSeries {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series$Instances")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstances protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstances {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series$Instances$Frames")
  @js.native
  class ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFrames protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFrames {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstores protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsFhirstores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresFhir protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsFhirstoresFhir {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$_history")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresFhirHistory protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsFhirstoresFhirHistory {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Observation")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresFhirObservation protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsFhirstoresFhirObservation {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Patient")
  @js.native
  class ResourceProjectsLocationsDatasetsFhirstoresFhirPatient protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsFhirstoresFhirPatient {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Hl7v2stores")
  @js.native
  class ResourceProjectsLocationsDatasetsHl7v2stores protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsHl7v2stores {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Hl7v2stores$Messages")
  @js.native
  class ResourceProjectsLocationsDatasetsHl7v2storesMessages protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsHl7v2storesMessages {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Operations")
  @js.native
  class ResourceProjectsLocationsDatasetsOperations protected ()
    extends typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1.ResourceProjectsLocationsDatasetsOperations {
    def this(context: APIRequestContext) = this()
  }
}
