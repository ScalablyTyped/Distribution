package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventSelection extends StObject {
  
  var nativeEvent: Selection
}
object NativeEventSelection {
  
  inline def apply(nativeEvent: Selection): NativeEventSelection = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEventSelection] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: Selection): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
