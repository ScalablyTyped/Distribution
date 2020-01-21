package typings.googleapis.visionV1Mod.visionV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vision/v1", "vision_v1.Resource$Projects$Locations$Productsets")
@js.native
class ResourceProjectsLocationsProductsets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var products: ResourceProjectsLocationsProductsetsProducts = js.native
  /**
    * vision.projects.locations.productSets.addProduct
    * @desc Adds a Product to the specified ProductSet. If the Product is
    * already present, no change is made.  One Product can be added to at most
    * 100 ProductSets.  Possible errors:  * Returns NOT_FOUND if the Product or
    * the ProductSet doesn't exist.
    * @alias vision.projects.locations.productSets.addProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name for the ProductSet to modify.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {().AddProductToProductSetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addProduct(): GaxiosPromise[SchemaEmpty] = js.native
  def addProduct(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def addProduct(params: ParamsResourceProjectsLocationsProductsetsAddproduct): GaxiosPromise[SchemaEmpty] = js.native
  def addProduct(
    params: ParamsResourceProjectsLocationsProductsetsAddproduct,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def addProduct(
    params: ParamsResourceProjectsLocationsProductsetsAddproduct,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def addProduct(params: ParamsResourceProjectsLocationsProductsetsAddproduct, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def addProduct(
    params: ParamsResourceProjectsLocationsProductsetsAddproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.create
    * @desc Creates and returns a new ProductSet resource.  Possible errors:  *
    * Returns INVALID_ARGUMENT if display_name is missing, or is longer than
    * 4096 characters.
    * @alias vision.projects.locations.productSets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which the ProductSet should be created.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {string=} params.productSetId A user-supplied resource id for this ProductSet. If set, the server will attempt to use this value as the resource id. If it is already in use, an error is returned with code ALREADY_EXISTS. Must be at most 128 characters long. It cannot contain the character `/`.
    * @param {().ProductSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaProductSet] = js.native
  def create(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProductsetsCreate): GaxiosPromise[SchemaProductSet] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsetsCreate,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsetsCreate,
    options: BodyResponseCallback[SchemaProductSet],
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProductsetsCreate, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProductsetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.delete
    * @desc Permanently deletes a ProductSet. Products and ReferenceImages in
    * the ProductSet are not deleted.  The actual image files are not deleted
    * from Google Cloud Storage.  Possible errors:  * Returns NOT_FOUND if the
    * ProductSet does not exist.
    * @alias vision.projects.locations.productSets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the ProductSet to delete.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsetsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsetsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProductsetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProductsetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.get
    * @desc Gets information associated with a ProductSet.  Possible errors:  *
    * Returns NOT_FOUND if the ProductSet does not exist.
    * @alias vision.projects.locations.productSets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name of the ProductSet to get.  Format is: `projects/PROJECT_ID/locations/LOG_ID/productSets/PRODUCT_SET_ID`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProductSet] = js.native
  def get(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProductsetsGet): GaxiosPromise[SchemaProductSet] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsetsGet,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsetsGet,
    options: BodyResponseCallback[SchemaProductSet],
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProductsetsGet, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProductsetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.import
    * @desc Asynchronous API that imports a list of reference images to specified
    * product sets based on a list of image information.  The
    * google.longrunning.Operation API can be used to keep track of the progress
    * and results of the request. `Operation.metadata` contains
    * `BatchOperationMetadata`. (progress) `Operation.response` contains
    * `ImportProductSetsResponse`. (results)  The input source of this method is a
    * csv file on Google Cloud Storage. For the format of the csv file please see
    * ImportProductSetsGcsSource.csv_file_uri.
    * @alias vision.projects.locations.productSets.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which the ProductSets should be imported.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {().ImportProductSetsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsProductsetsImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsProductsetsImport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsProductsetsImport,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsProductsetsImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsProductsetsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.list
    * @desc Lists ProductSets in an unspecified order.  Possible errors:  * Returns INVALID_ARGUMENT if page_size is greater than 100, or less   than 1.
    * @alias vision.projects.locations.productSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. Default 10, maximum 100.
    * @param {string=} params.pageToken The next_page_token returned from a previous List request, if any.
    * @param {string} params.parent The project from which ProductSets should be listed.  Format is `projects/PROJECT_ID/locations/LOC_ID`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListProductSetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProductSetsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsList): GaxiosPromise[SchemaListProductSetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsList,
    callback: BodyResponseCallback[SchemaListProductSetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsList,
    options: BodyResponseCallback[SchemaListProductSetsResponse],
    callback: BodyResponseCallback[SchemaListProductSetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProductsetsList, options: MethodOptions): GaxiosPromise[SchemaListProductSetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProductsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProductSetsResponse]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.patch
    * @desc Makes changes to a ProductSet resource. Only display_name can be
    * updated currently.  Possible errors:  * Returns NOT_FOUND if the
    * ProductSet does not exist. * Returns INVALID_ARGUMENT if display_name is
    * present in update_mask but   missing from the request or longer than 4096
    * characters.
    * @alias vision.projects.locations.productSets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the ProductSet.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`.  This field is ignored when creating a ProductSet.
    * @param {string=} params.updateMask The FieldMask that specifies which fields to update. If update_mask isn't specified, all mutable fields are to be updated. Valid mask path is `display_name`.
    * @param {().ProductSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProductSet] = js.native
  def patch(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsProductsetsPatch): GaxiosPromise[SchemaProductSet] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsetsPatch,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsetsPatch,
    options: BodyResponseCallback[SchemaProductSet],
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsProductsetsPatch, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProductsetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  /**
    * vision.projects.locations.productSets.removeProduct
    * @desc Removes a Product from the specified ProductSet.  Possible errors:
    * * Returns NOT_FOUND If the Product is not found under the ProductSet.
    * @alias vision.projects.locations.productSets.removeProduct
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name for the ProductSet to modify.  Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`
    * @param {().RemoveProductFromProductSetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeProduct(): GaxiosPromise[SchemaEmpty] = js.native
  def removeProduct(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeProduct(params: ParamsResourceProjectsLocationsProductsetsRemoveproduct): GaxiosPromise[SchemaEmpty] = js.native
  def removeProduct(
    params: ParamsResourceProjectsLocationsProductsetsRemoveproduct,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeProduct(
    params: ParamsResourceProjectsLocationsProductsetsRemoveproduct,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeProduct(params: ParamsResourceProjectsLocationsProductsetsRemoveproduct, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeProduct(
    params: ParamsResourceProjectsLocationsProductsetsRemoveproduct,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
}

