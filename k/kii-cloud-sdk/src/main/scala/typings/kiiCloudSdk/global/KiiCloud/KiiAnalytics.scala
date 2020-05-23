package typings.kiiCloudSdk.global.KiiCloud

import typings.kiiCloudSdk.anon.`19`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main SDK class
  */
@JSGlobal("KiiCloud.KiiAnalytics")
@js.native
class KiiAnalytics ()
  extends typings.kiiCloudSdk.KiiCloud.KiiAnalytics

/* static members */
@JSGlobal("KiiCloud.KiiAnalytics")
@js.native
object KiiAnalytics extends js.Object {
  /**
    * Retrieve the current app ID
    *
    * @return The current app ID
    */
  def getAppID(): String = js.native
  /**
    * Retrieve the current app key
    *
    * @return The current app key
    */
  def getAppKey(): String = js.native
  /**
    * Get the deviceId. If deviceId has not specified while initialization, it returns SDK generated deviceId.It is recommended to retrieve the deviceId and store it to identify the device
    * properly.
    *
    * @return deviceId.
    */
  def getDeviceId(): String = js.native
  /**
    *
    *
    * @deprecated Use {@link Kii.getSDKVersion} instead. Kii Analytics SDK Version Number
    *
    * @return current version number of the SDK
    */
  def getSDKVersion(): String = js.native
  /**
    *
    *
    * @deprecated Use {@link Kii.initialize} instead. Initialize the KiiAnalytics SDK
    *
    *   Should be the first KiiAnalytics SDK action your application makes
    *
    * @param appID The application ID found in your Kii developer console
    * @param appKey The application key found in your Kii developer console
    * @param deviceid If deviceId is not provided, SDK generates a new deviceId and use it when upload events. deviceId can be retrieved by {@link KiiAnalytics.getDeviceId()}.It is recommended to
    * retrieve the deviceId and store it to identify the device properly.
    *
    * @example
    *     // initialize without deviceId
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiAnalyticsSite.JP);
    *     // initialize with deviceId
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiAnalyticsSite.JP, "my-device-id");
    */
  def initialize(appID: String, appKey: String, deviceid: String): Unit = js.native
  /**
    *
    *
    * @deprecated Use {@link Kii.initializeWithSite} instead. Initialize the Kii SDK with a specific URL
    *
    *   Should be the first Kii SDK action your application makes
    *
    * @param appID The application ID found in your Kii developer console
    * @param appKey The application key found in your Kii developer console
    * @param site Can be one of the constants KiiAnalyticsSite.US, KiiAnalyticsSite.JP, KiiAnalyticsSite.CN, KiiAnalyticsSite.CN3 or KiiAnalyticsSite.SG depending on your location.
    * @param deviceid If deviceId is not provided, SDK generates a new deviceId and use it when upload events.deviceId can be retrieved by {@link KiiAnalytics.getDeviceId()}.It is recommended to
    * retrieve the deviceId and store it to identify the device properly.
    *
    * @example
    *     // initialize without deviceId
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiAnalyticsSite.JP);
    *     // initialize with deviceId
    *     Kii.initializeWithSite("my-app-id", "my-app-key", KiiAnalyticsSite.JP, "my-device-id");
    */
  def initializeWithSite(
    appID: String,
    appKey: String,
    site: typings.kiiCloudSdk.KiiCloud.KiiAnalyticsSite,
    deviceid: String
  ): Unit = js.native
  /**
    * Is the SDK printing logs to the console?
    *
    * @return True if printing logs, false otherwise
    */
  def isLogging(): Boolean = js.native
  /**
    * Utilize the KiiAnalytics logger to track SDK-specific actions
    *
    *     Helpful for development - we strongly advice you turn off logging for any production code.
    *
    * @param message The message to print to console.log in your browser
    *
    * @example
    *         KiiAnalytics.logger("My message");
    */
  def logger(message: String): Unit = js.native
  /**
    *
    *
    * @deprecated Set a custom API endpoint URL
    *
    * @param url A string containing the desired endpoint
    */
  def setBaseURL(url: String): Unit = js.native
  /**
    * Set the logging status of the SDK
    *
    *     Helpful for development - we strongly advice you turn off logging for any production code.
    *
    * @param True if logs should be printed, false otherwise
    *
    * @example
    *         KiiAnalytics.setLogging(true);
    */
  def setLogging(True: Boolean): Unit = js.native
  /**
    * Log a single event to be uploaded to KiiAnalytics
    *
    * Use this method if you'd like to track an event by name only. If you'd like to track other attributes/dimensions, please use KiiAnalytics.trackEventWithExtras(eventName, parameters)
    *
    * @param eventName A string representing the event name for later tracking
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(). No parameters. </li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    */
  def trackEvent(eventName: String): js.Promise[Unit] = js.native
  /**
    * Log a single event to be uploaded to KiiAnalytics
    *
    * Use this method if you'd like to track an event by name and add extra information to the event.
    *
    * @param eventName A string representing the event name for later tracking
    * @param extras A dictionary of JSON-encodable key/value pairs to be attached to the event.
    *   Key must follow the pattern "^[a-zA-Z][a-zA-Z0-9_]{0,63}$".Supported value type is string, number, boolean and array.
    *   Empty string or empty array will be considered as invalid.Type of array elements must be string, number or boolean.
    *   If any key/value pair is invalid, it will be ignored and not sent to the KiiCloud.
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(). No parameters. </li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    */
  def trackEventWithExtras(eventName: String, extras: js.Any): js.Promise[Unit] = js.native
  /**
    * Log a single event to be uploaded to KiiAnalytics
    *
    * Use this method if you'd like to track an event asynchronously by name and add extra information to the event.
    *
    * @param eventName A string representing the event name for later tracking
    * @param extras A dictionary of JSON-encodable key/value pairs to be attached to the event.
    *   Key must follow the pattern "^[a-zA-Z][a-zA-Z0-9_]{0,63}$".Supported value type is string, number, boolean and array.
    *   Empty string or empty array will be considered as invalid.Type of array elements must be string, number or boolean.
    *   If any key/value pair is invalid, it will be ignored and not sent to the KiiCloud.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *     <ul>
    *       <li>fulfill callback function: function(). No parameters. </li>
    *       <li>reject callback function: function(error). error is an Error instance.
    *         <ul>
    *           <li>error.message</li>
    *         </ul>
    *       </li>
    *     </ul>
    */
  def trackEventWithExtrasAndCallbacks(eventName: String, extras: js.Any): js.Promise[Unit] = js.native
  def trackEventWithExtrasAndCallbacks(eventName: String, extras: js.Any, callbacks: `19`): js.Promise[Unit] = js.native
}

