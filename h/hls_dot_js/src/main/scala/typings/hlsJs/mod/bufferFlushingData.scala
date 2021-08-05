package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// interface bufferEosData {}
trait bufferFlushingData extends StObject {
  
  var endOffset: Double
  
  var startOffset: Double
}
object bufferFlushingData {
  
  inline def apply(endOffset: Double, startOffset: Double): bufferFlushingData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferFlushingData]
  }
  
  extension [Self <: bufferFlushingData](x: Self) {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
