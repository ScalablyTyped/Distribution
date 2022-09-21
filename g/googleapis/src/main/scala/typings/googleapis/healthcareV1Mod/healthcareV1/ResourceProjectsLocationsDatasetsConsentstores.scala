package typings.googleapis.healthcareV1Mod.healthcareV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1", "healthcare_v1.Resource$Projects$Locations$Datasets$Consentstores")
@js.native
open class ResourceProjectsLocationsDatasetsConsentstores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var attributeDefinitions: ResourceProjectsLocationsDatasetsConsentstoresAttributedefinitions = js.native
  
  def checkDataAccess(): GaxiosPromise[SchemaCheckDataAccessResponse] = js.native
  def checkDataAccess(callback: BodyResponseCallback[SchemaCheckDataAccessResponse]): Unit = js.native
  def checkDataAccess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckDataAccessResponse] = js.native
  def checkDataAccess(params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess): GaxiosPromise[SchemaCheckDataAccessResponse] = js.native
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    callback: BodyResponseCallback[SchemaCheckDataAccessResponse]
  ): Unit = js.native
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    options: BodyResponseCallback[Readable | SchemaCheckDataAccessResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckDataAccessResponse]
  ): Unit = js.native
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    options: MethodOptions
  ): GaxiosPromise[SchemaCheckDataAccessResponse] = js.native
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckDataAccessResponse]
  ): Unit = js.native
  /**
    * Checks if a particular data_id of a User data mapping in the specified consent store is consented for the specified use.
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.checkDataAccess({
    *       // Required. Name of the consent store where the requested data_id is stored, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}`.
    *       consentStore:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "consentList": {},
    *         //   "dataId": "my_dataId",
    *         //   "requestAttributes": {},
    *         //   "responseView": "my_responseView"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentDetails": {},
    *   //   "consented": false
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
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def checkDataAccess(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCheckdataaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var consentArtifacts: ResourceProjectsLocationsDatasetsConsentstoresConsentartifacts = js.native
  
  var consents: ResourceProjectsLocationsDatasetsConsentstoresConsents = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaConsentStore] = js.native
  def create(callback: BodyResponseCallback[SchemaConsentStore]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate): GaxiosPromise[SchemaConsentStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate,
    options: BodyResponseCallback[Readable | SchemaConsentStore],
    callback: BodyResponseCallback[Readable | SchemaConsentStore]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  /**
    * Creates a new consent store in the parent dataset. Attempting to create a consent store with the same ID as an existing store fails with an ALREADY_EXISTS error.
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
    * const healthcare = google.healthcare('v1');
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
    *   const res = await healthcare.projects.locations.datasets.consentStores.create(
    *     {
    *       // Required. The ID of the consent store to create. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`. Cannot be changed after creation.
    *       consentStoreId: 'placeholder-value',
    *       // Required. The name of the dataset this consent store belongs to.
    *       parent: 'projects/my-project/locations/my-location/datasets/my-dataset',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "defaultConsentTtl": "my_defaultConsentTtl",
    *         //   "enableConsentCreateOnUpdate": false,
    *         //   "labels": {},
    *         //   "name": "my_name"
    *         // }
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultConsentTtl": "my_defaultConsentTtl",
    *   //   "enableConsentCreateOnUpdate": false,
    *   //   "labels": {},
    *   //   "name": "my_name"
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
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified consent store and removes all the consent store's data.
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
    * const healthcare = google.healthcare('v1');
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
    *   const res = await healthcare.projects.locations.datasets.consentStores.delete(
    *     {
    *       // Required. The resource name of the consent store to delete.
    *       name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *     }
    *   );
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
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def evaluateUserConsents(): GaxiosPromise[SchemaEvaluateUserConsentsResponse] = js.native
  def evaluateUserConsents(callback: BodyResponseCallback[SchemaEvaluateUserConsentsResponse]): Unit = js.native
  def evaluateUserConsents(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvaluateUserConsentsResponse] = js.native
  def evaluateUserConsents(params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents): GaxiosPromise[SchemaEvaluateUserConsentsResponse] = js.native
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    callback: BodyResponseCallback[SchemaEvaluateUserConsentsResponse]
  ): Unit = js.native
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    options: BodyResponseCallback[Readable | SchemaEvaluateUserConsentsResponse],
    callback: BodyResponseCallback[Readable | SchemaEvaluateUserConsentsResponse]
  ): Unit = js.native
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    options: MethodOptions
  ): GaxiosPromise[SchemaEvaluateUserConsentsResponse] = js.native
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvaluateUserConsentsResponse]
  ): Unit = js.native
  /**
    * Evaluates the user's Consents for all matching User data mappings. Note: User data mappings are indexed asynchronously, which can cause a slight delay between the time mappings are created or updated and when they are included in EvaluateUserConsents results.
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.evaluateUserConsents(
    *       {
    *         // Required. Name of the consent store to retrieve User data mappings from.
    *         consentStore:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "consentList": {},
    *           //   "pageSize": 0,
    *           //   "pageToken": "my_pageToken",
    *           //   "requestAttributes": {},
    *           //   "resourceAttributes": {},
    *           //   "responseView": "my_responseView",
    *           //   "userId": "my_userId"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "results": []
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
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def evaluateUserConsents(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresEvaluateuserconsents,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaConsentStore] = js.native
  def get(callback: BodyResponseCallback[SchemaConsentStore]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet): GaxiosPromise[SchemaConsentStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet,
    options: BodyResponseCallback[Readable | SchemaConsentStore],
    callback: BodyResponseCallback[Readable | SchemaConsentStore]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  /**
    * Gets the specified consent store.
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
    * const healthcare = google.healthcare('v1');
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
    *   const res = await healthcare.projects.locations.datasets.consentStores.get({
    *     // Required. The resource name of the consent store to get.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultConsentTtl": "my_defaultConsentTtl",
    *   //   "enableConsentCreateOnUpdate": false,
    *   //   "labels": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListConsentStoresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConsentStoresResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListConsentStoresResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresList): GaxiosPromise[SchemaListConsentStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresList,
    callback: BodyResponseCallback[SchemaListConsentStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresList,
    options: BodyResponseCallback[Readable | SchemaListConsentStoresResponse],
    callback: BodyResponseCallback[Readable | SchemaListConsentStoresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresList, options: MethodOptions): GaxiosPromise[SchemaListConsentStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConsentStoresResponse]
  ): Unit = js.native
  /**
    * Lists the consent stores in the specified dataset.
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
    * const healthcare = google.healthcare('v1');
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
    *   const res = await healthcare.projects.locations.datasets.consentStores.list({
    *     // Optional. Restricts the stores returned to those matching a filter. Only filtering on labels is supported. For example, `filter=labels.key=value`.
    *     filter: 'placeholder-value',
    *     // Optional. Limit on the number of consent stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. Token to retrieve the next page of results, or empty to get the first page.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the dataset.
    *     parent: 'projects/my-project/locations/my-location/datasets/my-dataset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consentStores": [],
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
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaConsentStore] = js.native
  def patch(callback: BodyResponseCallback[SchemaConsentStore]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch): GaxiosPromise[SchemaConsentStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch,
    options: BodyResponseCallback[Readable | SchemaConsentStore],
    callback: BodyResponseCallback[Readable | SchemaConsentStore]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch, options: MethodOptions): GaxiosPromise[SchemaConsentStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConsentStore]
  ): Unit = js.native
  /**
    * Updates the specified consent store.
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
    * const healthcare = google.healthcare('v1');
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
    *   const res = await healthcare.projects.locations.datasets.consentStores.patch({
    *     // Resource name of the consent store, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}`. Cannot be changed after creation.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *     // Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `labels`, `default_consent_ttl`, and `enable_consent_create_on_update` fields are allowed to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "defaultConsentTtl": "my_defaultConsentTtl",
    *       //   "enableConsentCreateOnUpdate": false,
    *       //   "labels": {},
    *       //   "name": "my_name"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultConsentTtl": "my_defaultConsentTtl",
    *   //   "enableConsentCreateOnUpdate": false,
    *   //   "labels": {},
    *   //   "name": "my_name"
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
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def queryAccessibleData(): GaxiosPromise[SchemaOperation] = js.native
  def queryAccessibleData(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def queryAccessibleData(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def queryAccessibleData(params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata): GaxiosPromise[SchemaOperation] = js.native
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Queries all data_ids that are consented for a specified use in the given consent store and writes them to a specified destination. The returned Operation includes a progress counter for the number of User data mappings processed. If the request is successful, a detailed response is returned of type QueryAccessibleDataResponse, contained in the response field when the operation finishes. The metadata field type is OperationMetadata. Errors are logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). For example, the following sample log entry shows a `failed to evaluate consent policy` error that occurred during a QueryAccessibleData call to consent store `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}`. ```json jsonPayload: { @type: "type.googleapis.com/google.cloud.healthcare.logging.QueryAccessibleDataLogEntry" error: { code: 9 message: "failed to evaluate consent policy" \} resourceName: "projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/consents/{consent_id\}" \} logName: "projects/{project_id\}/logs/healthcare.googleapis.com%2Fquery_accessible_data" operation: { id: "projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/operations/{operation_id\}" producer: "healthcare.googleapis.com/QueryAccessibleData" \} receiveTimestamp: "TIMESTAMP" resource: { labels: { consent_store_id: "{consent_store_id\}" dataset_id: "{dataset_id\}" location: "{location_id\}" project_id: "{project_id\}" \} type: "healthcare_consent_store" \} severity: "ERROR" timestamp: "TIMESTAMP" ```
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.queryAccessibleData(
    *       {
    *         // Required. Name of the consent store to retrieve User data mappings from.
    *         consentStore:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "gcsDestination": {},
    *           //   "requestAttributes": {},
    *           //   "resourceAttributes": {}
    *           // }
    *         },
    *       }
    *     );
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
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def queryAccessibleData(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresQueryaccessibledata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.consentStores.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var userDataMappings: ResourceProjectsLocationsDatasetsConsentstoresUserdatamappings = js.native
}
