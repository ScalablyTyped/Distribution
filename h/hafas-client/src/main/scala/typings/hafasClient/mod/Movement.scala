package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Movement extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  
  var line: js.UndefOr[Line] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  
  var polyline: js.UndefOr[FeatureCollection] = js.undefined
  
  var tripId: js.UndefOr[String] = js.undefined
}
object Movement {
  
  inline def apply(): Movement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Movement]
  }
  
  extension [Self <: Movement](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNextStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "nextStopovers", value.asInstanceOf[js.Any])
    
    inline def setNextStopoversUndefined: Self = StObject.set(x, "nextStopovers", js.undefined)
    
    inline def setNextStopoversVarargs(value: StopOver*): Self = StObject.set(x, "nextStopovers", js.Array(value*))
    
    inline def setPolyline(value: FeatureCollection): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
  }
}
