package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Creativefieldvalues")
@js.native
class ResourceCreativefieldvalues protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.creativeFieldValues.delete
    * @desc Deletes an existing creative field value.
    * @alias dfareporting.creativeFieldValues.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCreativefieldvaluesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCreativefieldvaluesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCreativefieldvaluesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.get
    * @desc Gets one creative field value by ID.
    * @alias dfareporting.creativeFieldValues.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def get(params: ParamsResourceCreativefieldvaluesGet): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    options: BodyResponseCallback[SchemaCreativeFieldValue],
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def get(params: ParamsResourceCreativefieldvaluesGet, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def get(
    params: ParamsResourceCreativefieldvaluesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.insert
    * @desc Inserts a new creative field value.
    * @alias dfareporting.creativeFieldValues.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def insert(params: ParamsResourceCreativefieldvaluesInsert): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    options: BodyResponseCallback[SchemaCreativeFieldValue],
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def insert(params: ParamsResourceCreativefieldvaluesInsert, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def insert(
    params: ParamsResourceCreativefieldvaluesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.list
    * @desc Retrieves a list of creative field values, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.creativeFieldValues.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string=} params.ids Select only creative field values with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for creative field values by their values. Wildcards (e.g. *) are not allowed.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]): Unit = js.native
  def list(params: ParamsResourceCreativefieldvaluesList): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    options: BodyResponseCallback[SchemaCreativeFieldValuesListResponse],
    callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCreativefieldvaluesList, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValuesListResponse] = js.native
  def list(
    params: ParamsResourceCreativefieldvaluesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValuesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.patch
    * @desc Updates an existing creative field value. This method supports
    * patch semantics.
    * @alias dfareporting.creativeFieldValues.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.id Creative Field Value ID
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def patch(params: ParamsResourceCreativefieldvaluesPatch): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    options: BodyResponseCallback[SchemaCreativeFieldValue],
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def patch(params: ParamsResourceCreativefieldvaluesPatch, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def patch(
    params: ParamsResourceCreativefieldvaluesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  /**
    * dfareporting.creativeFieldValues.update
    * @desc Updates an existing creative field value.
    * @alias dfareporting.creativeFieldValues.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.creativeFieldId Creative field ID for this creative field value.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CreativeFieldValue} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(callback: BodyResponseCallback[SchemaCreativeFieldValue]): Unit = js.native
  def update(params: ParamsResourceCreativefieldvaluesUpdate): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    options: BodyResponseCallback[SchemaCreativeFieldValue],
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
  def update(params: ParamsResourceCreativefieldvaluesUpdate, options: MethodOptions): GaxiosPromise[SchemaCreativeFieldValue] = js.native
  def update(
    params: ParamsResourceCreativefieldvaluesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreativeFieldValue]
  ): Unit = js.native
}

