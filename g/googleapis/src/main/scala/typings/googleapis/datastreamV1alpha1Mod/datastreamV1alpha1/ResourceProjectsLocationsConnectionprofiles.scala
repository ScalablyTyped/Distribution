package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datastream/v1alpha1", "datastream_v1alpha1.Resource$Projects$Locations$Connectionprofiles")
@js.native
open class ResourceProjectsLocationsConnectionprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsConnectionprofilesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionprofilesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionprofilesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsConnectionprofilesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionprofilesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Use this method to create a connection profile in a project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.create({
    *     // Required. The connection profile identifier.
    *     connectionProfileId: 'placeholder-value',
    *     // Required. The parent that owns the collection of ConnectionProfiles.
    *     parent: 'projects/my-project/locations/my-location',
    *     // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "forwardSshConnectivity": {},
    *       //   "gcsProfile": {},
    *       //   "labels": {},
    *       //   "mysqlProfile": {},
    *       //   "name": "my_name",
    *       //   "noConnectivity": {},
    *       //   "oracleProfile": {},
    *       //   "privateConnectivity": {},
    *       //   "staticServiceIpConnectivity": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def create(params: ParamsResourceProjectsLocationsConnectionprofilesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsConnectionprofilesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsConnectionprofilesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionprofilesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionprofilesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsConnectionprofilesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionprofilesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Use this method to delete a connection profile..
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.delete({
    *     // Required. The name of the connection profile resource to delete.
    *     name: 'projects/my-project/locations/my-location/connectionProfiles/my-connectionProfile',
    *     // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes after the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def delete(params: ParamsResourceProjectsLocationsConnectionprofilesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsConnectionprofilesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def discover(): GaxiosPromise[SchemaDiscoverConnectionProfileResponse] = js.native
  def discover(callback: BodyResponseCallback[SchemaDiscoverConnectionProfileResponse]): Unit = js.native
  def discover(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDiscoverConnectionProfileResponse] = js.native
  def discover(params: ParamsResourceProjectsLocationsConnectionprofilesDiscover): GaxiosPromise[SchemaDiscoverConnectionProfileResponse] = js.native
  def discover(
    params: ParamsResourceProjectsLocationsConnectionprofilesDiscover,
    callback: BodyResponseCallback[SchemaDiscoverConnectionProfileResponse]
  ): Unit = js.native
  def discover(
    params: ParamsResourceProjectsLocationsConnectionprofilesDiscover,
    options: BodyResponseCallback[Readable | SchemaDiscoverConnectionProfileResponse],
    callback: BodyResponseCallback[Readable | SchemaDiscoverConnectionProfileResponse]
  ): Unit = js.native
  def discover(params: ParamsResourceProjectsLocationsConnectionprofilesDiscover, options: MethodOptions): GaxiosPromise[SchemaDiscoverConnectionProfileResponse] = js.native
  def discover(
    params: ParamsResourceProjectsLocationsConnectionprofilesDiscover,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiscoverConnectionProfileResponse]
  ): Unit = js.native
  /**
    * Use this method to discover a connection profile. The discover API call exposes the data objects and metadata belonging to the profile. Typically, a request returns children data objects under a parent data object that's optionally supplied in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.discover({
    *     // Required. The parent resource of the ConnectionProfile type. Must be in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectionProfile": {},
    *       //   "connectionProfileName": "my_connectionProfileName",
    *       //   "mysqlRdbms": {},
    *       //   "oracleRdbms": {},
    *       //   "recursionDepth": 0,
    *       //   "recursive": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mysqlRdbms": {},
    *   //   "oracleRdbms": {}
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
  def discover(params: ParamsResourceProjectsLocationsConnectionprofilesDiscover, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def discover(
    params: ParamsResourceProjectsLocationsConnectionprofilesDiscover,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConnectionProfile] = js.native
  def get(callback: BodyResponseCallback[SchemaConnectionProfile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConnectionProfile] = js.native
  def get(params: ParamsResourceProjectsLocationsConnectionprofilesGet): GaxiosPromise[SchemaConnectionProfile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionprofilesGet,
    callback: BodyResponseCallback[SchemaConnectionProfile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionprofilesGet,
    options: BodyResponseCallback[Readable | SchemaConnectionProfile],
    callback: BodyResponseCallback[Readable | SchemaConnectionProfile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsConnectionprofilesGet, options: MethodOptions): GaxiosPromise[SchemaConnectionProfile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionprofilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConnectionProfile]
  ): Unit = js.native
  /**
    * Use this method to get details about a connection profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.get({
    *     // Required. The name of the connection profile resource to get.
    *     name: 'projects/my-project/locations/my-location/connectionProfiles/my-connectionProfile',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "forwardSshConnectivity": {},
    *   //   "gcsProfile": {},
    *   //   "labels": {},
    *   //   "mysqlProfile": {},
    *   //   "name": "my_name",
    *   //   "noConnectivity": {},
    *   //   "oracleProfile": {},
    *   //   "privateConnectivity": {},
    *   //   "staticServiceIpConnectivity": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsConnectionprofilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsConnectionprofilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConnectionProfilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConnectionProfilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConnectionProfilesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionprofilesList): GaxiosPromise[SchemaListConnectionProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionprofilesList,
    callback: BodyResponseCallback[SchemaListConnectionProfilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionprofilesList,
    options: BodyResponseCallback[Readable | SchemaListConnectionProfilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListConnectionProfilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsConnectionprofilesList, options: MethodOptions): GaxiosPromise[SchemaListConnectionProfilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConnectionProfilesResponse]
  ): Unit = js.native
  /**
    * Use this method to list connection profiles created in a project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.list({
    *     // Filter request.
    *     filter: 'placeholder-value',
    *     // Order by fields for the result.
    *     orderBy: 'placeholder-value',
    *     // Maximum number of connection profiles to return. If unspecified, at most 50 connection profiles will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // Page token received from a previous `ListConnectionProfiles` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListConnectionProfiles` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent that owns the collection of connection profiles.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "connectionProfiles": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsConnectionprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsConnectionprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsConnectionprofilesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionprofilesPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionprofilesPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsConnectionprofilesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionprofilesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Use this method to update the parameters of a connection profile.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datastream.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datastream = google.datastream('v1alpha1');
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
    *   const res = await datastream.projects.locations.connectionProfiles.patch({
    *     // Output only. The resource's name.
    *     name: 'projects/my-project/locations/my-location/connectionProfiles/my-connectionProfile',
    *     // Optional. A request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    *     requestId: 'placeholder-value',
    *     // Optional. Field mask is used to specify the fields to be overwritten in the ConnectionProfile resource by the update. The fields specified in the update_mask are relative to the resource, not the full request. A field will be overwritten if it is in the mask. If the user does not provide a mask then all fields will be overwritten.
    *     updateMask: 'placeholder-value',
    *     // Optional. Only validate the connection profile, but do not update any resources. The default is false.
    *     validateOnly: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "displayName": "my_displayName",
    *       //   "forwardSshConnectivity": {},
    *       //   "gcsProfile": {},
    *       //   "labels": {},
    *       //   "mysqlProfile": {},
    *       //   "name": "my_name",
    *       //   "noConnectivity": {},
    *       //   "oracleProfile": {},
    *       //   "privateConnectivity": {},
    *       //   "staticServiceIpConnectivity": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def patch(params: ParamsResourceProjectsLocationsConnectionprofilesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsConnectionprofilesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
