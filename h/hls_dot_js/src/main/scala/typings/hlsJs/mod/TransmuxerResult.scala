package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransmuxerResult extends StObject {
  
  var chunkMeta: ChunkMetadata
  
  var remuxResult: RemuxerResult
}
object TransmuxerResult {
  
  inline def apply(chunkMeta: ChunkMetadata, remuxResult: RemuxerResult): TransmuxerResult = {
    val __obj = js.Dynamic.literal(chunkMeta = chunkMeta.asInstanceOf[js.Any], remuxResult = remuxResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmuxerResult]
  }
  
  extension [Self <: TransmuxerResult](x: Self) {
    
    inline def setChunkMeta(value: ChunkMetadata): Self = StObject.set(x, "chunkMeta", value.asInstanceOf[js.Any])
    
    inline def setRemuxResult(value: RemuxerResult): Self = StObject.set(x, "remuxResult", value.asInstanceOf[js.Any])
  }
}
