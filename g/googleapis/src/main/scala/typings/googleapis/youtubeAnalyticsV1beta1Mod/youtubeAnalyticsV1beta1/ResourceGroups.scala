package typings.googleapis.youtubeAnalyticsV1beta1Mod.youtubeAnalyticsV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1beta1", "youtubeAnalytics_v1beta1.Resource$Groups")
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
    * @param {string} params.id The id parameter specifies the YouTube group ID for the group that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGroupsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * youtubeAnalytics.groups.insert
    * @desc Creates a group.
    * @alias youtubeAnalytics.groups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
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
    * @param {object=} params Parameters for request
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube group ID(s) for the resource(s) that are being retrieved. In a group resource, the id property specifies the group's YouTube group ID.
    * @param {boolean=} params.mine Set this parameter's value to true to instruct the API to only return groups owned by the authenticated user.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies the next page that can be retrieved.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGroupListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupListResponse] = js.native
  def list(params: ParamsResourceGroupsList): GaxiosPromise[SchemaGroupListResponse] = js.native
  def list(params: ParamsResourceGroupsList, callback: BodyResponseCallback[SchemaGroupListResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: BodyResponseCallback[SchemaGroupListResponse],
    callback: BodyResponseCallback[SchemaGroupListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupsList, options: MethodOptions): GaxiosPromise[SchemaGroupListResponse] = js.native
  def list(
    params: ParamsResourceGroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupListResponse]
  ): Unit = js.native
  /**
    * youtubeAnalytics.groups.update
    * @desc Modifies a group. For example, you could change a group's title.
    * @alias youtubeAnalytics.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
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

