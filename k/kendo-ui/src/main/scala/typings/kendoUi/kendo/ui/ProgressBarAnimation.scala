package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarAnimation extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
}
object ProgressBarAnimation {
  
  @scala.inline
  def apply(): ProgressBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarAnimation]
  }
  
  @scala.inline
  implicit class ProgressBarAnimationMutableBuilder[Self <: ProgressBarAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
