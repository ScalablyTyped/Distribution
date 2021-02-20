package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Fhirstores$Fhir")
@js.native
class ResourceProjectsLocationsDatasetsFhirstoresFhir protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var Observation: ResourceProjectsLocationsDatasetsFhirstoresFhirObservation = js.native
  
  var Patient: ResourceProjectsLocationsDatasetsFhirstoresFhirPatient = js.native
  
  var _history: ResourceProjectsLocationsDatasetsFhirstoresFhirHistory = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir._search
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir._search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {().SearchResourcesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def _search(): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def _search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearch): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearch,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearch,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def _search(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearch, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalDeleteResource
    * @desc Deletes FHIR resources matching a search query.  Note: unless
    * resource versioning is disabled by setting the
    * disable_resource_versioning flag on the FHIR store, the deleted resources
    * will be moved to a history repository that can still be retrieved through
    * GetResourceVersion and related methods, unless they are removed by the
    * DeleteResourceVersions method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalDeleteResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalDeleteResource(): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def conditionalDeleteResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalPatchResource
    * @desc Updates parts of a resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalPatchResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalPatchResource(): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def conditionalPatchResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalpatchresource): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalpatchresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalpatchresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalpatchresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalpatchresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalUpdateResource
    * @desc Updates the entire resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.conditionalUpdateResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def conditionalUpdateResource(): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def conditionalUpdateResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalupdateresource): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalupdateresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalupdateresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalupdateresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionalupdateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.createResource
    * @desc Creates a FHIR resource.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.createResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the FHIR store this resource belongs to.
    * @param {string} params.type The type of the resource to create.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createResource(): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def createResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCreateresource): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCreateresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCreateresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCreateresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCreateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete
    * @desc Deletes a FHIR resource.  Note: unless resource versioning is
    * disabled by setting the disable_resource_versioning flag on the FHIR
    * store, the deleted resources will be moved to a history repository that
    * can still be retrieved through GetResourceVersion and related methods,
    * unless they are removed by the DeleteResourceVersions method.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDelete): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDelete,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDelete,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDelete, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete$purge
    * @desc Deletes all the historical versions of a resource (excluding
    * current version) from the FHIR store. To remove all versions of a
    * resource, first delete the current version and call this method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.delete$purge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to purge.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  @JSName("delete$purge")
  def delete$purge(): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDeletepurge): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDeletepurge,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDeletepurge,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDeletepurge, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirDeletepurge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.get
    * @desc Gets a FHIR resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHttpBody] = js.native
  def get(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGet): GaxiosPromise[SchemaHttpBody] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGet,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGet,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGet, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.getMetadata
    * @desc Gets the FHIR capability statement for the store, which contains a
    * description of functionality supported by the server.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.getMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the FHIR store to retrieve the capabilities for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def getMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGetmetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGetmetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGetmetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getMetadata(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGetmetadata, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.patch
    * @desc Updates part of an existing resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatch): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatch,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatch,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatch, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.searchResources
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.fhir.searchResources
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Name of the FHIR store to retrieve resources from.
    * @param {string} params.resourceType The type of the resource to search.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchResources(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchResources(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearchresources): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearchresources,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearchresources,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearchresources,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirSearchresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.fhirStores.fhir.update
    * @desc Updates the entire resource or creates a new resource with a client
    * specified ID if the resource does not exist and the FHIR store has
    * enable_update_create set.
    * @alias healthcare.projects.locations.datasets.fhirStores.fhir.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the resource to update.
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaHttpBody] = js.native
  def update(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def update(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirUpdate): GaxiosPromise[SchemaHttpBody] = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirUpdate,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirUpdate,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirUpdate, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}
