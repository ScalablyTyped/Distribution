package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Creativefields")
@js.native
class ResourceCreativefields protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.creativeFields.delete
    * @desc Deletes an existing creative field.
    * @alias dfareporting.creativeFields.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCreativefieldsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCreativefieldsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCreativefieldsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeFields.get
    * @desc Gets one creative field by ID.
    * @alias dfareporting.creativeFields.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreativeField] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def get(params: ParamsResourceCreativefieldsGet): GaxiosPromise[SchemaCreativeField] = js.native
  def get(params: ParamsResourceCreativefieldsGet, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def get(
    params: ParamsResourceCreativefieldsGet,
    options: BodyResponseCallback[SchemaCreativeField],
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  def get(params: ParamsResourceCreativefieldsGet, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def get(
    params: ParamsResourceCreativefieldsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeFields.insert
    * @desc Inserts a new creative field.
    * @alias dfareporting.creativeFields.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(params: ParamsResourceCreativefieldsInsert): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(params: ParamsResourceCreativefieldsInsert, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def insert(
    params: ParamsResourceCreativefieldsInsert,
    options: BodyResponseCallback[SchemaCreativeField],
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativefieldsInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def insert(
    params: ParamsResourceCreativefieldsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeFields.list
    * @desc Retrieves a list of creative fields, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.creativeFields.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserIds Select only creative fields that belong to these advertisers.
    * @param {string=} params.ids Select only creative fields with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative fields by name or ID. Wildcards (*) are allowed. For example, "creativefield*2015" will return creative fields with names like "creativefield June 2015", "creativefield April 2015", or simply "creativefield 2015". Most of the searches also add wild-cards implicitly at the start and the end of the search string. For example, a search string of "creativefield" will match creative fields with the name "my creativefield", "creativefield 2015", or simply "creativefield".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(params: ParamsResourceCreativefieldsList): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    options: BodyResponseCallback[SchemaCreativeFieldsListResponse],
    callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativefieldsList, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldsListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeFields.patch
    * @desc Updates an existing creative field. This method supports patch
    * semantics.
    * @alias dfareporting.creativeFields.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Creative Field ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(params: ParamsResourceCreativefieldsPatch): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(params: ParamsResourceCreativefieldsPatch, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def patch(
    params: ParamsResourceCreativefieldsPatch,
    options: BodyResponseCallback[SchemaCreativeField],
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativefieldsPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def patch(
    params: ParamsResourceCreativefieldsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  
  /**
    * dfareporting.creativeFields.update
    * @desc Updates an existing creative field.
    * @alias dfareporting.creativeFields.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeField} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCreativeField] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def update(params: ParamsResourceCreativefieldsUpdate): GaxiosPromise[SchemaCreativeField] = js.native
  def update(params: ParamsResourceCreativefieldsUpdate, callback: BodyResponseCallback[SchemaCreativeField]): Unit = js.native
  def update(
    params: ParamsResourceCreativefieldsUpdate,
    options: BodyResponseCallback[SchemaCreativeField],
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
  def update(params: ParamsResourceCreativefieldsUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeField] = js.native
  def update(
    params: ParamsResourceCreativefieldsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeField]
  ): Unit = js.native
}
