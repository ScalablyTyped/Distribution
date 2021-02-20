package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtubeAnalytics/v2", "youtubeAnalytics_v2.Resource$Groupitems")
@js.native
class ResourceGroupitems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtubeAnalytics.groupItems.delete
    * @desc Removes an item from a group.
    * @alias youtubeAnalytics.groupItems.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.id The `id` parameter specifies the YouTube group item ID of the group item that is being deleted.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupitemsDelete): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(params: ParamsResourceGroupitemsDelete, callback: BodyResponseCallback[SchemaEmptyResponse]): Unit = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: BodyResponseCallback[SchemaEmptyResponse],
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  def delete(params: ParamsResourceGroupitemsDelete, options: MethodOptions): GaxiosPromise[SchemaEmptyResponse] = js.native
  def delete(
    params: ParamsResourceGroupitemsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmptyResponse]
  ): Unit = js.native
  
  /**
    * youtubeAnalytics.groupItems.insert
    * @desc Creates a group item.
    * @alias youtubeAnalytics.groupItems.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
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
    * @param {string=} params.groupId The `groupId` parameter specifies the unique ID of the group for which you want to retrieve group items.
    * @param {string=} params.onBehalfOfContentOwner This parameter can only be used in a properly authorized request. **Note:** This parameter is intended exclusively for YouTube content partners that own and manage many different YouTube channels.  The `onBehalfOfContentOwner` parameter indicates that the request's authorization credentials identify a YouTube user who is acting on behalf of the content owner specified in the parameter value. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupItemsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(params: ParamsResourceGroupitemsList): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(params: ParamsResourceGroupitemsList, callback: BodyResponseCallback[SchemaListGroupItemsResponse]): Unit = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: BodyResponseCallback[SchemaListGroupItemsResponse],
    callback: BodyResponseCallback[SchemaListGroupItemsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGroupitemsList, options: MethodOptions): GaxiosPromise[SchemaListGroupItemsResponse] = js.native
  def list(
    params: ParamsResourceGroupitemsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupItemsResponse]
  ): Unit = js.native
}
