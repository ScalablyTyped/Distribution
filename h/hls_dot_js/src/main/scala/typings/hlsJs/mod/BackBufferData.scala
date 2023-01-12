package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackBufferData extends StObject {
  
  var bufferEnd: Double
}
object BackBufferData {
  
  inline def apply(bufferEnd: Double): BackBufferData = {
    val __obj = js.Dynamic.literal(bufferEnd = bufferEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackBufferData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackBufferData] (val x: Self) extends AnyVal {
    
    inline def setBufferEnd(value: Double): Self = StObject.set(x, "bufferEnd", value.asInstanceOf[js.Any])
  }
}
