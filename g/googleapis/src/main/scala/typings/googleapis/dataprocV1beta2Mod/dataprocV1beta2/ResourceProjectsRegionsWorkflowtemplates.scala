package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Workflowtemplates")
@js.native
open class ResourceProjectsRegionsWorkflowtemplates protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate,
    options: BodyResponseCallback[Readable | SchemaWorkflowTemplate],
    callback: BodyResponseCallback[Readable | SchemaWorkflowTemplate]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def create(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  /**
    * Creates new workflow template.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.create({
    *     // Required. The resource name of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,create, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.workflowTemplates.create, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    *     parent: 'projects/my-project/regions/my-region',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dagTimeout": "my_dagTimeout",
    *       //   "id": "my_id",
    *       //   "jobs": [],
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "parameters": [],
    *       //   "placement": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dagTimeout": "my_dagTimeout",
    *   //   "id": "my_id",
    *   //   "jobs": [],
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "placement": {},
    *   //   "updateTime": "my_updateTime",
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
  def create(params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a workflow template. It does not cancel in-progress workflows.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.delete({
    *     // Required. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates.delete, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    *     name: 'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *     // Optional. The version of workflow template to delete. If specified, will only delete the template if the current server version matches specified version.
    *     version: 'placeholder-value',
    *   });
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
  def delete(params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(params: ParamsResourceProjectsRegionsWorkflowtemplatesGet): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGet,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGet,
    options: BodyResponseCallback[Readable | SchemaWorkflowTemplate],
    callback: BodyResponseCallback[Readable | SchemaWorkflowTemplate]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsWorkflowtemplatesGet, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def get(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  /**
    * Retrieves the latest workflow template.Can retrieve previously instantiated template by specifying optional version parameter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.get({
    *     // Required. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates.get, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates.get, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    *     name: 'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *     // Optional. The version of workflow template to retrieve. Only previously instantiated versions can be retrieved.If unspecified, retrieves the current version.
    *     version: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dagTimeout": "my_dagTimeout",
    *   //   "id": "my_id",
    *   //   "jobs": [],
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "placement": {},
    *   //   "updateTime": "my_updateTime",
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
  def get(params: ParamsResourceProjectsRegionsWorkflowtemplatesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.getIamPolicy({
    *     // Optional. The policy format version to be returned.Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected.Requests for policies with any conditional bindings must specify version 3. Policies without any conditional bindings may specify any valid value or leave the field unset.To learn which resources support conditions in their IAM policies, see the IAM documentation (https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def getIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def instantiate(): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def instantiate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiate(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def instantiate(params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiate(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Instantiates a template and begins execution.The returned Operation can be used to track execution of workflow by polling operations.get. The Operation will complete when entire workflow is finished.The running workflow can be aborted via operations.cancel. This will cause any inflight jobs to be cancelled and workflow-owned clusters to be deleted.The Operation.metadata will be WorkflowMetadata (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#workflowmetadata). Also see Using WorkflowMetadata (https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).On successful completion, Operation.response will be Empty.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.instantiate({
    *     // Required. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    *     name: 'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "instanceId": "my_instanceId",
    *       //   "parameters": {},
    *       //   "requestId": "my_requestId",
    *       //   "version": 0
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
  def instantiate(params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def instantiate(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def instantiateInline(): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def instantiateInline(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def instantiateInline(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def instantiateInline(params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def instantiateInline(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Instantiates a template and begins execution.This method is equivalent to executing the sequence CreateWorkflowTemplate, InstantiateWorkflowTemplate, DeleteWorkflowTemplate.The returned Operation can be used to track execution of workflow by polling operations.get. The Operation will complete when entire workflow is finished.The running workflow can be aborted via operations.cancel. This will cause any inflight jobs to be cancelled and workflow-owned clusters to be deleted.The Operation.metadata will be WorkflowMetadata (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1#workflowmetadata). Also see Using WorkflowMetadata (https://cloud.google.com/dataproc/docs/concepts/workflows/debugging#using_workflowmetadata).On successful completion, Operation.response will be Empty.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *     await dataproc.projects.regions.workflowTemplates.instantiateInline({
    *       // Deprecated. Please use request_id field instead.
    *       instanceId: 'placeholder-value',
    *       // Required. The resource name of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,instantiateinline, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.workflowTemplates.instantiateinline, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    *       parent: 'projects/my-project/regions/my-region',
    *       // Optional. A tag that prevents multiple concurrent workflow instances with the same tag from running. This mitigates risk of concurrent instances started due to retries.It is recommended to always set this value to a UUID (https://en.wikipedia.org/wiki/Universally_unique_identifier).The tag must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). The maximum length is 40 characters.
    *       requestId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "createTime": "my_createTime",
    *         //   "dagTimeout": "my_dagTimeout",
    *         //   "id": "my_id",
    *         //   "jobs": [],
    *         //   "labels": {},
    *         //   "name": "my_name",
    *         //   "parameters": [],
    *         //   "placement": {},
    *         //   "updateTime": "my_updateTime",
    *         //   "version": 0
    *         // }
    *       },
    *     });
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
  def instantiateInline(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def instantiateInline(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesInstantiateinline,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(params: ParamsResourceProjectsRegionsWorkflowtemplatesList): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesList,
    callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesList,
    options: BodyResponseCallback[Readable | SchemaListWorkflowTemplatesResponse],
    callback: BodyResponseCallback[Readable | SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsWorkflowtemplatesList, options: MethodOptions): GaxiosPromise[SchemaListWorkflowTemplatesResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkflowTemplatesResponse]
  ): Unit = js.native
  /**
    * Lists workflows that match the specified filter in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.list({
    *     // Optional. The maximum number of results to return in each response.
    *     pageSize: 'placeholder-value',
    *     // Optional. The page token, returned by a previous call, to request the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,list, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.workflowTemplates.list, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    *     parent: 'projects/my-project/regions/my-region',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "templates": []
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
  def list(params: ParamsResourceProjectsRegionsWorkflowtemplatesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy.Can return NOT_FOUND, INVALID_ARGUMENT, and PERMISSION_DENIED errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def setIamPolicy(params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a NOT_FOUND error.Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *     await dataproc.projects.regions.workflowTemplates.testIamPermissions({
    *       // REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     });
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
    params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(callback: BodyResponseCallback[SchemaWorkflowTemplate]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate,
    options: BodyResponseCallback[Readable | SchemaWorkflowTemplate],
    callback: BodyResponseCallback[Readable | SchemaWorkflowTemplate]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate, options: MethodOptions): GaxiosPromise[SchemaWorkflowTemplate] = js.native
  def update(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkflowTemplate]
  ): Unit = js.native
  /**
    * Updates (replaces) workflow template. The updated template must contain version that matches the current server version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dataproc.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dataproc = google.dataproc('v1beta2');
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
    *   const res = await dataproc.projects.regions.workflowTemplates.update({
    *     // Output only. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    *     name: 'projects/my-project/regions/my-region/workflowTemplates/my-workflowTemplate',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "dagTimeout": "my_dagTimeout",
    *       //   "id": "my_id",
    *       //   "jobs": [],
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "parameters": [],
    *       //   "placement": {},
    *       //   "updateTime": "my_updateTime",
    *       //   "version": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "dagTimeout": "my_dagTimeout",
    *   //   "id": "my_id",
    *   //   "jobs": [],
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "placement": {},
    *   //   "updateTime": "my_updateTime",
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
  def update(params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProjectsRegionsWorkflowtemplatesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
