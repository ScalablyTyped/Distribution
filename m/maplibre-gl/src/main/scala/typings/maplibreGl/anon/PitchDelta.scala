package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PitchDelta extends StObject {
  
  var pitchDelta: Double
}
object PitchDelta {
  
  inline def apply(pitchDelta: Double): PitchDelta = {
    val __obj = js.Dynamic.literal(pitchDelta = pitchDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[PitchDelta]
  }
  
  extension [Self <: PitchDelta](x: Self) {
    
    inline def setPitchDelta(value: Double): Self = StObject.set(x, "pitchDelta", value.asInstanceOf[js.Any])
  }
}
