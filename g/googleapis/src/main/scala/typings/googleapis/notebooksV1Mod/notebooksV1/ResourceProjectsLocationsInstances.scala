package typings.googleapis.notebooksV1Mod.notebooksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/notebooks/v1", "notebooks_v1.Resource$Projects$Locations$Instances")
@js.native
open class ResourceProjectsLocationsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new Instance in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.create({
    *     // Required. User-defined unique ID of this instance.
    *     instanceId: 'placeholder-value',
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "acceleratorConfig": {},
    *       //   "bootDiskSizeGb": "my_bootDiskSizeGb",
    *       //   "bootDiskType": "my_bootDiskType",
    *       //   "canIpForward": false,
    *       //   "containerImage": {},
    *       //   "createTime": "my_createTime",
    *       //   "creator": "my_creator",
    *       //   "customGpuDriverPath": "my_customGpuDriverPath",
    *       //   "dataDiskSizeGb": "my_dataDiskSizeGb",
    *       //   "dataDiskType": "my_dataDiskType",
    *       //   "diskEncryption": "my_diskEncryption",
    *       //   "disks": [],
    *       //   "installGpuDriver": false,
    *       //   "instanceOwners": [],
    *       //   "kmsKey": "my_kmsKey",
    *       //   "labels": {},
    *       //   "machineType": "my_machineType",
    *       //   "metadata": {},
    *       //   "name": "my_name",
    *       //   "network": "my_network",
    *       //   "nicType": "my_nicType",
    *       //   "noProxyAccess": false,
    *       //   "noPublicIp": false,
    *       //   "noRemoveDataDisk": false,
    *       //   "postStartupScript": "my_postStartupScript",
    *       //   "proxyUri": "my_proxyUri",
    *       //   "reservationAffinity": {},
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "serviceAccountScopes": [],
    *       //   "shieldedInstanceConfig": {},
    *       //   "state": "my_state",
    *       //   "subnet": "my_subnet",
    *       //   "tags": [],
    *       //   "updateTime": "my_updateTime",
    *       //   "upgradeHistory": [],
    *       //   "vmImage": {}
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
  def create(params: ParamsResourceProjectsLocationsInstancesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsInstancesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.delete({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
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
  def delete(params: ParamsResourceProjectsLocationsInstancesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsInstancesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: BodyResponseCallback[Readable | SchemaInstance],
    callback: BodyResponseCallback[Readable | SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  /**
    * Gets details of a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.get({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "acceleratorConfig": {},
    *   //   "bootDiskSizeGb": "my_bootDiskSizeGb",
    *   //   "bootDiskType": "my_bootDiskType",
    *   //   "canIpForward": false,
    *   //   "containerImage": {},
    *   //   "createTime": "my_createTime",
    *   //   "creator": "my_creator",
    *   //   "customGpuDriverPath": "my_customGpuDriverPath",
    *   //   "dataDiskSizeGb": "my_dataDiskSizeGb",
    *   //   "dataDiskType": "my_dataDiskType",
    *   //   "diskEncryption": "my_diskEncryption",
    *   //   "disks": [],
    *   //   "installGpuDriver": false,
    *   //   "instanceOwners": [],
    *   //   "kmsKey": "my_kmsKey",
    *   //   "labels": {},
    *   //   "machineType": "my_machineType",
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "network": "my_network",
    *   //   "nicType": "my_nicType",
    *   //   "noProxyAccess": false,
    *   //   "noPublicIp": false,
    *   //   "noRemoveDataDisk": false,
    *   //   "postStartupScript": "my_postStartupScript",
    *   //   "proxyUri": "my_proxyUri",
    *   //   "reservationAffinity": {},
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceAccountScopes": [],
    *   //   "shieldedInstanceConfig": {},
    *   //   "state": "my_state",
    *   //   "subnet": "my_subnet",
    *   //   "tags": [],
    *   //   "updateTime": "my_updateTime",
    *   //   "upgradeHistory": [],
    *   //   "vmImage": {}
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
  def get(params: ParamsResourceProjectsLocationsInstancesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsInstancesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsInstancesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsInstancesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/instances/my-instance',
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsInstancesGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getInstanceHealth(): GaxiosPromise[SchemaGetInstanceHealthResponse] = js.native
  def getInstanceHealth(callback: BodyResponseCallback[SchemaGetInstanceHealthResponse]): Unit = js.native
  def getInstanceHealth(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetInstanceHealthResponse] = js.native
  def getInstanceHealth(params: ParamsResourceProjectsLocationsInstancesGetinstancehealth): GaxiosPromise[SchemaGetInstanceHealthResponse] = js.native
  def getInstanceHealth(
    params: ParamsResourceProjectsLocationsInstancesGetinstancehealth,
    callback: BodyResponseCallback[SchemaGetInstanceHealthResponse]
  ): Unit = js.native
  def getInstanceHealth(
    params: ParamsResourceProjectsLocationsInstancesGetinstancehealth,
    options: BodyResponseCallback[Readable | SchemaGetInstanceHealthResponse],
    callback: BodyResponseCallback[Readable | SchemaGetInstanceHealthResponse]
  ): Unit = js.native
  def getInstanceHealth(params: ParamsResourceProjectsLocationsInstancesGetinstancehealth, options: MethodOptions): GaxiosPromise[SchemaGetInstanceHealthResponse] = js.native
  def getInstanceHealth(
    params: ParamsResourceProjectsLocationsInstancesGetinstancehealth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetInstanceHealthResponse]
  ): Unit = js.native
  /**
    * Check if a notebook instance is healthy.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.getInstanceHealth({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "healthInfo": {},
    *   //   "healthState": "my_healthState"
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
  def getInstanceHealth(params: ParamsResourceProjectsLocationsInstancesGetinstancehealth, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getInstanceHealth(
    params: ParamsResourceProjectsLocationsInstancesGetinstancehealth,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def isUpgradeable(): GaxiosPromise[SchemaIsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(callback: BodyResponseCallback[SchemaIsInstanceUpgradeableResponse]): Unit = js.native
  def isUpgradeable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaIsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(params: ParamsResourceProjectsLocationsInstancesIsupgradeable): GaxiosPromise[SchemaIsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(
    params: ParamsResourceProjectsLocationsInstancesIsupgradeable,
    callback: BodyResponseCallback[SchemaIsInstanceUpgradeableResponse]
  ): Unit = js.native
  def isUpgradeable(
    params: ParamsResourceProjectsLocationsInstancesIsupgradeable,
    options: BodyResponseCallback[Readable | SchemaIsInstanceUpgradeableResponse],
    callback: BodyResponseCallback[Readable | SchemaIsInstanceUpgradeableResponse]
  ): Unit = js.native
  def isUpgradeable(params: ParamsResourceProjectsLocationsInstancesIsupgradeable, options: MethodOptions): GaxiosPromise[SchemaIsInstanceUpgradeableResponse] = js.native
  def isUpgradeable(
    params: ParamsResourceProjectsLocationsInstancesIsupgradeable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaIsInstanceUpgradeableResponse]
  ): Unit = js.native
  /**
    * Check if a notebook instance is upgradable.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.isUpgradeable({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     notebookInstance:
    *       'projects/my-project/locations/my-location/instances/my-instance',
    *     // Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "upgradeImage": "my_upgradeImage",
    *   //   "upgradeInfo": "my_upgradeInfo",
    *   //   "upgradeVersion": "my_upgradeVersion",
    *   //   "upgradeable": false
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
  def isUpgradeable(params: ParamsResourceProjectsLocationsInstancesIsupgradeable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def isUpgradeable(
    params: ParamsResourceProjectsLocationsInstancesIsupgradeable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: BodyResponseCallback[Readable | SchemaListInstancesResponse],
    callback: BodyResponseCallback[Readable | SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  /**
    * Lists instances in a given project and location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.list({
    *     // Maximum return size of the list call.
    *     pageSize: 'placeholder-value',
    *     // A previous returned page token that can be used to continue listing from the last result.
    *     pageToken: 'placeholder-value',
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "instances": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsInstancesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsInstancesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def register(): GaxiosPromise[SchemaOperation] = js.native
  def register(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def register(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def register(params: ParamsResourceProjectsLocationsInstancesRegister): GaxiosPromise[SchemaOperation] = js.native
  def register(
    params: ParamsResourceProjectsLocationsInstancesRegister,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def register(
    params: ParamsResourceProjectsLocationsInstancesRegister,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def register(params: ParamsResourceProjectsLocationsInstancesRegister, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def register(
    params: ParamsResourceProjectsLocationsInstancesRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Registers an existing legacy notebook instance to the Notebooks API server. Legacy instances are instances created with the legacy Compute Engine calls. They are not manageable by the Notebooks API out of the box. This call makes these instances manageable by the Notebooks API.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.register({
    *     // Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "instanceId": "my_instanceId"
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
  def register(params: ParamsResourceProjectsLocationsInstancesRegister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def register(
    params: ParamsResourceProjectsLocationsInstancesRegister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def report(): GaxiosPromise[SchemaOperation] = js.native
  def report(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def report(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def report(params: ParamsResourceProjectsLocationsInstancesReport): GaxiosPromise[SchemaOperation] = js.native
  def report(
    params: ParamsResourceProjectsLocationsInstancesReport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def report(
    params: ParamsResourceProjectsLocationsInstancesReport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def report(params: ParamsResourceProjectsLocationsInstancesReport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def report(
    params: ParamsResourceProjectsLocationsInstancesReport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Allows notebook instances to report their latest instance information to the Notebooks API server. The server will merge the reported information to the instance metadata store. Do not use this method directly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.report({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "metadata": {},
    *       //   "vmId": "my_vmId"
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
  def report(params: ParamsResourceProjectsLocationsInstancesReport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def report(
    params: ParamsResourceProjectsLocationsInstancesReport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reset(): GaxiosPromise[SchemaOperation] = js.native
  def reset(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reset(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(params: ParamsResourceProjectsLocationsInstancesReset): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsInstancesReset,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reset(
    params: ParamsResourceProjectsLocationsInstancesReset,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def reset(params: ParamsResourceProjectsLocationsInstancesReset, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsInstancesReset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Resets a notebook instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.reset({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def reset(params: ParamsResourceProjectsLocationsInstancesReset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reset(
    params: ParamsResourceProjectsLocationsInstancesReset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rollback(): GaxiosPromise[SchemaOperation] = js.native
  def rollback(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def rollback(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(params: ParamsResourceProjectsLocationsInstancesRollback): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsInstancesRollback,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsInstancesRollback,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def rollback(params: ParamsResourceProjectsLocationsInstancesRollback, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsInstancesRollback,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Rollbacks a notebook instance to the previous version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.rollback({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "targetSnapshot": "my_targetSnapshot"
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
  def rollback(params: ParamsResourceProjectsLocationsInstancesRollback, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rollback(
    params: ParamsResourceProjectsLocationsInstancesRollback,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setAccelerator(): GaxiosPromise[SchemaOperation] = js.native
  def setAccelerator(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAccelerator(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAccelerator(params: ParamsResourceProjectsLocationsInstancesSetaccelerator): GaxiosPromise[SchemaOperation] = js.native
  def setAccelerator(
    params: ParamsResourceProjectsLocationsInstancesSetaccelerator,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAccelerator(
    params: ParamsResourceProjectsLocationsInstancesSetaccelerator,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setAccelerator(params: ParamsResourceProjectsLocationsInstancesSetaccelerator, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAccelerator(
    params: ParamsResourceProjectsLocationsInstancesSetaccelerator,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the guest accelerators of a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.setAccelerator({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "coreCount": "my_coreCount",
    *       //   "type": "my_type"
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
  def setAccelerator(params: ParamsResourceProjectsLocationsInstancesSetaccelerator, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAccelerator(
    params: ParamsResourceProjectsLocationsInstancesSetaccelerator,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsInstancesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsInstancesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/instances/my-instance',
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsInstancesSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsInstancesSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceProjectsLocationsInstancesSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceProjectsLocationsInstancesSetlabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(
    params: ParamsResourceProjectsLocationsInstancesSetlabels,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceProjectsLocationsInstancesSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceProjectsLocationsInstancesSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Replaces all the labels of an Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.setLabels({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labels": {}
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
  def setLabels(params: ParamsResourceProjectsLocationsInstancesSetlabels, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setLabels(
    params: ParamsResourceProjectsLocationsInstancesSetlabels,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setMachineType(): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setMachineType(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(params: ParamsResourceProjectsLocationsInstancesSetmachinetype): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(
    params: ParamsResourceProjectsLocationsInstancesSetmachinetype,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setMachineType(
    params: ParamsResourceProjectsLocationsInstancesSetmachinetype,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def setMachineType(params: ParamsResourceProjectsLocationsInstancesSetmachinetype, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setMachineType(
    params: ParamsResourceProjectsLocationsInstancesSetmachinetype,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the machine type of a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.setMachineType({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "machineType": "my_machineType"
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
  def setMachineType(params: ParamsResourceProjectsLocationsInstancesSetmachinetype, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setMachineType(
    params: ParamsResourceProjectsLocationsInstancesSetmachinetype,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def start(): GaxiosPromise[SchemaOperation] = js.native
  def start(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(params: ParamsResourceProjectsLocationsInstancesStart): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsInstancesStart,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def start(
    params: ParamsResourceProjectsLocationsInstancesStart,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def start(params: ParamsResourceProjectsLocationsInstancesStart, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def start(
    params: ParamsResourceProjectsLocationsInstancesStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Starts a notebook instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.start({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def start(params: ParamsResourceProjectsLocationsInstancesStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceProjectsLocationsInstancesStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaOperation] = js.native
  def stop(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(params: ParamsResourceProjectsLocationsInstancesStop): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsInstancesStop,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsInstancesStop,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsInstancesStop, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsInstancesStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Stops a notebook instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.stop({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def stop(params: ParamsResourceProjectsLocationsInstancesStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsInstancesStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsInstancesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsInstancesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsInstancesTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsInstancesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsInstancesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.testIamPermissions({
    *     // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "permissions": []
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsInstancesTestiampermissions, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsInstancesTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateConfig(): GaxiosPromise[SchemaOperation] = js.native
  def updateConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConfig(params: ParamsResourceProjectsLocationsInstancesUpdateconfig): GaxiosPromise[SchemaOperation] = js.native
  def updateConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateconfig,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateconfig,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateConfig(params: ParamsResourceProjectsLocationsInstancesUpdateconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update Notebook Instance configurations.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.updateConfig({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "config": {}
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
  def updateConfig(params: ParamsResourceProjectsLocationsInstancesUpdateconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateMetadataItems(): GaxiosPromise[SchemaUpdateInstanceMetadataItemsResponse] = js.native
  def updateMetadataItems(callback: BodyResponseCallback[SchemaUpdateInstanceMetadataItemsResponse]): Unit = js.native
  def updateMetadataItems(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateInstanceMetadataItemsResponse] = js.native
  def updateMetadataItems(params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems): GaxiosPromise[SchemaUpdateInstanceMetadataItemsResponse] = js.native
  def updateMetadataItems(
    params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems,
    callback: BodyResponseCallback[SchemaUpdateInstanceMetadataItemsResponse]
  ): Unit = js.native
  def updateMetadataItems(
    params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems,
    options: BodyResponseCallback[Readable | SchemaUpdateInstanceMetadataItemsResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateInstanceMetadataItemsResponse]
  ): Unit = js.native
  def updateMetadataItems(params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems, options: MethodOptions): GaxiosPromise[SchemaUpdateInstanceMetadataItemsResponse] = js.native
  def updateMetadataItems(
    params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateInstanceMetadataItemsResponse]
  ): Unit = js.native
  /**
    * Add/update metadata items for an instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.updateMetadataItems({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "items": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": {}
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
  def updateMetadataItems(params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateMetadataItems(
    params: ParamsResourceProjectsLocationsInstancesUpdatemetadataitems,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateShieldedInstanceConfig(): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateShieldedInstanceConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the Shielded instance configuration of a single Instance.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *     await notebooks.projects.locations.instances.updateShieldedInstanceConfig({
    *       // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *       name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "shieldedInstanceConfig": {}
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
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateShieldedInstanceConfig(
    params: ParamsResourceProjectsLocationsInstancesUpdateshieldedinstanceconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upgrade(): GaxiosPromise[SchemaOperation] = js.native
  def upgrade(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def upgrade(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def upgrade(params: ParamsResourceProjectsLocationsInstancesUpgrade): GaxiosPromise[SchemaOperation] = js.native
  def upgrade(
    params: ParamsResourceProjectsLocationsInstancesUpgrade,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def upgrade(
    params: ParamsResourceProjectsLocationsInstancesUpgrade,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def upgrade(params: ParamsResourceProjectsLocationsInstancesUpgrade, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def upgrade(
    params: ParamsResourceProjectsLocationsInstancesUpgrade,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Upgrades a notebook instance to the latest version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.upgrade({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "type": "my_type"
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
  def upgrade(params: ParamsResourceProjectsLocationsInstancesUpgrade, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upgrade(
    params: ParamsResourceProjectsLocationsInstancesUpgrade,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upgradeInternal(): GaxiosPromise[SchemaOperation] = js.native
  def upgradeInternal(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def upgradeInternal(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def upgradeInternal(params: ParamsResourceProjectsLocationsInstancesUpgradeinternal): GaxiosPromise[SchemaOperation] = js.native
  def upgradeInternal(
    params: ParamsResourceProjectsLocationsInstancesUpgradeinternal,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def upgradeInternal(
    params: ParamsResourceProjectsLocationsInstancesUpgradeinternal,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def upgradeInternal(params: ParamsResourceProjectsLocationsInstancesUpgradeinternal, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def upgradeInternal(
    params: ParamsResourceProjectsLocationsInstancesUpgradeinternal,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Allows notebook instances to call this endpoint to upgrade themselves. Do not use this method directly.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/notebooks.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const notebooks = google.notebooks('v1');
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
    *   const res = await notebooks.projects.locations.instances.upgradeInternal({
    *     // Required. Format: `projects/{project_id\}/locations/{location\}/instances/{instance_id\}`
    *     name: 'projects/my-project/locations/my-location/instances/my-instance',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "type": "my_type",
    *       //   "vmId": "my_vmId"
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
  def upgradeInternal(params: ParamsResourceProjectsLocationsInstancesUpgradeinternal, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upgradeInternal(
    params: ParamsResourceProjectsLocationsInstancesUpgradeinternal,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
