package typings.mauron85ReactNativeBackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureOptions extends StObject {
  
  /**
    * Rate in milliseconds at which activity recognition occurs.
    * Larger values will result in fewer activity detections while improving battery life.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 10000
    */
  var activitiesInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Activity type.
    * Presumably, this affects iOS GPS algorithm.
    *
    * Possible values:
    * "AutomotiveNavigation", "OtherNavigation", "Fitness", "Other"
    *
    * Platform: iOS
    * Provider: all
    *
    * @default "OtherNavigation"
    * @see {@link https://apple.co/2oHofpH|Apple docs}
    */
  var activityType: js.UndefOr[iOSActivityType] = js.undefined
  
  /**
    * When enabled, the plugin will emit sounds for life-cycle events of background-geolocation! See debugging sounds table.
    *
    * Platform: all
    * Provider: all
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Desired accuracy in meters.
    *
    * Platform: all
    * Provider: all
    * Possible values:
    *  HIGH_ACCURACY,
    *  MEDIUM_ACCURACY,
    *  LOW_ACCURACY,
    *  PASSIVE_ACCURACY
    * Note: Accuracy has direct effect on power drain. Lower accuracy = lower power drain.
    *
    * @default MEDIUM_ACCURACY
    * @example
    * { desiredAccuracy: BackgroundGeolocation.LOW_ACCURACY }
    */
  var desiredAccuracy: js.UndefOr[AccuracyLevel] = js.undefined
  
  /**
    * The minimum distance (measured in meters) a device must move horizontally before an update event is generated.
    *
    * Platform: all
    * Provider: DISTANCE_FILTER, RAW
    *
    * @default 500
    * @see {@link https://apple.co/2oHo2CV|Apple docs}
    */
  var distanceFilter: js.UndefOr[Double] = js.undefined
  
  /**
    * Fastest rate in milliseconds at which your app can handle location updates.
    *
    * Platform: Android
    * Provider: ACTIVITY
    *
    * @default 120000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var fastestInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional HTTP headers sent along in HTTP request.
    *
    * Platform: all
    * Provider: all
    */
  var httpHeaders: js.UndefOr[Any] = js.undefined
  
  /**
    * The minimum time interval between location updates in milliseconds.
    *
    * Platform: Android
    * Provider: all
    *
    * @default 60000
    * @see {@link https://bit.ly/1x00RUu|Android docs}
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Set location provider
    *
    * Platform: all
    * Available providers:
    *  DISTANCE_FILTER_PROVIDER,
    *  ACTIVITY_PROVIDER
    *  RAW_PROVIDER
    *
    * @default DISTANCE_FILTER_PROVIDER
    * @example
    * { locationProvider: BackgroundGeolocation.RAW_PROVIDER }
    */
  var locationProvider: js.UndefOr[LocationProvider] = js.undefined
  
  /**
    * Limit maximum number of locations stored into db.
    *
    * Platform: all
    * Provider: all
    *
    * @default 10000
    */
  var maxLocations: js.UndefOr[Double] = js.undefined
  
  /**
    * The accent color (hex triplet) to use for notification.
    * Eg. <code>#4CAF50</code>.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconColor: js.UndefOr[String] = js.undefined
  
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconLarge: js.UndefOr[String] = js.undefined
  
  /**
    * The filename of a custom notification icon.
    *
    * Platform: Android
    * Provider: all
    */
  var notificationIconSmall: js.UndefOr[String] = js.undefined
  
  /**
    * Custom notification text in the drawer.
    *
    * Platform: Android
    * Provider: all
    *
    * @default "ENABLED"
    */
  var notificationText: js.UndefOr[String] = js.undefined
  
  /**
    * Custom notification title in the drawer.
    *
    * Platform: Android
    * Provider: all
    * @default "Background tracking"
    */
  var notificationTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Enable/disable local notifications when tracking and syncing locations.
    *
    * Platform: Android
    * Provider: all
    *
    * @default true
    */
  var notificationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pauses location updates when app is paused.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    * @see {@link https://apple.co/2CbjEW2|Apple docs}
    */
  var pauseLocationUpdates: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customization post template.
    *
    * Platform: all
    * Provider: all
    */
  var postTemplate: js.UndefOr[Any] = js.undefined
  
  /**
    * Switch to less accurate significant changes and region monitory when in background.
    *
    * Platform: iOS
    * Provider: all
    *
    * @default false
    */
  var saveBatteryOnBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow location sync service to run in foreground state.
    * Foreground state also requires a notification to be presented to the user.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startForeground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Start background service on device boot.
    *
    * Platform: Android
    * Provider: all
    *
    * @default false
    */
  var startOnBoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Stationary radius in meters.
    *
    * When stopped, the minimum distance the device must move beyond the stationary location for aggressive background-tracking to engage.
    * Platform: all
    * Provider: DISTANCE_FILTER
    *
    * @default 50
    */
  var stationaryRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated Stop location updates, when the STILL activity is detected.
    */
  var stopOnStillActivity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable this in order to force a stop() when the application terminated.
    * E.g. on iOS, double-tap home button, swipe away the app.
    *
    * Platform: all
    * Provider: all
    *
    * @default true
    */
  var stopOnTerminate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how many previously failed locations will be sent to server at once.
    *
    * Platform: all
    * Provider: all
    *
    * @default 100
    */
  var syncThreshold: js.UndefOr[String] = js.undefined
  
  /**
    * Server url where to send fail to post locations
    *
    * Platform: all
    * Provider: all
    */
  var syncUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Server url where to send HTTP POST with recorded locations
    *
    * Platform: all
    * Provider: all
    */
  var url: js.UndefOr[String] = js.undefined
}
object ConfigureOptions {
  
  inline def apply(): ConfigureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  extension [Self <: ConfigureOptions](x: Self) {
    
    inline def setActivitiesInterval(value: Double): Self = StObject.set(x, "activitiesInterval", value.asInstanceOf[js.Any])
    
    inline def setActivitiesIntervalUndefined: Self = StObject.set(x, "activitiesInterval", js.undefined)
    
    inline def setActivityType(value: iOSActivityType): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    inline def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDesiredAccuracy(value: AccuracyLevel): Self = StObject.set(x, "desiredAccuracy", value.asInstanceOf[js.Any])
    
    inline def setDesiredAccuracyUndefined: Self = StObject.set(x, "desiredAccuracy", js.undefined)
    
    inline def setDistanceFilter(value: Double): Self = StObject.set(x, "distanceFilter", value.asInstanceOf[js.Any])
    
    inline def setDistanceFilterUndefined: Self = StObject.set(x, "distanceFilter", js.undefined)
    
    inline def setFastestInterval(value: Double): Self = StObject.set(x, "fastestInterval", value.asInstanceOf[js.Any])
    
    inline def setFastestIntervalUndefined: Self = StObject.set(x, "fastestInterval", js.undefined)
    
    inline def setHttpHeaders(value: Any): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLocationProvider(value: LocationProvider): Self = StObject.set(x, "locationProvider", value.asInstanceOf[js.Any])
    
    inline def setLocationProviderUndefined: Self = StObject.set(x, "locationProvider", js.undefined)
    
    inline def setMaxLocations(value: Double): Self = StObject.set(x, "maxLocations", value.asInstanceOf[js.Any])
    
    inline def setMaxLocationsUndefined: Self = StObject.set(x, "maxLocations", js.undefined)
    
    inline def setNotificationIconColor(value: String): Self = StObject.set(x, "notificationIconColor", value.asInstanceOf[js.Any])
    
    inline def setNotificationIconColorUndefined: Self = StObject.set(x, "notificationIconColor", js.undefined)
    
    inline def setNotificationIconLarge(value: String): Self = StObject.set(x, "notificationIconLarge", value.asInstanceOf[js.Any])
    
    inline def setNotificationIconLargeUndefined: Self = StObject.set(x, "notificationIconLarge", js.undefined)
    
    inline def setNotificationIconSmall(value: String): Self = StObject.set(x, "notificationIconSmall", value.asInstanceOf[js.Any])
    
    inline def setNotificationIconSmallUndefined: Self = StObject.set(x, "notificationIconSmall", js.undefined)
    
    inline def setNotificationText(value: String): Self = StObject.set(x, "notificationText", value.asInstanceOf[js.Any])
    
    inline def setNotificationTextUndefined: Self = StObject.set(x, "notificationText", js.undefined)
    
    inline def setNotificationTitle(value: String): Self = StObject.set(x, "notificationTitle", value.asInstanceOf[js.Any])
    
    inline def setNotificationTitleUndefined: Self = StObject.set(x, "notificationTitle", js.undefined)
    
    inline def setNotificationsEnabled(value: Boolean): Self = StObject.set(x, "notificationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setNotificationsEnabledUndefined: Self = StObject.set(x, "notificationsEnabled", js.undefined)
    
    inline def setPauseLocationUpdates(value: Boolean): Self = StObject.set(x, "pauseLocationUpdates", value.asInstanceOf[js.Any])
    
    inline def setPauseLocationUpdatesUndefined: Self = StObject.set(x, "pauseLocationUpdates", js.undefined)
    
    inline def setPostTemplate(value: Any): Self = StObject.set(x, "postTemplate", value.asInstanceOf[js.Any])
    
    inline def setPostTemplateUndefined: Self = StObject.set(x, "postTemplate", js.undefined)
    
    inline def setSaveBatteryOnBackground(value: Boolean): Self = StObject.set(x, "saveBatteryOnBackground", value.asInstanceOf[js.Any])
    
    inline def setSaveBatteryOnBackgroundUndefined: Self = StObject.set(x, "saveBatteryOnBackground", js.undefined)
    
    inline def setStartForeground(value: Boolean): Self = StObject.set(x, "startForeground", value.asInstanceOf[js.Any])
    
    inline def setStartForegroundUndefined: Self = StObject.set(x, "startForeground", js.undefined)
    
    inline def setStartOnBoot(value: Boolean): Self = StObject.set(x, "startOnBoot", value.asInstanceOf[js.Any])
    
    inline def setStartOnBootUndefined: Self = StObject.set(x, "startOnBoot", js.undefined)
    
    inline def setStationaryRadius(value: Double): Self = StObject.set(x, "stationaryRadius", value.asInstanceOf[js.Any])
    
    inline def setStationaryRadiusUndefined: Self = StObject.set(x, "stationaryRadius", js.undefined)
    
    inline def setStopOnStillActivity(value: Boolean): Self = StObject.set(x, "stopOnStillActivity", value.asInstanceOf[js.Any])
    
    inline def setStopOnStillActivityUndefined: Self = StObject.set(x, "stopOnStillActivity", js.undefined)
    
    inline def setStopOnTerminate(value: Boolean): Self = StObject.set(x, "stopOnTerminate", value.asInstanceOf[js.Any])
    
    inline def setStopOnTerminateUndefined: Self = StObject.set(x, "stopOnTerminate", js.undefined)
    
    inline def setSyncThreshold(value: String): Self = StObject.set(x, "syncThreshold", value.asInstanceOf[js.Any])
    
    inline def setSyncThresholdUndefined: Self = StObject.set(x, "syncThreshold", js.undefined)
    
    inline def setSyncUrl(value: String): Self = StObject.set(x, "syncUrl", value.asInstanceOf[js.Any])
    
    inline def setSyncUrlUndefined: Self = StObject.set(x, "syncUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
