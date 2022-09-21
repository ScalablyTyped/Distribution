package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Locations$Attributes")
@js.native
open class ResourceLocationsAttributes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getGoogleUpdated(): GaxiosPromise[SchemaAttributes] = js.native
  def getGoogleUpdated(callback: BodyResponseCallback[SchemaAttributes]): Unit = js.native
  def getGoogleUpdated(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsAttributesGetgoogleupdated): GaxiosPromise[SchemaAttributes] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsAttributesGetgoogleupdated,
    callback: BodyResponseCallback[SchemaAttributes]
  ): Unit = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsAttributesGetgoogleupdated,
    options: BodyResponseCallback[Readable | SchemaAttributes],
    callback: BodyResponseCallback[Readable | SchemaAttributes]
  ): Unit = js.native
  def getGoogleUpdated(params: ParamsResourceLocationsAttributesGetgoogleupdated, options: MethodOptions): GaxiosPromise[SchemaAttributes] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsAttributesGetgoogleupdated,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributes]
  ): Unit = js.native
  /**
    * Gets the Google-updated version of the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/mybusinessbusinessinformation.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const mybusinessbusinessinformation =
    *   google.mybusinessbusinessinformation('v1');
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
    *   const res =
    *     await mybusinessbusinessinformation.locations.attributes.getGoogleUpdated({
    *       // Required. Google identifier for this location in the form of `locations/{location_id\}/attributes`.
    *       name: 'locations/my-location/attributes',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributes": [],
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
  def getGoogleUpdated(params: ParamsResourceLocationsAttributesGetgoogleupdated, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getGoogleUpdated(
    params: ParamsResourceLocationsAttributesGetgoogleupdated,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
