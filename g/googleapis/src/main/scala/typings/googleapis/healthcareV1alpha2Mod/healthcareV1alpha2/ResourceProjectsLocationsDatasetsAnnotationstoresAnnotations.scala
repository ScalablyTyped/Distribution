package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Annotationstores$Annotations")
@js.native
class ResourceProjectsLocationsDatasetsAnnotationstoresAnnotations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.create
    * @desc Creates a new Annotation record. It is valid to create Annotation
    * objects for the same source more than once since a unique ID is assigned
    * to each record by this service.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The name of the Annotation store this annotation belongs to. For example, `projects/my-project/locations/us-central1/datasets/mydataset/annotationStores/myannotationstore`.
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaAnnotation] = js.native
  def create(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate): GaxiosPromise[SchemaAnnotation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: BodyResponseCallback[SchemaAnnotation],
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaAnnotation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.delete
    * @desc Deletes an Annotation or returns NOT_FOUND if it does not exist.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.get
    * @desc Gets an Annotation.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAnnotation] = js.native
  def get(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet): GaxiosPromise[SchemaAnnotation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: BodyResponseCallback[SchemaAnnotation],
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaAnnotation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.list
    * @desc Lists the Annotations in the given Annotation store for a source
    * resource.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts Annotations returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Fields/functions available for filtering are: - source_version
    * @param {integer=} params.pageSize Limit on the number of Annotations to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the Annotation store to retrieve Annotations from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAnnotationsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    callback: BodyResponseCallback[SchemaListAnnotationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: BodyResponseCallback[SchemaListAnnotationsResponse],
    callback: BodyResponseCallback[SchemaListAnnotationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAnnotationsResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.annotationStores.annotations.patch
    * @desc Updates the Annotation.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.annotations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the Annotation, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}/annotations/{annotation_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Annotation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: BodyResponseCallback[SchemaAnnotation],
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
}

