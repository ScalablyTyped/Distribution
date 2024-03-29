package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlindEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
}
object BlindEffect {
  
  inline def apply(): BlindEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlindEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlindEffect] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
