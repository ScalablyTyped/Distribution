package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.audio_
import typings.hlsJs.hlsJsStrings.main
import typings.std.SourceBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  var buffer: js.UndefOr[SourceBuffer] = js.undefined
  
  var codec: js.UndefOr[String] = js.undefined
  
  var container: String
  
  var id: audio_ | main
  
  var initSegment: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var levelCodec: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
}
object Track {
  
  inline def apply(container: String, id: audio_ | main): Track = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  
  extension [Self <: Track](x: Self) {
    
    inline def setBuffer(value: SourceBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setId(value: audio_ | main): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitSegment(value: js.typedarray.Uint8Array): Self = StObject.set(x, "initSegment", value.asInstanceOf[js.Any])
    
    inline def setInitSegmentUndefined: Self = StObject.set(x, "initSegment", js.undefined)
    
    inline def setLevelCodec(value: String): Self = StObject.set(x, "levelCodec", value.asInstanceOf[js.Any])
    
    inline def setLevelCodecUndefined: Self = StObject.set(x, "levelCodec", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
