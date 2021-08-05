package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a Level object represents a given quality level and contains quality level related info
  */
trait Level extends StObject {
  
  /**
    * attribute list
    */
  var attrs: js.Array[LevelAttr]
  
  /**
    * audio codec
    */
  var audioCodec: String
  
  /**
    * level bitrate
    */
  var bitrate: Double
  
  /**
    * level details
    */
  var details: js.UndefOr[LevelDetails] = js.undefined
  
  /**
    * whether there is any error on the fragment
    */
  var fragmentError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * video height
    */
  var height: Double
  
  /**
    * index of the level
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * error code
    */
  var loadError: Double
  
  /**
    * level name
    */
  var name: String
  
  /**
    * array of unrecognized codecs
    */
  var unkownCodecs: js.Array[String]
  
  /**
    * level url. might contain several items if failover/redundant streams are found in the manifest
    */
  var url: js.Array[String]
  
  /**
    * index of current url from url[] array
    */
  var urlId: Double
  
  /**
    * video codec
    */
  var videoCodec: String
  
  /**
    * video width
    */
  var width: Double
}
object Level {
  
  inline def apply(
    attrs: js.Array[LevelAttr],
    audioCodec: String,
    bitrate: Double,
    height: Double,
    loadError: Double,
    name: String,
    unkownCodecs: js.Array[String],
    url: js.Array[String],
    urlId: Double,
    videoCodec: String,
    width: Double
  ): Level = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], audioCodec = audioCodec.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unkownCodecs = unkownCodecs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlId = urlId.asInstanceOf[js.Any], videoCodec = videoCodec.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setAttrs(value: js.Array[LevelAttr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsVarargs(value: LevelAttr*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFragmentError(value: Boolean): Self = StObject.set(x, "fragmentError", value.asInstanceOf[js.Any])
    
    inline def setFragmentErrorUndefined: Self = StObject.set(x, "fragmentError", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLoadError(value: Double): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnkownCodecs(value: js.Array[String]): Self = StObject.set(x, "unkownCodecs", value.asInstanceOf[js.Any])
    
    inline def setUnkownCodecsVarargs(value: String*): Self = StObject.set(x, "unkownCodecs", js.Array(value :_*))
    
    inline def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlId(value: Double): Self = StObject.set(x, "urlId", value.asInstanceOf[js.Any])
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
