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

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Projects$Locations$Image")
@js.native
open class ResourceProjectsLocationsImage protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def redact(): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]): Unit = js.native
  def redact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(params: ParamsResourceProjectsLocationsImageRedact): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(
    params: ParamsResourceProjectsLocationsImageRedact,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
  def redact(
    params: ParamsResourceProjectsLocationsImageRedact,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2RedactImageResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
  def redact(params: ParamsResourceProjectsLocationsImageRedact, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2RedactImageResponse] = js.native
  def redact(
    params: ParamsResourceProjectsLocationsImageRedact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2RedactImageResponse]
  ): Unit = js.native
  /**
    * Redacts potentially sensitive info from an image. This method has limits on input size, processing time, and output size. See https://cloud.google.com/dlp/docs/redacting-sensitive-data-images to learn more. When no InfoTypes or CustomInfoTypes are specified in this request, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
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
    *   const res = await dlp.projects.locations.image.redact({
    *     // Parent resource name. The format of this value varies depending on whether you have [specified a processing location](https://cloud.google.com/dlp/docs/specifying-location): + Projects scope, location specified: `projects/`PROJECT_ID`/locations/`LOCATION_ID + Projects scope, no location specified (defaults to global): `projects/`PROJECT_ID The following example `parent` string specifies a parent project with the identifier `example-project`, and specifies the `europe-west3` location for processing data: parent=projects/example-project/locations/europe-west3
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "byteItem": {},
    *       //   "imageRedactionConfigs": [],
    *       //   "includeFindings": false,
    *       //   "inspectConfig": {},
    *       //   "locationId": "my_locationId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "extractedText": "my_extractedText",
    *   //   "inspectResult": {},
    *   //   "redactedImage": "my_redactedImage"
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
  def redact(params: ParamsResourceProjectsLocationsImageRedact, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def redact(
    params: ParamsResourceProjectsLocationsImageRedact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
