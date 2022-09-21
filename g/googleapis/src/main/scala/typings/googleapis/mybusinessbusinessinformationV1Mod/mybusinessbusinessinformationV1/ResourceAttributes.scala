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

@JSImport("googleapis/build/src/apis/mybusinessbusinessinformation/v1", "mybusinessbusinessinformation_v1.Resource$Attributes")
@js.native
open class ResourceAttributes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAttributeMetadataResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAttributeMetadataResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAttributeMetadataResponse] = js.native
  def list(params: ParamsResourceAttributesList): GaxiosPromise[SchemaListAttributeMetadataResponse] = js.native
  def list(
    params: ParamsResourceAttributesList,
    callback: BodyResponseCallback[SchemaListAttributeMetadataResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAttributesList,
    options: BodyResponseCallback[Readable | SchemaListAttributeMetadataResponse],
    callback: BodyResponseCallback[Readable | SchemaListAttributeMetadataResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAttributesList, options: MethodOptions): GaxiosPromise[SchemaListAttributeMetadataResponse] = js.native
  def list(
    params: ParamsResourceAttributesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAttributeMetadataResponse]
  ): Unit = js.native
  /**
    * Returns the list of attributes that would be available for a location with the given primary category and country.
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
    *   const res = await mybusinessbusinessinformation.attributes.list({
    *     // The primary category stable ID to find available attributes. Must be of the format categories/{category_id\}.
    *     categoryName: 'placeholder-value',
    *     // The BCP 47 code of language to get attribute display names in. If this language is not available, they will be provided in English.
    *     languageCode: 'placeholder-value',
    *     // How many attributes to include per page. Default is 200, minimum is 1.
    *     pageSize: 'placeholder-value',
    *     // If specified, the next page of attribute metadata is retrieved.
    *     pageToken: 'placeholder-value',
    *     // Resource name of the location to look up available attributes. If this field is set, category_name, region_code, language_code and show_all are not required and must not be set.
    *     parent: 'placeholder-value',
    *     // The ISO 3166-1 alpha-2 country code to find available attributes.
    *     regionCode: 'placeholder-value',
    *     // Metadata for all available attributes are returned when this field is set to true, disregarding parent and category_name fields. language_code and region_code are required when show_all is set to true.
    *     showAll: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeMetadata": [],
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
  def list(params: ParamsResourceAttributesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAttributesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
