package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxAnimationClose extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var effects: js.UndefOr[String] = js.undefined
}
object ComboBoxAnimationClose {
  
  @scala.inline
  def apply(): ComboBoxAnimationClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComboBoxAnimationClose]
  }
  
  @scala.inline
  implicit class ComboBoxAnimationCloseMutableBuilder[Self <: ComboBoxAnimationClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEffects(value: String): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
  }
}
