package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLog extends StObject {
  
  var channel: String
  
  var data: String | js.Object
  
  var request: String
  
  var tags: js.Array[String]
  
  var timestamp: Double
}
object RequestLog {
  
  inline def apply(
    channel: String,
    data: String | js.Object,
    request: String,
    tags: js.Array[String],
    timestamp: Double
  ): RequestLog = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLog]
  }
  
  extension [Self <: RequestLog](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
