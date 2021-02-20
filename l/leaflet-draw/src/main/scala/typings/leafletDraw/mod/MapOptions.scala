package typings.leafletDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOptions extends StObject {
  
  var drawControl: js.UndefOr[Boolean] = js.native
  
  var drawControlTooltips: js.UndefOr[Boolean] = js.native
  
  var touchExtend: js.UndefOr[Boolean] = js.native
}
object MapOptions {
  
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit class MapOptionsMutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawControl(value: Boolean): Self = StObject.set(x, "drawControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawControlTooltips(value: Boolean): Self = StObject.set(x, "drawControlTooltips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawControlTooltipsUndefined: Self = StObject.set(x, "drawControlTooltips", js.undefined)
    
    @scala.inline
    def setDrawControlUndefined: Self = StObject.set(x, "drawControl", js.undefined)
    
    @scala.inline
    def setTouchExtend(value: Boolean): Self = StObject.set(x, "touchExtend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchExtendUndefined: Self = StObject.set(x, "touchExtend", js.undefined)
  }
}
