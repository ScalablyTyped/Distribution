package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTopicId extends StObject {
  
  /**
    * The Space or DM that the topic belongs to.
    */
  var groupId: js.UndefOr[SchemaGroupId] = js.undefined
  
  /**
    * Opaque, server-assigned ID of the Topic. While this ID is guaranteed to be unique within the Space, it's not guaranteed to be globally unique. Internal usage: this field can be empty in the following cases: 1. To create the first message in a topic. 2. To list last N messages of a Space (regardless of topic).
    */
  var topicId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTopicId {
  
  inline def apply(): SchemaTopicId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTopicId]
  }
  
  extension [Self <: SchemaTopicId](x: Self) {
    
    inline def setGroupId(value: SchemaGroupId): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdNull: Self = StObject.set(x, "topicId", null)
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
  }
}
