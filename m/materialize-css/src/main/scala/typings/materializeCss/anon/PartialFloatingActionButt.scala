package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.buttom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.FloatingActionButtonOptions> */
@js.native
trait PartialFloatingActionButt extends js.Object {
  
  var direction: js.UndefOr[top | right | buttom | left] = js.native
  
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  
  var toolbarEnabled: js.UndefOr[Boolean] = js.native
}
object PartialFloatingActionButt {
  
  @scala.inline
  def apply(): PartialFloatingActionButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFloatingActionButt]
  }
  
  @scala.inline
  implicit class PartialFloatingActionButtOps[Self <: PartialFloatingActionButt] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: top | right | buttom | left): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = this.set("toolbarEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarEnabled: Self = this.set("toolbarEnabled", js.undefined)
  }
}
