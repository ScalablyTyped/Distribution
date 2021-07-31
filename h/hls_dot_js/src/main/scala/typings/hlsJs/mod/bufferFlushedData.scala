package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait bufferFlushedData extends StObject {
  
  var endOffset: Double
  
  var startOffset: Double
}
object bufferFlushedData {
  
  @scala.inline
  def apply(endOffset: Double, startOffset: Double): bufferFlushedData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferFlushedData]
  }
  
  @scala.inline
  implicit class bufferFlushedDataMutableBuilder[Self <: bufferFlushedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
