package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analyticsadmin/v1alpha", "analyticsadmin_v1alpha.Resource$Properties$Firebaselinks")
@js.native
open class ResourcePropertiesFirebaselinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(params: ParamsResourcePropertiesFirebaselinksCreate): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(
    params: ParamsResourcePropertiesFirebaselinksCreate,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]
  ): Unit = js.native
  def create(
    params: ParamsResourcePropertiesFirebaselinksCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaFirebaseLink],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]
  ): Unit = js.native
  def create(params: ParamsResourcePropertiesFirebaselinksCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink] = js.native
  def create(
    params: ParamsResourcePropertiesFirebaselinksCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaFirebaseLink]
  ): Unit = js.native
  /**
    * Creates a FirebaseLink. Properties can have at most one FirebaseLink.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.firebaseLinks.create({
    *     // Required. Format: properties/{property_id\} Example: properties/1234
    *     parent: 'properties/my-propertie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "name": "my_name",
    *       //   "project": "my_project"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "project": "my_project"
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
  def create(params: ParamsResourcePropertiesFirebaselinksCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePropertiesFirebaselinksCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourcePropertiesFirebaselinksDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesFirebaselinksDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourcePropertiesFirebaselinksDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourcePropertiesFirebaselinksDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourcePropertiesFirebaselinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a FirebaseLink on a property
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.firebaseLinks.delete({
    *     // Required. Format: properties/{property_id\}/firebaseLinks/{firebase_link_id\} Example: properties/1234/firebaseLinks/5678
    *     name: 'properties/my-propertie/firebaseLinks/my-firebaseLink',
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
  def delete(params: ParamsResourcePropertiesFirebaselinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePropertiesFirebaselinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(params: ParamsResourcePropertiesFirebaselinksList): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesFirebaselinksList,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePropertiesFirebaselinksList,
    options: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePropertiesFirebaselinksList, options: MethodOptions): GaxiosPromise[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] = js.native
  def list(
    params: ParamsResourcePropertiesFirebaselinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  ): Unit = js.native
  /**
    * Lists FirebaseLinks on a property. Properties can have at most one FirebaseLink.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analyticsadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analyticsadmin = google.analyticsadmin('v1alpha');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analyticsadmin.properties.firebaseLinks.list({
    *     // The maximum number of resources to return. The service may return fewer than this value, even if there are additional pages. If unspecified, at most 50 resources will be returned. The maximum value is 200; (higher values will be coerced to the maximum)
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListFirebaseLinks` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListProperties` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Format: properties/{property_id\} Example: properties/1234
    *     parent: 'properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "firebaseLinks": [],
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
  def list(params: ParamsResourcePropertiesFirebaselinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePropertiesFirebaselinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
