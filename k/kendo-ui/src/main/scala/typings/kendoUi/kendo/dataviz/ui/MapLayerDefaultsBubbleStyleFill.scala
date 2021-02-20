package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerDefaultsBubbleStyleFill extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
}
object MapLayerDefaultsBubbleStyleFill {
  
  @scala.inline
  def apply(): MapLayerDefaultsBubbleStyleFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsBubbleStyleFill]
  }
  
  @scala.inline
  implicit class MapLayerDefaultsBubbleStyleFillMutableBuilder[Self <: MapLayerDefaultsBubbleStyleFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
