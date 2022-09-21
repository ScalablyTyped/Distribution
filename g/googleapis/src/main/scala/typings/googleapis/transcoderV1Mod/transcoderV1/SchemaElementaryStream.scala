package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaElementaryStream extends StObject {
  
  /**
    * Encoding of an audio stream.
    */
  var audioStream: js.UndefOr[SchemaAudioStream] = js.undefined
  
  /**
    * A unique key for this elementary stream.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Encoding of a text stream. For example, closed captions or subtitles.
    */
  var textStream: js.UndefOr[SchemaTextStream] = js.undefined
  
  /**
    * Encoding of a video stream.
    */
  var videoStream: js.UndefOr[SchemaVideoStream] = js.undefined
}
object SchemaElementaryStream {
  
  inline def apply(): SchemaElementaryStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElementaryStream]
  }
  
  extension [Self <: SchemaElementaryStream](x: Self) {
    
    inline def setAudioStream(value: SchemaAudioStream): Self = StObject.set(x, "audioStream", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamUndefined: Self = StObject.set(x, "audioStream", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTextStream(value: SchemaTextStream): Self = StObject.set(x, "textStream", value.asInstanceOf[js.Any])
    
    inline def setTextStreamUndefined: Self = StObject.set(x, "textStream", js.undefined)
    
    inline def setVideoStream(value: SchemaVideoStream): Self = StObject.set(x, "videoStream", value.asInstanceOf[js.Any])
    
    inline def setVideoStreamUndefined: Self = StObject.set(x, "videoStream", js.undefined)
  }
}
