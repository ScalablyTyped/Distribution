package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Groups")
@js.native
class ResourceGroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubeAnalytics.groups.delete
    * @desc Deletes a group.
    * @alias youtubeAnalytics.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The `id` parameter specifies the YouTube group ID of the group that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupsDelete): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupsDelete, callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: BodyResponseCallback[SchemaEmptyResponse],
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.insert
    * @desc Creates a group.
    * @alias youtubeAnalytics.groups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaGroup] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert): GaxiosPromise[SchemaGroup] = js.native
  def insert(params: ParamsResourceGroupsInsert, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupsInsert, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def insert(
    params: ParamsResourceGroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.list
    * @desc Returns a collection of groups that match the API request
    * parameters. For example, you can retrieve all groups that the
    * authenticated user owns, or you can retrieve one or more groups by their
    * unique IDs.
    * @alias youtubeAnalytics.groups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The `id` parameter specifies a comma-separated list of the YouTube group ID(s) for the resource(s) that are being retrieved. Each group must be owned by the authenticated user. In a `group` resource, the `id` property specifies the group's YouTube group ID.  Note that if you do not specify a value for the `id` parameter, then you must set the `mine` parameter to `true`.
    * @param {boolean=} params.mine This parameter can only be used in a properly authorized request. Set this parameter's value to true to retrieve all groups owned by the authenticated user.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The `pageToken` parameter identifies a specific page in the result set that should be returned. In an API response, the `nextPageToken` property identifies the next page that can be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceGroupsList): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(params: ParamsResourceGroupsList, callback: BodyResponseCallback[SchemaListGroupsResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: BodyResponseCallback[SchemaListGroupsResponse],
    callback: BodyResponseCallback[SchemaListGroupsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsList, options: MethodOptions): GaxiosPromise[SchemaListGroupsResponse] = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupsResponse]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.update
    * @desc Modifies a group. For example, you could change a group's title.
    * @alias youtubeAnalytics.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaGroup] = js.native
  def update(callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate): GaxiosPromise[SchemaGroup] = js.native
  def update(params: ParamsResourceGroupsUpdate, callback: BodyResponseCallback[SchemaGroup]): Unit = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: BodyResponseCallback[SchemaGroup],
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
  def update(params: ParamsResourceGroupsUpdate, options: MethodOptions): GaxiosPromise[SchemaGroup] = js.native
  def update(
    params: ParamsResourceGroupsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroup]
  ): Unit = js.native
}

