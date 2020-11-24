package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.bottom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipOptions extends js.Object {
  
  /**
    * Delay time before tooltip appears.
    * @default 200
    */
  var enterDelay: Double = js.native
  
  /**
    * Delay time before tooltip disappears.
    * @default 0
    */
  var exitDelay: Double = js.native
  
  /**
    * Can take regular text or HTML strings.
    * @default null
    */
  var html: String = js.native
  
  /**
    * Enter transition duration.
    * @default 300
    */
  var inDuration: Double = js.native
  
  /**
    * Set distance tooltip appears away from its activator excluding transitionMovement.
    * @default 5
    */
  var margin: Double = js.native
  
  /**
    * Exit transition duration.
    * @default 250
    */
  var outDuration: Double = js.native
  
  /**
    * Set the direction of the tooltip.
    * @default 'bottom'
    */
  var position: top | right | bottom | left = js.native
  
  /**
    * Amount in px that the tooltip moves during its transition.
    * @default 10
    */
  var transitionMovement: Double = js.native
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
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnterDelay(value: Double): Self = this.set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitDelay(value: Double): Self = this.set("exitDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: top | right | bottom | left): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionMovement(value: Double): Self = this.set("transitionMovement", value.asInstanceOf[js.Any])
  }
}
