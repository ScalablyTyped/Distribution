package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Fhirstores$Resources")
@js.native
class ResourceProjectsLocationsDatasetsFhirstoresResources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var Patient: ResourceProjectsLocationsDatasetsFhirstoresResourcesPatient = js.native
  var _history: ResourceProjectsLocationsDatasetsFhirstoresResourcesHistory = js.native
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources._search
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources._search
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
  def _search(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearch): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearch,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearch,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def _search(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearch, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def _search(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalDeleteResource
    * @desc Deletes FHIR resources matching a search query. Note: unless
    * resource versioning is disabled by setting the
    * disable_resource_versioning flag on the FHIR store, the deleted resources
    * will be moved to a history repository that can still be retrieved through
    * GetResourceVersion and related methods, unless they are removed by the
    * DeleteResourceVersions method.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalDeleteResource
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
  def conditionalDeleteResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionaldeleteresource): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionaldeleteresource,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionaldeleteresource,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionaldeleteresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def conditionalDeleteResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionaldeleteresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalPatchResource
    * @desc Updates parts of a resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalPatchResource
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
  def conditionalPatchResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalpatchresource): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalpatchresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalpatchresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalpatchresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalPatchResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalpatchresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalUpdateResource
    * @desc Updates the entire resource if the resource exists based on the
    * search criteria specified via query parameters.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.conditionalUpdateResource
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
  def conditionalUpdateResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalupdateresource): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalupdateresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalupdateresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalupdateresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def conditionalUpdateResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesConditionalupdateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.createResource
    * @desc Creates a FHIR resource.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.createResource
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
  def createResource(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesCreateresource): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesCreateresource,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesCreateresource,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesCreateresource,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def createResource(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesCreateresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.delete
    * @desc Deletes a FHIR resource. Note: unless resource versioning is
    * disabled by setting the disable_resource_versioning flag on the FHIR
    * store, the deleted resources will be moved to a history repository that
    * can still be retrieved through GetResourceVersion and related methods,
    * unless they are removed by the DeleteResourceVersions method.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.delete
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
  def delete(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDelete): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDelete,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDelete,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDelete, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.delete$purge
    * @desc Deletes all the historical versions of a resource (excluding
    * current version) from the FHIR store. To remove all versions of a
    * resource, first delete the current version and call this API.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.delete$purge
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
  def delete$purge(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDeletepurge): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDeletepurge,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDeletepurge,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDeletepurge,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  @JSName("delete$purge")
  def delete$purge(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesDeletepurge,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.get
    * @desc Gets a FHIR resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.get
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
  def get(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGet): GaxiosPromise[SchemaHttpBody] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGet,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGet,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGet, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.getMetadata
    * @desc Gets the capabilities statement for the store.
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.getMetadata
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
  def getMetadata(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGetmetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGetmetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGetmetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGetmetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def getMetadata(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.patch
    * @desc Updates part of an existing resource.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.patch
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
  def patch(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesPatch): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesPatch,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesPatch,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesPatch, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.searchResources
    * @desc Searches resources in the given FHIR store.  # Search Parameters
    * The server's capability statement, retrieved through
    * GetCapabilityStatement, indicates which search parameters are supported
    * on each FHIR resource.  # Search Modifiers  Modifier   | Supported
    * ----------- | --------- `:missing`  | Yes `:exact`    | Yes `:contains` |
    * Yes `:text`     | Yes `:in`       | Yes `:not-in`   | Yes `:above`    |
    * Yes `:below`    | Yes `:[type]`   | Yes `:not`      | Yes `:recurse`  |
    * No
    * @alias
    * healthcare.projects.locations.datasets.fhirStores.resources.searchResources
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
  def searchResources(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchResources(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.fhirStores.resources.update
    * @desc Updates the entire resource or creates a new resource with a client
    * specified ID if the resource does not exist and the FHIR store has
    * enable_update_create set.
    * @alias healthcare.projects.locations.datasets.fhirStores.resources.update
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
  def update(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesUpdate): GaxiosPromise[SchemaHttpBody] = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesUpdate,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesUpdate,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesUpdate, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def update(
    params: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

