package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bufferFlushedData extends StObject {
  
  var endOffset: Double
  
  var startOffset: Double
}
object bufferFlushedData {
  
  inline def apply(endOffset: Double, startOffset: Double): bufferFlushedData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferFlushedData]
  }
  
  extension [Self <: bufferFlushedData](x: Self) {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
