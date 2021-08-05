package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ObjectDestroyed
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ObjectDestroyed', {  objectId :string}> */
trait EventObjectDestroyedobjec extends StObject {
  
  var objectId: String
  
  var source: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: ObjectDestroyed
}
object EventObjectDestroyedobjec {
  
  inline def apply(objectId: String, source: String, tags: js.Array[Tag], timestamp: String, timestampMillis: String): EventObjectDestroyedobjec = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectDestroyed")
    __obj.asInstanceOf[EventObjectDestroyedobjec]
  }
  
  extension [Self <: EventObjectDestroyedobjec](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: ObjectDestroyed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
