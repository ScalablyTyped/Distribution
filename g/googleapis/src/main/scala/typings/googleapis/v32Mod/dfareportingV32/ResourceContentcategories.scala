package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Contentcategories")
@js.native
class ResourceContentcategories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.contentCategories.delete
    * @desc Deletes an existing content category.
    * @alias dfareporting.contentCategories.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContentcategoriesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceContentcategoriesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceContentcategoriesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceContentcategoriesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceContentcategoriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dfareporting.contentCategories.get
    * @desc Gets one content category by ID.
    * @alias dfareporting.contentCategories.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaContentCategory] = js.native
  def get(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def get(params: ParamsResourceContentcategoriesGet): GaxiosPromise[SchemaContentCategory] = js.native
  def get(params: ParamsResourceContentcategoriesGet, callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def get(
    params: ParamsResourceContentcategoriesGet,
    options: BodyResponseCallback[SchemaContentCategory],
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def get(params: ParamsResourceContentcategoriesGet, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def get(
    params: ParamsResourceContentcategoriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  
  /**
    * dfareporting.contentCategories.insert
    * @desc Inserts a new content category.
    * @alias dfareporting.contentCategories.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(params: ParamsResourceContentcategoriesInsert): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    options: BodyResponseCallback[SchemaContentCategory],
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def insert(params: ParamsResourceContentcategoriesInsert, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def insert(
    params: ParamsResourceContentcategoriesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  
  /**
    * dfareporting.contentCategories.list
    * @desc Retrieves a list of content categories, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.contentCategories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only content categories with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "contentcategory*2015" will return objects with names like "contentcategory June 2015", "contentcategory April 2015", or simply "contentcategory 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "contentcategory" will match objects with name "my contentcategory", "contentcategory 2015", or simply "contentcategory".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaContentCategoriesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(params: ParamsResourceContentcategoriesList): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    callback: BodyResponseCallback[SchemaContentCategoriesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    options: BodyResponseCallback[SchemaContentCategoriesListResponse],
    callback: BodyResponseCallback[SchemaContentCategoriesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceContentcategoriesList, options: MethodOptions): GaxiosPromise[SchemaContentCategoriesListResponse] = js.native
  def list(
    params: ParamsResourceContentcategoriesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategoriesListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.contentCategories.patch
    * @desc Updates an existing content category. This method supports patch
    * semantics.
    * @alias dfareporting.contentCategories.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Content category ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(params: ParamsResourceContentcategoriesPatch): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    options: BodyResponseCallback[SchemaContentCategory],
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def patch(params: ParamsResourceContentcategoriesPatch, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def patch(
    params: ParamsResourceContentcategoriesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  
  /**
    * dfareporting.contentCategories.update
    * @desc Updates an existing content category.
    * @alias dfareporting.contentCategories.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ContentCategory} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaContentCategory] = js.native
  def update(callback: BodyResponseCallback[SchemaContentCategory]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def update(params: ParamsResourceContentcategoriesUpdate): GaxiosPromise[SchemaContentCategory] = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    options: BodyResponseCallback[SchemaContentCategory],
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
  def update(params: ParamsResourceContentcategoriesUpdate, options: MethodOptions): GaxiosPromise[SchemaContentCategory] = js.native
  def update(
    params: ParamsResourceContentcategoriesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaContentCategory]
  ): Unit = js.native
}
