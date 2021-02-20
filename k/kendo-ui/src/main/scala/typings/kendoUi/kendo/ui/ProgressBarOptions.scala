package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | ProgressBarAnimation] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ ProgressBarChangeEvent, Unit]] = js.native
  
  var chunkCount: js.UndefOr[Double] = js.native
  
  var complete: js.UndefOr[js.Function1[/* e */ ProgressBarCompleteEvent, Unit]] = js.native
  
  var enable: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var showStatus: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ProgressBarOptions {
  
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  @scala.inline
  implicit class ProgressBarOptionsMutableBuilder[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean | ProgressBarAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ProgressBarChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChunkCount(value: Double): Self = StObject.set(x, "chunkCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkCountUndefined: Self = StObject.set(x, "chunkCount", js.undefined)
    
    @scala.inline
    def setComplete(value: /* e */ ProgressBarCompleteEvent => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setShowStatus(value: Boolean): Self = StObject.set(x, "showStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStatusUndefined: Self = StObject.set(x, "showStatus", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
