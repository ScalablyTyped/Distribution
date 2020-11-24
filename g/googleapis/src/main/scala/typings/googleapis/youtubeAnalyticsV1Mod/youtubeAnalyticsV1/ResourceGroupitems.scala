package typings.googleapis.youtubeAnalyticsV1Mod.youtubeAnalyticsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v1", "youtubeAnalytics_v1.Resource$Groupitems")
@js.native
class ResourceGroupitems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtubeAnalytics.groupItems.delete
    * @desc Removes an item from a group.
    * @alias youtubeAnalytics.groupItems.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube group item ID for the group that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupitemsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGroupitemsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupitemsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtubeAnalytics.groupItems.insert
    * @desc Creates a group item.
    * @alias youtubeAnalytics.groupItems.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {().GroupItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(callback: BodyResponseCallback[SchemaGroupItem]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(params: ParamsResourceGroupitemsInsert): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(params: ParamsResourceGroupitemsInsert, callback: BodyResponseCallback[SchemaGroupItem]): Unit = js.native
  def insert(
    params: ParamsResourceGroupitemsInsert,
    options: BodyResponseCallback[SchemaGroupItem],
    callback: BodyResponseCallback[SchemaGroupItem]
  ): Unit = js.native
  def insert(params: ParamsResourceGroupitemsInsert, options: MethodOptions): GaxiosPromise[SchemaGroupItem] = js.native
  def insert(
    params: ParamsResourceGroupitemsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupItem]
  ): Unit = js.native
  
  /**
    * youtubeAnalytics.groupItems.list
    * @desc Returns a collection of group items that match the API request
    * parameters.
    * @alias youtubeAnalytics.groupItems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupId The id parameter specifies the unique ID of the group for which you want to retrieve group items.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGroupItemListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupItemListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupItemListResponse] = js.native
  def list(params: ParamsResourceGroupitemsList): GaxiosPromise[SchemaGroupItemListResponse] = js.native
  def list(params: ParamsResourceGroupitemsList, callback: BodyResponseCallback[SchemaGroupItemListResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: BodyResponseCallback[SchemaGroupItemListResponse],
    callback: BodyResponseCallback[SchemaGroupItemListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupitemsList, options: MethodOptions): GaxiosPromise[SchemaGroupItemListResponse] = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupItemListResponse]
  ): Unit = js.native
}
