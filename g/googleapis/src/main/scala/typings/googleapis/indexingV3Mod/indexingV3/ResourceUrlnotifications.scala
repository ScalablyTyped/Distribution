package typings.googleapis.indexingV3Mod.indexingV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Resource$Urlnotifications")
@js.native
class ResourceUrlnotifications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * indexing.urlNotifications.getMetadata
    * @desc Gets metadata about a Web Document. This method can _only_ be used
    * to query URLs that were previously seen in successful Indexing API
    * notifications. Includes the latest `UrlNotification` received via this
    * API.
    * @alias indexing.urlNotifications.getMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.url URL that is being queried.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetadata(): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
  def getMetadata(callback: BodyResponseCallback[SchemaUrlNotificationMetadata]): Unit = js.native
  def getMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
  def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
  def getMetadata(
    params: ParamsResourceUrlnotificationsGetmetadata,
    callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
  ): Unit = js.native
  def getMetadata(
    params: ParamsResourceUrlnotificationsGetmetadata,
    options: BodyResponseCallback[SchemaUrlNotificationMetadata],
    callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
  ): Unit = js.native
  def getMetadata(params: ParamsResourceUrlnotificationsGetmetadata, options: MethodOptions): GaxiosPromise[SchemaUrlNotificationMetadata] = js.native
  def getMetadata(
    params: ParamsResourceUrlnotificationsGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlNotificationMetadata]
  ): Unit = js.native
  /**
    * indexing.urlNotifications.publish
    * @desc Notifies that a URL has been updated or deleted.
    * @alias indexing.urlNotifications.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UrlNotification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
  def publish(callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]): Unit = js.native
  def publish(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
  def publish(params: ParamsResourceUrlnotificationsPublish): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
  def publish(
    params: ParamsResourceUrlnotificationsPublish,
    callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
  ): Unit = js.native
  def publish(
    params: ParamsResourceUrlnotificationsPublish,
    options: BodyResponseCallback[SchemaPublishUrlNotificationResponse],
    callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
  ): Unit = js.native
  def publish(params: ParamsResourceUrlnotificationsPublish, options: MethodOptions): GaxiosPromise[SchemaPublishUrlNotificationResponse] = js.native
  def publish(
    params: ParamsResourceUrlnotificationsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPublishUrlNotificationResponse]
  ): Unit = js.native
}

