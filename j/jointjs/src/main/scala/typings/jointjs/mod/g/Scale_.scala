package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale_ extends StObject {
  
  var sx: Double
  
  var sy: Double
}
object Scale_ {
  
  @scala.inline
  def apply(sx: Double, sy: Double): Scale_ = {
    val __obj = js.Dynamic.literal(sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale_]
  }
  
  @scala.inline
  implicit class Scale_MutableBuilder[Self <: Scale_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
  }
}
