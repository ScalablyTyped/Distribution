package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Locations$Content")
@js.native
open class ResourceProjectsLocationsContent protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def deidentify(): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]): Unit = js.native
  def deidentify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(params: ParamsResourceProjectsLocationsContentDeidentify): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsContentDeidentify,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsContentDeidentify,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyContentResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  def deidentify(params: ParamsResourceProjectsLocationsContentDeidentify, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2DeidentifyContentResponse] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsContentDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2DeidentifyContentResponse]
  ): Unit = js.native
  /**
    * De-identifies potentially sensitive info from a ContentItem. This method has limits on input size and output size. See https://cloud.google.com/dlp/docs/deidentify-sensitive-data to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.content.deidentify({
    *     // Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "deidentifyConfig": {},
    *       //   "deidentifyTemplateName": "my_deidentifyTemplateName",
    *       //   "inspectConfig": {},
    *       //   "inspectTemplateName": "my_inspectTemplateName",
    *       //   "item": {},
    *       //   "locationId": "my_locationId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "item": {},
    *   //   "overview": {}
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
  def deidentify(params: ParamsResourceProjectsLocationsContentDeidentify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsContentDeidentify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def inspect(): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]): Unit = js.native
  def inspect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(params: ParamsResourceProjectsLocationsContentInspect): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsResourceProjectsLocationsContentInspect,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(
    params: ParamsResourceProjectsLocationsContentInspect,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectContentResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  def inspect(params: ParamsResourceProjectsLocationsContentInspect, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2InspectContentResponse] = js.native
  def inspect(
    params: ParamsResourceProjectsLocationsContentInspect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2InspectContentResponse]
  ): Unit = js.native
  /**
    * Finds potentially sensitive info in content. This method has limits on input size, processing time, and output size. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. For how to guides, see https://cloud.google.com/dlp/docs/inspecting-images and https://cloud.google.com/dlp/docs/inspecting-text,
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.content.inspect({
    *     // Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectConfig": {},
    *       //   "inspectTemplateName": "my_inspectTemplateName",
    *       //   "item": {},
    *       //   "locationId": "my_locationId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "result": {}
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
  def inspect(params: ParamsResourceProjectsLocationsContentInspect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def inspect(
    params: ParamsResourceProjectsLocationsContentInspect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reidentify(): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]): Unit = js.native
  def reidentify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(params: ParamsResourceProjectsLocationsContentReidentify): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsResourceProjectsLocationsContentReidentify,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(
    params: ParamsResourceProjectsLocationsContentReidentify,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ReidentifyContentResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  def reidentify(params: ParamsResourceProjectsLocationsContentReidentify, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ReidentifyContentResponse] = js.native
  def reidentify(
    params: ParamsResourceProjectsLocationsContentReidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ReidentifyContentResponse]
  ): Unit = js.native
  /**
    * Re-identifies content that has been de-identified. See https://cloud.google.com/dlp/docs/pseudonymization#re-identification_in_free_text_code_example to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
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
    *   const res = await dlp.projects.locations.content.reidentify({
    *     // Required. Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectConfig": {},
    *       //   "inspectTemplateName": "my_inspectTemplateName",
    *       //   "item": {},
    *       //   "locationId": "my_locationId",
    *       //   "reidentifyConfig": {},
    *       //   "reidentifyTemplateName": "my_reidentifyTemplateName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "item": {},
    *   //   "overview": {}
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
  def reidentify(params: ParamsResourceProjectsLocationsContentReidentify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reidentify(
    params: ParamsResourceProjectsLocationsContentReidentify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
