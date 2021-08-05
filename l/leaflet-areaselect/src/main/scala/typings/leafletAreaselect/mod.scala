package typings.leafletAreaselect

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def areaSelect(box: AreaSelectOptions): AreaSelect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("areaSelect")(box.asInstanceOf[js.Any]).asInstanceOf[AreaSelect_]
  
  trait AreaSelectOptions extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AreaSelectOptions {
    
    inline def apply(): AreaSelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaSelectOptions]
    }
    
    extension [Self <: AreaSelectOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait AreaSelect_ extends StObject {
    
    def addTo(map: Map_): Map_
    
    def getBounds(): LatLngBounds_
    
    def remove(): Unit
    
    def setDimensions(dim: Dimension): Unit
  }
  object AreaSelect_ {
    
    inline def apply(
      addTo: Map_ => Map_,
      getBounds: () => LatLngBounds_,
      remove: () => Unit,
      setDimensions: Dimension => Unit
    ): AreaSelect_ = {
      val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), getBounds = js.Any.fromFunction0(getBounds), remove = js.Any.fromFunction0(remove), setDimensions = js.Any.fromFunction1(setDimensions))
      __obj.asInstanceOf[AreaSelect_]
    }
    
    extension [Self <: AreaSelect_](x: Self) {
      
      inline def setAddTo(value: Map_ => Map_): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
      
      inline def setGetBounds(value: () => LatLngBounds_): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setSetDimensions(value: Dimension => Unit): Self = StObject.set(x, "setDimensions", js.Any.fromFunction1(value))
    }
  }
  
  trait Dimension extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimension {
    
    inline def apply(height: Double, width: Double): Dimension = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimension]
    }
    
    extension [Self <: Dimension](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
