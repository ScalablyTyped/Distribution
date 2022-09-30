package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEvent extends StObject {
  
  var nativeEvent: Error
}
object NativeEvent {
  
  inline def apply(nativeEvent: Error): NativeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
  
  extension [Self <: NativeEvent](x: Self) {
    
    inline def setNativeEvent(value: Error): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
