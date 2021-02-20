package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chunk extends StObject {
  
  var chunk: ProduceRequest = js.native
}
object Chunk {
  
  @scala.inline
  def apply(chunk: ProduceRequest): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunk(value: ProduceRequest): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
