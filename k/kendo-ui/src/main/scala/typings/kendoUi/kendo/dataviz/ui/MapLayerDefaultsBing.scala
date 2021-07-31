package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsBing extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var imagerySet: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object MapLayerDefaultsBing {
  
  @scala.inline
  def apply(): MapLayerDefaultsBing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBing]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsBingMutableBuilder[Self <: MapLayerDefaultsBing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setImagerySet(value: String): Self = StObject.set(x, "imagerySet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagerySetUndefined: Self = StObject.set(x, "imagerySet", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
