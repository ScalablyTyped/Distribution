package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsShape extends StObject {
  
  var attribution: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[MapLayerDefaultsShapeStyle] = js.native
}
object MapLayerDefaultsShape {
  
  @scala.inline
  def apply(): MapLayerDefaultsShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsShape]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsShapeMutableBuilder[Self <: MapLayerDefaultsShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setStyle(value: MapLayerDefaultsShapeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
