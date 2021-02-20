package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DivOverlayOptions extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[PointExpression] = js.native
  
  var pane: js.UndefOr[String] = js.native
  
  var zoomAnimation: js.UndefOr[Boolean] = js.native
}
object DivOverlayOptions {
  
  @scala.inline
  def apply(): DivOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivOverlayOptions]
  }
  
  @scala.inline
  implicit class DivOverlayOptionsMutableBuilder[Self <: DivOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOffset(value: PointExpression): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
  }
}
