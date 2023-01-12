package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//shape configs class
trait RectConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
}
object RectConfig {
  
  inline def apply(): RectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectConfig] (val x: Self) extends AnyVal {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
  }
}
