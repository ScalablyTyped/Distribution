package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/domains/v1beta1", "domains_v1beta1.Resource$Projects$Locations$Registrations")
@js.native
open class ResourceProjectsLocationsRegistrations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def configureContactSettings(): GaxiosPromise[SchemaOperation] = js.native
  def configureContactSettings(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def configureContactSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def configureContactSettings(params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings): GaxiosPromise[SchemaOperation] = js.native
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a `Registration`'s contact settings. Some changes require confirmation by the domain's registrant contact .
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.configureContactSettings({
    *       // Required. The name of the `Registration` whose contact settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    *       registration:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "contactNotices": [],
    *         //   "contactSettings": {},
    *         //   "updateMask": "my_updateMask",
    *         //   "validateOnly": false
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
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def configureContactSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def configureDnsSettings(): GaxiosPromise[SchemaOperation] = js.native
  def configureDnsSettings(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def configureDnsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def configureDnsSettings(params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings): GaxiosPromise[SchemaOperation] = js.native
  def configureDnsSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def configureDnsSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def configureDnsSettings(params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def configureDnsSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a `Registration`'s DNS settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.configureDnsSettings({
    *       // Required. The name of the `Registration` whose DNS settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    *       registration:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "dnsSettings": {},
    *         //   "updateMask": "my_updateMask",
    *         //   "validateOnly": false
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
  def configureDnsSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def configureDnsSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def configureManagementSettings(): GaxiosPromise[SchemaOperation] = js.native
  def configureManagementSettings(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def configureManagementSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def configureManagementSettings(params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings): GaxiosPromise[SchemaOperation] = js.native
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates a `Registration`'s management settings.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.configureManagementSettings({
    *       // Required. The name of the `Registration` whose management settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    *       registration:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "managementSettings": {},
    *         //   "updateMask": "my_updateMask"
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
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def configureManagementSettings(
    params: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistrationsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistrationsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistrationsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRegistrationsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistrationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a `Registration` resource. This method works on any `Registration` resource using [Subscription or Commitment billing](/domains/pricing#billing-models), provided that the resource was created at least 1 day in the past. For `Registration` resources using [Monthly billing](/domains/pricing#billing-models), this method works if: * `state` is `EXPORTED` with `expire_time` in the past * `state` is `REGISTRATION_FAILED` * `state` is `TRANSFER_FAILED` When an active registration is successfully deleted, you can continue to use the domain in [Google Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are subsequently managed there. The domain does not renew automatically unless the new owner sets up billing in Google Domains.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.delete({
    *     // Required. The name of the `Registration` to delete, in the format `projects/x/locations/x/registrations/x`.
    *     name: 'projects/my-project/locations/my-location/registrations/my-registration',
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
  def delete(params: ParamsResourceProjectsLocationsRegistrationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRegistrationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceProjectsLocationsRegistrationsExport): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsRegistrationsExport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsRegistrationsExport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsRegistrationsExport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsRegistrationsExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports a `Registration` resource, such that it is no longer managed by Cloud Domains. When an active domain is successfully exported, you can continue to use the domain in [Google Domains](https://domains.google/) until it expires. The calling user becomes the domain's sole owner in Google Domains, and permissions for the domain are subsequently managed there. The domain does not renew automatically unless the new owner sets up billing in Google Domains.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.export({
    *     // Required. The name of the `Registration` to export, in the format `projects/x/locations/x/registrations/x`.
    *     name: 'projects/my-project/locations/my-location/registrations/my-registration',
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
  def `export`(params: ParamsResourceProjectsLocationsRegistrationsExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsRegistrationsExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRegistration] = js.native
  def get(callback: BodyResponseCallback[SchemaRegistration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegistration] = js.native
  def get(params: ParamsResourceProjectsLocationsRegistrationsGet): GaxiosPromise[SchemaRegistration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistrationsGet,
    callback: BodyResponseCallback[SchemaRegistration]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistrationsGet,
    options: BodyResponseCallback[Readable | SchemaRegistration],
    callback: BodyResponseCallback[Readable | SchemaRegistration]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRegistrationsGet, options: MethodOptions): GaxiosPromise[SchemaRegistration] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistrationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegistration]
  ): Unit = js.native
  /**
    * Gets the details of a `Registration` resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.get({
    *     // Required. The name of the `Registration` to get, in the format `projects/x/locations/x/registrations/x`.
    *     name: 'projects/my-project/locations/my-location/registrations/my-registration',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contactSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "dnsSettings": {},
    *   //   "domainName": "my_domainName",
    *   //   "expireTime": "my_expireTime",
    *   //   "issues": [],
    *   //   "labels": {},
    *   //   "managementSettings": {},
    *   //   "name": "my_name",
    *   //   "pendingContactSettings": {},
    *   //   "registerFailureReason": "my_registerFailureReason",
    *   //   "state": "my_state",
    *   //   "supportedPrivacy": [],
    *   //   "transferFailureReason": "my_transferFailureReason"
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
  def get(params: ParamsResourceProjectsLocationsRegistrationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRegistrationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.getIamPolicy({
    *     // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *     'options.requestedPolicyVersion': 'placeholder-value',
    *     // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/registrations/my-registration',
    *   });
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsRegistrationsImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRegistrationsImport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRegistrationsImport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsRegistrationsImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRegistrationsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Imports a domain name from [Google Domains](https://domains.google/) for use in Cloud Domains. To transfer a domain from another registrar, use the `TransferDomain` method instead. Since individual users can own domains in Google Domains, the calling user must have ownership permission on the domain.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.import({
    *     // Required. The parent resource of the Registration. Must be in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "domainName": "my_domainName",
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
  def `import`(params: ParamsResourceProjectsLocationsRegistrationsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRegistrationsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRegistrationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRegistrationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRegistrationsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRegistrationsList): GaxiosPromise[SchemaListRegistrationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistrationsList,
    callback: BodyResponseCallback[SchemaListRegistrationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistrationsList,
    options: BodyResponseCallback[Readable | SchemaListRegistrationsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRegistrationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRegistrationsList, options: MethodOptions): GaxiosPromise[SchemaListRegistrationsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistrationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRegistrationsResponse]
  ): Unit = js.native
  /**
    * Lists the `Registration` resources in a project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.list({
    *     // Filter expression to restrict the `Registration`s returned. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, a boolean, or an enum value. The comparison operator should be one of =, !=, \>, <, \>=, <=, or : for prefix or wildcard matches. For example, to filter to a specific domain name, use an expression like `domainName="example.com"`. You can also check for the existence of a field; for example, to find domains using custom DNS settings, use an expression like `dnsSettings.customDns:*`. You can also create compound filters by combining expressions with the `AND` and `OR` operators. For example, to find domains that are suspended or have specific issues flagged, use an expression like `(state=SUSPENDED) OR (issue:*)`.
    *     filter: 'placeholder-value',
    *     // Maximum number of results to return.
    *     pageSize: 'placeholder-value',
    *     // When set to the `next_page_token` from a prior response, provides the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Required. The project and location from which to list `Registration`s, specified in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "registrations": []
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
  def list(params: ParamsResourceProjectsLocationsRegistrationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRegistrationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistrationsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistrationsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistrationsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRegistrationsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistrationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates select fields of a `Registration` resource, notably `labels`. To update other fields, use the appropriate custom update method: * To update management settings, see `ConfigureManagementSettings` * To update DNS configuration, see `ConfigureDnsSettings` * To update contact information, see `ConfigureContactSettings`
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.patch({
    *     // Output only. Name of the `Registration` resource, in the format `projects/x/locations/x/registrations/`.
    *     name: 'projects/my-project/locations/my-location/registrations/my-registration',
    *     // Required. The field mask describing which fields to update as a comma-separated list. For example, if only the labels are being updated, the `update_mask` is `"labels"`.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactSettings": {},
    *       //   "createTime": "my_createTime",
    *       //   "dnsSettings": {},
    *       //   "domainName": "my_domainName",
    *       //   "expireTime": "my_expireTime",
    *       //   "issues": [],
    *       //   "labels": {},
    *       //   "managementSettings": {},
    *       //   "name": "my_name",
    *       //   "pendingContactSettings": {},
    *       //   "registerFailureReason": "my_registerFailureReason",
    *       //   "state": "my_state",
    *       //   "supportedPrivacy": [],
    *       //   "transferFailureReason": "my_transferFailureReason"
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
  def patch(params: ParamsResourceProjectsLocationsRegistrationsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRegistrationsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def register(): GaxiosPromise[SchemaOperation] = js.native
  def register(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def register(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def register(params: ParamsResourceProjectsLocationsRegistrationsRegister): GaxiosPromise[SchemaOperation] = js.native
  def register(
    params: ParamsResourceProjectsLocationsRegistrationsRegister,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def register(
    params: ParamsResourceProjectsLocationsRegistrationsRegister,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def register(params: ParamsResourceProjectsLocationsRegistrationsRegister, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def register(
    params: ParamsResourceProjectsLocationsRegistrationsRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Registers a new domain name and creates a corresponding `Registration` resource. Call `RetrieveRegisterParameters` first to check availability of the domain name and determine parameters like price that are needed to build a call to this method. A successful call creates a `Registration` resource in state `REGISTRATION_PENDING`, which resolves to `ACTIVE` within 1-2 minutes, indicating that the domain was successfully registered. If the resource ends up in state `REGISTRATION_FAILED`, it indicates that the domain was not registered successfully, and you can safely delete the resource and retry registration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.register({
    *     // Required. The parent resource of the `Registration`. Must be in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contactNotices": [],
    *       //   "domainNotices": [],
    *       //   "registration": {},
    *       //   "validateOnly": false,
    *       //   "yearlyPrice": {}
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
  def register(params: ParamsResourceProjectsLocationsRegistrationsRegister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def register(
    params: ParamsResourceProjectsLocationsRegistrationsRegister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resetAuthorizationCode(): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def resetAuthorizationCode(callback: BodyResponseCallback[SchemaAuthorizationCode]): Unit = js.native
  def resetAuthorizationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def resetAuthorizationCode(params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def resetAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode,
    callback: BodyResponseCallback[SchemaAuthorizationCode]
  ): Unit = js.native
  def resetAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode,
    options: BodyResponseCallback[Readable | SchemaAuthorizationCode],
    callback: BodyResponseCallback[Readable | SchemaAuthorizationCode]
  ): Unit = js.native
  def resetAuthorizationCode(params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode, options: MethodOptions): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def resetAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizationCode]
  ): Unit = js.native
  /**
    * Resets the authorization code of the `Registration` to a new random string. You can call this method only after 60 days have elapsed since the initial domain registration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.resetAuthorizationCode({
    *       // Required. The name of the `Registration` whose authorization code is being reset, in the format `projects/x/locations/x/registrations/x`.
    *       registration:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code"
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
  def resetAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def resetAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveAuthorizationCode(): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def retrieveAuthorizationCode(callback: BodyResponseCallback[SchemaAuthorizationCode]): Unit = js.native
  def retrieveAuthorizationCode(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def retrieveAuthorizationCode(params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    callback: BodyResponseCallback[SchemaAuthorizationCode]
  ): Unit = js.native
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    options: BodyResponseCallback[Readable | SchemaAuthorizationCode],
    callback: BodyResponseCallback[Readable | SchemaAuthorizationCode]
  ): Unit = js.native
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    options: MethodOptions
  ): GaxiosPromise[SchemaAuthorizationCode] = js.native
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthorizationCode]
  ): Unit = js.native
  /**
    * Gets the authorization code of the `Registration` for the purpose of transferring the domain to another registrar. You can call this method only after 60 days have elapsed since the initial domain registration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.retrieveAuthorizationCode({
    *       // Required. The name of the `Registration` whose authorization code is being retrieved, in the format `projects/x/locations/x/registrations/x`.
    *       registration:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "code": "my_code"
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
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveAuthorizationCode(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveImportableDomains(): GaxiosPromise[SchemaRetrieveImportableDomainsResponse] = js.native
  def retrieveImportableDomains(callback: BodyResponseCallback[SchemaRetrieveImportableDomainsResponse]): Unit = js.native
  def retrieveImportableDomains(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRetrieveImportableDomainsResponse] = js.native
  def retrieveImportableDomains(params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains): GaxiosPromise[SchemaRetrieveImportableDomainsResponse] = js.native
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    callback: BodyResponseCallback[SchemaRetrieveImportableDomainsResponse]
  ): Unit = js.native
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    options: BodyResponseCallback[Readable | SchemaRetrieveImportableDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaRetrieveImportableDomainsResponse]
  ): Unit = js.native
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    options: MethodOptions
  ): GaxiosPromise[SchemaRetrieveImportableDomainsResponse] = js.native
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRetrieveImportableDomainsResponse]
  ): Unit = js.native
  /**
    * Lists domain names from [Google Domains](https://domains.google/) that can be imported to Cloud Domains using the `ImportDomain` method. Since individual users can own domains in Google Domains, the list of domains returned depends on the individual user making the call. Domains supported by Google Domains, but not supported by Cloud Domains, are not returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.retrieveImportableDomains({
    *       // Required. The location. Must be in the format `projects/x/locations/x`.
    *       location: 'projects/my-project/locations/my-location',
    *       // Maximum number of results to return.
    *       pageSize: 'placeholder-value',
    *       // When set to the `next_page_token` from a prior response, provides the next page of results.
    *       pageToken: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "domains": [],
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
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveImportableDomains(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveRegisterParameters(): GaxiosPromise[SchemaRetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(callback: BodyResponseCallback[SchemaRetrieveRegisterParametersResponse]): Unit = js.native
  def retrieveRegisterParameters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters): GaxiosPromise[SchemaRetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    callback: BodyResponseCallback[SchemaRetrieveRegisterParametersResponse]
  ): Unit = js.native
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    options: BodyResponseCallback[Readable | SchemaRetrieveRegisterParametersResponse],
    callback: BodyResponseCallback[Readable | SchemaRetrieveRegisterParametersResponse]
  ): Unit = js.native
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    options: MethodOptions
  ): GaxiosPromise[SchemaRetrieveRegisterParametersResponse] = js.native
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRetrieveRegisterParametersResponse]
  ): Unit = js.native
  /**
    * Gets parameters needed to register a new domain name, including price and up-to-date availability. Use the returned values to call `RegisterDomain`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.retrieveRegisterParameters({
    *       // Required. The domain name. Unicode domain names must be expressed in Punycode format.
    *       domainName: 'placeholder-value',
    *       // Required. The location. Must be in the format `projects/x/locations/x`.
    *       location: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "registerParameters": {}
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
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveRegisterParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrieveregisterparameters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveTransferParameters(): GaxiosPromise[SchemaRetrieveTransferParametersResponse] = js.native
  def retrieveTransferParameters(callback: BodyResponseCallback[SchemaRetrieveTransferParametersResponse]): Unit = js.native
  def retrieveTransferParameters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRetrieveTransferParametersResponse] = js.native
  def retrieveTransferParameters(params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters): GaxiosPromise[SchemaRetrieveTransferParametersResponse] = js.native
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    callback: BodyResponseCallback[SchemaRetrieveTransferParametersResponse]
  ): Unit = js.native
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    options: BodyResponseCallback[Readable | SchemaRetrieveTransferParametersResponse],
    callback: BodyResponseCallback[Readable | SchemaRetrieveTransferParametersResponse]
  ): Unit = js.native
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    options: MethodOptions
  ): GaxiosPromise[SchemaRetrieveTransferParametersResponse] = js.native
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRetrieveTransferParametersResponse]
  ): Unit = js.native
  /**
    * Gets parameters needed to transfer a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use `ImportDomain` instead. Use the returned values to call `TransferDomain`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *     await domains.projects.locations.registrations.retrieveTransferParameters({
    *       // Required. The domain name. Unicode domain names must be expressed in Punycode format.
    *       domainName: 'placeholder-value',
    *       // Required. The location. Must be in the format `projects/x/locations/x`.
    *       location: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "transferParameters": {}
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
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveTransferParameters(
    params: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchDomains(): GaxiosPromise[SchemaSearchDomainsResponse] = js.native
  def searchDomains(callback: BodyResponseCallback[SchemaSearchDomainsResponse]): Unit = js.native
  def searchDomains(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchDomainsResponse] = js.native
  def searchDomains(params: ParamsResourceProjectsLocationsRegistrationsSearchdomains): GaxiosPromise[SchemaSearchDomainsResponse] = js.native
  def searchDomains(
    params: ParamsResourceProjectsLocationsRegistrationsSearchdomains,
    callback: BodyResponseCallback[SchemaSearchDomainsResponse]
  ): Unit = js.native
  def searchDomains(
    params: ParamsResourceProjectsLocationsRegistrationsSearchdomains,
    options: BodyResponseCallback[Readable | SchemaSearchDomainsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchDomainsResponse]
  ): Unit = js.native
  def searchDomains(params: ParamsResourceProjectsLocationsRegistrationsSearchdomains, options: MethodOptions): GaxiosPromise[SchemaSearchDomainsResponse] = js.native
  def searchDomains(
    params: ParamsResourceProjectsLocationsRegistrationsSearchdomains,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchDomainsResponse]
  ): Unit = js.native
  /**
    * Searches for available domain names similar to the provided query. Availability results from this method are approximate; call `RetrieveRegisterParameters` on a domain before registering to confirm availability.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.searchDomains({
    *     // Required. The location. Must be in the format `projects/x/locations/x`.
    *     location: 'projects/my-project/locations/my-location',
    *     // Required. String used to search for available domain names.
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "registerParameters": []
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
  def searchDomains(params: ParamsResourceProjectsLocationsRegistrationsSearchdomains, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchDomains(
    params: ParamsResourceProjectsLocationsRegistrationsSearchdomains,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.setIamPolicy({
    *     // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *     resource:
    *       'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "policy": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsRegistrationsSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.testIamPermissions(
    *     {
    *       // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/registrations/my-registration',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "permissions": []
    *         // }
    *       },
    *     }
    *   );
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
    params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsRegistrationsTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def transfer(): GaxiosPromise[SchemaOperation] = js.native
  def transfer(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def transfer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def transfer(params: ParamsResourceProjectsLocationsRegistrationsTransfer): GaxiosPromise[SchemaOperation] = js.native
  def transfer(
    params: ParamsResourceProjectsLocationsRegistrationsTransfer,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def transfer(
    params: ParamsResourceProjectsLocationsRegistrationsTransfer,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def transfer(params: ParamsResourceProjectsLocationsRegistrationsTransfer, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def transfer(
    params: ParamsResourceProjectsLocationsRegistrationsTransfer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Transfers a domain name from another registrar to Cloud Domains. For domains already managed by [Google Domains](https://domains.google/), use `ImportDomain` instead. Before calling this method, go to the domain's current registrar to unlock the domain for transfer and retrieve the domain's transfer authorization code. Then call `RetrieveTransferParameters` to confirm that the domain is unlocked and to get values needed to build a call to this method. A successful call creates a `Registration` resource in state `TRANSFER_PENDING`. It can take several days to complete the transfer process. The registrant can often speed up this process by approving the transfer through the current registrar, either by clicking a link in an email from the registrar or by visiting the registrar's website. A few minutes after transfer approval, the resource transitions to state `ACTIVE`, indicating that the transfer was successful. If the transfer is rejected or the request expires without being approved, the resource can end up in state `TRANSFER_FAILED`. If transfer fails, you can safely delete the resource and retry the transfer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/domains.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const domains = google.domains('v1beta1');
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
    *   const res = await domains.projects.locations.registrations.transfer({
    *     // Required. The parent resource of the `Registration`. Must be in the format `projects/x/locations/x`.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authorizationCode": {},
    *       //   "contactNotices": [],
    *       //   "registration": {},
    *       //   "validateOnly": false,
    *       //   "yearlyPrice": {}
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
  def transfer(params: ParamsResourceProjectsLocationsRegistrationsTransfer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def transfer(
    params: ParamsResourceProjectsLocationsRegistrationsTransfer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
