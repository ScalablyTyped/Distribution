package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[js.Array[String]] = js.native
  
  var percent: js.UndefOr[Double] = js.native
  
  var scale: js.UndefOr[String] = js.native
}
object ScaleEffect {
  
  @scala.inline
  def apply(): ScaleEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleEffect]
  }
  
  @scala.inline
  implicit class ScaleEffectMutableBuilder[Self <: ScaleEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value :_*))
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
