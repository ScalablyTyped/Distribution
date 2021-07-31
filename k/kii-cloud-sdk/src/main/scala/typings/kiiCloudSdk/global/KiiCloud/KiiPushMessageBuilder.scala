package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder of push message
  */
@JSGlobal("KiiCloud.KiiPushMessageBuilder")
@js.native
class KiiPushMessageBuilder protected ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiPushMessageBuilder {
  /**
    * instantiate builder with push message data.
    * By default all push channels (gcm, apns, jpush, mqtt) is enabled.
    * All other properties configured by method of this class won't be set and default
    * value would be applied.<br>
    * Details of properties of message and its default value, please refer to
    * http://documentation.kii.com/rest/#notification_management-leverage__push_to_users__notification-group_scope-send_messages-send_a_push_message_to_the_current_topic
    *
    * @param data sent to all push channels (gcm, apns, jpush, mqtt).
    */
  def this(data: js.Any) = this()
}
