package typings.jointjs.mod.elementTools.Button

import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.MarkupJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options
  extends typings.jointjs.mod.dia.ToolView.Options {
  
  var action: js.UndefOr[ActionCallback] = js.native
  
  var markup: js.UndefOr[MarkupJSON] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var rotate: js.UndefOr[Boolean] = js.native
  
  var useModelGeometry: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAction(value: (/* evt */ Event, /* view */ LinkView) => Unit): Self = this.set("action", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setMarkup(value: MarkupJSON): Self = this.set("markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setRotate(value: Boolean): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setUseModelGeometry(value: Boolean): Self = this.set("useModelGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseModelGeometry: Self = this.set("useModelGeometry", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
