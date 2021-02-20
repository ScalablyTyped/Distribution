package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Notificationchanneldescriptors")
@js.native
class ResourceProjectsNotificationchanneldescriptors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.projects.notificationChannelDescriptors.get
    * @desc Gets a single channel descriptor. The descriptor indicates which
    * fields are expected / permitted for a notification channel of the given
    * type.
    * @alias monitoring.projects.notificationChannelDescriptors.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The channel type for which to execute the request. The format is projects/[PROJECT_ID]/notificationChannelDescriptors/{channel_type}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(params: ParamsResourceProjectsNotificationchanneldescriptorsGet): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    options: BodyResponseCallback[SchemaNotificationChannelDescriptor],
    callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsNotificationchanneldescriptorsGet, options: MethodOptions): GaxiosPromise[SchemaNotificationChannelDescriptor] = js.native
  def get(
    params: ParamsResourceProjectsNotificationchanneldescriptorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotificationChannelDescriptor]
  ): Unit = js.native
  
  /**
    * monitoring.projects.notificationChannelDescriptors.list
    * @desc Lists the descriptors for supported channel types. The use of
    * descriptors makes it possible for new channel types to be dynamically
    * added.
    * @alias monitoring.projects.notificationChannelDescriptors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The REST resource name of the parent from which to retrieve the notification channel descriptors. The expected syntax is: projects/[PROJECT_ID] Note that this names the parent container in which to look for the descriptors; to retrieve a single descriptor by name, use the GetNotificationChannelDescriptor operation, instead.
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. If not set to a positive number, a reasonable value will be chosen by the service.
    * @param {string=} params.pageToken If non-empty, page_token must contain a value returned as the next_page_token in a previous response to request the next set of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(params: ParamsResourceProjectsNotificationchanneldescriptorsList): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    options: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse],
    callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsNotificationchanneldescriptorsList, options: MethodOptions): GaxiosPromise[SchemaListNotificationChannelDescriptorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsNotificationchanneldescriptorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNotificationChannelDescriptorsResponse]
  ): Unit = js.native
}
