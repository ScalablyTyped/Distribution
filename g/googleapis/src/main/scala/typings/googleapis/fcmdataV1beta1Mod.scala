package typings.googleapis

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleAuthLibrary.googleauthMod.JSONClient
import typings.googleapis.googleapisStrings.v1beta1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.googleapisCommon.mod.BaseExternalAccountClient
import typings.googleapisCommon.mod.Compute
import typings.googleapisCommon.mod.GoogleAuth
import typings.googleapisCommon.mod.JWT
import typings.googleapisCommon.mod.OAuth2Client
import typings.googleapisCommon.mod.UserRefreshClient
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fcmdataV1beta1Mod {
  
  object fcmdataV1beta1 {
    
    @JSImport("googleapis/build/src/apis/fcmdata/v1beta1", "fcmdata_v1beta1.Fcmdata")
    @js.native
    open class Fcmdata protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
      
      var projects: ResourceProjects = js.native
    }
    
    @JSImport("googleapis/build/src/apis/fcmdata/v1beta1", "fcmdata_v1beta1.Resource$Projects")
    @js.native
    open class ResourceProjects protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var androidApps: ResourceProjectsAndroidapps = js.native
      
      var context: APIRequestContext = js.native
    }
    
    @JSImport("googleapis/build/src/apis/fcmdata/v1beta1", "fcmdata_v1beta1.Resource$Projects$Androidapps")
    @js.native
    open class ResourceProjectsAndroidapps protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      var deliveryData: ResourceProjectsAndroidappsDeliverydata = js.native
    }
    
    @JSImport("googleapis/build/src/apis/fcmdata/v1beta1", "fcmdata_v1beta1.Resource$Projects$Androidapps$Deliverydata")
    @js.native
    open class ResourceProjectsAndroidappsDeliverydata protected () extends StObject {
      def this(context: APIRequestContext) = this()
      
      var context: APIRequestContext = js.native
      
      def list(): GaxiosPromise[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse] = js.native
      def list(callback: BodyResponseCallback[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse]): Unit = js.native
      def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse] = js.native
      def list(params: ParamsResourceProjectsAndroidappsDeliverydataList): GaxiosPromise[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse] = js.native
      def list(
        params: ParamsResourceProjectsAndroidappsDeliverydataList,
        callback: BodyResponseCallback[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse]
      ): Unit = js.native
      def list(
        params: ParamsResourceProjectsAndroidappsDeliverydataList,
        options: BodyResponseCallback[Readable | SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse],
        callback: BodyResponseCallback[Readable | SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse]
      ): Unit = js.native
      def list(params: ParamsResourceProjectsAndroidappsDeliverydataList, options: MethodOptions): GaxiosPromise[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse] = js.native
      def list(
        params: ParamsResourceProjectsAndroidappsDeliverydataList,
        options: MethodOptions,
        callback: BodyResponseCallback[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse]
      ): Unit = js.native
      /**
        * List aggregate delivery data for the given Android application.
        * @example
        * ```js
        * // Before running the sample:
        * // - Enable the API at:
        * //   https://console.developers.google.com/apis/api/fcmdata.googleapis.com
        * // - Login into gcloud by running:
        * //   `$ gcloud auth application-default login`
        * // - Install the npm module by running:
        * //   `$ npm install googleapis`
        *
        * const {google} = require('googleapis');
        * const fcmdata = google.fcmdata('v1beta1');
        *
        * async function main() {
        *   const auth = new google.auth.GoogleAuth({
        *     // Scopes can be specified either as an array or as a single, space-delimited string.
        *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
        *   });
        *
        *   // Acquire an auth client, and bind it to all future calls
        *   const authClient = await auth.getClient();
        *   google.options({auth: authClient});
        *
        *   // Do the magic
        *   const res = await fcmdata.projects.androidApps.deliveryData.list({
        *     // The maximum number of entries to return. The service may return fewer than this value. If unspecified, at most 1,000 entries will be returned. The maximum value is 10,000; values above 10,000 will be capped to 10,000. This default may change over time.
        *     pageSize: 'placeholder-value',
        *     // A page token, received from a previous `ListAndroidDeliveryDataRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAndroidDeliveryDataRequest` must match the call that provided the page token.
        *     pageToken: 'placeholder-value',
        *     // Required. The application for which to list delivery data. Format: `projects/{project_id\}/androidApps/{app_id\}`
        *     parent: 'projects/my-project/androidApps/my-androidApp',
        *   });
        *   console.log(res.data);
        *
        *   // Example response
        *   // {
        *   //   "androidDeliveryData": [],
        *   //   "nextPageToken": "my_nextPageToken"
        *   // }
        * }
        *
        * main().catch(e => {
        *   console.error(e);
        *   throw e;
        * });
        *
        * ```
        *
        * @param params - Parameters for request
        * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
        * @param callback - Optional callback that handles the response.
        * @returns A promise if used with async/await, or void if used with a callback.
        */
      def list(params: ParamsResourceProjectsAndroidappsDeliverydataList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
      def list(
        params: ParamsResourceProjectsAndroidappsDeliverydataList,
        options: StreamMethodOptions,
        callback: BodyResponseCallback[Readable]
      ): Unit = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1beta1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1beta1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1beta1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    trait ParamsResourceProjectsAndroidappsDeliverydataList
      extends StObject
         with StandardParameters {
      
      /**
        * The maximum number of entries to return. The service may return fewer than this value. If unspecified, at most 1,000 entries will be returned. The maximum value is 10,000; values above 10,000 will be capped to 10,000. This default may change over time.
        */
      var pageSize: js.UndefOr[Double] = js.undefined
      
      /**
        * A page token, received from a previous `ListAndroidDeliveryDataRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAndroidDeliveryDataRequest` must match the call that provided the page token.
        */
      var pageToken: js.UndefOr[String] = js.undefined
      
      /**
        * Required. The application for which to list delivery data. Format: `projects/{project_id\}/androidApps/{app_id\}`
        */
      var parent: js.UndefOr[String] = js.undefined
    }
    object ParamsResourceProjectsAndroidappsDeliverydataList {
      
      inline def apply(): ParamsResourceProjectsAndroidappsDeliverydataList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParamsResourceProjectsAndroidappsDeliverydataList]
      }
      
      extension [Self <: ParamsResourceProjectsAndroidappsDeliverydataList](x: Self) {
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData extends StObject {
      
      /**
        * The analytics label associated with the messages sent. All messages sent without an analytics label will be grouped together in a single entry.
        */
      var analyticsLabel: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The app ID to which the messages were sent.
        */
      var appId: js.UndefOr[String | Null] = js.undefined
      
      /**
        * The data for the specified appId, date, and analyticsLabel.
        */
      var data: js.UndefOr[SchemaGoogleFirebaseFcmDataV1beta1Data] = js.undefined
      
      /**
        * The date represented by this entry.
        */
      var date: js.UndefOr[SchemaGoogleTypeDate] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData](x: Self) {
        
        inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
        
        inline def setAnalyticsLabelNull: Self = StObject.set(x, "analyticsLabel", null)
        
        inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
        
        inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
        
        inline def setAppIdNull: Self = StObject.set(x, "appId", null)
        
        inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
        
        inline def setData(value: SchemaGoogleFirebaseFcmDataV1beta1Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDate(value: SchemaGoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1Data extends StObject {
      
      /**
        * Count of messages accepted by FCM intended to Android devices. The targeted device must have opted in to the collection of usage and diagnostic information.
        */
      var countMessagesAccepted: js.UndefOr[String | Null] = js.undefined
      
      /**
        * Additional information about delivery performance for messages that were successfully delivered.
        */
      var deliveryPerformancePercents: js.UndefOr[SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents] = js.undefined
      
      /**
        * Additional general insights about message delivery.
        */
      var messageInsightPercents: js.UndefOr[SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents] = js.undefined
      
      /**
        * Mutually exclusive breakdown of message delivery outcomes.
        */
      var messageOutcomePercents: js.UndefOr[SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1Data {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1Data = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1Data]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1Data](x: Self) {
        
        inline def setCountMessagesAccepted(value: String): Self = StObject.set(x, "countMessagesAccepted", value.asInstanceOf[js.Any])
        
        inline def setCountMessagesAcceptedNull: Self = StObject.set(x, "countMessagesAccepted", null)
        
        inline def setCountMessagesAcceptedUndefined: Self = StObject.set(x, "countMessagesAccepted", js.undefined)
        
        inline def setDeliveryPerformancePercents(value: SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents): Self = StObject.set(x, "deliveryPerformancePercents", value.asInstanceOf[js.Any])
        
        inline def setDeliveryPerformancePercentsUndefined: Self = StObject.set(x, "deliveryPerformancePercents", js.undefined)
        
        inline def setMessageInsightPercents(value: SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents): Self = StObject.set(x, "messageInsightPercents", value.asInstanceOf[js.Any])
        
        inline def setMessageInsightPercentsUndefined: Self = StObject.set(x, "messageInsightPercents", js.undefined)
        
        inline def setMessageOutcomePercents(value: SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents): Self = StObject.set(x, "messageOutcomePercents", value.asInstanceOf[js.Any])
        
        inline def setMessageOutcomePercentsUndefined: Self = StObject.set(x, "messageOutcomePercents", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents extends StObject {
      
      /**
        * The percentage of accepted messages that were delayed because the device was in doze mode. Only [normal priority messages](https://firebase.google.com/docs/cloud-messaging/concept-options#setting-the-priority-of-a-message) should be delayed due to doze mode.
        */
      var delayedDeviceDoze: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were delayed because the target device was not connected at the time of sending. These messages were eventually delivered when the device reconnected.
        */
      var delayedDeviceOffline: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were delayed due to message throttling, such as [collapsible message throttling](https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_throttling) or [maximum message rate throttling](https://firebase.google.com/docs/cloud-messaging/concept-options#device_throttling).
        */
      var delayedMessageThrottled: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were delayed because the intended device user-profile was [stopped](https://firebase.google.com/docs/cloud-messaging/android/receive#handling_messages) on the target device at the time of the send. The messages were eventually delivered when the user-profile was started again.
        */
      var delayedUserStopped: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were delivered to the device without delay from the FCM system.
        */
      var deliveredNoDelay: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1DeliveryPerformancePercents](x: Self) {
        
        inline def setDelayedDeviceDoze(value: Double): Self = StObject.set(x, "delayedDeviceDoze", value.asInstanceOf[js.Any])
        
        inline def setDelayedDeviceDozeNull: Self = StObject.set(x, "delayedDeviceDoze", null)
        
        inline def setDelayedDeviceDozeUndefined: Self = StObject.set(x, "delayedDeviceDoze", js.undefined)
        
        inline def setDelayedDeviceOffline(value: Double): Self = StObject.set(x, "delayedDeviceOffline", value.asInstanceOf[js.Any])
        
        inline def setDelayedDeviceOfflineNull: Self = StObject.set(x, "delayedDeviceOffline", null)
        
        inline def setDelayedDeviceOfflineUndefined: Self = StObject.set(x, "delayedDeviceOffline", js.undefined)
        
        inline def setDelayedMessageThrottled(value: Double): Self = StObject.set(x, "delayedMessageThrottled", value.asInstanceOf[js.Any])
        
        inline def setDelayedMessageThrottledNull: Self = StObject.set(x, "delayedMessageThrottled", null)
        
        inline def setDelayedMessageThrottledUndefined: Self = StObject.set(x, "delayedMessageThrottled", js.undefined)
        
        inline def setDelayedUserStopped(value: Double): Self = StObject.set(x, "delayedUserStopped", value.asInstanceOf[js.Any])
        
        inline def setDelayedUserStoppedNull: Self = StObject.set(x, "delayedUserStopped", null)
        
        inline def setDelayedUserStoppedUndefined: Self = StObject.set(x, "delayedUserStopped", js.undefined)
        
        inline def setDeliveredNoDelay(value: Double): Self = StObject.set(x, "deliveredNoDelay", value.asInstanceOf[js.Any])
        
        inline def setDeliveredNoDelayNull: Self = StObject.set(x, "deliveredNoDelay", null)
        
        inline def setDeliveredNoDelayUndefined: Self = StObject.set(x, "deliveredNoDelay", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse extends StObject {
      
      /**
        * The delivery data for the provided app. There will be one entry per combination of app, date, and analytics label.
        */
      var androidDeliveryData: js.UndefOr[js.Array[SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData]] = js.undefined
      
      /**
        * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
        */
      var nextPageToken: js.UndefOr[String | Null] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1ListAndroidDeliveryDataResponse](x: Self) {
        
        inline def setAndroidDeliveryData(value: js.Array[SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData]): Self = StObject.set(x, "androidDeliveryData", value.asInstanceOf[js.Any])
        
        inline def setAndroidDeliveryDataUndefined: Self = StObject.set(x, "androidDeliveryData", js.undefined)
        
        inline def setAndroidDeliveryDataVarargs(value: SchemaGoogleFirebaseFcmDataV1beta1AndroidDeliveryData*): Self = StObject.set(x, "androidDeliveryData", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents extends StObject {
      
      /**
        * The percentage of accepted messages that had their priority lowered from high to normal. See [documentation for setting message priority](https://firebase.google.com/docs/cloud-messaging/android/message-priority).
        */
      var priorityLowered: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1MessageInsightPercents](x: Self) {
        
        inline def setPriorityLowered(value: Double): Self = StObject.set(x, "priorityLowered", value.asInstanceOf[js.Any])
        
        inline def setPriorityLoweredNull: Self = StObject.set(x, "priorityLowered", null)
        
        inline def setPriorityLoweredUndefined: Self = StObject.set(x, "priorityLowered", js.undefined)
      }
    }
    
    trait SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents extends StObject {
      
      /**
        * The percentage of all accepted messages that were successfully delivered to the device.
        */
      var delivered: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were dropped because the application was force stopped on the device at the time of delivery and retries were unsuccessful.
        */
      var droppedAppForceStopped: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were dropped because the target device is inactive. FCM will drop messages if the target device is deemed inactive by our servers. If a device does reconnect, we call [OnDeletedMessages()](https://firebase.google.com/docs/cloud-messaging/android/receive#override-ondeletedmessages) in our SDK instead of delivering the messages.
        */
      var droppedDeviceInactive: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of accepted messages that were dropped due to [too many undelivered non-collapsible messages](https://firebase.google.com/docs/cloud-messaging/concept-options#collapsible_and_non-collapsible_messages). Specifically, each app instance can only have 100 pending messages stored on our servers for a device which is disconnected. When that device reconnects, those messages are delivered. When there are more than the maximum pending messages, we call [OnDeletedMessages()](https://firebase.google.com/docs/cloud-messaging/android/receive#override-ondeletedmessages) in our SDK instead of delivering the messages.
        */
      var droppedTooManyPendingMessages: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * The percentage of messages accepted on this day that were not dropped and not delivered, due to the device being disconnected (as of the end of the America/Los_Angeles day when the message was sent to FCM). A portion of these messages will be delivered the next day when the device connects but others may be destined to devices that ultimately never reconnect.
        */
      var pending: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents {
      
      inline def apply(): SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents]
      }
      
      extension [Self <: SchemaGoogleFirebaseFcmDataV1beta1MessageOutcomePercents](x: Self) {
        
        inline def setDelivered(value: Double): Self = StObject.set(x, "delivered", value.asInstanceOf[js.Any])
        
        inline def setDeliveredNull: Self = StObject.set(x, "delivered", null)
        
        inline def setDeliveredUndefined: Self = StObject.set(x, "delivered", js.undefined)
        
        inline def setDroppedAppForceStopped(value: Double): Self = StObject.set(x, "droppedAppForceStopped", value.asInstanceOf[js.Any])
        
        inline def setDroppedAppForceStoppedNull: Self = StObject.set(x, "droppedAppForceStopped", null)
        
        inline def setDroppedAppForceStoppedUndefined: Self = StObject.set(x, "droppedAppForceStopped", js.undefined)
        
        inline def setDroppedDeviceInactive(value: Double): Self = StObject.set(x, "droppedDeviceInactive", value.asInstanceOf[js.Any])
        
        inline def setDroppedDeviceInactiveNull: Self = StObject.set(x, "droppedDeviceInactive", null)
        
        inline def setDroppedDeviceInactiveUndefined: Self = StObject.set(x, "droppedDeviceInactive", js.undefined)
        
        inline def setDroppedTooManyPendingMessages(value: Double): Self = StObject.set(x, "droppedTooManyPendingMessages", value.asInstanceOf[js.Any])
        
        inline def setDroppedTooManyPendingMessagesNull: Self = StObject.set(x, "droppedTooManyPendingMessages", null)
        
        inline def setDroppedTooManyPendingMessagesUndefined: Self = StObject.set(x, "droppedTooManyPendingMessages", js.undefined)
        
        inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
        
        inline def setPendingNull: Self = StObject.set(x, "pending", null)
        
        inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      }
    }
    
    trait SchemaGoogleTypeDate extends StObject {
      
      /**
        * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
        */
      var day: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
        */
      var month: js.UndefOr[Double | Null] = js.undefined
      
      /**
        * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
        */
      var year: js.UndefOr[Double | Null] = js.undefined
    }
    object SchemaGoogleTypeDate {
      
      inline def apply(): SchemaGoogleTypeDate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SchemaGoogleTypeDate]
      }
      
      extension [Self <: SchemaGoogleTypeDate](x: Self) {
        
        inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        inline def setDayNull: Self = StObject.set(x, "day", null)
        
        inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        inline def setMonthNull: Self = StObject.set(x, "month", null)
        
        inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        inline def setYearNull: Self = StObject.set(x, "year", null)
        
        inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    trait StandardParameters extends StObject {
      
      /**
        * V1 error format.
        */
      @JSName("$.xgafv")
      var $Dotxgafv: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth access token.
        */
      var access_token: js.UndefOr[String] = js.undefined
      
      /**
        * Data format for response.
        */
      var alt: js.UndefOr[String] = js.undefined
      
      /**
        * Auth client or API Key for the request
        */
      var auth: js.UndefOr[
            String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
          ] = js.undefined
      
      /**
        * JSONP
        */
      var callback: js.UndefOr[String] = js.undefined
      
      /**
        * Selector specifying which fields to include in a partial response.
        */
      var fields: js.UndefOr[String] = js.undefined
      
      /**
        * API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token.
        */
      var key: js.UndefOr[String] = js.undefined
      
      /**
        * OAuth 2.0 token for the current user.
        */
      var oauth_token: js.UndefOr[String] = js.undefined
      
      /**
        * Returns response with indentations and line breaks.
        */
      var prettyPrint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
        */
      var quotaUser: js.UndefOr[String] = js.undefined
      
      /**
        * Legacy upload protocol for media (e.g. "media", "multipart").
        */
      var uploadType: js.UndefOr[String] = js.undefined
      
      /**
        * Upload protocol for media (e.g. "raw", "multipart").
        */
      var upload_protocol: js.UndefOr[String] = js.undefined
    }
    object StandardParameters {
      
      inline def apply(): StandardParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StandardParameters]
      }
      
      extension [Self <: StandardParameters](x: Self) {
        
        inline def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
        
        inline def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
        
        inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
        
        inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
        
        inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
        
        inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
        
        inline def setAuth(
          value: String | OAuth2Client | JWT | Compute | UserRefreshClient | BaseExternalAccountClient | GoogleAuth[JSONClient]
        ): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
        
        inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
        
        inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
        
        inline def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
        
        inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
        
        inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
        
        inline def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
        
        inline def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
        
        inline def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
        
        inline def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
        
        inline def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
        
        inline def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
      }
    }
  }
}
