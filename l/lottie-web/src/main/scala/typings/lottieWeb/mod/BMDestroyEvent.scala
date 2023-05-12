package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMDestroyEvent extends StObject {
  
  var `type`: destroy
}
object BMDestroyEvent {
  
  inline def apply(): BMDestroyEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("destroy")
    __obj.asInstanceOf[BMDestroyEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BMDestroyEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: destroy): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
