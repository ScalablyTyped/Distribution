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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEventLoaded] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: Loaded): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
