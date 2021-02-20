package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a Level object represents a given quality level and contains quality level related info
  */
@js.native
trait Level extends StObject {
  
  /**
    * attribute list
    */
  var attrs: js.Array[LevelAttr] = js.native
  
  /**
    * audio codec
    */
  var audioCodec: String = js.native
  
  /**
    * level bitrate
    */
  var bitrate: Double = js.native
  
  /**
    * level details
    */
  var details: js.UndefOr[LevelDetails] = js.native
  
  /**
    * whether there is any error on the fragment
    */
  var fragmentError: js.UndefOr[Boolean] = js.native
  
  /**
    * video height
    */
  var height: Double = js.native
  
  /**
    * index of the level
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * error code
    */
  var loadError: Double = js.native
  
  /**
    * level name
    */
  var name: String = js.native
  
  /**
    * array of unrecognized codecs
    */
  var unkownCodecs: js.Array[String] = js.native
  
  /**
    * level url. might contain several items if failover/redundant streams are found in the manifest
    */
  var url: js.Array[String] = js.native
  
  /**
    * index of current url from url[] array
    */
  var urlId: Double = js.native
  
  /**
    * video codec
    */
  var videoCodec: String = js.native
  
  /**
    * video width
    */
  var width: Double = js.native
}
object Level {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Array[LevelAttr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsVarargs(value: LevelAttr*): Self = StObject.set(x, "attrs", js.Array(value :_*))
    
    @scala.inline
    def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setFragmentError(value: Boolean): Self = StObject.set(x, "fragmentError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentErrorUndefined: Self = StObject.set(x, "fragmentError", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLoadError(value: Double): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnkownCodecs(value: js.Array[String]): Self = StObject.set(x, "unkownCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnkownCodecsVarargs(value: String*): Self = StObject.set(x, "unkownCodecs", js.Array(value :_*))
    
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
