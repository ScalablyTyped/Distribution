package typings.materializeDashCss.MNs

import typings.materializeDashCss.materializeDashCssStrings.buttom
import typings.materializeDashCss.materializeDashCssStrings.left
import typings.materializeDashCss.materializeDashCssStrings.right
import typings.materializeDashCss.materializeDashCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingActionButtonOptions extends js.Object {
  /**
    * Direction FAB menu opens
    * @default "top"
    */
  var direction: top | right | buttom | left
  /**
    * true: FAB menu appears on hover, false: FAB menu appears on click
    * @default true
    */
  var hoverEnabled: Boolean
  /**
    * Enable transit the FAB into a toolbar on click
    * @default false
    */
  var toolbarEnabled: Boolean
}

object FloatingActionButtonOptions {
  @scala.inline
  def apply(direction: top | right | buttom | left, hoverEnabled: Boolean, toolbarEnabled: Boolean): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], hoverEnabled = hoverEnabled, toolbarEnabled = toolbarEnabled)
  
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
}

