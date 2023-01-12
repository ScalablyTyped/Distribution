package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelParsed extends StObject {
  
  var attrs: LevelAttributes
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  var bitrate: Double
  
  var details: js.UndefOr[LevelDetails] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var textCodec: js.UndefOr[String] = js.undefined
  
  var unknownCodecs: js.UndefOr[js.Array[String]] = js.undefined
  
  var url: String
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object LevelParsed {
  
  inline def apply(attrs: LevelAttributes, bitrate: Double, name: String, url: String): LevelParsed = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelParsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelParsed] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: LevelAttributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTextCodec(value: String): Self = StObject.set(x, "textCodec", value.asInstanceOf[js.Any])
    
    inline def setTextCodecUndefined: Self = StObject.set(x, "textCodec", js.undefined)
    
    inline def setUnknownCodecs(value: js.Array[String]): Self = StObject.set(x, "unknownCodecs", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecsUndefined: Self = StObject.set(x, "unknownCodecs", js.undefined)
    
    inline def setUnknownCodecsVarargs(value: String*): Self = StObject.set(x, "unknownCodecs", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
