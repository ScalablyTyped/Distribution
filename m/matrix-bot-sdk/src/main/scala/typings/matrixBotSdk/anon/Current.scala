package typings.matrixBotSdk.anon

import typings.matrixBotSdk.libMatrixClientMod.RoomReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: RoomReference
  
  var newer: js.Array[RoomReference]
  
  var previous: js.Array[RoomReference]
}
object Current {
  
  inline def apply(current: RoomReference, newer: js.Array[RoomReference], previous: js.Array[RoomReference]): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: RoomReference): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setNewer(value: js.Array[RoomReference]): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
    
    inline def setNewerVarargs(value: RoomReference*): Self = StObject.set(x, "newer", js.Array(value*))
    
    inline def setPrevious(value: js.Array[RoomReference]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousVarargs(value: RoomReference*): Self = StObject.set(x, "previous", js.Array(value*))
  }
}
