package typings.googleapis.v1p4beta1Mod.cloudassetV1p4beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudasset/v1p4beta1", "cloudasset_v1p4beta1.Resource$V1p4beta1")
@js.native
open class ResourceV1p4beta1 protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzeIamPolicy(): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]): Unit = js.native
  def analyzeIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(params: ParamsResourceV1p4beta1Analyzeiampolicy): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1p4beta1Analyzeiampolicy,
    callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1p4beta1Analyzeiampolicy,
    options: BodyResponseCallback[Readable | SchemaAnalyzeIamPolicyResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  def analyzeIamPolicy(params: ParamsResourceV1p4beta1Analyzeiampolicy, options: MethodOptions): GaxiosPromise[SchemaAnalyzeIamPolicyResponse] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1p4beta1Analyzeiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeIamPolicyResponse]
  ): Unit = js.native
  /**
    * Analyzes IAM policies to answer which identities have what accesses on which resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1p4beta1');
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
    *   const res = await cloudasset.analyzeIamPolicy({
    *     // Optional. The permissions to appear in result.
    *     'analysisQuery.accessSelector.permissions': 'placeholder-value',
    *     // Optional. The roles to appear in result.
    *     'analysisQuery.accessSelector.roles': 'placeholder-value',
    *     // Required. The identity appear in the form of members in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding). The examples of supported forms are: "user:mike@example.com", "group:admins@example.com", "domain:google.com", "serviceAccount:my-project-id@appspot.gserviceaccount.com". Notice that wildcard characters (such as * and ?) are not supported. You must give a specific identity.
    *     'analysisQuery.identitySelector.identity': 'placeholder-value',
    *     // Required. The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
    *     'analysisQuery.resourceSelector.fullResourceName': 'placeholder-value',
    *     // Optional. If true, the response will include access analysis from identities to resources via service account impersonation. This is a very expensive operation, because many derived queries will be executed. We highly recommend you use AssetService.ExportIamPolicyAnalysis rpc instead. For example, if the request analyzes for which resources user A has permission P, and there's an IAM policy states user A has iam.serviceAccounts.getAccessToken permission to a service account SA, and there's another IAM policy states service account SA has permission P to a GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Another example, if the request analyzes for who has permission P to a GCP folder F, and there's an IAM policy states user A has iam.serviceAccounts.actAs permission to a service account SA, and there's another IAM policy states service account SA has permission P to the GCP folder F, then user A potentially has access to the GCP folder F. And those advanced analysis results will be included in AnalyzeIamPolicyResponse.service_account_impersonation_analysis. Default is false.
    *     'options.analyzeServiceAccountImpersonation': 'placeholder-value',
    *     // Optional. Amount of time executable has to complete. See JSON representation of [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json). If this field is set with a value less than the RPC deadline, and the execution of your query hasn't finished in the specified execution timeout, you will get a response with partial result. Otherwise, your query's execution will continue until the RPC deadline. If it's not finished until then, you will get a DEADLINE_EXCEEDED error. Default is empty.
    *     'options.executionTimeout': 'placeholder-value',
    *     // Optional. If true, the identities section of the result will expand any Google groups appearing in an IAM policy binding. If identity_selector is specified, the identity in the result will be determined by the selector, and this flag will have no effect. Default is false.
    *     'options.expandGroups': 'placeholder-value',
    *     // Optional. If true, the resource section of the result will expand any resource attached to an IAM policy to include resources lower in the resource hierarchy. For example, if the request analyzes for which resources user A has permission P, and the results include an IAM policy with P on a GCP folder, the results will also include resources in that folder with permission P. If resource_selector is specified, the resource section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    *     'options.expandResources': 'placeholder-value',
    *     // Optional. If true, the access section of result will expand any roles appearing in IAM policy bindings to include their permissions. If access_selector is specified, the access section of the result will be determined by the selector, and this flag will have no effect. Default is false.
    *     'options.expandRoles': 'placeholder-value',
    *     // Optional. If true, the result will output group identity edges, starting from the binding's group members, to any expanded identities. Default is false.
    *     'options.outputGroupEdges': 'placeholder-value',
    *     // Optional. If true, the result will output resource edges, starting from the policy attached resource, to any expanded resources. Default is false.
    *     'options.outputResourceEdges': 'placeholder-value',
    *     // Required. The relative name of the root asset. Only resources and IAM policies within the parent will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    *     parent: '[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fullyExplored": false,
    *   //   "mainAnalysis": {},
    *   //   "nonCriticalErrors": [],
    *   //   "serviceAccountImpersonationAnalysis": []
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
  def analyzeIamPolicy(params: ParamsResourceV1p4beta1Analyzeiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeIamPolicy(
    params: ParamsResourceV1p4beta1Analyzeiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def exportIamPolicyAnalysis(): GaxiosPromise[SchemaOperation] = js.native
  def exportIamPolicyAnalysis(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def exportIamPolicyAnalysis(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportIamPolicyAnalysis(params: ParamsResourceV1p4beta1Exportiampolicyanalysis): GaxiosPromise[SchemaOperation] = js.native
  def exportIamPolicyAnalysis(
    params: ParamsResourceV1p4beta1Exportiampolicyanalysis,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def exportIamPolicyAnalysis(
    params: ParamsResourceV1p4beta1Exportiampolicyanalysis,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def exportIamPolicyAnalysis(params: ParamsResourceV1p4beta1Exportiampolicyanalysis, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def exportIamPolicyAnalysis(
    params: ParamsResourceV1p4beta1Exportiampolicyanalysis,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports the answers of which identities have what accesses on which resources to a Google Cloud Storage destination. The output format is the JSON format that represents a AnalyzeIamPolicyResponse in the JSON format. This method implements the google.longrunning.Operation, which allows you to keep track of the export. We recommend intervals of at least 2 seconds with exponential retry to poll the export operation result. The metadata contains the request to help callers to map responses to requests.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudasset.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudasset = google.cloudasset('v1p4beta1');
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
    *   const res = await cloudasset.exportIamPolicyAnalysis({
    *     // Required. The relative name of the root asset. Only resources and IAM policies within the parent will be analyzed. This can only be an organization number (such as "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    *     parent: '[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "analysisQuery": {},
    *       //   "options": {},
    *       //   "outputConfig": {}
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
  def exportIamPolicyAnalysis(params: ParamsResourceV1p4beta1Exportiampolicyanalysis, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def exportIamPolicyAnalysis(
    params: ParamsResourceV1p4beta1Exportiampolicyanalysis,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
