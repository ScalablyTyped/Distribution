package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/sasportal/v1alpha1", "sasportal_v1alpha1.Resource$Policies")
@js.native
open class ResourcePolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaSasPortalPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet, callback: BodyResponseCallback[SchemaSasPortalPolicy]): Unit = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: BodyResponseCallback[Readable | SchemaSasPortalPolicy],
    callback: BodyResponseCallback[Readable | SchemaSasPortalPolicy]
  ): Unit = js.native
  def get(params: ParamsResourcePoliciesGet, options: MethodOptions): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.policies.get({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "resource": "my_resource"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignments": [],
    *   //   "etag": "my_etag"
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
  def get(params: ParamsResourcePoliciesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def set(): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def set(callback: BodyResponseCallback[SchemaSasPortalPolicy]): Unit = js.native
  def set(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def set(params: ParamsResourcePoliciesSet): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def set(params: ParamsResourcePoliciesSet, callback: BodyResponseCallback[SchemaSasPortalPolicy]): Unit = js.native
  def set(
    params: ParamsResourcePoliciesSet,
    options: BodyResponseCallback[Readable | SchemaSasPortalPolicy],
    callback: BodyResponseCallback[Readable | SchemaSasPortalPolicy]
  ): Unit = js.native
  def set(params: ParamsResourcePoliciesSet, options: MethodOptions): GaxiosPromise[SchemaSasPortalPolicy] = js.native
  def set(
    params: ParamsResourcePoliciesSet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.policies.set({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "disableNotification": false,
    *       //   "policy": {},
    *       //   "resource": "my_resource"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "assignments": [],
    *   //   "etag": "my_etag"
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
  def set(params: ParamsResourcePoliciesSet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def set(
    params: ParamsResourcePoliciesSet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def test(): GaxiosPromise[SchemaSasPortalTestPermissionsResponse] = js.native
  def test(callback: BodyResponseCallback[SchemaSasPortalTestPermissionsResponse]): Unit = js.native
  def test(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSasPortalTestPermissionsResponse] = js.native
  def test(params: ParamsResourcePoliciesTest): GaxiosPromise[SchemaSasPortalTestPermissionsResponse] = js.native
  def test(
    params: ParamsResourcePoliciesTest,
    callback: BodyResponseCallback[SchemaSasPortalTestPermissionsResponse]
  ): Unit = js.native
  def test(
    params: ParamsResourcePoliciesTest,
    options: BodyResponseCallback[Readable | SchemaSasPortalTestPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaSasPortalTestPermissionsResponse]
  ): Unit = js.native
  def test(params: ParamsResourcePoliciesTest, options: MethodOptions): GaxiosPromise[SchemaSasPortalTestPermissionsResponse] = js.native
  def test(
    params: ParamsResourcePoliciesTest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSasPortalTestPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/sasportal.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const sasportal = google.sasportal('v1alpha1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/sasportal',
    *       'https://www.googleapis.com/auth/userinfo.email',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await sasportal.policies.test({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": [],
    *       //   "resource": "my_resource"
    *       // }
    *     },
    *   });
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
  def test(params: ParamsResourcePoliciesTest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def test(
    params: ParamsResourcePoliciesTest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
