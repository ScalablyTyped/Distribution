package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Consentstores$Attributedefinitions")
@js.native
open class ResourceProjectsLocationsDatasetsConsentstoresAttributedefinitions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def create(callback: BodyResponseCallback[SchemaAttributeDefinition]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    options: BodyResponseCallback[Readable | SchemaAttributeDefinition],
    callback: BodyResponseCallback[Readable | SchemaAttributeDefinition]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  /**
    * Creates a new Attribute definition in the parent consent store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *     await healthcare.projects.locations.datasets.consentStores.attributeDefinitions.create(
    *       {
    *         // Required. The ID of the Attribute definition to create. The string must match the following regex: `_a-zA-Z{0,255\}` and must not be a reserved keyword within the Common Expression Language as listed on https://github.com/google/cel-spec/blob/master/doc/langdef.md.
    *         attributeDefinitionId: 'placeholder-value',
    *         // Required. The name of the consent store that this Attribute definition belongs to.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "allowedValues": [],
    *           //   "category": "my_category",
    *           //   "consentDefaultValues": [],
    *           //   "dataMappingDefaultValue": "my_dataMappingDefaultValue",
    *           //   "description": "my_description",
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedValues": [],
    *   //   "category": "my_category",
    *   //   "consentDefaultValues": [],
    *   //   "dataMappingDefaultValue": "my_dataMappingDefaultValue",
    *   //   "description": "my_description",
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
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified Attribute definition. Fails if the Attribute definition is referenced by any User data mapping, or the latest revision of any Consent.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *     await healthcare.projects.locations.datasets.consentStores.attributeDefinitions.delete(
    *       {
    *         // Required. The resource name of the Attribute definition to delete. To preserve referential integrity, Attribute definitions referenced by a User data mapping or the latest revision of a Consent cannot be deleted.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/attributeDefinitions/my-attributeDefinition',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def get(callback: BodyResponseCallback[SchemaAttributeDefinition]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    options: BodyResponseCallback[Readable | SchemaAttributeDefinition],
    callback: BodyResponseCallback[Readable | SchemaAttributeDefinition]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    options: MethodOptions
  ): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  /**
    * Gets the specified Attribute definition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *     await healthcare.projects.locations.datasets.consentStores.attributeDefinitions.get(
    *       {
    *         // Required. The resource name of the Attribute definition to get.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/attributeDefinitions/my-attributeDefinition',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedValues": [],
    *   //   "category": "my_category",
    *   //   "consentDefaultValues": [],
    *   //   "dataMappingDefaultValue": "my_dataMappingDefaultValue",
    *   //   "description": "my_description",
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
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAttributeDefinitionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAttributeDefinitionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAttributeDefinitionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList): GaxiosPromise[SchemaListAttributeDefinitionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    callback: BodyResponseCallback[SchemaListAttributeDefinitionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    options: BodyResponseCallback[Readable | SchemaListAttributeDefinitionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAttributeDefinitionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    options: MethodOptions
  ): GaxiosPromise[SchemaListAttributeDefinitionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAttributeDefinitionsResponse]
  ): Unit = js.native
  /**
    * Lists the Attribute definitions in the specified consent store.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *     await healthcare.projects.locations.datasets.consentStores.attributeDefinitions.list(
    *       {
    *         // Optional. Restricts the attributes returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. The only field available for filtering is `category`. For example, `filter=category=\"REQUEST\"`.
    *         filter: 'placeholder-value',
    *         // Optional. Limit on the number of Attribute definitions to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *         pageSize: 'placeholder-value',
    *         // Optional. Token to retrieve the next page of results or empty to get the first page.
    *         pageToken: 'placeholder-value',
    *         // Required. Name of the consent store to retrieve Attribute definitions from.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeDefinitions": [],
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
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def patch(callback: BodyResponseCallback[SchemaAttributeDefinition]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    options: BodyResponseCallback[Readable | SchemaAttributeDefinition],
    callback: BodyResponseCallback[Readable | SchemaAttributeDefinition]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    options: MethodOptions
  ): GaxiosPromise[SchemaAttributeDefinition] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttributeDefinition]
  ): Unit = js.native
  /**
    * Updates the specified Attribute definition.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *     await healthcare.projects.locations.datasets.consentStores.attributeDefinitions.patch(
    *       {
    *         // Resource name of the Attribute definition, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/attributeDefinitions/{attribute_definition_id\}`. Cannot be changed after creation.
    *         name: 'projects/my-project/locations/my-location/datasets/my-dataset/consentStores/my-consentStore/attributeDefinitions/my-attributeDefinition',
    *         // Required. The update mask that applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask. Only the `description`, `allowed_values`, `consent_default_values` and `data_mapping_default_value` fields can be updated. The updated `allowed_values` must contain all values from the previous `allowed_values`.
    *         updateMask: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "allowedValues": [],
    *           //   "category": "my_category",
    *           //   "consentDefaultValues": [],
    *           //   "dataMappingDefaultValue": "my_dataMappingDefaultValue",
    *           //   "description": "my_description",
    *           //   "name": "my_name"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowedValues": [],
    *   //   "category": "my_category",
    *   //   "consentDefaultValues": [],
    *   //   "dataMappingDefaultValue": "my_dataMappingDefaultValue",
    *   //   "description": "my_description",
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
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsConsentstoresAttributedefinitionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
