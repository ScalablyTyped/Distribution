package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Controller to deal with Common Media Client Data (CMCD)
  * @see https://cdn.cta.tech/cta/media/media/resources/standards/pdfs/cta-5004-final.pdf
  */
trait CMCDController
  extends StObject
     with ComponentAPI {
  
  /**
    * Apply CMCD data to a request.
    */
  /* private */ @JSName("apply")
  var apply: Any
  
  /**
    * Apply CMCD data to a segment request
    */
  /* private */ var applyFragmentData: Any
  
  /**
    * Apply CMCD data to a manifest request.
    */
  /* private */ var applyPlaylistData: Any
  
  /* private */ var audioBuffer: Any
  
  /* private */ var buffering: Any
  
  /* private */ var cid: Any
  
  /* private */ var config: Any
  
  /**
    * Create baseline CMCD data
    */
  /* private */ var createData: Any
  
  /**
    * Create a playlist loader
    */
  /* private */ var createFragmentLoader: Any
  
  /**
    * Create a playlist loader
    */
  /* private */ var createPlaylistLoader: Any
  
  /**
    * Get the buffer length for a media type in milliseconds
    */
  /* private */ var getBufferLength: Any
  
  /**
    * The CMCD object type.
    */
  /* private */ var getObjectType: Any
  
  /**
    * Get the highest bitrate.
    */
  /* private */ var getTopBandwidth: Any
  
  /* private */ var hls: Any
  
  /* private */ var initialized: Any
  
  /* private */ var media: Any
  
  /* private */ var onBufferCreated: Any
  
  /* private */ var onMediaAttached: Any
  
  /* private */ var onMediaDetached: Any
  
  /* private */ var onPlaying: Any
  
  /* private */ var onWaiting: Any
  
  /* private */ var registerListeners: Any
  
  /* private */ var sid: Any
  
  /* private */ var starved: Any
  
  /* private */ var unregisterListeners: Any
  
  /* private */ var useHeaders: Any
  
  /* private */ var videoBuffer: Any
}
object CMCDController {
  
  inline def apply(
    apply: Any,
    applyFragmentData: Any,
    applyPlaylistData: Any,
    audioBuffer: Any,
    buffering: Any,
    cid: Any,
    config: Any,
    createData: Any,
    createFragmentLoader: Any,
    createPlaylistLoader: Any,
    destroy: () => Unit,
    getBufferLength: Any,
    getObjectType: Any,
    getTopBandwidth: Any,
    hls: Any,
    initialized: Any,
    media: Any,
    onBufferCreated: Any,
    onMediaAttached: Any,
    onMediaDetached: Any,
    onPlaying: Any,
    onWaiting: Any,
    registerListeners: Any,
    sid: Any,
    starved: Any,
    unregisterListeners: Any,
    useHeaders: Any,
    videoBuffer: Any
  ): CMCDController = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], applyFragmentData = applyFragmentData.asInstanceOf[js.Any], applyPlaylistData = applyPlaylistData.asInstanceOf[js.Any], audioBuffer = audioBuffer.asInstanceOf[js.Any], buffering = buffering.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], createData = createData.asInstanceOf[js.Any], createFragmentLoader = createFragmentLoader.asInstanceOf[js.Any], createPlaylistLoader = createPlaylistLoader.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getBufferLength = getBufferLength.asInstanceOf[js.Any], getObjectType = getObjectType.asInstanceOf[js.Any], getTopBandwidth = getTopBandwidth.asInstanceOf[js.Any], hls = hls.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], onBufferCreated = onBufferCreated.asInstanceOf[js.Any], onMediaAttached = onMediaAttached.asInstanceOf[js.Any], onMediaDetached = onMediaDetached.asInstanceOf[js.Any], onPlaying = onPlaying.asInstanceOf[js.Any], onWaiting = onWaiting.asInstanceOf[js.Any], registerListeners = registerListeners.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], starved = starved.asInstanceOf[js.Any], unregisterListeners = unregisterListeners.asInstanceOf[js.Any], useHeaders = useHeaders.asInstanceOf[js.Any], videoBuffer = videoBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMCDController]
  }
  
  extension [Self <: CMCDController](x: Self) {
    
    inline def setApply(value: Any): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyFragmentData(value: Any): Self = StObject.set(x, "applyFragmentData", value.asInstanceOf[js.Any])
    
    inline def setApplyPlaylistData(value: Any): Self = StObject.set(x, "applyPlaylistData", value.asInstanceOf[js.Any])
    
    inline def setAudioBuffer(value: Any): Self = StObject.set(x, "audioBuffer", value.asInstanceOf[js.Any])
    
    inline def setBuffering(value: Any): Self = StObject.set(x, "buffering", value.asInstanceOf[js.Any])
    
    inline def setCid(value: Any): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCreateData(value: Any): Self = StObject.set(x, "createData", value.asInstanceOf[js.Any])
    
    inline def setCreateFragmentLoader(value: Any): Self = StObject.set(x, "createFragmentLoader", value.asInstanceOf[js.Any])
    
    inline def setCreatePlaylistLoader(value: Any): Self = StObject.set(x, "createPlaylistLoader", value.asInstanceOf[js.Any])
    
    inline def setGetBufferLength(value: Any): Self = StObject.set(x, "getBufferLength", value.asInstanceOf[js.Any])
    
    inline def setGetObjectType(value: Any): Self = StObject.set(x, "getObjectType", value.asInstanceOf[js.Any])
    
    inline def setGetTopBandwidth(value: Any): Self = StObject.set(x, "getTopBandwidth", value.asInstanceOf[js.Any])
    
    inline def setHls(value: Any): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setInitialized(value: Any): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setOnBufferCreated(value: Any): Self = StObject.set(x, "onBufferCreated", value.asInstanceOf[js.Any])
    
    inline def setOnMediaAttached(value: Any): Self = StObject.set(x, "onMediaAttached", value.asInstanceOf[js.Any])
    
    inline def setOnMediaDetached(value: Any): Self = StObject.set(x, "onMediaDetached", value.asInstanceOf[js.Any])
    
    inline def setOnPlaying(value: Any): Self = StObject.set(x, "onPlaying", value.asInstanceOf[js.Any])
    
    inline def setOnWaiting(value: Any): Self = StObject.set(x, "onWaiting", value.asInstanceOf[js.Any])
    
    inline def setRegisterListeners(value: Any): Self = StObject.set(x, "registerListeners", value.asInstanceOf[js.Any])
    
    inline def setSid(value: Any): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setStarved(value: Any): Self = StObject.set(x, "starved", value.asInstanceOf[js.Any])
    
    inline def setUnregisterListeners(value: Any): Self = StObject.set(x, "unregisterListeners", value.asInstanceOf[js.Any])
    
    inline def setUseHeaders(value: Any): Self = StObject.set(x, "useHeaders", value.asInstanceOf[js.Any])
    
    inline def setVideoBuffer(value: Any): Self = StObject.set(x, "videoBuffer", value.asInstanceOf[js.Any])
  }
}
