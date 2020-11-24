package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.bottom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.TooltipOptions> */
@js.native
trait PartialTooltipOptions extends js.Object {
  
  var enterDelay: js.UndefOr[Double] = js.native
  
  var exitDelay: js.UndefOr[Double] = js.native
  
  var html: js.UndefOr[String] = js.native
  
  var inDuration: js.UndefOr[Double] = js.native
  
  var margin: js.UndefOr[Double] = js.native
  
  var outDuration: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[top | right | bottom | left] = js.native
  
  var transitionMovement: js.UndefOr[Double] = js.native
}
object PartialTooltipOptions {
  
  @scala.inline
  def apply(): PartialTooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipOptions]
  }
  
  @scala.inline
  implicit class PartialTooltipOptionsOps[Self <: PartialTooltipOptions] (val x: Self) extends AnyVal {
    
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
    def deleteEnterDelay: Self = this.set("enterDelay", js.undefined)
    
    @scala.inline
    def setExitDelay(value: Double): Self = this.set("exitDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitDelay: Self = this.set("exitDelay", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInDuration: Self = this.set("inDuration", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutDuration: Self = this.set("outDuration", js.undefined)
    
    @scala.inline
    def setPosition(value: top | right | bottom | left): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTransitionMovement(value: Double): Self = this.set("transitionMovement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionMovement: Self = this.set("transitionMovement", js.undefined)
  }
}
