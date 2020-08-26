package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Notifications")
@js.native
class ResourceNotifications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.notifications.delete
    * @desc Deletes a notification
    * @alias directory.notifications.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. The customerId is also returned as part of the Users resource.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceNotificationsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceNotificationsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceNotificationsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceNotificationsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceNotificationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.notifications.get
    * @desc Retrieves a notification.
    * @alias directory.notifications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. The customerId is also returned as part of the Users resource.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNotification] = js.native
  def get(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationsGet): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationsGet, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(
    params: ParamsResourceNotificationsGet,
    options: BodyResponseCallback[SchemaNotification],
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  def get(params: ParamsResourceNotificationsGet, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(
    params: ParamsResourceNotificationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  /**
    * directory.notifications.list
    * @desc Retrieves a list of notifications.
    * @alias directory.notifications.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string=} params.language The ISO 639-1 code of the language notifications are returned in. The default is English (en).
    * @param {integer=} params.maxResults Maximum number of notifications to return per page. The default is 100.
    * @param {string=} params.pageToken The token to specify the page of results to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaNotifications] = js.native
  def list(callback: BodyResponseCallback[SchemaNotifications]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotifications] = js.native
  def list(params: ParamsResourceNotificationsList): GaxiosPromise[SchemaNotifications] = js.native
  def list(params: ParamsResourceNotificationsList, callback: BodyResponseCallback[SchemaNotifications]): Unit = js.native
  def list(
    params: ParamsResourceNotificationsList,
    options: BodyResponseCallback[SchemaNotifications],
    callback: BodyResponseCallback[SchemaNotifications]
  ): Unit = js.native
  def list(params: ParamsResourceNotificationsList, options: MethodOptions): GaxiosPromise[SchemaNotifications] = js.native
  def list(
    params: ParamsResourceNotificationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotifications]
  ): Unit = js.native
  /**
    * directory.notifications.patch
    * @desc Updates a notification. This method supports patch semantics.
    * @alias directory.notifications.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {().Notification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaNotification] = js.native
  def patch(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def patch(params: ParamsResourceNotificationsPatch): GaxiosPromise[SchemaNotification] = js.native
  def patch(params: ParamsResourceNotificationsPatch, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def patch(
    params: ParamsResourceNotificationsPatch,
    options: BodyResponseCallback[SchemaNotification],
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  def patch(params: ParamsResourceNotificationsPatch, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def patch(
    params: ParamsResourceNotificationsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  /**
    * directory.notifications.update
    * @desc Updates a notification.
    * @alias directory.notifications.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {().Notification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaNotification] = js.native
  def update(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def update(params: ParamsResourceNotificationsUpdate): GaxiosPromise[SchemaNotification] = js.native
  def update(params: ParamsResourceNotificationsUpdate, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def update(
    params: ParamsResourceNotificationsUpdate,
    options: BodyResponseCallback[SchemaNotification],
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  def update(params: ParamsResourceNotificationsUpdate, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def update(
    params: ParamsResourceNotificationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
}

