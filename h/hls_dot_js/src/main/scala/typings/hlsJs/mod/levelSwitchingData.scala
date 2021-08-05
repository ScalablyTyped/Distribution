package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait levelSwitchingData extends StObject {
  
  var attrs: js.Any
  
  var audioCodec: String
  
  var bitrate: Double
  
  var fragmentError: Boolean
  
  var height: Double
  
  var level: Double
  
  var loadError: Double
  
  var name: String
  
  var unknownCodecs: js.Array[String]
  
  var url: js.Array[String]
  
  var urlId: Double
  
  var videoCodec: String
  
  var width: Double
}
object levelSwitchingData {
  
  inline def apply(
    attrs: js.Any,
    audioCodec: String,
    bitrate: Double,
    fragmentError: Boolean,
    height: Double,
    level: Double,
    loadError: Double,
    name: String,
    unknownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): levelSwitchingData = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], fragmentError = fragmentError.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unknownCodecs = unknownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[levelSwitchingData]
  }
  
  extension [Self <: levelSwitchingData](x: Self) {
    
    inline def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setFragmentError(value: Boolean): Self = StObject.set(x, "fragmentError", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLoadError(value: Double): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecs(value: js.Array[String]): Self = StObject.set(x, "unknownCodecs", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecsVarargs(value: String*): Self = StObject.set(x, "unknownCodecs", js.Array(value :_*))
    
    inline def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlId(value: Double): Self = StObject.set(x, "urlId", value.asInstanceOf[js.Any])
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
