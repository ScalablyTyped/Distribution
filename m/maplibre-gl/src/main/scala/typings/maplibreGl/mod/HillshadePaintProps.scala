package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HillshadePaintProps extends StObject {
  
  var `hillshade-accent-color`: DataConstantProperty[Color]
  
  var `hillshade-exaggeration`: DataConstantProperty[Double]
  
  var `hillshade-highlight-color`: DataConstantProperty[Color]
  
  var `hillshade-illumination-anchor`: DataConstantProperty[map | viewport]
  
  var `hillshade-illumination-direction`: DataConstantProperty[Double]
  
  var `hillshade-shadow-color`: DataConstantProperty[Color]
}
object HillshadePaintProps {
  
  inline def apply(
    `hillshade-accent-color`: DataConstantProperty[Color],
    `hillshade-exaggeration`: DataConstantProperty[Double],
    `hillshade-highlight-color`: DataConstantProperty[Color],
    `hillshade-illumination-anchor`: DataConstantProperty[map | viewport],
    `hillshade-illumination-direction`: DataConstantProperty[Double],
    `hillshade-shadow-color`: DataConstantProperty[Color]
  ): HillshadePaintProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hillshade-accent-color")(`hillshade-accent-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-exaggeration")(`hillshade-exaggeration`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-highlight-color")(`hillshade-highlight-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-illumination-anchor")(`hillshade-illumination-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-illumination-direction")(`hillshade-illumination-direction`.asInstanceOf[js.Any])
    __obj.updateDynamic("hillshade-shadow-color")(`hillshade-shadow-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HillshadePaintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HillshadePaintProps] (val x: Self) extends AnyVal {
    
    inline def `setHillshade-accent-color`(value: DataConstantProperty[Color]): Self = StObject.set(x, "hillshade-accent-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-exaggeration`(value: DataConstantProperty[Double]): Self = StObject.set(x, "hillshade-exaggeration", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-highlight-color`(value: DataConstantProperty[Color]): Self = StObject.set(x, "hillshade-highlight-color", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-anchor`(value: DataConstantProperty[map | viewport]): Self = StObject.set(x, "hillshade-illumination-anchor", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-illumination-direction`(value: DataConstantProperty[Double]): Self = StObject.set(x, "hillshade-illumination-direction", value.asInstanceOf[js.Any])
    
    inline def `setHillshade-shadow-color`(value: DataConstantProperty[Color]): Self = StObject.set(x, "hillshade-shadow-color", value.asInstanceOf[js.Any])
  }
}
