package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/serviceconsumermanagement/v1", "serviceconsumermanagement_v1.Resource$Services")
@js.native
class ResourceServices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var tenancyUnits: ResourceServicesTenancyunits = js.native
  /**
    * serviceconsumermanagement.services.search
    * @desc Search tenancy units for a managed service.
    * @alias serviceconsumermanagement.services.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results returned by this request. Currently, the default maximum is set to 1000. If `page_size` isn't provided or the size provided is a number larger than 1000, it's automatically set to 1000.  Optional.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of `nextPageToken` from the previous response.  Optional.
    * @param {string} params.parent Service for which search is performed. services/{service} {service} the name of a service, for example 'service.googleapis.com'.
    * @param {string=} params.query Set a query `{expression}` for querying tenancy units. Your `{expression}` must be in the format: `field_name=literal_string`. The `field_name` is the name of the field you want to compare. Supported fields are `tenant_resources.tag` and `tenant_resources.resource`.  For example, to search tenancy units that contain at least one tenant resource with a given tag 'xyz', use the query `tenant_resources.tag=xyz`. To search tenancy units that contain at least one tenant resource with a given resource name 'projects/123456', use the query `tenant_resources.resource=projects/123456`.  Multiple expressions can be joined with `AND`s. Tenancy units must match all expressions to be included in the result set. For example, `tenant_resources.tag=xyz AND tenant_resources.resource=projects/123456`  Optional.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(params: ParamsResourceServicesSearch): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(
    params: ParamsResourceServicesSearch,
    callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceServicesSearch,
    options: BodyResponseCallback[SchemaSearchTenancyUnitsResponse],
    callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceServicesSearch, options: MethodOptions): GaxiosPromise[SchemaSearchTenancyUnitsResponse] = js.native
  def search(
    params: ParamsResourceServicesSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchTenancyUnitsResponse]
  ): Unit = js.native
}

