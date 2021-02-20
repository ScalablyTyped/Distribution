package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugePointerItemTrack extends StObject {
  
  var border: js.UndefOr[LinearGaugePointerItemTrackBorder] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object LinearGaugePointerItemTrack {
  
  @scala.inline
  def apply(): LinearGaugePointerItemTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugePointerItemTrack]
  }
  
  @scala.inline
  implicit class LinearGaugePointerItemTrackMutableBuilder[Self <: LinearGaugePointerItemTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: LinearGaugePointerItemTrackBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
