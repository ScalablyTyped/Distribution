package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk extends StObject {
  
  var chunk: ProduceRequest
}
object Chunk {
  
  inline def apply(chunk: ProduceRequest): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  extension [Self <: Chunk](x: Self) {
    
    inline def setChunk(value: ProduceRequest): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
