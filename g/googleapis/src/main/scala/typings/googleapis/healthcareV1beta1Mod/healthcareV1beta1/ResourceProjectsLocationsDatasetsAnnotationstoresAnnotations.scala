package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Annotationstores$Annotations")
@js.native
open class ResourceProjectsLocationsDatasetsAnnotationstoresAnnotations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAnnotation] = js.native
  def create(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate): GaxiosPromise[SchemaAnnotation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: BodyResponseCallback[Readable | SchemaAnnotation],
    callback: BodyResponseCallback[Readable | SchemaAnnotation]
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
    * Creates a new Annotation record. It is valid to create Annotation objects for the same source more than once since a unique ID is assigned to each record by this service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await healthcare.projects.locations.datasets.annotationStores.annotations.create(
    *       {
    *         // The name of the Annotation store this annotation belongs to. For example, `projects/my-project/locations/us-central1/datasets/mydataset/annotationStores/myannotationstore`.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/annotationStores/my-annotationStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "annotationSource": {},
    *           //   "customData": {},
    *           //   "imageAnnotation": {},
    *           //   "name": "my_name",
    *           //   "resourceAnnotation": {},
    *           //   "textAnnotation": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSource": {},
    *   //   "customData": {},
    *   //   "imageAnnotation": {},
    *   //   "name": "my_name",
    *   //   "resourceAnnotation": {},
    *   //   "textAnnotation": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
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
    * Deletes an Annotation or returns NOT_FOUND if it does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await healthcare.projects.locations.datasets.annotationStores.annotations.delete(
    *       {
    *         // The resource name of the Annotation to delete.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/annotationStores/my-annotationStore/annotations/my-annotation',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAnnotation] = js.native
  def get(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet): GaxiosPromise[SchemaAnnotation] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: BodyResponseCallback[Readable | SchemaAnnotation],
    callback: BodyResponseCallback[Readable | SchemaAnnotation]
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
    * Gets an Annotation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await healthcare.projects.locations.datasets.annotationStores.annotations.get(
    *       {
    *         // The resource name of the Annotation to retrieve.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/annotationStores/my-annotationStore/annotations/my-annotation',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSource": {},
    *   //   "customData": {},
    *   //   "imageAnnotation": {},
    *   //   "name": "my_name",
    *   //   "resourceAnnotation": {},
    *   //   "textAnnotation": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAnnotationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList): GaxiosPromise[SchemaListAnnotationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    callback: BodyResponseCallback[SchemaListAnnotationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: BodyResponseCallback[Readable | SchemaListAnnotationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAnnotationsResponse]
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
    * Lists the Annotations in the given Annotation store for a source resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await healthcare.projects.locations.datasets.annotationStores.annotations.list(
    *       {
    *         // Restricts Annotations returned to those matching a filter. Functions available for filtering are: - `matches("annotation_source.cloud_healthcare_source.name", substring)`. Filter on `cloud_healthcare_source.name`. For example: `matches("annotation_source.cloud_healthcare_source.name", "some source")`. - `matches("annotation", substring)`. Filter on all fields of annotation. For example: `matches("annotation", "some-content")`. - `type("text")`, `type("image")`, `type("resource")`. Filter on the type of annotation `data`.
    *         filter: 'placeholder-value',
    *         // Limit on the number of Annotations to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *         pageSize: 'placeholder-value',
    *         // The next_page_token value returned from the previous List request, if any.
    *         pageToken: 'placeholder-value',
    *         // Name of the Annotation store to retrieve Annotations from.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/annotationStores/my-annotationStore',
    *         // Controls which fields are populated in the response.
    *         view: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotations": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch): GaxiosPromise[SchemaAnnotation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: BodyResponseCallback[Readable | SchemaAnnotation],
    callback: BodyResponseCallback[Readable | SchemaAnnotation]
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
  /**
    * Updates the Annotation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await healthcare.projects.locations.datasets.annotationStores.annotations.patch(
    *       {
    *         // Resource name of the Annotation, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/annotationStores/{annotation_store_id\}/annotations/{annotation_id\}`.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/annotationStores/my-annotationStore/annotations/my-annotation',
    *         // The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "annotationSource": {},
    *           //   "customData": {},
    *           //   "imageAnnotation": {},
    *           //   "name": "my_name",
    *           //   "resourceAnnotation": {},
    *           //   "textAnnotation": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationSource": {},
    *   //   "customData": {},
    *   //   "imageAnnotation": {},
    *   //   "name": "my_name",
    *   //   "resourceAnnotation": {},
    *   //   "textAnnotation": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresAnnotationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
