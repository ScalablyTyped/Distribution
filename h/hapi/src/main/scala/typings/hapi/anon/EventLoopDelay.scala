package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLoopDelay extends StObject {
  
  /**
    * Max concurrent requests.
    */
  var concurrent: Double
  
  /**
    * event loop delay milliseconds.
    */
  var eventLoopDelay: Double
  
  /**
    * V8 heap usage.
    */
  var heapUsed: Double
  
  /**
    * RSS memory usage.
    */
  var rss: Double
}
object EventLoopDelay {
  
  inline def apply(concurrent: Double, eventLoopDelay: Double, heapUsed: Double, rss: Double): EventLoopDelay = {
    val __obj = js.Dynamic.literal(concurrent = concurrent.asInstanceOf[js.Any], eventLoopDelay = eventLoopDelay.asInstanceOf[js.Any], heapUsed = heapUsed.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLoopDelay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventLoopDelay] (val x: Self) extends AnyVal {
    
    inline def setConcurrent(value: Double): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
    
    inline def setEventLoopDelay(value: Double): Self = StObject.set(x, "eventLoopDelay", value.asInstanceOf[js.Any])
    
    inline def setHeapUsed(value: Double): Self = StObject.set(x, "heapUsed", value.asInstanceOf[js.Any])
    
    inline def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
  }
}
