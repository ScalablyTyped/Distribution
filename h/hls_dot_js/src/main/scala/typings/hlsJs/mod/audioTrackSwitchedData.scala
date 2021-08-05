package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait audioTrackSwitchedData extends StObject {
  
  var id: String
}
object audioTrackSwitchedData {
  
  inline def apply(id: String): audioTrackSwitchedData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[audioTrackSwitchedData]
  }
  
  extension [Self <: audioTrackSwitchedData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
