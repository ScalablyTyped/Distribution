package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Notificationchannels")
@js.native
class ResourceProjectsNotificationchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.notificationChannels.create
    * @desc Creates a new notification channel, representing a single
    * notification endpoint such as an email address, SMS number, or PagerDuty
    * service.
    * @alias monitoring.projects.notificationChannels.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The project on which to execute the request. The format is: projects/[PROJECT_ID] Note that this names the container into which the channel will be written. This does not name the newly created channel. The resulting channel's name will have a normalized version of this field as a prefix, but will add /notificationChannels/[CHANNEL_ID] to identify the channel.
    * @param {().NotificationChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def create(params: ParamsResourceProjectsNotificationchannelsCreate): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    options: BodyResponseCallback[SchemaNotificationChannel],
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsNotificationchannelsCreate, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def create(
    params: ParamsResourceProjectsNotificationchannelsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.delete
    * @desc Deletes a notification channel.
    * @alias monitoring.projects.notificationChannels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.force If true, the notification channel will be deleted regardless of its use in alert policies (the policies will be updated to remove the channel). If false, channels that are still referenced by an existing alerting policy will fail to be deleted in a delete operation.
    * @param {string} params.name The channel for which to execute the request. The format is projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsNotificationchannelsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsNotificationchannelsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsNotificationchannelsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.get
    * @desc Gets a single notification channel. The channel includes the
    * relevant configuration details with which the channel was created.
    * However, the response may truncate or omit passwords, API keys, or other
    * private key matter and thus the response may not be 100% identical to the
    * information that was supplied in the call to the create method.
    * @alias monitoring.projects.notificationChannels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The channel for which to execute the request. The format is projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def get(params: ParamsResourceProjectsNotificationchannelsGet): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    options: BodyResponseCallback[SchemaNotificationChannel],
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotificationchannelsGet, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchannelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.getVerificationCode
    * @desc Requests a verification code for an already verified channel that
    * can then be used in a call to VerifyNotificationChannel() on a different
    * channel with an equivalent identity in the same or in a different
    * project. This makes it possible to copy a channel between projects
    * without requiring manual reverification of the channel. If the channel is
    * not in the verified state, this method will fail (in other words, this
    * may only be used if the SendNotificationChannelVerificationCode and
    * VerifyNotificationChannel paths have already been used to put the given
    * channel into the verified state).There is no guarantee that the
    * verification codes returned by this method will be of a similar structure
    * or form as the ones that are delivered to the channel via
    * SendNotificationChannelVerificationCode; while
    * VerifyNotificationChannel() will recognize both the codes delivered via
    * SendNotificationChannelVerificationCode() and returned from
    * GetNotificationChannelVerificationCode(), it is typically the case that
    * the verification codes delivered via
    * SendNotificationChannelVerificationCode() will be shorter and also have a
    * shorter expiration (e.g. codes such as "G-123456") whereas
    * GetVerificationCode() will typically return a much longer, websafe base
    * 64 encoded string that has a longer expiration time.
    * @alias monitoring.projects.notificationChannels.getVerificationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The notification channel for which a verification code is to be generated and retrieved. This must name a channel that is already verified; if the specified channel is not verified, the request will fail.
    * @param {().GetNotificationChannelVerificationCodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getVerificationCode(): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]): Unit = js.native
  def getVerificationCode(params: ParamsResourceProjectsNotificationchannelsGetverificationcode): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse],
    callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  def getVerificationCode(params: ParamsResourceProjectsNotificationchannelsGetverificationcode, options: MethodOptions): GaxiosPromise[SchemaGetNotificationChannelVerificationCodeResponse] = js.native
  def getVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsGetverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetNotificationChannelVerificationCodeResponse]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.list
    * @desc Lists the notification channels that have been created for the
    * project.
    * @alias monitoring.projects.notificationChannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter If provided, this field specifies the criteria that must be met by notification channels to be included in the response.For more details, see sorting and filtering.
    * @param {string} params.name The project on which to execute the request. The format is projects/[PROJECT_ID]. That is, this names the container in which to look for the notification channels; it does not name a specific channel. To query a specific channel by REST resource name, use the GetNotificationChannel operation.
    * @param {string=} params.orderBy A comma-separated list of fields by which to sort the result. Supports the same set of fields as in filter. Entries can be prefixed with a minus sign to sort in descending rather than ascending order.For more details, see sorting and filtering.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service.
    * @param {string=} params.pageToken If non-empty, page_token must contain a value returned as the next_page_token in a previous response to request the next set of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsNotificationchannelsList): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    options: BodyResponseCallback[SchemaListNotificationChannelsResponse],
    callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotificationchannelsList, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchannelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotificationChannelsResponse]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.patch
    * @desc Updates a notification channel. Fields not specified in the field
    * mask remain unchanged.
    * @alias monitoring.projects.notificationChannels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The full REST resource name for this channel. The syntax is: projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID] The [CHANNEL_ID] is automatically assigned by the server on creation.
    * @param {string=} params.updateMask The fields to update.
    * @param {().NotificationChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def patch(params: ParamsResourceProjectsNotificationchannelsPatch): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    options: BodyResponseCallback[SchemaNotificationChannel],
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsNotificationchannelsPatch, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def patch(
    params: ParamsResourceProjectsNotificationchannelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.sendVerificationCode
    * @desc Causes a verification code to be delivered to the channel. The code
    * can then be supplied in VerifyNotificationChannel to verify the channel.
    * @alias monitoring.projects.notificationChannels.sendVerificationCode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The notification channel to which to send a verification code.
    * @param {().SendNotificationChannelVerificationCodeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendVerificationCode(): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def sendVerificationCode(params: ParamsResourceProjectsNotificationchannelsSendverificationcode): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def sendVerificationCode(params: ParamsResourceProjectsNotificationchannelsSendverificationcode, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def sendVerificationCode(
    params: ParamsResourceProjectsNotificationchannelsSendverificationcode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * monitoring.projects.notificationChannels.verify
    * @desc Verifies a NotificationChannel by proving receipt of the code
    * delivered to the channel as a result of calling
    * SendNotificationChannelVerificationCode.
    * @alias monitoring.projects.notificationChannels.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The notification channel to verify.
    * @param {().VerifyNotificationChannelRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(callback: BodyResponseCallback[SchemaNotificationChannel]): Unit = js.native
  def verify(params: ParamsResourceProjectsNotificationchannelsVerify): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    options: BodyResponseCallback[SchemaNotificationChannel],
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
  def verify(params: ParamsResourceProjectsNotificationchannelsVerify, options: MethodOptions): GaxiosPromise[SchemaNotificationChannel] = js.native
  def verify(
    params: ParamsResourceProjectsNotificationchannelsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannel]
  ): Unit = js.native
}

