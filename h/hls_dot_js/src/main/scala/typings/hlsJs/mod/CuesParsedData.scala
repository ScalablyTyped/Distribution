package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.captions
import typings.hlsJs.hlsJsStrings.subtitles_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CuesParsedData extends StObject {
  
  var cues: Any
  
  var track: String
  
  var `type`: captions | subtitles_
}
object CuesParsedData {
  
  inline def apply(cues: Any, track: String, `type`: captions | subtitles_): CuesParsedData = {
    val __obj = js.Dynamic.literal(cues = cues.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CuesParsedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CuesParsedData] (val x: Self) extends AnyVal {
    
    inline def setCues(value: Any): Self = StObject.set(x, "cues", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setType(value: captions | subtitles_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
