package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.bottom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TooltipOptions> */
trait PartialTooltipOptions extends StObject {
  
  var enterDelay: js.UndefOr[Double] = js.undefined
  
  var exitDelay: js.UndefOr[Double] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var transitionMovement: js.UndefOr[Double] = js.undefined
}
object PartialTooltipOptions {
  
  @scala.inline
  def apply(): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipOptions]
  }
  
  @scala.inline
  implicit class PartialTooltipOptionsMutableBuilder[Self <: PartialTooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
    
    @scala.inline
    def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
    
    @scala.inline
    def setPosition(value: top | right | bottom | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTransitionMovement(value: Double): Self = StObject.set(x, "transitionMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionMovementUndefined: Self = StObject.set(x, "transitionMovement", js.undefined)
  }
}
