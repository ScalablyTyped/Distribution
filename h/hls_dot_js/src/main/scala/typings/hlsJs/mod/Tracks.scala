package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracks extends StObject {
  
  var codec: String
  
  var container: js.Any
  
  var initSegment: js.Any
  
  var levelCodec: js.Any
  
  var metadata: js.Any
}
object Tracks {
  
  inline def apply(codec: String, container: js.Any, initSegment: js.Any, levelCodec: js.Any, metadata: js.Any): Tracks = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], initSegment = initSegment.asInstanceOf[js.Any], levelCodec = levelCodec.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracks]
  }
  
  extension [Self <: Tracks](x: Self) {
    
    inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInitSegment(value: js.Any): Self = StObject.set(x, "initSegment", value.asInstanceOf[js.Any])
    
    inline def setLevelCodec(value: js.Any): Self = StObject.set(x, "levelCodec", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
