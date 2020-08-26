package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.buttom
import typings.materializeCss.materializeCssStrings.left
import typings.materializeCss.materializeCssStrings.right
import typings.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloatingActionButtonOptions extends js.Object {
  /**
    * Direction FAB menu opens
    * @default "top"
    */
  var direction: top | right | buttom | left = js.native
  /**
    * true: FAB menu appears on hover, false: FAB menu appears on click
    * @default true
    */
  var hoverEnabled: Boolean = js.native
  /**
    * Enable transit the FAB into a toolbar on click
    * @default false
    */
  var toolbarEnabled: Boolean = js.native
}

object FloatingActionButtonOptions {
  @scala.inline
  def apply(direction: top | right | buttom | left, hoverEnabled: Boolean, toolbarEnabled: Boolean): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], hoverEnabled = hoverEnabled.asInstanceOf[js.Any], toolbarEnabled = toolbarEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
  @scala.inline
  implicit class FloatingActionButtonOptionsOps[Self <: FloatingActionButtonOptions] (val x: Self) extends AnyVal {
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
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = this.set("toolbarEnabled", value.asInstanceOf[js.Any])
  }
  
}

