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

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Consentstores$Consents")
@js.native
open class ResourceProjectsLocationsDatasetsConsentstoresConsents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaConsent] = js.native
  def activate(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def activate(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate): GaxiosPromise[SchemaConsent] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    options: MethodOptions
  ): GaxiosPromise[SchemaConsent] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Activates the latest revision of the specified Consent by committing a new revision with `state` updated to `ACTIVE`. If the latest revision of the specified Consent is in the `ACTIVE` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified consent is in the `REJECTED` or `REVOKED` state.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.activate(
    *       {
    *         // Required. The resource name of the Consent to activate, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "consentArtifact": "my_consentArtifact",
    *           //   "expireTime": "my_expireTime",
    *           //   "ttl": "my_ttl"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaConsent] = js.native
  def create(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate): GaxiosPromise[SchemaConsent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Creates a new Consent in the parent consent store.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.create({
    *       // Required. Name of the consent store.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "consentArtifact": "my_consentArtifact",
    *         //   "expireTime": "my_expireTime",
    *         //   "metadata": {},
    *         //   "name": "my_name",
    *         //   "policies": [],
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "state": "my_state",
    *         //   "ttl": "my_ttl",
    *         //   "userId": "my_userId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the Consent and its revisions. To keep a record of the Consent but mark it inactive, see [RevokeConsent]. To delete a revision of a Consent, see [DeleteConsentRevision]. This operation does not delete the related Consent artifact.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.delete({
    *       // Required. The resource name of the Consent to delete, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *     });
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteRevision(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteRevision(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteRevision(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteRevision(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision): GaxiosPromise[SchemaEmpty] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified revision of a Consent. An INVALID_ARGUMENT error occurs if the specified revision is the latest revision.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.deleteRevision(
    *       {
    *         // Required. The resource name of the Consent revision to delete, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}@{revision_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is not specified in the name.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
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
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def deleteRevision(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsDeleterevision,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConsent] = js.native
  def get(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet): GaxiosPromise[SchemaConsent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Gets the specified revision of a Consent, or the latest revision if `revision_id` is not specified in the resource name.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.get({
    *       // Required. The resource name of the Consent to retrieve, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. In order to retrieve a previous revision of the Consent, also provide the revision ID: `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}@{revision_id\}`
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConsentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConsentsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConsentsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList): GaxiosPromise[SchemaListConsentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList,
    callback: BodyResponseCallback[SchemaListConsentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList,
    options: BodyResponseCallback[Readable | SchemaListConsentsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConsentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList, options: MethodOptions): GaxiosPromise[SchemaListConsentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConsentsResponse]
  ): Unit = js.native
  /**
    * Lists the Consent in the given consent store, returning each Consent's latest revision.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.list({
    *       // Optional. Restricts the consents returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The fields available for filtering are: - user_id. For example, `filter='user_id="user123"'`. - consent_artifact - state - revision_create_time - metadata. For example, `filter=Metadata(\"testkey\")=\"value\"` or `filter=HasMetadata(\"testkey\")`.
    *       filter: 'placeholder-value',
    *       // Optional. Limit on the number of Consents to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *       pageSize: 'placeholder-value',
    *       // Optional. The next_page_token value returned from the previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. Name of the consent store to retrieve Consents from.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consents": [],
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listRevisions(): GaxiosPromise[SchemaListConsentRevisionsResponse] = js.native
  def listRevisions(callback: BodyResponseCallback[SchemaListConsentRevisionsResponse]): Unit = js.native
  def listRevisions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConsentRevisionsResponse] = js.native
  def listRevisions(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions): GaxiosPromise[SchemaListConsentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    callback: BodyResponseCallback[SchemaListConsentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    options: BodyResponseCallback[Readable | SchemaListConsentRevisionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListConsentRevisionsResponse]
  ): Unit = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    options: MethodOptions
  ): GaxiosPromise[SchemaListConsentRevisionsResponse] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConsentRevisionsResponse]
  ): Unit = js.native
  /**
    * Lists the revisions of the specified Consent in reverse chronological order.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.listRevisions(
    *       {
    *         // Optional. Restricts the revisions returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Fields/functions available for filtering are: - user_id. For example, `filter='user_id="user123"'`. - consent_artifact - state - revision_create_time - metadata. For example, `filter=Metadata(\"testkey\")=\"value\"` or `filter=HasMetadata(\"testkey\")`.
    *         filter: 'placeholder-value',
    *         // Required. The resource name of the Consent to retrieve revisions for.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *         // Optional. Limit on the number of revisions to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. Token to retrieve the next page of results or empty if there are no more results in the list.
    *         pageToken: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consents": [],
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
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listRevisions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsListrevisions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaConsent] = js.native
  def patch(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch): GaxiosPromise[SchemaConsent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Updates the latest revision of the specified Consent by committing a new revision with the changes. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `REJECTED` or `REVOKED` state.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.patch({
    *       // Resource name of the Consent, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. Cannot be changed after creation.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *       // Required. The update mask to apply to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `user_id`, `policies`, `consent_artifact`, and `metadata` fields can be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "consentArtifact": "my_consentArtifact",
    *         //   "expireTime": "my_expireTime",
    *         //   "metadata": {},
    *         //   "name": "my_name",
    *         //   "policies": [],
    *         //   "revisionCreateTime": "my_revisionCreateTime",
    *         //   "revisionId": "my_revisionId",
    *         //   "state": "my_state",
    *         //   "ttl": "my_ttl",
    *         //   "userId": "my_userId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reject(): GaxiosPromise[SchemaConsent] = js.native
  def reject(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def reject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def reject(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject): GaxiosPromise[SchemaConsent] = js.native
  def reject(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def reject(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def reject(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def reject(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Rejects the latest revision of the specified Consent by committing a new revision with `state` updated to `REJECTED`. If the latest revision of the specified Consent is in the `REJECTED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the specified Consent is in the `ACTIVE` or `REVOKED` state.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.reject({
    *       // Required. The resource name of the Consent to reject, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "consentArtifact": "my_consentArtifact"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
  def reject(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def reject(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsReject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revoke(): GaxiosPromise[SchemaConsent] = js.native
  def revoke(callback: BodyResponseCallback[SchemaConsent]): Unit = js.native
  def revoke(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def revoke(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke): GaxiosPromise[SchemaConsent] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke,
    options: BodyResponseCallback[Readable | SchemaConsent],
    callback: BodyResponseCallback[Readable | SchemaConsent]
  ): Unit = js.native
  def revoke(params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke, options: MethodOptions): GaxiosPromise[SchemaConsent] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsent]
  ): Unit = js.native
  /**
    * Revokes the latest revision of the specified Consent by committing a new revision with `state` updated to `REVOKED`. If the latest revision of the specified Consent is in the `REVOKED` state, no new revision is committed. A FAILED_PRECONDITION error occurs if the latest revision of the given consent is in `DRAFT` or `REJECTED` state.
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
    *     await healthcare.projects.locations.datasets.consentStores.consents.revoke({
    *       // Required. The resource name of the Consent to revoke, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}`. An INVALID_ARGUMENT error occurs if `revision_id` is specified in the name.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/consents/my-consent',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "consentArtifact": "my_consentArtifact"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentArtifact": "my_consentArtifact",
    *   //   "expireTime": "my_expireTime",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "policies": [],
    *   //   "revisionCreateTime": "my_revisionCreateTime",
    *   //   "revisionId": "my_revisionId",
    *   //   "state": "my_state",
    *   //   "ttl": "my_ttl",
    *   //   "userId": "my_userId"
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
  def revoke(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def revoke(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresConsentsRevoke,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
