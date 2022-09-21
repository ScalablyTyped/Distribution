package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datacatalog/v1beta1", "datacatalog_v1beta1.Resource$Projects$Locations$Tagtemplates$Fields")
@js.native
open class ResourceProjectsLocationsTagtemplatesFields protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def create(params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  /**
    * Creates a field in a tag template. The user should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource Project](https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
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
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.tagTemplates.fields.create({
    *     // Required. The name of the project and the template location [region](https://cloud.google.com/data-catalog/docs/concepts/regions). Example: * projects/{project_id\}/locations/us-central1/tagTemplates/{tag_template_id\}
    *     parent:
    *       'projects/my-project/locations/my-location/tagTemplates/my-tagTemplate',
    *     // Required. The ID of the tag template field to create. Field ids can contain letters (both uppercase and lowercase), numbers (0-9), underscores (_) and dashes (-). Field IDs must be at least 1 character long and at most 128 characters long. Field IDs must also be unique within their template.
    *     tagTemplateFieldId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "isRequired": false,
    *       //   "name": "my_name",
    *       //   "order": 0,
    *       //   "type": {}
    *       // }
    *     },
    *   });
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
  def create(params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a field in a tag template and all uses of that field. Users should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
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
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.tagTemplates.fields.delete({
    *     // Required. Currently, this field must always be set to `true`. This confirms the deletion of this field from any tags using this field. `force = false` will be supported in the future.
    *     force: 'placeholder-value',
    *     // Required. The name of the tag template field to delete. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}/fields/{tag_template_field_id\}
    *     name: 'projects/my-project/locations/my-location/tagTemplates/my-tagTemplate/fields/my-field',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var enumValues: ResourceProjectsLocationsTagtemplatesFieldsEnumvalues = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def patch(params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  /**
    * Updates a field in a tag template. This method cannot be used to update the field type. Users should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
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
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.tagTemplates.fields.patch({
    *     // Required. The name of the tag template field. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}/fields/{tag_template_field_id\}
    *     name: 'projects/my-project/locations/my-location/tagTemplates/my-tagTemplate/fields/my-field',
    *     // Optional. Names of fields whose values to overwrite on an individual field of a tag template. The following fields are modifiable: * `display_name` * `type.enum_type` * `is_required` If this parameter is absent or empty, all modifiable fields are overwritten. If such fields are non-required and omitted in the request body, their values are emptied with one exception: when updating an enum type, the provided values are merged with the existing values. Therefore, enum values can only be added, existing enum values cannot be deleted or renamed. Additionally, updating a template field from optional to required is *not* allowed.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "description": "my_description",
    *       //   "displayName": "my_displayName",
    *       //   "isRequired": false,
    *       //   "name": "my_name",
    *       //   "order": 0,
    *       //   "type": {}
    *       // }
    *     },
    *   });
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
  def patch(params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rename(): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def rename(callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]): Unit = js.native
  def rename(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def rename(params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  def rename(params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  ): Unit = js.native
  /**
    * Renames a field in a tag template. The user should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource Project](https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
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
    * const datacatalog = google.datacatalog('v1beta1');
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
    *   const res = await datacatalog.projects.locations.tagTemplates.fields.rename({
    *     // Required. The name of the tag template. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\}/fields/{tag_template_field_id\}
    *     name: 'projects/my-project/locations/my-location/tagTemplates/my-tagTemplate/fields/my-field',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "newTagTemplateFieldId": "my_newTagTemplateFieldId"
    *       // }
    *     },
    *   });
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
  def rename(params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rename(
    params: ParamsResourceProjectsLocationsTagtemplatesFieldsRename,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
