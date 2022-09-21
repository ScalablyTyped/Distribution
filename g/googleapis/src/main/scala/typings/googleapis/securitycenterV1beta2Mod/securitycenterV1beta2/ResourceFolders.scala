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

@JSImport("googleapis/build/src/apis/securitycenter/v1beta2", "securitycenter_v1beta2.Resource$Folders")
@js.native
open class ResourceFolders protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var containerThreatDetectionSettings: ResourceFoldersContainerthreatdetectionsettings = js.native
  
  var context: APIRequestContext = js.native
  
  var eventThreatDetectionSettings: ResourceFoldersEventthreatdetectionsettings = js.native
  
  def getContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def getContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceFoldersGetcontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceFoldersGetcontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceFoldersGetcontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def getContainerThreatDetectionSettings(params: ParamsResourceFoldersGetcontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceFoldersGetcontainerthreatdetectionsettings,
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
    *   const res = await securitycenter.folders.getContainerThreatDetectionSettings({
    *     // Required. The name of the ContainerThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *     name: 'folders/my-folder/containerThreatDetectionSettings',
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
  def getContainerThreatDetectionSettings(params: ParamsResourceFoldersGetcontainerthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getContainerThreatDetectionSettings(
    params: ParamsResourceFoldersGetcontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def getEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceFoldersGeteventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceFoldersGeteventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceFoldersGeteventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def getEventThreatDetectionSettings(params: ParamsResourceFoldersGeteventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceFoldersGeteventthreatdetectionsettings,
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
    *   const res = await securitycenter.folders.getEventThreatDetectionSettings({
    *     // Required. The name of the EventThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *     name: 'folders/my-folder/eventThreatDetectionSettings',
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
  def getEventThreatDetectionSettings(params: ParamsResourceFoldersGeteventthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getEventThreatDetectionSettings(
    params: ParamsResourceFoldersGeteventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getOnboardingState(): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(callback: BodyResponseCallback[SchemaOnboardingState]): Unit = js.native
  def getOnboardingState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(params: ParamsResourceFoldersGetonboardingstate): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceFoldersGetonboardingstate,
    callback: BodyResponseCallback[SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(
    params: ParamsResourceFoldersGetonboardingstate,
    options: BodyResponseCallback[Readable | SchemaOnboardingState],
    callback: BodyResponseCallback[Readable | SchemaOnboardingState]
  ): Unit = js.native
  def getOnboardingState(params: ParamsResourceFoldersGetonboardingstate, options: MethodOptions): GaxiosPromise[SchemaOnboardingState] = js.native
  def getOnboardingState(
    params: ParamsResourceFoldersGetonboardingstate,
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
    *   const res = await securitycenter.folders.getOnboardingState({
    *     // Required. The name of the OnboardingState to retrieve. Formats: * organizations/{organization\}/onboardingState * folders/{folder\}/onboardingState * projects/{project\}/onboardingState
    *     name: 'folders/my-folder/onboardingState',
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
  def getOnboardingState(params: ParamsResourceFoldersGetonboardingstate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getOnboardingState(
    params: ParamsResourceFoldersGetonboardingstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings,
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
    *     await securitycenter.folders.getRapidVulnerabilityDetectionSettings({
    *       // Required. The name of the RapidVulnerabilityDetectionSettings to retrieve. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *       name: 'folders/my-folder/rapidVulnerabilityDetectionSettings',
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
  def getRapidVulnerabilityDetectionSettings(params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersGetrapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityCenterSettings(): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(callback: BodyResponseCallback[SchemaSecurityCenterSettings]): Unit = js.native
  def getSecurityCenterSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(params: ParamsResourceFoldersGetsecuritycentersettings): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceFoldersGetsecuritycentersettings,
    callback: BodyResponseCallback[SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceFoldersGetsecuritycentersettings,
    options: BodyResponseCallback[Readable | SchemaSecurityCenterSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityCenterSettings]
  ): Unit = js.native
  def getSecurityCenterSettings(params: ParamsResourceFoldersGetsecuritycentersettings, options: MethodOptions): GaxiosPromise[SchemaSecurityCenterSettings] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceFoldersGetsecuritycentersettings,
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
    *   const res = await securitycenter.folders.getSecurityCenterSettings({
    *     // Required. The name of the SecurityCenterSettings to retrieve. Format: organizations/{organization\}/securityCenterSettings Format: folders/{folder\}/securityCenterSettings Format: projects/{project\}/securityCenterSettings
    *     name: 'folders/my-folder/securityCenterSettings',
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
  def getSecurityCenterSettings(params: ParamsResourceFoldersGetsecuritycentersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSecurityCenterSettings(
    params: ParamsResourceFoldersGetsecuritycentersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersGetsecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersGetsecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersGetsecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersGetsecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersGetsecurityhealthanalyticssettings,
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
    *   const res = await securitycenter.folders.getSecurityHealthAnalyticsSettings({
    *     // Required. The name of the SecurityHealthAnalyticsSettings to retrieve. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *     name: 'folders/my-folder/securityHealthAnalyticsSettings',
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
  def getSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersGetsecurityhealthanalyticssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersGetsecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def getVirtualMachineThreatDetectionSettings(params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings,
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
    *     await securitycenter.folders.getVirtualMachineThreatDetectionSettings({
    *       // Required. The name of the VirtualMachineThreatDetectionSettings to retrieve. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *       name: 'folders/my-folder/virtualMachineThreatDetectionSettings',
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
    params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersGetvirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def getWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceFoldersGetwebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceFoldersGetwebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceFoldersGetwebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def getWebSecurityScannerSettings(params: ParamsResourceFoldersGetwebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceFoldersGetwebsecurityscannersettings,
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
    *   const res = await securitycenter.folders.getWebSecurityScannerSettings({
    *     // Required. The name of the WebSecurityScannerSettings to retrieve. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *     name: 'folders/my-folder/webSecurityScannerSettings',
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
  def getWebSecurityScannerSettings(params: ParamsResourceFoldersGetwebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getWebSecurityScannerSettings(
    params: ParamsResourceFoldersGetwebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var rapidVulnerabilityDetectionSettings: ResourceFoldersRapidvulnerabilitydetectionsettings = js.native
  
  var securityHealthAnalyticsSettings: ResourceFoldersSecurityhealthanalyticssettings = js.native
  
  def updateContainerThreatDetectionSettings(): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]): Unit = js.native
  def updateContainerThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaContainerThreatDetectionSettings]
  ): Unit = js.native
  def updateContainerThreatDetectionSettings(params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaContainerThreatDetectionSettings] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings,
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
    *     await securitycenter.folders.updateContainerThreatDetectionSettings({
    *       // The resource name of the ContainerThreatDetectionSettings. Formats: * organizations/{organization\}/containerThreatDetectionSettings * folders/{folder\}/containerThreatDetectionSettings * projects/{project\}/containerThreatDetectionSettings * projects/{project\}/locations/{location\}/clusters/{cluster\}/containerThreatDetectionSettings
    *       name: 'folders/my-folder/containerThreatDetectionSettings',
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
  def updateContainerThreatDetectionSettings(params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateContainerThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatecontainerthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateEventThreatDetectionSettings(): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]): Unit = js.native
  def updateEventThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceFoldersUpdateeventthreatdetectionsettings): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceFoldersUpdateeventthreatdetectionsettings,
    callback: BodyResponseCallback[SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceFoldersUpdateeventthreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaEventThreatDetectionSettings]
  ): Unit = js.native
  def updateEventThreatDetectionSettings(params: ParamsResourceFoldersUpdateeventthreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaEventThreatDetectionSettings] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceFoldersUpdateeventthreatdetectionsettings,
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
    *   const res = await securitycenter.folders.updateEventThreatDetectionSettings({
    *     // The resource name of the EventThreatDetectionSettings. Formats: * organizations/{organization\}/eventThreatDetectionSettings * folders/{folder\}/eventThreatDetectionSettings * projects/{project\}/eventThreatDetectionSettings
    *     name: 'folders/my-folder/eventThreatDetectionSettings',
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
  def updateEventThreatDetectionSettings(params: ParamsResourceFoldersUpdateeventthreatdetectionsettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateEventThreatDetectionSettings(
    params: ParamsResourceFoldersUpdateeventthreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateRapidVulnerabilityDetectionSettings(): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings,
    callback: BodyResponseCallback[SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings,
    options: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaRapidVulnerabilityDetectionSettings]
  ): Unit = js.native
  def updateRapidVulnerabilityDetectionSettings(params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings, options: MethodOptions): GaxiosPromise[SchemaRapidVulnerabilityDetectionSettings] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings,
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
    *     await securitycenter.folders.updateRapidVulnerabilityDetectionSettings({
    *       // The resource name of the RapidVulnerabilityDetectionSettings. Formats: * organizations/{organization\}/rapidVulnerabilityDetectionSettings * folders/{folder\}/rapidVulnerabilityDetectionSettings * projects/{project\}/rapidVulnerabilityDetectionSettings
    *       name: 'folders/my-folder/rapidVulnerabilityDetectionSettings',
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
    params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateRapidVulnerabilityDetectionSettings(
    params: ParamsResourceFoldersUpdaterapidvulnerabilitydetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateSecurityHealthAnalyticsSettings(): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings,
    callback: BodyResponseCallback[SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings,
    options: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings],
    callback: BodyResponseCallback[Readable | SchemaSecurityHealthAnalyticsSettings]
  ): Unit = js.native
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings, options: MethodOptions): GaxiosPromise[SchemaSecurityHealthAnalyticsSettings] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings,
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
    *     await securitycenter.folders.updateSecurityHealthAnalyticsSettings({
    *       // The resource name of the SecurityHealthAnalyticsSettings. Formats: * organizations/{organization\}/securityHealthAnalyticsSettings * folders/{folder\}/securityHealthAnalyticsSettings * projects/{project\}/securityHealthAnalyticsSettings
    *       name: 'folders/my-folder/securityHealthAnalyticsSettings',
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
  def updateSecurityHealthAnalyticsSettings(params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSecurityHealthAnalyticsSettings(
    params: ParamsResourceFoldersUpdatesecurityhealthanalyticssettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateVirtualMachineThreatDetectionSettings(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def updateVirtualMachineThreatDetectionSettings(params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings,
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
    *     await securitycenter.folders.updateVirtualMachineThreatDetectionSettings({
    *       // The resource name of the VirtualMachineThreatDetectionSettings. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
    *       name: 'folders/my-folder/virtualMachineThreatDetectionSettings',
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
    params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def updateVirtualMachineThreatDetectionSettings(
    params: ParamsResourceFoldersUpdatevirtualmachinethreatdetectionsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateWebSecurityScannerSettings(): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]): Unit = js.native
  def updateWebSecurityScannerSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceFoldersUpdatewebsecurityscannersettings): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceFoldersUpdatewebsecurityscannersettings,
    callback: BodyResponseCallback[SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceFoldersUpdatewebsecurityscannersettings,
    options: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings],
    callback: BodyResponseCallback[Readable | SchemaWebSecurityScannerSettings]
  ): Unit = js.native
  def updateWebSecurityScannerSettings(params: ParamsResourceFoldersUpdatewebsecurityscannersettings, options: MethodOptions): GaxiosPromise[SchemaWebSecurityScannerSettings] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceFoldersUpdatewebsecurityscannersettings,
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
    *   const res = await securitycenter.folders.updateWebSecurityScannerSettings({
    *     // The resource name of the WebSecurityScannerSettings. Formats: * organizations/{organization\}/webSecurityScannerSettings * folders/{folder\}/webSecurityScannerSettings * projects/{project\}/webSecurityScannerSettings
    *     name: 'folders/my-folder/webSecurityScannerSettings',
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
  def updateWebSecurityScannerSettings(params: ParamsResourceFoldersUpdatewebsecurityscannersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateWebSecurityScannerSettings(
    params: ParamsResourceFoldersUpdatewebsecurityscannersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var virtualMachineThreatDetectionSettings: ResourceFoldersVirtualmachinethreatdetectionsettings = js.native
  
  var webSecurityScannerSettings: ResourceFoldersWebsecurityscannersettings = js.native
}
