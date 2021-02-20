package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Advertisergroups")
@js.native
class ResourceAdvertisergroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.advertiserGroups.delete
    * @desc Deletes an existing advertiser group.
    * @alias dfareporting.advertiserGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceAdvertisergroupsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceAdvertisergroupsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceAdvertisergroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * dfareporting.advertiserGroups.get
    * @desc Gets one advertiser group by ID.
    * @alias dfareporting.advertiserGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(params: ParamsResourceAdvertisergroupsGet): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(params: ParamsResourceAdvertisergroupsGet, callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def get(
    params: ParamsResourceAdvertisergroupsGet,
    options: BodyResponseCallback[SchemaAdvertiserGroup],
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisergroupsGet, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def get(
    params: ParamsResourceAdvertisergroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.advertiserGroups.insert
    * @desc Inserts a new advertiser group.
    * @alias dfareporting.advertiserGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(params: ParamsResourceAdvertisergroupsInsert): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    options: BodyResponseCallback[SchemaAdvertiserGroup],
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceAdvertisergroupsInsert, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def insert(
    params: ParamsResourceAdvertisergroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.advertiserGroups.list
    * @desc Retrieves a list of advertiser groups, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.advertiserGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only advertiser groups with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "advertiser*2015" will return objects with names like "advertiser group June 2015", "advertiser group April 2015", or simply "advertiser group 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "advertisergroup" will match objects with name "my advertisergroup", "advertisergroup 2015", or simply "advertisergroup".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(params: ParamsResourceAdvertisergroupsList): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    options: BodyResponseCallback[SchemaAdvertiserGroupsListResponse],
    callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisergroupsList, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroupsListResponse] = js.native
  def list(
    params: ParamsResourceAdvertisergroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroupsListResponse]
  ): Unit = js.native
  
  /**
    * dfareporting.advertiserGroups.patch
    * @desc Updates an existing advertiser group. This method supports patch
    * semantics.
    * @alias dfareporting.advertiserGroups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Advertiser group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch, callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisergroupsPatch,
    options: BodyResponseCallback[SchemaAdvertiserGroup],
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisergroupsPatch, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def patch(
    params: ParamsResourceAdvertisergroupsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  
  /**
    * dfareporting.advertiserGroups.update
    * @desc Updates an existing advertiser group.
    * @alias dfareporting.advertiserGroups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AdvertiserGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaAdvertiserGroup]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(params: ParamsResourceAdvertisergroupsUpdate): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    options: BodyResponseCallback[SchemaAdvertiserGroup],
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
  def update(params: ParamsResourceAdvertisergroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaAdvertiserGroup] = js.native
  def update(
    params: ParamsResourceAdvertisergroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdvertiserGroup]
  ): Unit = js.native
}
