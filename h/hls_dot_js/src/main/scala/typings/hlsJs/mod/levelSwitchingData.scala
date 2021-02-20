package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait levelSwitchingData extends StObject {
  
  var attrs: js.Any = js.native
  
  var audioCodec: String = js.native
  
  var bitrate: Double = js.native
  
  var fragmentError: Boolean = js.native
  
  var height: Double = js.native
  
  var level: Double = js.native
  
  var loadError: Double = js.native
  
  var name: String = js.native
  
  var unknownCodecs: js.Array[String] = js.native
  
  var url: js.Array[String] = js.native
  
  var urlId: Double = js.native
  
  var videoCodec: String = js.native
  
  var width: Double = js.native
}
object levelSwitchingData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class levelSwitchingDataMutableBuilder[Self <: levelSwitchingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentError(value: Boolean): Self = StObject.set(x, "fragmentError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadError(value: Double): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownCodecs(value: js.Array[String]): Self = StObject.set(x, "unknownCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownCodecsVarargs(value: String*): Self = StObject.set(x, "unknownCodecs", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlId(value: Double): Self = StObject.set(x, "urlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    @scala.inline
    def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
