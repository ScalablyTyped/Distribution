package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait audioTrackSwitchingData extends StObject {
  
  var id: String
}
object audioTrackSwitchingData {
  
  inline def apply(id: String): audioTrackSwitchingData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTrackSwitchingData]
  }
  
  extension [Self <: audioTrackSwitchingData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
