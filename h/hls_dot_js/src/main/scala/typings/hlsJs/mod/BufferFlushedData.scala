package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferFlushedData extends StObject {
  
  var `type`: SourceBufferName
}
object BufferFlushedData {
  
  inline def apply(`type`: SourceBufferName): BufferFlushedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferFlushedData]
  }
  
  extension [Self <: BufferFlushedData](x: Self) {
    
    inline def setType(value: SourceBufferName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
