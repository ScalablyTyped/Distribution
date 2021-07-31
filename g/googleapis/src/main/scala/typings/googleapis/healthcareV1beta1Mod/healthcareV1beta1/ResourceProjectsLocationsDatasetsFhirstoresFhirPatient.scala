package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Patient")
@js.native
class ResourceProjectsLocationsDatasetsFhirstoresFhirPatient protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.Patient.get$everything
    * @desc Gets all the resources in the patient compartment.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.Patient.get$everything
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.end The response includes records prior to the end date. If no end date is provided, all records subsequent to the start date are in scope.
    * @param {string} params.name Name of the patient for which the information is required.
    * @param {string=} params.start The response includes records subsequent to the start date. If no start date is provided, all records prior to the end date are in scope.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("get$everything")
  def get$everything(): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$everything")
  def get$everything(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  @JSName("get$everything")
  def get$everything(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$everything")
  def get$everything(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$everything")
  def get$everything(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatientGeteverything,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}
