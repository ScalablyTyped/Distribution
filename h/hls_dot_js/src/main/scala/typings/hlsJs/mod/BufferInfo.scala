package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferInfo extends StObject {
  
  var end: Double
  
  var len: Double
  
  var nextStart: js.UndefOr[Double] = js.undefined
  
  var start: Double
}
object BufferInfo {
  
  inline def apply(end: Double, len: Double, start: Double): BufferInfo = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferInfo] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setNextStart(value: Double): Self = StObject.set(x, "nextStart", value.asInstanceOf[js.Any])
    
    inline def setNextStartUndefined: Self = StObject.set(x, "nextStart", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
