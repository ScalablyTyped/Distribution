package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Down extends StObject {
  
  var down: js.UndefOr[String] = js.undefined
  
  var hover: js.UndefOr[String] = js.undefined
  
  var normal: js.UndefOr[String] = js.undefined
}
object Down {
  
  inline def apply(): Down = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Down]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Down] (val x: Self) extends AnyVal {
    
    inline def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
  }
}
