package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PitchWithRotate extends StObject {
  
  var pitchWithRotate: Boolean
}
object PitchWithRotate {
  
  inline def apply(pitchWithRotate: Boolean): PitchWithRotate = {
    val __obj = js.Dynamic.literal(pitchWithRotate = pitchWithRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PitchWithRotate]
  }
  
  extension [Self <: PitchWithRotate](x: Self) {
    
    inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
  }
}
