package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteTopicId extends StObject {
  
  /** The Space or DM that the topic belongs to. */
  var groupId: js.UndefOr[AppsDynamiteGroupId] = js.undefined
  
  /**
    * Opaque, server-assigned ID of the Topic. While this ID is guaranteed to be unique within the Space, it's not guaranteed to be globally unique. Internal usage: this field can be
    * empty in the following cases: 1. To create the first message in a topic. 2. To list last N messages of a Space (regardless of topic).
    */
  var topicId: js.UndefOr[String] = js.undefined
}
object AppsDynamiteTopicId {
  
  inline def apply(): AppsDynamiteTopicId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteTopicId]
  }
  
  extension [Self <: AppsDynamiteTopicId](x: Self) {
    
    inline def setGroupId(value: AppsDynamiteGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
  }
}
