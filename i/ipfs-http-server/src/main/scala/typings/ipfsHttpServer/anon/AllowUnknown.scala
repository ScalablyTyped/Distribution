package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowUnknown extends StObject {
  
  var allowUnknown: Boolean
  
  var stripUnknown: Boolean
}
object AllowUnknown {
  
  inline def apply(allowUnknown: Boolean, stripUnknown: Boolean): AllowUnknown = {
    val __obj = js.Dynamic.literal(allowUnknown = allowUnknown.asInstanceOf[js.Any], stripUnknown = stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUnknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowUnknown] (val x: Self) extends AnyVal {
    
    inline def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
    
    inline def setStripUnknown(value: Boolean): Self = StObject.set(x, "stripUnknown", value.asInstanceOf[js.Any])
  }
}
