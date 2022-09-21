package typings.googleapis.retailV2Mod.retailV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/retail/v2", "retail_v2.Resource$Projects$Locations$Catalogs$Attributesconfig")
@js.native
open class ResourceProjectsLocationsCatalogsAttributesconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addCatalogAttribute(): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def addCatalogAttribute(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]): Unit = js.native
  def addCatalogAttribute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def addCatalogAttribute(params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2AttributesConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  /**
    * Adds the specified CatalogAttribute to the AttributesConfig. If the CatalogAttribute to add already exists, an ALREADY_EXISTS error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2');
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
    *     await retail.projects.locations.catalogs.attributesConfig.addCatalogAttribute(
    *       {
    *         // Required. Full AttributesConfig resource name. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/attributesConfig`
    *         attributesConfig:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/attributesConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "catalogAttribute": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeConfigLevel": "my_attributeConfigLevel",
    *   //   "catalogAttributes": {},
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
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def addCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigAddcatalogattribute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def removeCatalogAttribute(): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def removeCatalogAttribute(callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]): Unit = js.native
  def removeCatalogAttribute(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def removeCatalogAttribute(params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2AttributesConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleCloudRetailV2AttributesConfig] = js.native
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudRetailV2AttributesConfig]
  ): Unit = js.native
  /**
    * Removes the specified CatalogAttribute from the AttributesConfig. If the CatalogAttribute to remove does not exist, a NOT_FOUND error is returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/retail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const retail = google.retail('v2');
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
    *     await retail.projects.locations.catalogs.attributesConfig.removeCatalogAttribute(
    *       {
    *         // Required. Full AttributesConfig resource name. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/attributesConfig`
    *         attributesConfig:
    *           'projects/my-project/locations/my-location/catalogs/my-catalog/attributesConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "key": "my_key"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeConfigLevel": "my_attributeConfigLevel",
    *   //   "catalogAttributes": {},
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
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeCatalogAttribute(
    params: ParamsResourceProjectsLocationsCatalogsAttributesconfigRemovecatalogattribute,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
