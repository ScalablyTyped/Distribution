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
  
  @scala.inline
  def apply(): LayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerConfig]
  }
  
  @scala.inline
  implicit class LayerConfigMutableBuilder[Self <: LayerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearBeforeDraw(value: Boolean): Self = StObject.set(x, "clearBeforeDraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearBeforeDrawUndefined: Self = StObject.set(x, "clearBeforeDraw", js.undefined)
  }
}
