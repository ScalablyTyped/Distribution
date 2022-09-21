package typings.googleapis.managedidentitiesV1beta1Mod.managedidentitiesV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/managedidentities/v1beta1", "managedidentities_v1beta1.Resource$Projects$Locations$Global$Domains")
@js.native
open class ResourceProjectsLocationsGlobalDomains protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def attachTrust(): GaxiosPromise[SchemaOperation] = js.native
  def attachTrust(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def attachTrust(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust): GaxiosPromise[SchemaOperation] = js.native
  def attachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def attachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def attachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Adds an AD trust to a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.attachTrust({
    *       // Required. The resource domain name, project name and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "trust": {}
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
  def attachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def attachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsAttachtrust,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var backups: ResourceProjectsLocationsGlobalDomainsBackups = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsGlobalDomainsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalDomainsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalDomainsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsGlobalDomainsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalDomainsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a Microsoft AD domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.create({
    *     // Required. A domain name, e.g. mydomain.myorg.com, with the following restrictions: * Must contain only lowercase letters, numbers, periods and hyphens. * Must start with a letter. * Must contain between 2-64 characters. * Must end with a number or a letter. * Must not start with period. * First segment length (mydomain form example above) shouldn't exceed 15 chars. * The last segment cannot be fully numeric. * Must be unique within the customer project.
    *     domainName: 'placeholder-value',
    *     // Required. The resource project name and location using the form: `projects/{project_id\}/locations/global`
    *     parent: 'projects/my-project/locations/global',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "admin": "my_admin",
    *       //   "auditLogsEnabled": false,
    *       //   "authorizedNetworks": [],
    *       //   "createTime": "my_createTime",
    *       //   "fqdn": "my_fqdn",
    *       //   "labels": {},
    *       //   "locations": [],
    *       //   "name": "my_name",
    *       //   "reservedIpRange": "my_reservedIpRange",
    *       //   "state": "my_state",
    *       //   "statusMessage": "my_statusMessage",
    *       //   "trusts": [],
    *       //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceProjectsLocationsGlobalDomainsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGlobalDomainsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsGlobalDomainsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalDomainsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalDomainsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsGlobalDomainsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalDomainsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.delete({
    *     // Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *     name: 'projects/my-project/locations/global/domains/my-domain',
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
  def delete(params: ParamsResourceProjectsLocationsGlobalDomainsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGlobalDomainsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def detachTrust(): GaxiosPromise[SchemaOperation] = js.native
  def detachTrust(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def detachTrust(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust): GaxiosPromise[SchemaOperation] = js.native
  def detachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def detachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def detachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Removes an AD trust.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.detachTrust({
    *       // Required. The resource domain name, project name, and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "trust": {}
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
  def detachTrust(params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def detachTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsDetachtrust,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def extendSchema(): GaxiosPromise[SchemaOperation] = js.native
  def extendSchema(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def extendSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def extendSchema(params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema): GaxiosPromise[SchemaOperation] = js.native
  def extendSchema(
    params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def extendSchema(
    params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def extendSchema(params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def extendSchema(
    params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Extend Schema for Domain
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.extendSchema({
    *       // Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       domain: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "description": "my_description",
    *         //   "fileContents": "my_fileContents",
    *         //   "gcsPath": "my_gcsPath"
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
  def extendSchema(params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def extendSchema(
    params: ParamsResourceProjectsLocationsGlobalDomainsExtendschema,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDomain] = js.native
  def get(callback: BodyResponseCallback[SchemaDomain]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalDomainsGet): GaxiosPromise[SchemaDomain] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsGet,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsGet,
    options: BodyResponseCallback[Readable | SchemaDomain],
    callback: BodyResponseCallback[Readable | SchemaDomain]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGlobalDomainsGet, options: MethodOptions): GaxiosPromise[SchemaDomain] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDomain]
  ): Unit = js.native
  /**
    * Gets information about a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.get({
    *     // Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *     name: 'projects/my-project/locations/global/domains/my-domain',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "admin": "my_admin",
    *   //   "auditLogsEnabled": false,
    *   //   "authorizedNetworks": [],
    *   //   "createTime": "my_createTime",
    *   //   "fqdn": "my_fqdn",
    *   //   "labels": {},
    *   //   "locations": [],
    *   //   "name": "my_name",
    *   //   "reservedIpRange": "my_reservedIpRange",
    *   //   "state": "my_state",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "trusts": [],
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsGlobalDomainsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGlobalDomainsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource: 'projects/my-project/locations/global/domains/my-domain',
    *     });
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getLdapssettings(): GaxiosPromise[SchemaLDAPSSettings] = js.native
  def getLdapssettings(callback: BodyResponseCallback[SchemaLDAPSSettings]): Unit = js.native
  def getLdapssettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLDAPSSettings] = js.native
  def getLdapssettings(params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings): GaxiosPromise[SchemaLDAPSSettings] = js.native
  def getLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings,
    callback: BodyResponseCallback[SchemaLDAPSSettings]
  ): Unit = js.native
  def getLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings,
    options: BodyResponseCallback[Readable | SchemaLDAPSSettings],
    callback: BodyResponseCallback[Readable | SchemaLDAPSSettings]
  ): Unit = js.native
  def getLdapssettings(params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings, options: MethodOptions): GaxiosPromise[SchemaLDAPSSettings] = js.native
  def getLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLDAPSSettings]
  ): Unit = js.native
  /**
    * Gets the domain ldaps settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.getLdapssettings({
    *       // Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "certificate": {},
    *   //   "certificatePassword": "my_certificatePassword",
    *   //   "certificatePfx": "my_certificatePfx",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime"
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
  def getLdapssettings(params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsGetldapssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDomainsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalDomainsList): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsList,
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsList,
    options: BodyResponseCallback[Readable | SchemaListDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDomainsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGlobalDomainsList, options: MethodOptions): GaxiosPromise[SchemaListDomainsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDomainsResponse]
  ): Unit = js.native
  /**
    * Lists domains in a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.list({
    *     // Optional. A filter specifying constraints of a list operation. For example, `Domain.fqdn="mydomain.myorginization"`.
    *     filter: 'placeholder-value',
    *     // Optional. Specifies the ordering of results. See [Sorting order](https://cloud.google.com/apis/design/design_patterns#sorting_order) for more information.
    *     orderBy: 'placeholder-value',
    *     // Optional. The maximum number of items to return. If not specified, a default value of 1000 will be used. Regardless of the page_size value, the response may include a partial list. Callers should rely on a response's next_page_token to determine if there are additional results to list.
    *     pageSize: 'placeholder-value',
    *     // The `next_page_token` value returned from a previous ListDomainsRequest request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the domain location using the form: `projects/{project_id\}/locations/global`
    *     parent: 'projects/my-project/locations/global',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domains": [],
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
  def list(params: ParamsResourceProjectsLocationsGlobalDomainsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGlobalDomainsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsGlobalDomainsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalDomainsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalDomainsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsGlobalDomainsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalDomainsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the metadata and configuration of a domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.patch({
    *     // Output only. The unique name of the domain using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`.
    *     name: 'projects/my-project/locations/global/domains/my-domain',
    *     // Required. Mask of fields to update. At least one path must be supplied in this field. The elements of the repeated paths field may only include fields from Domain: * `labels` * `locations` * `authorized_networks` * `audit_logs_enabled`
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "admin": "my_admin",
    *       //   "auditLogsEnabled": false,
    *       //   "authorizedNetworks": [],
    *       //   "createTime": "my_createTime",
    *       //   "fqdn": "my_fqdn",
    *       //   "labels": {},
    *       //   "locations": [],
    *       //   "name": "my_name",
    *       //   "reservedIpRange": "my_reservedIpRange",
    *       //   "state": "my_state",
    *       //   "statusMessage": "my_statusMessage",
    *       //   "trusts": [],
    *       //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceProjectsLocationsGlobalDomainsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGlobalDomainsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reconfigureTrust(): GaxiosPromise[SchemaOperation] = js.native
  def reconfigureTrust(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def reconfigureTrust(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reconfigureTrust(params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust): GaxiosPromise[SchemaOperation] = js.native
  def reconfigureTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def reconfigureTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def reconfigureTrust(params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def reconfigureTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the DNS conditional forwarder.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.reconfigureTrust({
    *       // Required. The resource domain name, project name and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "targetDnsIpAddresses": [],
    *         //   "targetDomainName": "my_targetDomainName"
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
  def reconfigureTrust(params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reconfigureTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsReconfiguretrust,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAdminPassword(): GaxiosPromise[SchemaResetAdminPasswordResponse] = js.native
  def resetAdminPassword(callback: BodyResponseCallback[SchemaResetAdminPasswordResponse]): Unit = js.native
  def resetAdminPassword(params: Unit, options: MethodOptions): GaxiosPromise[SchemaResetAdminPasswordResponse] = js.native
  def resetAdminPassword(params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword): GaxiosPromise[SchemaResetAdminPasswordResponse] = js.native
  def resetAdminPassword(
    params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword,
    callback: BodyResponseCallback[SchemaResetAdminPasswordResponse]
  ): Unit = js.native
  def resetAdminPassword(
    params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword,
    options: BodyResponseCallback[Readable | SchemaResetAdminPasswordResponse],
    callback: BodyResponseCallback[Readable | SchemaResetAdminPasswordResponse]
  ): Unit = js.native
  def resetAdminPassword(params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword, options: MethodOptions): GaxiosPromise[SchemaResetAdminPasswordResponse] = js.native
  def resetAdminPassword(
    params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResetAdminPasswordResponse]
  ): Unit = js.native
  /**
    * Resets a domain's administrator password.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.resetAdminPassword(
    *       {
    *         // Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *         name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {}
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "password": "my_password"
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
  def resetAdminPassword(
    params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def resetAdminPassword(
    params: ParamsResourceProjectsLocationsGlobalDomainsResetadminpassword,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def restore(): GaxiosPromise[SchemaOperation] = js.native
  def restore(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def restore(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(params: ParamsResourceProjectsLocationsGlobalDomainsRestore): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsGlobalDomainsRestore,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def restore(
    params: ParamsResourceProjectsLocationsGlobalDomainsRestore,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def restore(params: ParamsResourceProjectsLocationsGlobalDomainsRestore, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsGlobalDomainsRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * RestoreBackup restores domain mentioned in the RestoreBackupRequest
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *   const res = await managedidentities.projects.locations.global.domains.restore(
    *     {
    *       // Required. resource name for the domain to which the backup belongs
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "backupId": "my_backupId"
    *         // }
    *       },
    *     }
    *   );
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
  def restore(params: ParamsResourceProjectsLocationsGlobalDomainsRestore, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def restore(
    params: ParamsResourceProjectsLocationsGlobalDomainsRestore,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {}
    *         // }
    *       },
    *     });
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsGlobalDomainsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sqlIntegrations: ResourceProjectsLocationsGlobalDomainsSqlintegrations = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource: 'projects/my-project/locations/global/domains/my-domain',
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
    params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsGlobalDomainsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateLdapssettings(): GaxiosPromise[SchemaOperation] = js.native
  def updateLdapssettings(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateLdapssettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateLdapssettings(params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings): GaxiosPromise[SchemaOperation] = js.native
  def updateLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateLdapssettings(params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Patches a single ldaps settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.updateLdapssettings(
    *       {
    *         // The resource name of the LDAPS settings. Uses the form: `projects/{project\}/locations/{location\}/domains/{domain\}`.
    *         name: 'projects/my-project/locations/global/domains/my-domain',
    *         // Required. Mask of fields to update. At least one path must be supplied in this field. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "certificate": {},
    *           //   "certificatePassword": "my_certificatePassword",
    *           //   "certificatePfx": "my_certificatePfx",
    *           //   "name": "my_name",
    *           //   "state": "my_state",
    *           //   "updateTime": "my_updateTime"
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
  def updateLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateLdapssettings(
    params: ParamsResourceProjectsLocationsGlobalDomainsUpdateldapssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def validateTrust(): GaxiosPromise[SchemaOperation] = js.native
  def validateTrust(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def validateTrust(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def validateTrust(params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust): GaxiosPromise[SchemaOperation] = js.native
  def validateTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def validateTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def validateTrust(params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def validateTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Validates a trust state, that the target domain is reachable, and that the target domain is able to accept incoming trust requests.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/managedidentities.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const managedidentities = google.managedidentities('v1beta1');
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
    *     await managedidentities.projects.locations.global.domains.validateTrust({
    *       // Required. The resource domain name, project name, and location using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    *       name: 'projects/my-project/locations/global/domains/my-domain',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "trust": {}
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
  def validateTrust(params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def validateTrust(
    params: ParamsResourceProjectsLocationsGlobalDomainsValidatetrust,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
