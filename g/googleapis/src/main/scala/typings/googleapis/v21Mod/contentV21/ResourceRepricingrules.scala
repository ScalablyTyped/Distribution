package typings.googleapis.v21Mod.contentV21

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Repricingrules")
@js.native
open class ResourceRepricingrules protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaRepricingRule] = js.native
  def create(callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def create(params: ParamsResourceRepricingrulesCreate): GaxiosPromise[SchemaRepricingRule] = js.native
  def create(params: ParamsResourceRepricingrulesCreate, callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def create(
    params: ParamsResourceRepricingrulesCreate,
    options: BodyResponseCallback[Readable | SchemaRepricingRule],
    callback: BodyResponseCallback[Readable | SchemaRepricingRule]
  ): Unit = js.native
  def create(params: ParamsResourceRepricingrulesCreate, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def create(
    params: ParamsResourceRepricingrulesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepricingRule]
  ): Unit = js.native
  /**
    * Creates a repricing rule for your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.repricingrules.create({
    *     // Required. The id of the merchant who owns the repricing rule.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the rule to create.
    *     ruleId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cogsBasedRule": {},
    *       //   "countryCode": "my_countryCode",
    *       //   "effectiveTimePeriod": {},
    *       //   "eligibleOfferMatcher": {},
    *       //   "languageCode": "my_languageCode",
    *       //   "merchantId": "my_merchantId",
    *       //   "paused": false,
    *       //   "restriction": {},
    *       //   "ruleId": "my_ruleId",
    *       //   "statsBasedRule": {},
    *       //   "title": "my_title",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cogsBasedRule": {},
    *   //   "countryCode": "my_countryCode",
    *   //   "effectiveTimePeriod": {},
    *   //   "eligibleOfferMatcher": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "merchantId": "my_merchantId",
    *   //   "paused": false,
    *   //   "restriction": {},
    *   //   "ruleId": "my_ruleId",
    *   //   "statsBasedRule": {},
    *   //   "title": "my_title",
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceRepricingrulesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceRepricingrulesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepricingrulesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepricingrulesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRepricingrulesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRepricingrulesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceRepricingrulesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a repricing rule in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.repricingrules.delete({
    *     // Required. The id of the merchant who owns the repricing rule.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the rule to Delete.
    *     ruleId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceRepricingrulesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRepricingrulesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRepricingRule] = js.native
  def get(callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def get(params: ParamsResourceRepricingrulesGet): GaxiosPromise[SchemaRepricingRule] = js.native
  def get(params: ParamsResourceRepricingrulesGet, callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def get(
    params: ParamsResourceRepricingrulesGet,
    options: BodyResponseCallback[Readable | SchemaRepricingRule],
    callback: BodyResponseCallback[Readable | SchemaRepricingRule]
  ): Unit = js.native
  def get(params: ParamsResourceRepricingrulesGet, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def get(
    params: ParamsResourceRepricingrulesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepricingRule]
  ): Unit = js.native
  /**
    * Retrieves a repricing rule from your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.repricingrules.get({
    *     // Required. The id of the merchant who owns the repricing rule.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the rule to retrieve.
    *     ruleId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cogsBasedRule": {},
    *   //   "countryCode": "my_countryCode",
    *   //   "effectiveTimePeriod": {},
    *   //   "eligibleOfferMatcher": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "merchantId": "my_merchantId",
    *   //   "paused": false,
    *   //   "restriction": {},
    *   //   "ruleId": "my_ruleId",
    *   //   "statsBasedRule": {},
    *   //   "title": "my_title",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceRepricingrulesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRepricingrulesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRepricingRulesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRepricingRulesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRepricingRulesResponse] = js.native
  def list(params: ParamsResourceRepricingrulesList): GaxiosPromise[SchemaListRepricingRulesResponse] = js.native
  def list(
    params: ParamsResourceRepricingrulesList,
    callback: BodyResponseCallback[SchemaListRepricingRulesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceRepricingrulesList,
    options: BodyResponseCallback[Readable | SchemaListRepricingRulesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRepricingRulesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceRepricingrulesList, options: MethodOptions): GaxiosPromise[SchemaListRepricingRulesResponse] = js.native
  def list(
    params: ParamsResourceRepricingrulesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRepricingRulesResponse]
  ): Unit = js.native
  /**
    * Lists the repricing rules in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.repricingrules.list({
    *     // [CLDR country code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) (e.g. "US"), used as a filter on repricing rules.
    *     countryCode: 'placeholder-value',
    *     // The two-letter ISO 639-1 language code associated with the repricing rule, used as a filter.
    *     languageCode: 'placeholder-value',
    *     // Required. The id of the merchant who owns the repricing rule.
    *     merchantId: 'placeholder-value',
    *     // The maximum number of repricing rules to return. The service may return fewer than this value. If unspecified, at most 50 rules will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListRepricingRules` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListRepricingRules` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "repricingRules": []
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
  def list(params: ParamsResourceRepricingrulesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRepricingrulesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaRepricingRule] = js.native
  def patch(callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def patch(params: ParamsResourceRepricingrulesPatch): GaxiosPromise[SchemaRepricingRule] = js.native
  def patch(params: ParamsResourceRepricingrulesPatch, callback: BodyResponseCallback[SchemaRepricingRule]): Unit = js.native
  def patch(
    params: ParamsResourceRepricingrulesPatch,
    options: BodyResponseCallback[Readable | SchemaRepricingRule],
    callback: BodyResponseCallback[Readable | SchemaRepricingRule]
  ): Unit = js.native
  def patch(params: ParamsResourceRepricingrulesPatch, options: MethodOptions): GaxiosPromise[SchemaRepricingRule] = js.native
  def patch(
    params: ParamsResourceRepricingrulesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRepricingRule]
  ): Unit = js.native
  /**
    * Updates a repricing rule in your Merchant Center account. All mutable fields will be overwritten in each update request. In each update, you must provide all required mutable fields, or an error will be thrown. If you do not provide an optional field in the update request, if that field currently exists, it will be deleted from the rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.repricingrules.patch({
    *     // Required. The id of the merchant who owns the repricing rule.
    *     merchantId: 'placeholder-value',
    *     // Required. The id of the rule to update.
    *     ruleId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cogsBasedRule": {},
    *       //   "countryCode": "my_countryCode",
    *       //   "effectiveTimePeriod": {},
    *       //   "eligibleOfferMatcher": {},
    *       //   "languageCode": "my_languageCode",
    *       //   "merchantId": "my_merchantId",
    *       //   "paused": false,
    *       //   "restriction": {},
    *       //   "ruleId": "my_ruleId",
    *       //   "statsBasedRule": {},
    *       //   "title": "my_title",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cogsBasedRule": {},
    *   //   "countryCode": "my_countryCode",
    *   //   "effectiveTimePeriod": {},
    *   //   "eligibleOfferMatcher": {},
    *   //   "languageCode": "my_languageCode",
    *   //   "merchantId": "my_merchantId",
    *   //   "paused": false,
    *   //   "restriction": {},
    *   //   "ruleId": "my_ruleId",
    *   //   "statsBasedRule": {},
    *   //   "title": "my_title",
    *   //   "type": "my_type"
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
  def patch(params: ParamsResourceRepricingrulesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRepricingrulesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var repricingreports: ResourceRepricingrulesRepricingreports = js.native
}
