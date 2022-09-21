package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Iampolicies")
@js.native
open class ResourceIampolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def lintPolicy(): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(callback: BodyResponseCallback[SchemaLintPolicyResponse]): Unit = js.native
  def lintPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(params: ParamsResourceIampoliciesLintpolicy): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    callback: BodyResponseCallback[SchemaLintPolicyResponse]
  ): Unit = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    options: BodyResponseCallback[Readable | SchemaLintPolicyResponse],
    callback: BodyResponseCallback[Readable | SchemaLintPolicyResponse]
  ): Unit = js.native
  def lintPolicy(params: ParamsResourceIampoliciesLintpolicy, options: MethodOptions): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLintPolicyResponse]
  ): Unit = js.native
  /**
    * Lints, or validates, an IAM policy. Currently checks the google.iam.v1.Binding.condition field, which contains a condition expression for a role binding. Successful calls to this method always return an HTTP `200 OK` status code, even if the linter detects an issue in the IAM policy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.iamPolicies.lintPolicy({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "condition": {},
    *       //   "fullResourceName": "my_fullResourceName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "lintResults": []
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
  def lintPolicy(params: ParamsResourceIampoliciesLintpolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def queryAuditableServices(): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]): Unit = js.native
  def queryAuditableServices(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(params: ParamsResourceIampoliciesQueryauditableservices): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    options: BodyResponseCallback[Readable | SchemaQueryAuditableServicesResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
  def queryAuditableServices(params: ParamsResourceIampoliciesQueryauditableservices, options: MethodOptions): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
  /**
    * Returns a list of services that allow you to opt into audit logs that are not generated by default. To learn more about audit logs, see the [Logging documentation](https://cloud.google.com/logging/docs/audit).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/iam.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const iam = google.iam('v1');
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
    *   const res = await iam.iamPolicies.queryAuditableServices({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "fullResourceName": "my_fullResourceName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "services": []
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
  def queryAuditableServices(params: ParamsResourceIampoliciesQueryauditableservices, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
