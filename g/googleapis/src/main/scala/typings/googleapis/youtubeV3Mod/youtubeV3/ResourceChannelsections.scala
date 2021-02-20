package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Channelsections")
@js.native
class ResourceChannelsections protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.channelSections.delete
    * @desc Deletes a channelSection.
    * @alias youtube.channelSections.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter specifies the YouTube channelSection ID for the resource that is being deleted. In a channelSection resource, the id property specifies the YouTube channelSection ID.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChannelsectionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChannelsectionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceChannelsectionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceChannelsectionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceChannelsectionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * youtube.channelSections.insert
    * @desc Adds a channelSection for the authenticated user's channel.
    * @alias youtube.channelSections.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string=} params.onBehalfOfContentOwnerChannel This parameter can only be used in a properly authorized request. Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwnerChannel parameter specifies the YouTube channel ID of the channel to which a video is being added. This parameter is required when a request specifies a value for the onBehalfOfContentOwner parameter, and it can only be used in conjunction with that parameter. In addition, the request must be authorized using a CMS account that is linked to the content owner that the onBehalfOfContentOwner parameter specifies. Finally, the channel that the onBehalfOfContentOwnerChannel parameter value specifies must be linked to the content owner that the onBehalfOfContentOwner parameter specifies.  This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and perform actions on behalf of the channel specified in the parameter value, without having to provide authentication credentials for each separate channel.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  The part names that you can include in the parameter value are snippet and contentDetails.
    * @param {().ChannelSection} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaChannelSection] = js.native
  def insert(callback: BodyResponseCallback[SchemaChannelSection]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannelSection] = js.native
  def insert(params: ParamsResourceChannelsectionsInsert): GaxiosPromise[SchemaChannelSection] = js.native
  def insert(params: ParamsResourceChannelsectionsInsert, callback: BodyResponseCallback[SchemaChannelSection]): Unit = js.native
  def insert(
    params: ParamsResourceChannelsectionsInsert,
    options: BodyResponseCallback[SchemaChannelSection],
    callback: BodyResponseCallback[SchemaChannelSection]
  ): Unit = js.native
  def insert(params: ParamsResourceChannelsectionsInsert, options: MethodOptions): GaxiosPromise[SchemaChannelSection] = js.native
  def insert(
    params: ParamsResourceChannelsectionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannelSection]
  ): Unit = js.native
  
  /**
    * youtube.channelSections.list
    * @desc Returns channelSection resources that match the API request
    * criteria.
    * @alias youtube.channelSections.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.channelId The channelId parameter specifies a YouTube channel ID. The API will only return that channel's channelSections.
    * @param {string=} params.hl The hl parameter indicates that the snippet.localized property values in the returned channelSection resources should be in the specified language if localized values for that language are available. For example, if the API request specifies hl=de, the snippet.localized properties in the API response will contain German titles if German titles are available. Channel owners can provide localized channel section titles using either the channelSections.insert or channelSections.update method.
    * @param {string=} params.id The id parameter specifies a comma-separated list of the YouTube channelSection ID(s) for the resource(s) that are being retrieved. In a channelSection resource, the id property specifies the YouTube channelSection ID.
    * @param {boolean=} params.mine Set this parameter's value to true to retrieve a feed of the authenticated user's channelSections.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more channelSection resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, and contentDetails.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a channelSection resource, the snippet property contains other properties, such as a display title for the channelSection. If you set part=snippet, the API response will also contain all of those nested properties.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChannelSectionListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChannelSectionListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannelSectionListResponse] = js.native
  def list(params: ParamsResourceChannelsectionsList): GaxiosPromise[SchemaChannelSectionListResponse] = js.native
  def list(
    params: ParamsResourceChannelsectionsList,
    callback: BodyResponseCallback[SchemaChannelSectionListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceChannelsectionsList,
    options: BodyResponseCallback[SchemaChannelSectionListResponse],
    callback: BodyResponseCallback[SchemaChannelSectionListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChannelsectionsList, options: MethodOptions): GaxiosPromise[SchemaChannelSectionListResponse] = js.native
  def list(
    params: ParamsResourceChannelsectionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannelSectionListResponse]
  ): Unit = js.native
  
  /**
    * youtube.channelSections.update
    * @desc Update a channelSection.
    * @alias youtube.channelSections.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.  The part names that you can include in the parameter value are snippet and contentDetails.
    * @param {().ChannelSection} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaChannelSection] = js.native
  def update(callback: BodyResponseCallback[SchemaChannelSection]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannelSection] = js.native
  def update(params: ParamsResourceChannelsectionsUpdate): GaxiosPromise[SchemaChannelSection] = js.native
  def update(params: ParamsResourceChannelsectionsUpdate, callback: BodyResponseCallback[SchemaChannelSection]): Unit = js.native
  def update(
    params: ParamsResourceChannelsectionsUpdate,
    options: BodyResponseCallback[SchemaChannelSection],
    callback: BodyResponseCallback[SchemaChannelSection]
  ): Unit = js.native
  def update(params: ParamsResourceChannelsectionsUpdate, options: MethodOptions): GaxiosPromise[SchemaChannelSection] = js.native
  def update(
    params: ParamsResourceChannelsectionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannelSection]
  ): Unit = js.native
}
