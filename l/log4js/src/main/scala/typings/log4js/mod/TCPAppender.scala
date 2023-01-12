package typings.log4js.mod

import typings.log4js.log4jsStrings.tcp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TCPAppender extends StObject {
  
  // (defaults to __LOG4JS__)
  var endMsg: js.UndefOr[String] = js.undefined
  
  // (defaults to localhost)
  var host: js.UndefOr[String] = js.undefined
  
  // (defaults to a serialized log event)
  var layout: js.UndefOr[Layout] = js.undefined
  
  // (defaults to 5000)
  var port: js.UndefOr[Double] = js.undefined
  
  var `type`: tcp
}
object TCPAppender {
  
  inline def apply(): TCPAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tcp")
    __obj.asInstanceOf[TCPAppender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TCPAppender] (val x: Self) extends AnyVal {
    
    inline def setEndMsg(value: String): Self = StObject.set(x, "endMsg", value.asInstanceOf[js.Any])
    
    inline def setEndMsgUndefined: Self = StObject.set(x, "endMsg", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setType(value: tcp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
