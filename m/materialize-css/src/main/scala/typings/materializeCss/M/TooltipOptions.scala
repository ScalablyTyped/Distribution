package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.bottom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /**
    * Delay time before tooltip appears.
    * @default 200
    */
  var enterDelay: Double
  
  /**
    * Delay time before tooltip disappears.
    * @default 0
    */
  var exitDelay: Double
  
  /**
    * Can take regular text or HTML strings.
    * @default null
    */
  var html: String
  
  /**
    * Enter transition duration.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Set distance tooltip appears away from its activator excluding transitionMovement.
    * @default 5
    */
  var margin: Double
  
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
    * Amount in px that the tooltip moves during its transition.
    * @default 10
    */
  var transitionMovement: Double
}
object TooltipOptions {
  
  @scala.inline
  def apply(
    enterDelay: Double,
    exitDelay: Double,
    html: String,
    inDuration: Double,
    margin: Double,
    outDuration: Double,
    position: top | right | bottom | left,
    transitionMovement: Double
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal(enterDelay = enterDelay.asInstanceOf[js.Any], exitDelay = exitDelay.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], transitionMovement = transitionMovement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: top | right | bottom | left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionMovement(value: Double): Self = StObject.set(x, "transitionMovement", value.asInstanceOf[js.Any])
  }
}
