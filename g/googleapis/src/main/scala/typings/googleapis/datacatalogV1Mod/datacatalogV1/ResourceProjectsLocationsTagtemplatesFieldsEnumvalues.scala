package typings.googleapis.datacatalogV1Mod.datacatalogV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1", "datacatalog_v1.Resource$Projects$Locations$Tagtemplates$Fields$Enumvalues")
@js.native
open class ResourceProjectsLocationsTagtemplatesFieldsEnumvalues protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def rename(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1TagTemplateField] = js.native
  def rename(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1TagTemplateField]): Unit = js.native
  def rename(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1TagTemplateField] = js.native
  def rename(params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename): GaxiosPromise[SchemaGoogleCloudDatacatalogV1TagTemplateField] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1TagTemplateField]
  ): Unit = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1TagTemplateField],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1TagTemplateField]
  ): Unit = js.native
  def rename(params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1TagTemplateField] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1TagTemplateField]
  ): Unit = js.native
  /**
    * Renames an enum value in a tag template. Within a single enum field, enum values must be unique.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datacatalog.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datacatalog = google.datacatalog('v1');
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
    *     await datacatalog.projects.locations.tagTemplates.fields.enumValues.rename({
    *       // Required. The name of the enum field value.
    *       name: 'projects/my-project/locations/my-location/tagTemplates/my-tagTemplate/fields/my-field/enumValues/my-enumValue',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "newEnumValueDisplayName": "my_newEnumValueDisplayName"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "description": "my_description",
    *   //   "displayName": "my_displayName",
    *   //   "isRequired": false,
    *   //   "name": "my_name",
    *   //   "order": 0,
    *   //   "type": {}
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
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsEnumvaluesRename,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
