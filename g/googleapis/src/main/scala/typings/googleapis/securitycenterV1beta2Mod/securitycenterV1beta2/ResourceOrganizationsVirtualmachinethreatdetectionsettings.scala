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

@JSImport("googleapis/build/src/apis/securitycenter/v1beta2", "securitycenter_v1beta2.Resource$Organizations$Virtualmachinethreatdetectionsettings")
@js.native
open class ResourceOrganizationsVirtualmachinethreatdetectionsettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def calculate(): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def calculate(callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]): Unit = js.native
  def calculate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def calculate(params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    options: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings],
    callback: BodyResponseCallback[Readable | SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    options: MethodOptions
  ): GaxiosPromise[SchemaVirtualMachineThreatDetectionSettings] = js.native
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVirtualMachineThreatDetectionSettings]
  ): Unit = js.native
  /**
    * Calculates the effective VirtualMachineThreatDetectionSettings based on its level in the resource hierarchy and its settings.
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
    *     await securitycenter.organizations.virtualMachineThreatDetectionSettings.calculate(
    *       {
    *         // Required. The name of the VirtualMachineThreatDetectionSettings to calculate. Formats: * organizations/{organization\}/virtualMachineThreatDetectionSettings * folders/{folder\}/virtualMachineThreatDetectionSettings * projects/{project\}/virtualMachineThreatDetectionSettings
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
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def calculate(
    params: ParamsResourceOrganizationsVirtualmachinethreatdetectionsettingsCalculate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
