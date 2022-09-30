package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventLoaded extends StObject {
  
  var nativeEvent: Loaded
}
object NativeEventLoaded {
  
  inline def apply(nativeEvent: Loaded): NativeEventLoaded = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventLoaded]
  }
  
  extension [Self <: NativeEventLoaded](x: Self) {
    
    inline def setNativeEvent(value: Loaded): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
