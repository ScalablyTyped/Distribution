package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerConfig
  extends StObject
     with ObjectOptionsConfig {
  
  var clearBeforeDraw: js.UndefOr[Boolean] = js.undefined
}
object LayerConfig {
  
  inline def apply(): LayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerConfig] (val x: Self) extends AnyVal {
    
    inline def setClearBeforeDraw(value: Boolean): Self = StObject.set(x, "clearBeforeDraw", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeDrawUndefined: Self = StObject.set(x, "clearBeforeDraw", js.undefined)
  }
}
