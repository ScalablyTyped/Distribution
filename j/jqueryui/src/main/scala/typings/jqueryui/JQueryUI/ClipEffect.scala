package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipEffect extends StObject {
  
  var direction: js.UndefOr[Double] = js.undefined
}
object ClipEffect {
  
  inline def apply(): ClipEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipEffect] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
