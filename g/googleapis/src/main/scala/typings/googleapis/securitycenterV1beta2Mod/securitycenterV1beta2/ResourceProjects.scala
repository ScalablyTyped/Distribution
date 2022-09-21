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

@JSImport("googleapis/build/src/apis/securitycenter/v1beta2", "securitycenter_v1beta2.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var containerThreatDetectionSettings: ResourceProjectsContainerthreatdetectionsettings = js.native
  
  var context: APIRequestContext = js.native
  
  var eventThreatDetectionSettings: ResourceProjectsEventthreatdetectionsettings = js.native
  
  def getContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def getContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceProjectsGetcontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsGetcontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsGetcontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceProjectsGetcontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsGetcontainerthreatdetectionsettings,
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
    *   const res = await securitycenter.projects.getContainerThreatDetectionSettings(
    *     {
    *       // Required. The name of the ContainerThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *       name: 'projects/my-project/containerThreatDetectionSettings',
    *     }
    *   );
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
  def getContainerThreatDetectionSettings(params: ParamsResourceProjectsGetcontainerthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceProjectsGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def getEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceProjectsGeteventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceProjectsGeteventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceProjectsGeteventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceProjectsGeteventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceProjectsGeteventthreatdetectionsettings,
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
    *   const res = await securitycenter.projects.getEventThreatDetectionSettings({
    *     // Required. The name of the EventThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *     name: 'projects/my-project/eventThreatDetectionSettings',
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
  def getEventThreatDetectionSettings(params: ParamsResourceProjectsGeteventthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceProjectsGeteventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getOnboardingState(): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(callback: BodyResponseCallback[SchemaOnboardingState]): Unit = js.native
  def getOnboardingState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(params: ParamsResourceProjectsGetonboardingstate): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceProjectsGetonboardingstate,
    callback: BodyResponseCallback[SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(
    params: ParamsResourceProjectsGetonboardingstate,
    options: BodyResponseCallback[Readable | SchemaOnboardingState],
    callback: BodyResponseCallback[Readable | SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(params: ParamsResourceProjectsGetonboardingstate, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceProjectsGetonboardingstate,
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
    *   const res = await securitycenter.projects.getOnboardingState({
    *     // Required. The name of the OnboardingState to retrieve. Formats: * organizations/{organization\}/onboardingState * folders/{folder\}/onboardingState * projects/{project\}/onboardingState
    *     name: 'projects/my-project/onboardingState',
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
  def getOnboardingState(params: ParamsResourceProjectsGetonboardingstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOnboardingState(
    params: ParamsResourceProjectsGetonboardingstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings,
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
    *     await securitycenter.projects.getRapidVulnerabilityDetectionSettings({
    *       // Required. The name of the RapidVulnerabilityDetectionSettings to retrieve. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *       name: 'projects/my-project/rapidVulnerabilityDetectionSettings',
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
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsGetrapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityCenterSettings(): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(callback: BodyResponseCallback[SchemaSecurityCenterSettings]): Unit = js.native
  def getSecurityCenterSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(params: ParamsResourceProjectsGetsecuritycentersettings): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceProjectsGetsecuritycentersettings,
    callback: BodyResponseCallback[SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceProjectsGetsecuritycentersettings,
    options: BodyResponseCallback[Readable | SchemaSecurityCenterSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(params: ParamsResourceProjectsGetsecuritycentersettings, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceProjectsGetsecuritycentersettings,
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
    *   const res = await securitycenter.projects.getSecurityCenterSettings({
    *     // Required. The name of the SecurityCenterSettings to retrieve. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    *     name: 'projects/my-project/securityCenterSettings',
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
  def getSecurityCenterSettings(params: ParamsResourceProjectsGetsecuritycentersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceProjectsGetsecuritycentersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsGetsecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsGetsecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsGetsecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsGetsecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsGetsecurityhealthanalyticssettings,
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
    *   const res = await securitycenter.projects.getSecurityHealthAnalyticsSettings({
    *     // Required. The name of the SecurityHealthAnalyticsSettings to retrieve. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *     name: 'projects/my-project/securityHealthAnalyticsSettings',
    *   });
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
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsGetsecurityhealthanalyticssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsGetsecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings,
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
    *     await securitycenter.projects.getVirtualMachineThreatDetectionSettings({
    *       // Required. The name of the VirtualMachineThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *       name: 'projects/my-project/virtualMachineThreatDetectionSettings',
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
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def getWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceProjectsGetwebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceProjectsGetwebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceProjectsGetwebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceProjectsGetwebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceProjectsGetwebsecurityscannersettings,
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
    *   const res = await securitycenter.projects.getWebSecurityScannerSettings({
    *     // Required. The name of the WebSecurityScannerSettings to retrieve. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *     name: 'projects/my-project/webSecurityScannerSettings',
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
  def getWebSecurityScannerSettings(params: ParamsResourceProjectsGetwebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceProjectsGetwebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var rapidVulnerabilityDetectionSettings: ResourceProjectsRapidvulnerabilitydetectionsettings = js.native
  
  var securityHealthAnalyticsSettings: ResourceProjectsSecurityhealthanalyticssettings = js.native
  
  def updateContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def updateContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings,
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
    *     await securitycenter.projects.updateContainerThreatDetectionSettings({
    *       // The resource name of the ContainerThreatDetectionSettings. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *       name: 'projects/my-project/containerThreatDetectionSettings',
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
  def updateContainerThreatDetectionSettings(params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def updateEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceProjectsUpdateeventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceProjectsUpdateeventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceProjectsUpdateeventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceProjectsUpdateeventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceProjectsUpdateeventthreatdetectionsettings,
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
    *   const res = await securitycenter.projects.updateEventThreatDetectionSettings({
    *     // The resource name of the EventThreatDetectionSettings. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *     name: 'projects/my-project/eventThreatDetectionSettings',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "modules": {},
    *       //   "name": "my_name",
    *       //   "serviceEnablementState": "my_serviceEnablementState",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
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
  def updateEventThreatDetectionSettings(params: ParamsResourceProjectsUpdateeventthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceProjectsUpdateeventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings,
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
    *     await securitycenter.projects.updateRapidVulnerabilityDetectionSettings({
    *       // The resource name of the RapidVulnerabilityDetectionSettings. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *       name: 'projects/my-project/rapidVulnerabilityDetectionSettings',
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
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceProjectsUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings,
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
    *     await securitycenter.projects.updateSecurityHealthAnalyticsSettings({
    *       // The resource name of the SecurityHealthAnalyticsSettings. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *       name: 'projects/my-project/securityHealthAnalyticsSettings',
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
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceProjectsUpdatesecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings,
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
    *     await securitycenter.projects.updateVirtualMachineThreatDetectionSettings({
    *       // The resource name of the VirtualMachineThreatDetectionSettings. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *       name: 'projects/my-project/virtualMachineThreatDetectionSettings',
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
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceProjectsUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def updateWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceProjectsUpdatewebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceProjectsUpdatewebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceProjectsUpdatewebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceProjectsUpdatewebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceProjectsUpdatewebsecurityscannersettings,
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
    *   const res = await securitycenter.projects.updateWebSecurityScannerSettings({
    *     // The resource name of the WebSecurityScannerSettings. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *     name: 'projects/my-project/webSecurityScannerSettings',
    *     // The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "modules": {},
    *       //   "name": "my_name",
    *       //   "serviceEnablementState": "my_serviceEnablementState",
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
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
  def updateWebSecurityScannerSettings(params: ParamsResourceProjectsUpdatewebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceProjectsUpdatewebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var virtualMachineThreatDetectionSettings: ResourceProjectsVirtualmachinethreatdetectionsettings = js.native
  
  var webSecurityScannerSettings: ResourceProjectsWebsecurityscannersettings = js.native
}
