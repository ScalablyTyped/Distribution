package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/securitycenter/v1beta2", "securitycenter_v1beta2.Resource$Organizations")
@js.native
open class ResourceOrganizations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var containerThreatDetectionSettings: ResourceOrganizationsContainerthreatdetectionsettings = js.native
  
  var context: APIRequestContext = js.native
  
  var eventThreatDetectionSettings: ResourceOrganizationsEventthreatdetectionsettings = js.native
  
  def getContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def getContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Get the ContainerThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.getContainerThreatDetectionSettings({
    *       // Required. The name of the ContainerThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *       name: 'organizations/my-organization/containerThreatDetectionSettings',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def getEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceOrganizationsGeteventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsGeteventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsGeteventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceOrganizationsGeteventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsGeteventthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Get the EventThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.getEventThreatDetectionSettings({
    *       // Required. The name of the EventThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *       name: 'organizations/my-organization/eventThreatDetectionSettings',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getEventThreatDetectionSettings(params: ParamsResourceOrganizationsGeteventthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsGeteventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getOnboardingState(): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(callback: BodyResponseCallback[SchemaOnboardingState]): Unit = js.native
  def getOnboardingState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(params: ParamsResourceOrganizationsGetonboardingstate): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceOrganizationsGetonboardingstate,
    callback: BodyResponseCallback[SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(
    params: ParamsResourceOrganizationsGetonboardingstate,
    options: BodyResponseCallback[Readable | SchemaOnboardingState],
    callback: BodyResponseCallback[Readable | SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(params: ParamsResourceOrganizationsGetonboardingstate, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceOrganizationsGetonboardingstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOnboardingState]
  ): Unit = js.native
  /**
    * Retrieve the OnboardingState of a resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res = await securitycenter.organizations.getOnboardingState({
    *     // Required. The name of the OnboardingState to retrieve. Formats: * organizations/{organization\}/onboardingState * folders/{folder\}/onboardingState * projects/{project\}/onboardingState
    *     name: 'organizations/my-organization/onboardingState',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "onboardingLevel": "my_onboardingLevel"
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
  def getOnboardingState(params: ParamsResourceOrganizationsGetonboardingstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOnboardingState(
    params: ParamsResourceOrganizationsGetonboardingstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  /**
    * Get the RapidVulnerabilityDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.getRapidVulnerabilityDetectionSettings({
    *       // Required. The name of the RapidVulnerabilityDetectionSettings to retrieve. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *       name: 'organizations/my-organization/rapidVulnerabilityDetectionSettings',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsGetrapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityCenterSettings(): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(callback: BodyResponseCallback[SchemaSecurityCenterSettings]): Unit = js.native
  def getSecurityCenterSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(params: ParamsResourceOrganizationsGetsecuritycentersettings): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceOrganizationsGetsecuritycentersettings,
    callback: BodyResponseCallback[SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceOrganizationsGetsecuritycentersettings,
    options: BodyResponseCallback[Readable | SchemaSecurityCenterSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(params: ParamsResourceOrganizationsGetsecuritycentersettings, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceOrganizationsGetsecuritycentersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityCenterSettings]
  ): Unit = js.native
  /**
    * Get the SecurityCenterSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res = await securitycenter.organizations.getSecurityCenterSettings({
    *     // Required. The name of the SecurityCenterSettings to retrieve. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    *     name: 'organizations/my-organization/securityCenterSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "logSinkProject": "my_logSinkProject",
    *   //   "name": "my_name",
    *   //   "onboardingTime": "my_onboardingTime",
    *   //   "orgServiceAccount": "my_orgServiceAccount"
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
  def getSecurityCenterSettings(params: ParamsResourceOrganizationsGetsecuritycentersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceOrganizationsGetsecuritycentersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  /**
    * Get the SecurityHealthAnalyticsSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.getSecurityHealthAnalyticsSettings({
    *       // Required. The name of the SecurityHealthAnalyticsSettings to retrieve. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *       name: 'organizations/my-organization/securityHealthAnalyticsSettings',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsGetsecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSubscription(): GaxiosPromise[SchemaSubscription] = js.native
  def getSubscription(callback: BodyResponseCallback[SchemaSubscription]): Unit = js.native
  def getSubscription(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def getSubscription(params: ParamsResourceOrganizationsGetsubscription): GaxiosPromise[SchemaSubscription] = js.native
  def getSubscription(
    params: ParamsResourceOrganizationsGetsubscription,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  def getSubscription(
    params: ParamsResourceOrganizationsGetsubscription,
    options: BodyResponseCallback[Readable | SchemaSubscription],
    callback: BodyResponseCallback[Readable | SchemaSubscription]
  ): Unit = js.native
  def getSubscription(params: ParamsResourceOrganizationsGetsubscription, options: MethodOptions): GaxiosPromise[SchemaSubscription] = js.native
  def getSubscription(
    params: ParamsResourceOrganizationsGetsubscription,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubscription]
  ): Unit = js.native
  /**
    * Get the Subscription resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res = await securitycenter.organizations.getSubscription({
    *     // Required. The name of the subscription to retrieve. Format: organizations/{organization\}/subscription
    *     name: 'organizations/my-organization/subscription',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "details": {},
    *   //   "name": "my_name",
    *   //   "tier": "my_tier"
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
  def getSubscription(params: ParamsResourceOrganizationsGetsubscription, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSubscription(
    params: ParamsResourceOrganizationsGetsubscription,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Get the VirtualMachineThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.getVirtualMachineThreatDetectionSettings(
    *       {
    *         // Required. The name of the VirtualMachineThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *         name: 'organizations/my-organization/virtualMachineThreatDetectionSettings',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def getWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceOrganizationsGetwebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsGetwebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsGetwebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceOrganizationsGetwebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsGetwebsecurityscannersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  /**
    * Get the WebSecurityScannerSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *   const res = await securitycenter.organizations.getWebSecurityScannerSettings({
    *     // Required. The name of the WebSecurityScannerSettings to retrieve. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *     name: 'organizations/my-organization/webSecurityScannerSettings',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def getWebSecurityScannerSettings(params: ParamsResourceOrganizationsGetwebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsGetwebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var rapidVulnerabilityDetectionSettings: ResourceOrganizationsRapidvulnerabilitydetectionsettings = js.native
  
  var securityHealthAnalyticsSettings: ResourceOrganizationsSecurityhealthanalyticssettings = js.native
  
  def updateContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def updateContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Update the ContainerThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateContainerThreatDetectionSettings({
    *       // The resource name of the ContainerThreatDetectionSettings. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *       name: 'organizations/my-organization/containerThreatDetectionSettings',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "modules": {},
    *         //   "name": "my_name",
    *         //   "serviceAccount": "my_serviceAccount",
    *         //   "serviceEnablementState": "my_serviceEnablementState",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def updateEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Update the EventThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateEventThreatDetectionSettings({
    *       // The resource name of the EventThreatDetectionSettings. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *       name: 'organizations/my-organization/eventThreatDetectionSettings',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "modules": {},
    *         //   "name": "my_name",
    *         //   "serviceEnablementState": "my_serviceEnablementState",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdateeventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  /**
    * Update the RapidVulnerabilityDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateRapidVulnerabilityDetectionSettings(
    *       {
    *         // The resource name of the RapidVulnerabilityDetectionSettings. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *         name: 'organizations/my-organization/rapidVulnerabilityDetectionSettings',
    *         // The list of fields to be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "modules": {},
    *           //   "name": "my_name",
    *           //   "serviceEnablementState": "my_serviceEnablementState",
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceOrganizationsUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  /**
    * Update the SecurityHealthAnalyticsSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateSecurityHealthAnalyticsSettings({
    *       // The resource name of the SecurityHealthAnalyticsSettings. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *       name: 'organizations/my-organization/securityHealthAnalyticsSettings',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "modules": {},
    *         //   "name": "my_name",
    *         //   "serviceAccount": "my_serviceAccount",
    *         //   "serviceEnablementState": "my_serviceEnablementState",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceOrganizationsUpdatesecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    options: MethodOptions
  ): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Update the VirtualMachineThreatDetectionSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateVirtualMachineThreatDetectionSettings(
    *       {
    *         // The resource name of the VirtualMachineThreatDetectionSettings. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *         name: 'organizations/my-organization/virtualMachineThreatDetectionSettings',
    *         // The list of fields to be updated.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "modules": {},
    *           //   "name": "my_name",
    *           //   "serviceAccount": "my_serviceAccount",
    *           //   "serviceEnablementState": "my_serviceEnablementState",
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceOrganizationsUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def updateWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  /**
    * Update the WebSecurityScannerSettings resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/securitycenter.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const securitycenter = google.securitycenter('v1beta2');
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
    *     await securitycenter.organizations.updateWebSecurityScannerSettings({
    *       // The resource name of the WebSecurityScannerSettings. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *       name: 'organizations/my-organization/webSecurityScannerSettings',
    *       // The list of fields to be updated.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "modules": {},
    *         //   "name": "my_name",
    *         //   "serviceEnablementState": "my_serviceEnablementState",
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "modules": {},
    *   //   "name": "my_name",
    *   //   "serviceEnablementState": "my_serviceEnablementState",
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
  def updateWebSecurityScannerSettings(params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceOrganizationsUpdatewebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var virtualMachineThreatDetectionSettings: ResourceOrganizationsVirtualmachinethreatdetectionsettings = js.native
  
  var webSecurityScannerSettings: ResourceOrganizationsWebsecurityscannersettings = js.native
}
