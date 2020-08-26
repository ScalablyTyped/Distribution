package typings.googleapis.visionV1Mod.visionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Products")
@js.native
class ResourceProjectsLocationsProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var referenceImages: ResourceProjectsLocationsProductsReferenceimages = js.native
  /**
    * vision.projects.locations.products.create
    * @desc Creates and returns a new product resource.  Possible errors:  *
    * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096
    * characters. * Returns INVALID_ARGUMENT if description is longer than 4096
    * characters. * Returns INVALID_ARGUMENT if product_category is missing or
    * invalid.
    * @alias vision.projects.locations.products.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which the Product should be created.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {string=} params.productId A user-supplied resource id for this Product. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
    * @param {().Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaProduct] = js.native
  def create(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def create(params: ParamsResourceProjectsLocationsProductsCreate): GaxiosPromise[SchemaProduct] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsCreate,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsCreate,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProductsCreate, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * vision.projects.locations.products.delete
    * @desc Permanently deletes a product and its reference images.  Metadata
    * of the product and all its images will be deleted right away, but search
    * queries against ProductSets containing the product may still work until
    * all related caches are refreshed.  Possible errors:  * Returns NOT_FOUND
    * if the product does not exist.
    * @alias vision.projects.locations.products.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of product to delete.  Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * vision.projects.locations.products.get
    * @desc Gets information associated with a Product.  Possible errors:  *
    * Returns NOT_FOUND if the Product does not exist.
    * @alias vision.projects.locations.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the Product to get.  Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProduct] = js.native
  def get(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProjectsLocationsProductsGet): GaxiosPromise[SchemaProduct] = js.native
  def get(params: ParamsResourceProjectsLocationsProductsGet, callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsGet,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProductsGet, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  /**
    * vision.projects.locations.products.list
    * @desc Lists products in an unspecified order.  Possible errors:  *
    * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1.
    * @alias vision.projects.locations.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. Default 10, maximum 100.
    * @param {string=} params.pageToken The next_page_token returned from a previous List request, if any.
    * @param {string} params.parent The project OR ProductSet from which Products should be listed.  Format: `projects/PROJECT_ID/locations/LOC_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProductsList): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsList,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsList,
    options: BodyResponseCallback[SchemaListProductsResponse],
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsList, options: MethodOptions): GaxiosPromise[SchemaListProductsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductsResponse]
  ): Unit = js.native
  /**
    * vision.projects.locations.products.patch
    * @desc Makes changes to a Product resource. Only the `display_name`,
    * `description`, and `labels` fields can be updated right now.  If labels
    * are updated, the change will not be reflected in queries until the next
    * index time.  Possible errors:  * Returns NOT_FOUND if the Product does
    * not exist. * Returns INVALID_ARGUMENT if display_name is present in
    * update_mask but is   missing from the request or longer than 4096
    * characters. * Returns INVALID_ARGUMENT if description is present in
    * update_mask but is   longer than 4096 characters. * Returns
    * INVALID_ARGUMENT if product_category is present in update_mask.
    * @alias vision.projects.locations.products.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the product.  Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.  This field is ignored when creating a product.
    * @param {string=} params.updateMask The FieldMask that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask paths include `product_labels`, `display_name`, and `description`.
    * @param {().Product} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProduct] = js.native
  def patch(callback: BodyResponseCallback[SchemaProduct]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def patch(params: ParamsResourceProjectsLocationsProductsPatch): GaxiosPromise[SchemaProduct] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsPatch,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsPatch,
    options: BodyResponseCallback[SchemaProduct],
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsProductsPatch, options: MethodOptions): GaxiosPromise[SchemaProduct] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProduct]
  ): Unit = js.native
}

