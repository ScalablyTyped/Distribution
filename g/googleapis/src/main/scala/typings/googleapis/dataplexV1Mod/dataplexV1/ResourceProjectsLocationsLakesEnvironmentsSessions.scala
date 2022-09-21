package typings.googleapis.dataplexV1Mod.dataplexV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataplex/v1", "dataplex_v1.Resource$Projects$Locations$Lakes$Environments$Sessions")
@js.native
open class ResourceProjectsLocationsLakesEnvironmentsSessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDataplexV1ListSessionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListSessionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListSessionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList): GaxiosPromise[SchemaGoogleCloudDataplexV1ListSessionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListSessionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListSessionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDataplexV1ListSessionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDataplexV1ListSessionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDataplexV1ListSessionsResponse]
  ): Unit = js.native
  /**
    * Lists session resources in an environment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataplex.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataplex = google.dataplex('v1');
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
    *     await dataplex.projects.locations.lakes.environments.sessions.list({
    *       // Optional. Filter request. The following mode filter is supported to return only the sessions belonging to the requester when the mode is USER and return sessions of all the users when the mode is ADMIN. When no filter is sent default to USER mode. NOTE: When the mode is ADMIN, the requester should have dataplex.environments.listAllSessions permission to list all sessions, in absence of the permission, the request fails.mode = ADMIN | USER
    *       filter: 'placeholder-value',
    *       // Optional. Maximum number of sessions to return. The service may return fewer than this value. If unspecified, at most 10 sessions will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. Page token received from a previous ListSessions call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to ListSessions must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name of the parent environment: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/environment/{environment_id\}.
    *       parent:
    *         'projects/my-project/locations/my-location/lakes/my-lake/environments/my-environment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "sessions": []
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
  def list(params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsLakesEnvironmentsSessionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
