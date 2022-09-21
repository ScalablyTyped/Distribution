package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1", "serviceconsumermanagement_v1.Resource$Services")
@js.native
open class ResourceServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(params: ParamsResourceServicesSearch): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(
    params: ParamsResourceServicesSearch,
    callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceServicesSearch,
    options: BodyResponseCallback[Readable | SchemaSearchTenancyUnitsResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceServicesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(
    params: ParamsResourceServicesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
  /**
    * Search tenancy units for a managed service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/serviceconsumermanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const serviceconsumermanagement = google.serviceconsumermanagement('v1');
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
    *   const res = await serviceconsumermanagement.services.search({
    *     // Optional. The maximum number of results returned by this request. Currently, the default maximum is set to 1000. If `page_size` isn't provided or the size provided is a number larger than 1000, it's automatically set to 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `nextPageToken` from the previous response.
    *     pageToken: 'placeholder-value',
    *     // Required. Service for which search is performed. services/{service\} {service\} the name of a service, for example 'service.googleapis.com'.
    *     parent: 'services/my-service',
    *     // Optional. Set a query `{expression\}` for querying tenancy units. Your `{expression\}` must be in the format: `field_name=literal_string`. The `field_name` is the name of the field you want to compare. Supported fields are `tenant_resources.tag` and `tenant_resources.resource`. For example, to search tenancy units that contain at least one tenant resource with a given tag 'xyz', use the query `tenant_resources.tag=xyz`. To search tenancy units that contain at least one tenant resource with a given resource name 'projects/123456', use the query `tenant_resources.resource=projects/123456`. Multiple expressions can be joined with `AND`s. Tenancy units must match all expressions to be included in the result set. For example, `tenant_resources.tag=xyz AND tenant_resources.resource=projects/123456`
    *     query: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tenancyUnits": []
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
  def search(params: ParamsResourceServicesSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceServicesSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var tenancyUnits: ResourceServicesTenancyunits = js.native
}
