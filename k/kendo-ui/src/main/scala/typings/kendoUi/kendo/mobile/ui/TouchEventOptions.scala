package typings.kendoUi.kendo.mobile.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEventOptions extends StObject {
  
  var target: js.UndefOr[JQuery] = js.undefined
  
  var x: js.UndefOr[TouchAxis] = js.undefined
  
  var y: js.UndefOr[TouchAxis] = js.undefined
}
object TouchEventOptions {
  
  inline def apply(): TouchEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchEventOptions] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setX(value: TouchAxis): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: TouchAxis): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
