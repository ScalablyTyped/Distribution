package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LightSpecification extends StObject {
  
  var anchor: js.UndefOr[PropertyValueSpecification[map | viewport]] = js.undefined
  
  var color: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var intensity: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var position: js.UndefOr[PropertyValueSpecification[js.Tuple3[Double, Double, Double]]] = js.undefined
}
object LightSpecification {
  
  inline def apply(): LightSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LightSpecification] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: PropertyValueSpecification[map | viewport]): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setColor(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIntensity(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
    
    inline def setPosition(value: PropertyValueSpecification[js.Tuple3[Double, Double, Double]]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
