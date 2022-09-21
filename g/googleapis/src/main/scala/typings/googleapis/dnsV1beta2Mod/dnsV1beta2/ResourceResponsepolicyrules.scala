package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Responsepolicyrules")
@js.native
open class ResourceResponsepolicyrules protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def create(callback: BodyResponseCallback[SchemaResponsePolicyRule]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def create(params: ParamsResourceResponsepolicyrulesCreate): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def create(
    params: ParamsResourceResponsepolicyrulesCreate,
    callback: BodyResponseCallback[SchemaResponsePolicyRule]
  ): Unit = js.native
  def create(
    params: ParamsResourceResponsepolicyrulesCreate,
    options: BodyResponseCallback[Readable | SchemaResponsePolicyRule],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicyRule]
  ): Unit = js.native
  def create(params: ParamsResourceResponsepolicyrulesCreate, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def create(
    params: ParamsResourceResponsepolicyrulesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicyRule]
  ): Unit = js.native
  /**
    * Creates a new Response Policy Rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.create({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy containing the Response Policy Rule.
    *     responsePolicy: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "behavior": "my_behavior",
    *       //   "dnsName": "my_dnsName",
    *       //   "kind": "my_kind",
    *       //   "localData": {},
    *       //   "ruleName": "my_ruleName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "behavior": "my_behavior",
    *   //   "dnsName": "my_dnsName",
    *   //   "kind": "my_kind",
    *   //   "localData": {},
    *   //   "ruleName": "my_ruleName"
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
  def create(params: ParamsResourceResponsepolicyrulesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceResponsepolicyrulesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResponsepolicyrulesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceResponsepolicyrulesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceResponsepolicyrulesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceResponsepolicyrulesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceResponsepolicyrulesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a previously created Response Policy Rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.delete({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy containing the Response Policy Rule.
    *     responsePolicy: 'placeholder-value',
    *     // User assigned name of the Response Policy Rule addressed by this request.
    *     responsePolicyRule: 'placeholder-value',
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
  def delete(params: ParamsResourceResponsepolicyrulesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceResponsepolicyrulesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def get(callback: BodyResponseCallback[SchemaResponsePolicyRule]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def get(params: ParamsResourceResponsepolicyrulesGet): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def get(
    params: ParamsResourceResponsepolicyrulesGet,
    callback: BodyResponseCallback[SchemaResponsePolicyRule]
  ): Unit = js.native
  def get(
    params: ParamsResourceResponsepolicyrulesGet,
    options: BodyResponseCallback[Readable | SchemaResponsePolicyRule],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicyRule]
  ): Unit = js.native
  def get(params: ParamsResourceResponsepolicyrulesGet, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRule] = js.native
  def get(
    params: ParamsResourceResponsepolicyrulesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicyRule]
  ): Unit = js.native
  /**
    * Fetches the representation of an existing Response Policy Rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.get({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy containing the Response Policy Rule.
    *     responsePolicy: 'placeholder-value',
    *     // User assigned name of the Response Policy Rule addressed by this request.
    *     responsePolicyRule: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "behavior": "my_behavior",
    *   //   "dnsName": "my_dnsName",
    *   //   "kind": "my_kind",
    *   //   "localData": {},
    *   //   "ruleName": "my_ruleName"
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
  def get(params: ParamsResourceResponsepolicyrulesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceResponsepolicyrulesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaResponsePolicyRulesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResponsePolicyRulesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesListResponse] = js.native
  def list(params: ParamsResourceResponsepolicyrulesList): GaxiosPromise[SchemaResponsePolicyRulesListResponse] = js.native
  def list(
    params: ParamsResourceResponsepolicyrulesList,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResponsepolicyrulesList,
    options: BodyResponseCallback[Readable | SchemaResponsePolicyRulesListResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicyRulesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResponsepolicyrulesList, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesListResponse] = js.native
  def list(
    params: ParamsResourceResponsepolicyrulesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesListResponse]
  ): Unit = js.native
  /**
    * Enumerates all Response Policy Rules associated with a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readonly',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.list({
    *     // Optional. Maximum number of results to be returned. If unspecified, the server decides how many results to return.
    *     maxResults: 'placeholder-value',
    *     // Optional. A tag returned by a previous list request that was truncated. Use this parameter to continue a previous list request.
    *     pageToken: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy to list.
    *     responsePolicy: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "responsePolicyRules": []
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
  def list(params: ParamsResourceResponsepolicyrulesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceResponsepolicyrulesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaResponsePolicyRulesPatchResponse] = js.native
  def patch(callback: BodyResponseCallback[SchemaResponsePolicyRulesPatchResponse]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesPatchResponse] = js.native
  def patch(params: ParamsResourceResponsepolicyrulesPatch): GaxiosPromise[SchemaResponsePolicyRulesPatchResponse] = js.native
  def patch(
    params: ParamsResourceResponsepolicyrulesPatch,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesPatchResponse]
  ): Unit = js.native
  def patch(
    params: ParamsResourceResponsepolicyrulesPatch,
    options: BodyResponseCallback[Readable | SchemaResponsePolicyRulesPatchResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicyRulesPatchResponse]
  ): Unit = js.native
  def patch(params: ParamsResourceResponsepolicyrulesPatch, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesPatchResponse] = js.native
  def patch(
    params: ParamsResourceResponsepolicyrulesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesPatchResponse]
  ): Unit = js.native
  /**
    * Applies a partial update to an existing Response Policy Rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.patch({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy containing the Response Policy Rule.
    *     responsePolicy: 'placeholder-value',
    *     // User assigned name of the Response Policy Rule addressed by this request.
    *     responsePolicyRule: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "behavior": "my_behavior",
    *       //   "dnsName": "my_dnsName",
    *       //   "kind": "my_kind",
    *       //   "localData": {},
    *       //   "ruleName": "my_ruleName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "responsePolicyRule": {}
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
  def patch(params: ParamsResourceResponsepolicyrulesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceResponsepolicyrulesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaResponsePolicyRulesUpdateResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaResponsePolicyRulesUpdateResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesUpdateResponse] = js.native
  def update(params: ParamsResourceResponsepolicyrulesUpdate): GaxiosPromise[SchemaResponsePolicyRulesUpdateResponse] = js.native
  def update(
    params: ParamsResourceResponsepolicyrulesUpdate,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesUpdateResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceResponsepolicyrulesUpdate,
    options: BodyResponseCallback[Readable | SchemaResponsePolicyRulesUpdateResponse],
    callback: BodyResponseCallback[Readable | SchemaResponsePolicyRulesUpdateResponse]
  ): Unit = js.native
  def update(params: ParamsResourceResponsepolicyrulesUpdate, options: MethodOptions): GaxiosPromise[SchemaResponsePolicyRulesUpdateResponse] = js.native
  def update(
    params: ParamsResourceResponsepolicyrulesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResponsePolicyRulesUpdateResponse]
  ): Unit = js.native
  /**
    * Updates an existing Response Policy Rule.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dns.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dns = google.dns('v1beta2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/ndev.clouddns.readwrite',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dns.responsePolicyRules.update({
    *     // For mutating operation requests only. An optional identifier specified by the client. Must be unique for operation resources in the Operations collection.
    *     clientOperationId: 'placeholder-value',
    *     // Identifies the project addressed by this request.
    *     project: 'placeholder-value',
    *     // User assigned name of the Response Policy containing the Response Policy Rule.
    *     responsePolicy: 'placeholder-value',
    *     // User assigned name of the Response Policy Rule addressed by this request.
    *     responsePolicyRule: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "behavior": "my_behavior",
    *       //   "dnsName": "my_dnsName",
    *       //   "kind": "my_kind",
    *       //   "localData": {},
    *       //   "ruleName": "my_ruleName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "header": {},
    *   //   "responsePolicyRule": {}
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
  def update(params: ParamsResourceResponsepolicyrulesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceResponsepolicyrulesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
