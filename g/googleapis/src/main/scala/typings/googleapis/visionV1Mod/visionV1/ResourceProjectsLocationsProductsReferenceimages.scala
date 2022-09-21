package typings.googleapis.visionV1Mod.visionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Products$Referenceimages")
@js.native
open class ResourceProjectsLocationsProductsReferenceimages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReferenceImage] = js.native
  def create(callback: BodyResponseCallback[SchemaReferenceImage]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReferenceImage] = js.native
  def create(params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate): GaxiosPromise[SchemaReferenceImage] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate,
    callback: BodyResponseCallback[SchemaReferenceImage]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate,
    options: BodyResponseCallback[Readable | SchemaReferenceImage],
    callback: BodyResponseCallback[Readable | SchemaReferenceImage]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate, options: MethodOptions): GaxiosPromise[SchemaReferenceImage] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReferenceImage]
  ): Unit = js.native
  /**
    * Creates and returns a new ReferenceImage resource. The `bounding_poly` field is optional. If `bounding_poly` is not specified, the system will try to detect regions of interest in the image that are compatible with the product_category on the parent product. If it is specified, detection is ALWAYS skipped. The system converts polygons into non-rotated rectangles. Note that the pipeline will resize the image if the image resolution is too large to process (above 50MP). Possible errors: * Returns INVALID_ARGUMENT if the image_uri is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if the product does not exist. * Returns INVALID_ARGUMENT if bounding_poly is not provided, and nothing compatible with the parent product's product_category is detected. * Returns INVALID_ARGUMENT if bounding_poly contains more than 10 polygons.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.locations.products.referenceImages.create({
    *     // Required. Resource name of the product in which to create the reference image. Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    *     parent: 'projects/my-project/locations/my-location/products/my-product',
    *     // A user-supplied resource id for the ReferenceImage to be added. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
    *     referenceImageId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "boundingPolys": [],
    *       //   "name": "my_name",
    *       //   "uri": "my_uri"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boundingPolys": [],
    *   //   "name": "my_name",
    *   //   "uri": "my_uri"
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
  def create(params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Permanently deletes a reference image. The image metadata will be deleted right away, but search queries against ProductSets containing the image may still work until all related caches are refreshed. The actual image files are not deleted from Google Cloud Storage.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.locations.products.referenceImages.delete({
    *     // Required. The resource name of the reference image to delete. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`
    *     name: 'projects/my-project/locations/my-location/products/my-product/referenceImages/my-referenceImage',
    *   });
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
  def delete(params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReferenceImage] = js.native
  def get(callback: BodyResponseCallback[SchemaReferenceImage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReferenceImage] = js.native
  def get(params: ParamsResourceProjectsLocationsProductsReferenceimagesGet): GaxiosPromise[SchemaReferenceImage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesGet,
    callback: BodyResponseCallback[SchemaReferenceImage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesGet,
    options: BodyResponseCallback[Readable | SchemaReferenceImage],
    callback: BodyResponseCallback[Readable | SchemaReferenceImage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProductsReferenceimagesGet, options: MethodOptions): GaxiosPromise[SchemaReferenceImage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReferenceImage]
  ): Unit = js.native
  /**
    * Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.locations.products.referenceImages.get({
    *     // Required. The resource name of the ReferenceImage to get. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`.
    *     name: 'projects/my-project/locations/my-location/products/my-product/referenceImages/my-referenceImage',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "boundingPolys": [],
    *   //   "name": "my_name",
    *   //   "uri": "my_uri"
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
  def get(params: ParamsResourceProjectsLocationsProductsReferenceimagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListReferenceImagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListReferenceImagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListReferenceImagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProductsReferenceimagesList): GaxiosPromise[SchemaListReferenceImagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesList,
    callback: BodyResponseCallback[SchemaListReferenceImagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesList,
    options: BodyResponseCallback[Readable | SchemaListReferenceImagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListReferenceImagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsReferenceimagesList, options: MethodOptions): GaxiosPromise[SchemaListReferenceImagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListReferenceImagesResponse]
  ): Unit = js.native
  /**
    * Lists reference images. Possible errors: * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT if the page_size is greater than 100, or less than 1.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.locations.products.referenceImages.list({
    *     // The maximum number of items to return. Default 10, maximum 100.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results to be returned. This is the value of `nextPageToken` returned in a previous reference image list request. Defaults to the first page if not specified.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the product containing the reference images. Format is `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
    *     parent: 'projects/my-project/locations/my-location/products/my-product',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pageSize": 0,
    *   //   "referenceImages": []
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
  def list(params: ParamsResourceProjectsLocationsProductsReferenceimagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsReferenceimagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
