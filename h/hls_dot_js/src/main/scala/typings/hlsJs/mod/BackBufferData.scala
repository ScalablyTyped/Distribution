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
  
  extension [Self <: BackBufferData](x: Self) {
    
    inline def setBufferEnd(value: Double): Self = StObject.set(x, "bufferEnd", value.asInstanceOf[js.Any])
  }
}
