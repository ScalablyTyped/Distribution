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

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Consentstores$Consentartifacts")
@js.native
open class ResourceProjectsLocationsDatasetsConsentstoresConsentartifacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaConsentArtifact] = js.native
  def create(callback: BodyResponseCallback[SchemaConsentArtifact]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsentArtifact] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate): GaxiosPromise[SchemaConsentArtifact] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    callback: BodyResponseCallback[SchemaConsentArtifact]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    options: BodyResponseCallback[Readable | SchemaConsentArtifact],
    callback: BodyResponseCallback[Readable | SchemaConsentArtifact]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaConsentArtifact] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsentArtifact]
  ): Unit = js.native
  /**
    * Creates a new Consent artifact in the parent consent store.
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
    *     await healthcare.projects.locations.datasets.consentStores.consentArtifacts.create(
    *       {
    *         // Required. The name of the consent store this Consent artifact belongs to.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "consentContentScreenshots": [],
    *           //   "consentContentVersion": "my_consentContentVersion",
    *           //   "guardianSignature": {},
    *           //   "metadata": {},
    *           //   "name": "my_name",
    *           //   "userId": "my_userId",
    *           //   "userSignature": {},
    *           //   "witnessSignature": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentContentScreenshots": [],
    *   //   "consentContentVersion": "my_consentContentVersion",
    *   //   "guardianSignature": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "userId": "my_userId",
    *   //   "userSignature": {},
    *   //   "witnessSignature": {}
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified Consent artifact. Fails if the artifact is referenced by the latest revision of any Consent.
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
    *     await healthcare.projects.locations.datasets.consentStores.consentArtifacts.delete(
    *       {
    *         // Required. The resource name of the Consent artifact to delete. To preserve referential integrity, Consent artifacts referenced by the latest revision of a Consent cannot be deleted.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consentArtifacts/my-consentArtifact',
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConsentArtifact] = js.native
  def get(callback: BodyResponseCallback[SchemaConsentArtifact]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsentArtifact] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet): GaxiosPromise[SchemaConsentArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    callback: BodyResponseCallback[SchemaConsentArtifact]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    options: BodyResponseCallback[Readable | SchemaConsentArtifact],
    callback: BodyResponseCallback[Readable | SchemaConsentArtifact]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaConsentArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsentArtifact]
  ): Unit = js.native
  /**
    * Gets the specified Consent artifact.
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
    *     await healthcare.projects.locations.datasets.consentStores.consentArtifacts.get(
    *       {
    *         // Required. The resource name of the Consent artifact to retrieve.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consentArtifacts/my-consentArtifact',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentContentScreenshots": [],
    *   //   "consentContentVersion": "my_consentContentVersion",
    *   //   "guardianSignature": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "userId": "my_userId",
    *   //   "userSignature": {},
    *   //   "witnessSignature": {}
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConsentArtifactsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConsentArtifactsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConsentArtifactsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList): GaxiosPromise[SchemaListConsentArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    callback: BodyResponseCallback[SchemaListConsentArtifactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    options: BodyResponseCallback[Readable | SchemaListConsentArtifactsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConsentArtifactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListConsentArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConsentArtifactsResponse]
  ): Unit = js.native
  /**
    * Lists the Consent artifacts in the specified consent store.
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
    *     await healthcare.projects.locations.datasets.consentStores.consentArtifacts.list(
    *       {
    *         // Optional. Restricts the artifacts returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - user_id. For example, `filter=user_id=\"user123\"`. - consent_content_version - metadata. For example, `filter=Metadata(\"testkey\")=\"value\"` or `filter=HasMetadata(\"testkey\")`.
    *         filter: 'placeholder-value',
    *         // Optional. Limit on the number of consent artifacts to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. The next_page_token value returned from the previous List request, if any.
    *         pageToken: 'placeholder-value',
    *         // Required. Name of the consent store to retrieve consent artifacts from.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifacts": [],
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentartifactsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
