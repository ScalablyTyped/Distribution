package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir$Observation")
@js.native
class ResourceProjectsLocationsDatasetsFhirstoresFhirObservation protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.Observation.get$lastn
    * @desc Get N most recent observations for patient, grouped by code that
    * match given query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.Observation.get$lastn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("get$lastn")
  def get$lastn(): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationGetlastn): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationGetlastn,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationGetlastn,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationGetlastn,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  @JSName("get$lastn")
  def get$lastn(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationGetlastn,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

