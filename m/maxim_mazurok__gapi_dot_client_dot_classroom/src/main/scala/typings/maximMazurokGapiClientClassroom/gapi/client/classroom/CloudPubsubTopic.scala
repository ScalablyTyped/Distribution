package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudPubsubTopic extends StObject {
  
  /** The `name` field of a Cloud Pub/Sub [Topic](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics#Topic). */
  var topicName: js.UndefOr[String] = js.undefined
}
object CloudPubsubTopic {
  
  @scala.inline
  def apply(): CloudPubsubTopic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudPubsubTopic]
  }
  
  @scala.inline
  implicit class CloudPubsubTopicMutableBuilder[Self <: CloudPubsubTopic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
  }
}
