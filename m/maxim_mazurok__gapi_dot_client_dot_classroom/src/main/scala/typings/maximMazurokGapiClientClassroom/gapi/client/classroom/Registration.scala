package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registration extends StObject {
  
  /** The Cloud Pub/Sub topic that notifications are to be sent to. */
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.native
  
  /** The time until which the `Registration` is effective. This is a read-only field assigned by the server. */
  var expiryTime: js.UndefOr[String] = js.native
  
  /** Specification for the class of notifications that Classroom should deliver to the destination. */
  var feed: js.UndefOr[Feed] = js.native
  
  /** A server-generated unique identifier for this `Registration`. Read-only. */
  var registrationId: js.UndefOr[String] = js.native
}
object Registration {
  
  @scala.inline
  def apply(): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Registration]
  }
  
  @scala.inline
  implicit class RegistrationMutableBuilder[Self <: Registration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudPubsubTopic(value: CloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    @scala.inline
    def setFeed(value: Feed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
    
    @scala.inline
    def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
  }
}
