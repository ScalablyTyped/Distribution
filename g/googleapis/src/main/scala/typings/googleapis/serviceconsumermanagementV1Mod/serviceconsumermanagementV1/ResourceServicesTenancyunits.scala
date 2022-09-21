package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1", "serviceconsumermanagement_v1.Resource$Services$Tenancyunits")
@js.native
open class ResourceServicesTenancyunits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addProject(): GaxiosPromise[SchemaOperation] = js.native
  def addProject(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addProject(params: ParamsResourceServicesTenancyunitsAddproject): GaxiosPromise[SchemaOperation] = js.native
  def addProject(
    params: ParamsResourceServicesTenancyunitsAddproject,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addProject(
    params: ParamsResourceServicesTenancyunitsAddproject,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def addProject(params: ParamsResourceServicesTenancyunitsAddproject, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addProject(
    params: ParamsResourceServicesTenancyunitsAddproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Add a new tenant project to the tenancy unit. There can be a maximum of 1024 tenant projects in a tenancy unit. If there are previously failed `AddTenantProject` calls, you might need to call `RemoveTenantProject` first to resolve them before you can make another call to `AddTenantProject` with the same tag. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *   const res = await serviceconsumermanagement.services.tenancyUnits.addProject({
    *     // Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *     parent: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "projectConfig": {},
    *       //   "tag": "my_tag"
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
  def addProject(params: ParamsResourceServicesTenancyunitsAddproject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addProject(
    params: ParamsResourceServicesTenancyunitsAddproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def applyProjectConfig(): GaxiosPromise[SchemaOperation] = js.native
  def applyProjectConfig(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def applyProjectConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyProjectConfig(params: ParamsResourceServicesTenancyunitsApplyprojectconfig): GaxiosPromise[SchemaOperation] = js.native
  def applyProjectConfig(
    params: ParamsResourceServicesTenancyunitsApplyprojectconfig,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def applyProjectConfig(
    params: ParamsResourceServicesTenancyunitsApplyprojectconfig,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def applyProjectConfig(params: ParamsResourceServicesTenancyunitsApplyprojectconfig, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def applyProjectConfig(
    params: ParamsResourceServicesTenancyunitsApplyprojectconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Apply a configuration to an existing tenant project. This project must exist in an active state and have the original owner account. The caller must have permission to add a project to the given tenancy unit. The configuration is applied, but any existing settings on the project aren't modified. Specified policy bindings are applied. Existing bindings aren't modified. Specified services are activated. No service is deactivated. If specified, new billing configuration is applied. Omit a billing configuration to keep the existing one. A service account in the project is created if previously non existed. Specified labels will be appended to tenant project, note that the value of existing label key will be updated if the same label key is requested. The specified folder is ignored, as moving a tenant project to a different folder isn't supported. The operation fails if any of the steps fail, but no rollback of already applied configuration changes is attempted. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *     await serviceconsumermanagement.services.tenancyUnits.applyProjectConfig({
    *       // Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *       name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "projectConfig": {},
    *         //   "tag": "my_tag"
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
  def applyProjectConfig(params: ParamsResourceServicesTenancyunitsApplyprojectconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def applyProjectConfig(
    params: ParamsResourceServicesTenancyunitsApplyprojectconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def attachProject(): GaxiosPromise[SchemaOperation] = js.native
  def attachProject(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def attachProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachProject(params: ParamsResourceServicesTenancyunitsAttachproject): GaxiosPromise[SchemaOperation] = js.native
  def attachProject(
    params: ParamsResourceServicesTenancyunitsAttachproject,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def attachProject(
    params: ParamsResourceServicesTenancyunitsAttachproject,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def attachProject(params: ParamsResourceServicesTenancyunitsAttachproject, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachProject(
    params: ParamsResourceServicesTenancyunitsAttachproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Attach an existing project to the tenancy unit as a new tenant resource. The project could either be the tenant project reserved by calling `AddTenantProject` under a tenancy unit of a service producer's project of a managed service, or from a separate project. The caller is checked against a set of permissions as if calling `AddTenantProject` on the same service consumer. To trigger the attachment, the targeted tenant project must be in a folder. Make sure the ServiceConsumerManagement service account is the owner of that project. These two requirements are already met if the project is reserved by calling `AddTenantProject`. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *     await serviceconsumermanagement.services.tenancyUnits.attachProject({
    *       // Required. Name of the tenancy unit that the project will be attached to. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *       name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "externalResource": "my_externalResource",
    *         //   "reservedResource": "my_reservedResource",
    *         //   "tag": "my_tag"
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
  def attachProject(params: ParamsResourceServicesTenancyunitsAttachproject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def attachProject(
    params: ParamsResourceServicesTenancyunitsAttachproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTenancyUnit] = js.native
  def create(callback: BodyResponseCallback[SchemaTenancyUnit]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTenancyUnit] = js.native
  def create(params: ParamsResourceServicesTenancyunitsCreate): GaxiosPromise[SchemaTenancyUnit] = js.native
  def create(
    params: ParamsResourceServicesTenancyunitsCreate,
    callback: BodyResponseCallback[SchemaTenancyUnit]
  ): Unit = js.native
  def create(
    params: ParamsResourceServicesTenancyunitsCreate,
    options: BodyResponseCallback[Readable | SchemaTenancyUnit],
    callback: BodyResponseCallback[Readable | SchemaTenancyUnit]
  ): Unit = js.native
  def create(params: ParamsResourceServicesTenancyunitsCreate, options: MethodOptions): GaxiosPromise[SchemaTenancyUnit] = js.native
  def create(
    params: ParamsResourceServicesTenancyunitsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTenancyUnit]
  ): Unit = js.native
  /**
    * Creates a tenancy unit with no tenant resources. If tenancy unit already exists, it will be returned, however, in this case, returned TenancyUnit does not have tenant_resources field set and ListTenancyUnits has to be used to get a complete TenancyUnit with all fields populated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *   const res = await serviceconsumermanagement.services.tenancyUnits.create({
    *     // Required. services/{service\}/{collection id\}/{resource id\} {collection id\} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id\} is the consumer numeric id, such as project number: '123456'. {service\} the name of a managed service, such as 'service.googleapis.com'. Enables service binding using the new tenancy unit.
    *     parent: 'services/my-service/[^/]+/[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "tenancyUnitId": "my_tenancyUnitId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consumer": "my_consumer",
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "service": "my_service",
    *   //   "tenantResources": []
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
  def create(params: ParamsResourceServicesTenancyunitsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceServicesTenancyunitsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesTenancyunitsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceServicesTenancyunitsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceServicesTenancyunitsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceServicesTenancyunitsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceServicesTenancyunitsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Delete a tenancy unit. Before you delete the tenancy unit, there should be no tenant resources in it that aren't in a DELETED state. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *   const res = await serviceconsumermanagement.services.tenancyUnits.delete({
    *     // Required. Name of the tenancy unit to be deleted.
    *     name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
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
  def delete(params: ParamsResourceServicesTenancyunitsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceServicesTenancyunitsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deleteProject(): GaxiosPromise[SchemaOperation] = js.native
  def deleteProject(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteProject(params: ParamsResourceServicesTenancyunitsDeleteproject): GaxiosPromise[SchemaOperation] = js.native
  def deleteProject(
    params: ParamsResourceServicesTenancyunitsDeleteproject,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteProject(
    params: ParamsResourceServicesTenancyunitsDeleteproject,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def deleteProject(params: ParamsResourceServicesTenancyunitsDeleteproject, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteProject(
    params: ParamsResourceServicesTenancyunitsDeleteproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the specified project resource identified by a tenant resource tag. The mothod removes a project lien with a 'TenantManager' origin if that was added. It will then attempt to delete the project. If that operation fails, this method also fails. After the project has been deleted, the tenant resource state is set to DELETED. To permanently remove resource metadata, call the `RemoveTenantProject` method. New resources with the same tag can't be added if there are existing resources in a DELETED state. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *     await serviceconsumermanagement.services.tenancyUnits.deleteProject({
    *       // Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *       name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "tag": "my_tag"
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
  def deleteProject(params: ParamsResourceServicesTenancyunitsDeleteproject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteProject(
    params: ParamsResourceServicesTenancyunitsDeleteproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTenancyUnitsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTenancyUnitsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTenancyUnitsResponse] = js.native
  def list(params: ParamsResourceServicesTenancyunitsList): GaxiosPromise[SchemaListTenancyUnitsResponse] = js.native
  def list(
    params: ParamsResourceServicesTenancyunitsList,
    callback: BodyResponseCallback[SchemaListTenancyUnitsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceServicesTenancyunitsList,
    options: BodyResponseCallback[Readable | SchemaListTenancyUnitsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTenancyUnitsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesTenancyunitsList, options: MethodOptions): GaxiosPromise[SchemaListTenancyUnitsResponse] = js.native
  def list(
    params: ParamsResourceServicesTenancyunitsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTenancyUnitsResponse]
  ): Unit = js.native
  /**
    * Find the tenancy unit for a managed service and service consumer. This method shouldn't be used in a service producer's runtime path, for example to find the tenant project number when creating VMs. Service producers must persist the tenant project's information after the project is created.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *   const res = await serviceconsumermanagement.services.tenancyUnits.list({
    *     // Optional. Filter expression over tenancy resources field. Optional.
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of results returned by this request.
    *     pageSize: 'placeholder-value',
    *     // Optional. The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `nextPageToken` from the previous response.
    *     pageToken: 'placeholder-value',
    *     // Required. Managed service and service consumer. Required. services/{service\}/{collection id\}/{resource id\} {collection id\} is the cloud resource collection type representing the service consumer, for example 'projects', or 'organizations'. {resource id\} is the consumer numeric id, such as project number: '123456'. {service\} the name of a service, such as 'service.googleapis.com'.
    *     parent: 'services/my-service/[^/]+/[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tenancyUnits": []
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
  def list(params: ParamsResourceServicesTenancyunitsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesTenancyunitsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeProject(): GaxiosPromise[SchemaOperation] = js.native
  def removeProject(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeProject(params: ParamsResourceServicesTenancyunitsRemoveproject): GaxiosPromise[SchemaOperation] = js.native
  def removeProject(
    params: ParamsResourceServicesTenancyunitsRemoveproject,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeProject(
    params: ParamsResourceServicesTenancyunitsRemoveproject,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def removeProject(params: ParamsResourceServicesTenancyunitsRemoveproject, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeProject(
    params: ParamsResourceServicesTenancyunitsRemoveproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes the specified project resource identified by a tenant resource tag. The method removes the project lien with 'TenantManager' origin if that was added. It then attempts to delete the project. If that operation fails, this method also fails. Calls to remove already removed or non-existent tenant project succeed. After the project has been deleted, or if was already in a DELETED state, resource metadata is permanently removed from the tenancy unit. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *     await serviceconsumermanagement.services.tenancyUnits.removeProject({
    *       // Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *       name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "tag": "my_tag"
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
  def removeProject(params: ParamsResourceServicesTenancyunitsRemoveproject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeProject(
    params: ParamsResourceServicesTenancyunitsRemoveproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undeleteProject(): GaxiosPromise[SchemaOperation] = js.native
  def undeleteProject(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def undeleteProject(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undeleteProject(params: ParamsResourceServicesTenancyunitsUndeleteproject): GaxiosPromise[SchemaOperation] = js.native
  def undeleteProject(
    params: ParamsResourceServicesTenancyunitsUndeleteproject,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def undeleteProject(
    params: ParamsResourceServicesTenancyunitsUndeleteproject,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def undeleteProject(params: ParamsResourceServicesTenancyunitsUndeleteproject, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def undeleteProject(
    params: ParamsResourceServicesTenancyunitsUndeleteproject,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Attempts to undelete a previously deleted tenant project. The project must be in a DELETED state. There are no guarantees that an undeleted project will be in a fully restored and functional state. Call the `ApplyTenantProjectConfig` method to update its configuration and then validate all managed service resources. Operation.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *     await serviceconsumermanagement.services.tenancyUnits.undeleteProject({
    *       // Required. Name of the tenancy unit. Such as 'services/service.googleapis.com/projects/12345/tenancyUnits/abcd'.
    *       name: 'services/my-service/[^/]+/[^/]+/tenancyUnits/my-tenancyUnit',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "tag": "my_tag"
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
  def undeleteProject(params: ParamsResourceServicesTenancyunitsUndeleteproject, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def undeleteProject(
    params: ParamsResourceServicesTenancyunitsUndeleteproject,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
