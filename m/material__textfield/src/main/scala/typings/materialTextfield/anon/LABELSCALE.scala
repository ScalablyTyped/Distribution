package typings.materialTextfield.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LABELSCALE extends StObject {
  
  var LABEL_SCALE: Double
}
object LABELSCALE {
  
  inline def apply(LABEL_SCALE: Double): LABELSCALE = {
    val __obj = js.Dynamic.literal(LABEL_SCALE = LABEL_SCALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[LABELSCALE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LABELSCALE] (val x: Self) extends AnyVal {
    
    inline def setLABEL_SCALE(value: Double): Self = StObject.set(x, "LABEL_SCALE", value.asInstanceOf[js.Any])
  }
}
