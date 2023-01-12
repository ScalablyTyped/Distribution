package typings.materializecssMaterialize.anon

import typings.materializecssMaterialize.materializecssMaterializeStrings.bottom
import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.materializecssMaterialize.materializecssMaterializeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@materializecss/materialize.M.TooltipOptions> */
trait PartialTooltipOptions extends StObject {
  
  var enterDelay: js.UndefOr[Double] = js.undefined
  
  var exitDelay: js.UndefOr[Double] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[top | right | bottom | left] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var transitionMovement: js.UndefOr[Double] = js.undefined
  
  var unsafeHTML: js.UndefOr[String] = js.undefined
}
object PartialTooltipOptions {
  
  inline def apply(): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTooltipOptions] (val x: Self) extends AnyVal {
    
    inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
    
    inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
    
    inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
    
    inline def setPosition(value: top | right | bottom | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTransitionMovement(value: Double): Self = StObject.set(x, "transitionMovement", value.asInstanceOf[js.Any])
    
    inline def setTransitionMovementUndefined: Self = StObject.set(x, "transitionMovement", js.undefined)
    
    inline def setUnsafeHTML(value: String): Self = StObject.set(x, "unsafeHTML", value.asInstanceOf[js.Any])
    
    inline def setUnsafeHTMLUndefined: Self = StObject.set(x, "unsafeHTML", js.undefined)
  }
}
