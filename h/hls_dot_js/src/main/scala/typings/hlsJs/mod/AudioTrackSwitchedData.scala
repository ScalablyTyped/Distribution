package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioTrackSwitchedData extends StObject {
  
  var id: Double
}
object AudioTrackSwitchedData {
  
  inline def apply(id: Double): AudioTrackSwitchedData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackSwitchedData]
  }
  
  extension [Self <: AudioTrackSwitchedData](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
