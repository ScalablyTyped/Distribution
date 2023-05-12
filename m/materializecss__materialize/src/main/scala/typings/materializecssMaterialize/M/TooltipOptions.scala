package typings.materializecssMaterialize.M

import typings.materializecssMaterialize.materializecssMaterializeStrings.bottom
import typings.materializecssMaterialize.materializecssMaterializeStrings.left
import typings.materializecssMaterialize.materializecssMaterializeStrings.right
import typings.materializecssMaterialize.materializecssMaterializeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /**
    * Delay time before tooltip appears.
    * @default 0
    */
  var enterDelay: Double
  
  /**
    * Delay time before tooltip disappears.
    * @default 200
    */
  var exitDelay: Double
  
  /**
    * HTML content that will be appended to text.\
    * Only use properly sanitized or otherwise trusted data for html.\
    * Will be ignored if unsafeHTML is set.
    * @deprecated Will be removed in a later release.
    * @default null
    */
  var html: String
  
  /**
    * Enter transition duration.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Set distance tooltip appears away from its activator
    * excluding transitionMovement.
    * @default 5
    */
  var margin: Double
  
  /**
    * Opacity of the tooltip.
    * @default 1
    */
  var opacity: Double
  
  /**
    * Exit transition duration.
    * @default 250
    */
  var outDuration: Double
  
  /**
    * Set the direction of the tooltip.
    * @default 'bottom'
    */
  var position: top | right | bottom | left
  
  /**
    * Text string for the tooltip.
    * @default ""
    */
  var text: String
  
  /**
    * Amount in px that the tooltip moves during its transition.
    * @default 10
    */
  var transitionMovement: Double
  
  /**
    * HTML content that will be appended to the text.
    * Only use properly sanitized or otherwise trusted data for unsafeHTML.
    * @default null
    */
  var unsafeHTML: String
}
object TooltipOptions {
  
  inline def apply(
    enterDelay: Double,
    exitDelay: Double,
    html: String,
    inDuration: Double,
    margin: Double,
    opacity: Double,
    outDuration: Double,
    position: top | right | bottom | left,
    text: String,
    transitionMovement: Double,
    unsafeHTML: String
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal(enterDelay = enterDelay.asInstanceOf[js.Any], exitDelay = exitDelay.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transitionMovement = transitionMovement.asInstanceOf[js.Any], unsafeHTML = unsafeHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: top | right | bottom | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTransitionMovement(value: Double): Self = StObject.set(x, "transitionMovement", value.asInstanceOf[js.Any])
    
    inline def setUnsafeHTML(value: String): Self = StObject.set(x, "unsafeHTML", value.asInstanceOf[js.Any])
  }
}
