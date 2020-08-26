package typings.googleapis.visionV1Mod.visionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Productsets$Products")
@js.native
class ResourceProjectsLocationsProductsetsProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * vision.projects.locations.productSets.products.list
    * @desc Lists the Products in a ProductSet, in an unspecified order. If the
    * ProductSet does not exist, the products field of the response will be
    * empty.  Possible errors:  * Returns INVALID_ARGUMENT if page_size is
    * greater than 100 or less than 1.
    * @alias vision.projects.locations.productSets.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The ProductSet resource for which to retrieve Products.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {integer=} params.pageSize The maximum number of items to return. Default 10, maximum 100.
    * @param {string=} params.pageToken The next_page_token returned from a previous List request, if any.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsProductsList): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    options: BodyResponseCallback[SchemaListProductsInProductSetResponse],
    callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsInProductSetResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsInProductSetResponse]
  ): Unit = js.native
}

