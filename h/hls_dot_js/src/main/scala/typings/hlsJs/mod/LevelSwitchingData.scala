package typings.hlsJs.mod

import typings.hlsJs.anon.Bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<hls.js.hls.js.Level, '_urlId'> */
trait LevelSwitchingData extends StObject {
  
  var _attrs: js.Array[LevelAttributes]
  
  def addFallback(data: LevelParsed): Unit
  @JSName("addFallback")
  var addFallback_Original: js.Function1[/* data */ LevelParsed, Unit]
  
  def attrs(): LevelAttributes
  @JSName("attrs")
  var attrs_Original: js.Function0[LevelAttributes]
  
  var audioCodec: js.UndefOr[String] = js.undefined
  
  def audioGroupId(): js.UndefOr[String]
  @JSName("audioGroupId")
  var audioGroupId_Original: js.Function0[js.UndefOr[String]]
  
  var audioGroupIds: js.UndefOr[js.Array[js.UndefOr[String]]] = js.undefined
  
  var bitrate: Double
  
  var codecSet: String
  
  @JSName("constructor")
  var constructor_Original: js.Function1[/* data */ LevelParsed, Any]
  
  var details: js.UndefOr[LevelDetails] = js.undefined
  
  var fragmentError: Double
  
  var height: Double
  
  var id: Double
  
  var level: Double
  
  var loadError: Double
  
  var loaded: js.UndefOr[Bytes] = js.undefined
  
  def maxBitrate(): Double
  @JSName("maxBitrate")
  var maxBitrate_Original: js.Function0[Double]
  
  var name: js.UndefOr[String] = js.undefined
  
  def pathwayId(): String
  @JSName("pathwayId")
  var pathwayId_Original: js.Function0[String]
  
  var realBitrate: Double
  
  def textGroupId(): js.UndefOr[String]
  @JSName("textGroupId")
  var textGroupId_Original: js.Function0[js.UndefOr[String]]
  
  var textGroupIds: js.UndefOr[js.Array[js.UndefOr[String]]] = js.undefined
  
  var unknownCodecs: js.UndefOr[js.Array[String]] = js.undefined
  
  def uri(): String
  @JSName("uri")
  var uri_Original: js.Function0[String]
  
  var url: js.Array[String]
  
  def urlId(): Double
  @JSName("urlId")
  var urlId_Original: js.Function0[Double]
  
  var videoCodec: js.UndefOr[String] = js.undefined
  
  var width: Double
}
object LevelSwitchingData {
  
  inline def apply(
    _attrs: js.Array[LevelAttributes],
    addFallback: /* data */ LevelParsed => Unit,
    attrs: () => LevelAttributes,
    audioGroupId: () => js.UndefOr[String],
    bitrate: Double,
    codecSet: String,
    constructor: /* data */ LevelParsed => Any,
    fragmentError: Double,
    height: Double,
    id: Double,
    level: Double,
    loadError: Double,
    maxBitrate: () => Double,
    pathwayId: () => String,
    realBitrate: Double,
    textGroupId: () => js.UndefOr[String],
    uri: () => String,
    url: js.Array[String],
    urlId: () => Double,
    width: Double
  ): LevelSwitchingData = {
    val __obj = js.Dynamic.literal(_attrs = _attrs.asInstanceOf[js.Any], addFallback = js.Any.fromFunction1(addFallback), attrs = js.Any.fromFunction0(attrs), audioGroupId = js.Any.fromFunction0(audioGroupId), bitrate = bitrate.asInstanceOf[js.Any], codecSet = codecSet.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), fragmentError = fragmentError.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], loadError = loadError.asInstanceOf[js.Any], maxBitrate = js.Any.fromFunction0(maxBitrate), pathwayId = js.Any.fromFunction0(pathwayId), realBitrate = realBitrate.asInstanceOf[js.Any], textGroupId = js.Any.fromFunction0(textGroupId), uri = js.Any.fromFunction0(uri), url = url.asInstanceOf[js.Any], urlId = js.Any.fromFunction0(urlId), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelSwitchingData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelSwitchingData] (val x: Self) extends AnyVal {
    
    inline def setAddFallback(value: /* data */ LevelParsed => Unit): Self = StObject.set(x, "addFallback", js.Any.fromFunction1(value))
    
    inline def setAttrs(value: () => LevelAttributes): Self = StObject.set(x, "attrs", js.Any.fromFunction0(value))
    
    inline def setAudioCodec(value: String): Self = StObject.set(x, "audioCodec", value.asInstanceOf[js.Any])
    
    inline def setAudioCodecUndefined: Self = StObject.set(x, "audioCodec", js.undefined)
    
    inline def setAudioGroupId(value: () => js.UndefOr[String]): Self = StObject.set(x, "audioGroupId", js.Any.fromFunction0(value))
    
    inline def setAudioGroupIds(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "audioGroupIds", value.asInstanceOf[js.Any])
    
    inline def setAudioGroupIdsUndefined: Self = StObject.set(x, "audioGroupIds", js.undefined)
    
    inline def setAudioGroupIdsVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "audioGroupIds", js.Array(value*))
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setCodecSet(value: String): Self = StObject.set(x, "codecSet", value.asInstanceOf[js.Any])
    
    inline def setConstructor(value: /* data */ LevelParsed => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setFragmentError(value: Double): Self = StObject.set(x, "fragmentError", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLoadError(value: Double): Self = StObject.set(x, "loadError", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Bytes): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setMaxBitrate(value: () => Double): Self = StObject.set(x, "maxBitrate", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPathwayId(value: () => String): Self = StObject.set(x, "pathwayId", js.Any.fromFunction0(value))
    
    inline def setRealBitrate(value: Double): Self = StObject.set(x, "realBitrate", value.asInstanceOf[js.Any])
    
    inline def setTextGroupId(value: () => js.UndefOr[String]): Self = StObject.set(x, "textGroupId", js.Any.fromFunction0(value))
    
    inline def setTextGroupIds(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "textGroupIds", value.asInstanceOf[js.Any])
    
    inline def setTextGroupIdsUndefined: Self = StObject.set(x, "textGroupIds", js.undefined)
    
    inline def setTextGroupIdsVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "textGroupIds", js.Array(value*))
    
    inline def setUnknownCodecs(value: js.Array[String]): Self = StObject.set(x, "unknownCodecs", value.asInstanceOf[js.Any])
    
    inline def setUnknownCodecsUndefined: Self = StObject.set(x, "unknownCodecs", js.undefined)
    
    inline def setUnknownCodecsVarargs(value: String*): Self = StObject.set(x, "unknownCodecs", js.Array(value*))
    
    inline def setUri(value: () => String): Self = StObject.set(x, "uri", js.Any.fromFunction0(value))
    
    inline def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlId(value: () => Double): Self = StObject.set(x, "urlId", js.Any.fromFunction0(value))
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    
    inline def setVideoCodec(value: String): Self = StObject.set(x, "videoCodec", value.asInstanceOf[js.Any])
    
    inline def setVideoCodecUndefined: Self = StObject.set(x, "videoCodec", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def set_attrs(value: js.Array[LevelAttributes]): Self = StObject.set(x, "_attrs", value.asInstanceOf[js.Any])
    
    inline def set_attrsVarargs(value: LevelAttributes*): Self = StObject.set(x, "_attrs", js.Array(value*))
  }
}
