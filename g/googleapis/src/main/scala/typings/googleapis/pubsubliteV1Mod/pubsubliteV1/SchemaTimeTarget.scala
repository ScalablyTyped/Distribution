package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeTarget extends StObject {
  
  /**
    * Request the cursor of the first message with event time greater than or equal to `event_time`. If messages are missing an event time, the publish time is used as a fallback. As event times are user supplied, subsequent messages may have event times less than `event_time` and should be filtered by the client, if necessary.
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Request the cursor of the first message with publish time greater than or equal to `publish_time`. All messages thereafter are guaranteed to have publish times \>= `publish_time`.
    */
  var publishTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimeTarget {
  
  inline def apply(): SchemaTimeTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeTarget]
  }
  
  extension [Self <: SchemaTimeTarget](x: Self) {
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
