package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk extends StObject {
  
  var chunk: js.Array[Any]
  
  var original_event: Any
}
object Chunk {
  
  inline def apply(chunk: js.Array[Any], original_event: Any): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], original_event = original_event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  extension [Self <: Chunk](x: Self) {
    
    inline def setChunk(value: js.Array[Any]): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkVarargs(value: Any*): Self = StObject.set(x, "chunk", js.Array(value*))
    
    inline def setOriginal_event(value: Any): Self = StObject.set(x, "original_event", value.asInstanceOf[js.Any])
  }
}
