package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoStream extends StObject {
  
  /**
    * H264 codec settings.
    */
  var h264: js.UndefOr[SchemaH264CodecSettings] = js.undefined
  
  /**
    * H265 codec settings.
    */
  var h265: js.UndefOr[SchemaH265CodecSettings] = js.undefined
  
  /**
    * VP9 codec settings.
    */
  var vp9: js.UndefOr[SchemaVp9CodecSettings] = js.undefined
}
object SchemaVideoStream {
  
  inline def apply(): SchemaVideoStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoStream]
  }
  
  extension [Self <: SchemaVideoStream](x: Self) {
    
    inline def setH264(value: SchemaH264CodecSettings): Self = StObject.set(x, "h264", value.asInstanceOf[js.Any])
    
    inline def setH264Undefined: Self = StObject.set(x, "h264", js.undefined)
    
    inline def setH265(value: SchemaH265CodecSettings): Self = StObject.set(x, "h265", value.asInstanceOf[js.Any])
    
    inline def setH265Undefined: Self = StObject.set(x, "h265", js.undefined)
    
    inline def setVp9(value: SchemaVp9CodecSettings): Self = StObject.set(x, "vp9", value.asInstanceOf[js.Any])
    
    inline def setVp9Undefined: Self = StObject.set(x, "vp9", js.undefined)
  }
}
