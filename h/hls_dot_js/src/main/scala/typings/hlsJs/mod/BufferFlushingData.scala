package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFlushingData extends StObject {
  
  var endOffset: Double
  
  var endOffsetSubtitles: js.UndefOr[Double] = js.undefined
  
  var startOffset: Double
  
  var `type`: SourceBufferName | Null
}
object BufferFlushingData {
  
  inline def apply(endOffset: Double, startOffset: Double): BufferFlushingData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[BufferFlushingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BufferFlushingData] (val x: Self) extends AnyVal {
    
    inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetSubtitles(value: Double): Self = StObject.set(x, "endOffsetSubtitles", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetSubtitlesUndefined: Self = StObject.set(x, "endOffsetSubtitles", js.undefined)
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
