package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props extends StObject {
  
  var anchor: DataConstantProperty[map | viewport]
  
  var color: DataConstantProperty[Color]
  
  var intensity: DataConstantProperty[Double]
  
  var position: LightPositionProperty
}
object Props {
  
  inline def apply(
    anchor: DataConstantProperty[map | viewport],
    color: DataConstantProperty[Color],
    intensity: DataConstantProperty[Double],
    position: LightPositionProperty
  ): Props = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setColor(value: DataConstantProperty[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: DataConstantProperty[Double]): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: LightPositionProperty): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
