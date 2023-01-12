package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackSwitchedData extends StObject {
  
  var id: Double
}
object TrackSwitchedData {
  
  inline def apply(id: Double): TrackSwitchedData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSwitchedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackSwitchedData] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
