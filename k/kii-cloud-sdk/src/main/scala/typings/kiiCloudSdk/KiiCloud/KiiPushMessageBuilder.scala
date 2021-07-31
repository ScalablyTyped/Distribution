package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder of push message
  */
@js.native
trait KiiPushMessageBuilder extends StObject {
  
  /**
    * Set alert for APNS subscribers.
    * If this method is not called, no alert is applied.
    * For details please refer to APNS document of alert.
    *
    * @param alert alert object
    *
    * @return builder instance.
    */
  def apnsAlert(alert: String): KiiPushMessageBuilder = js.native
  def apnsAlert(alert: APNSAlert): KiiPushMessageBuilder = js.native
  
  /**
    * Set badge for APNS subscribers.
    * If this method is not called, no badge is applied.
    * For details please refer to APNS document of badge.
    *
    *
    * @return builder instance.
    */
  def apnsBadge(badge: Double): KiiPushMessageBuilder = js.native
  
  /**
    * Set category for APNS subscribers.
    * If this method is not called, no category is applied.
    * For details please refer to APNS document of category.
    *
    *
    * @return builder instance.
    */
  def apnsCategory(category: String): KiiPushMessageBuilder = js.native
  
  /**
    * Set content-available for APNS subscribers.
    * If this method is not called, no content-available is applied.
    *
    * @param contentAvailable If 0 or this method is not invoked,
    *   content-available payload is not delivered.
    *   Otherwise, content-available=1 payload is delivered.
    *
    * @return builder instance.
    */
  def apnsContentAvailable(contentAvailable: Double): KiiPushMessageBuilder = js.native
  
  /**
    * Set specific data for APNS subscribers.
    * If this method is not called, no specific data is not applied
    * and data passed to the constructor would be sent to subscribers.
    *
    * @param data specific data applied to only APNS subscribers.
    *   Contents should be JSON Object with only one-level of nesting,
    *   and only strings, integers, booleans or doubles in the values.
    *
    * @return builder instance.
    */
  def apnsData(data: StringDictionary[String | Double | Boolean]): KiiPushMessageBuilder = js.native
  
  /**
    * Set sound for APNS subscribers.
    * If this method is not called, no sound is applied.
    * For details please refer to APNS document of sound.
    *
    *
    * @return builder instance.
    */
  def apnsSound(sound: String): KiiPushMessageBuilder = js.native
  
  /**
    * build push message.
    *
    * @return push message object. Can be used in {@link KiiTopic#sendMessage()}
    */
  def build(): js.Any = js.native
  
  /**
    * Enable/ Disable message distribution via APNS.
    * If this method is not called, true will be applied as default.
    *
    * @param enable flag indicate whether distribute this message to APNS subscribers.
    *
    * @return builder instance.
    */
  def enableApns(enable: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Enable/ Disable message distribution via GCM.
    * If this method is not called, true will be applied as default.
    *
    * @param enable flag indicate whether distribute this message to GCM subscribers.
    *
    * @return builder instance.
    */
  def enableGcm(enable: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Enable/ Disable message distribution via JPush.
    * If this method is not called, true will be applied as default.
    *
    * @param enable flag indicate whether distribute this message to JPush subscribers.
    *
    * @return builder instance.
    */
  def enableJpush(enable: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Enable/ Disable message distribution via MQTT.
    * If this method is not called, true will be applied as default.
    *
    * @param enable flag indicate whether distribute this message to MQTT subscribers.
    *
    * @return builder instance.
    */
  def enableMqtt(enable: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Set collapse_key for GCM subscribers.
    * If this method is not called, no collapse_key is applied.
    * For details please refer to GCM document of collapse_key.
    *
    *
    * @return builder instance.
    */
  def gcmCollapseKey(collapseKey: String): KiiPushMessageBuilder = js.native
  
  /**
    * Set specific data for GCM subscribers.
    * If this method is not called, no specific data is not applied
    * and data passed to the constructor would be sent to subscribers.
    *
    * @param data specific data applied to only GCM subscribers.
    *   Contents should be JSON Object with only one-level of nesting,
    *   and only strings in values
    *
    * @return builder instance.
    */
  def gcmData(data: StringDictionary[String]): KiiPushMessageBuilder = js.native
  
  /**
    * Set delay_while_idle for GCM subscribers.
    * If this method is not called, no delay_while_idle is applied.
    * For details please refer to GCM document of delay_while_idle.
    *
    *
    * @return builder instance.
    */
  def gcmDelayWhileIdle(delayWhileIdle: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Set restricted_package_name for GCM subscribers.
    * If this method is not called, no restricted_package_name is applied.
    * For details please refer to GCM document of restricted_package_name.
    *
    *
    * @return builder instance.
    */
  def gcmRestrictedPackageName(restrictedPackageName: String): KiiPushMessageBuilder = js.native
  
  /**
    * Set time_to_live for GCM subscribers.
    * If this method is not called, no time_to_live is applied.
    * For details please refer to GCM document of time_to_live.
    *
    *
    * @return builder instance.
    */
  def gcmTimeToLive(timeToLive: Double): KiiPushMessageBuilder = js.native
  
  /**
    * Set specific data for JPush subscribers.
    * If this method is not called, no specific data is not applied
    * and data passed to the constructor would be sent to subscribers.
    *
    * @param data specific data applied to only JPush subscribers.
    *   Contents should be JSON Object with only one-level of nesting,
    *   and only strings, integers, booleans or doubles in the values.
    *
    * @return builder instance.
    */
  def jpushData(data: StringDictionary[String | Double | Boolean]): KiiPushMessageBuilder = js.native
  
  /**
    * Set specific data for MQTT subscribers.
    * If this method is not called, no specific data is not applied
    * and data passed to the constructor would be sent to subscribers.
    *
    * @param data specific data applied to only MQTT subscribers.
    *   Contents should be JSON Object with only one-level of nesting,
    *   and only strings in the values.
    *
    * @return builder instance.
    */
  def mqttData(data: StringDictionary[String]): KiiPushMessageBuilder = js.native
  
  /**
    * Indicate whether send this message to development environment.
    * If this method is not called, true will be applied as default.
    *
    * @param flag indicate whether send this message to development env.
    *
    * @return builder instance.
    */
  def setSendToDevelopment(flag: Boolean): KiiPushMessageBuilder = js.native
  
  /**
    * Indicate whether send this message to production environment.
    * If this method is not called, true will be applied as default.
    *
    * @param flag indicate whether send this message to production env.
    *
    * @return builder instance.
    */
  def setSendToProduction(flag: Boolean): KiiPushMessageBuilder = js.native
}
