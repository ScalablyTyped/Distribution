package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitSegmentData extends StObject {
  
  var initPTS: js.UndefOr[Double] = js.undefined
  
  var timescale: js.UndefOr[Double] = js.undefined
  
  var tracks: js.UndefOr[TrackSet] = js.undefined
}
object InitSegmentData {
  
  inline def apply(): InitSegmentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitSegmentData]
  }
  
  extension [Self <: InitSegmentData](x: Self) {
    
    inline def setInitPTS(value: Double): Self = StObject.set(x, "initPTS", value.asInstanceOf[js.Any])
    
    inline def setInitPTSUndefined: Self = StObject.set(x, "initPTS", js.undefined)
    
    inline def setTimescale(value: Double): Self = StObject.set(x, "timescale", value.asInstanceOf[js.Any])
    
    inline def setTimescaleUndefined: Self = StObject.set(x, "timescale", js.undefined)
    
    inline def setTracks(value: TrackSet): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
  }
}
