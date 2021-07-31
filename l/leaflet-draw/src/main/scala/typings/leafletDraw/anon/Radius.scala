package typings.leafletDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: String
  
  var tooltip: Start
}
object Radius {
  
  @scala.inline
  def apply(radius: String, tooltip: Start): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  @scala.inline
  implicit class RadiusMutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: Start): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
