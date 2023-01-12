package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeExtensionInfo extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object ChromeExtensionInfo {
  
  inline def apply(): ChromeExtensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeExtensionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChromeExtensionInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
