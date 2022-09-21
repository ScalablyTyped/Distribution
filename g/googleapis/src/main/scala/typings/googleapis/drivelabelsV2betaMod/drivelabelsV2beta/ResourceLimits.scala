package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drivelabels/v2beta", "drivelabels_v2beta.Resource$Limits")
@js.native
open class ResourceLimits protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getLabel(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelLimits] = js.native
  def getLabel(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelLimits]): Unit = js.native
  def getLabel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelLimits] = js.native
  def getLabel(params: ParamsResourceLimitsGetlabel): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelLimits] = js.native
  def getLabel(
    params: ParamsResourceLimitsGetlabel,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelLimits]
  ): Unit = js.native
  def getLabel(
    params: ParamsResourceLimitsGetlabel,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelLimits],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaLabelLimits]
  ): Unit = js.native
  def getLabel(params: ParamsResourceLimitsGetlabel, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaLabelLimits] = js.native
  def getLabel(
    params: ParamsResourceLimitsGetlabel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaLabelLimits]
  ): Unit = js.native
  /**
    * Get the constraints on the structure of a Label; such as, the maximum number of Fields allowed and maximum length of the label title.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drivelabels.limits.getLabel({
    *     // Required. Label revision resource name Must be: "limits/label"
    *     name: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "fieldLimits": {},
    *   //   "maxDeletedFields": 0,
    *   //   "maxDescriptionLength": 0,
    *   //   "maxDraftRevisions": 0,
    *   //   "maxFields": 0,
    *   //   "maxTitleLength": 0,
    *   //   "name": "my_name"
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
  def getLabel(params: ParamsResourceLimitsGetlabel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getLabel(
    params: ParamsResourceLimitsGetlabel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
