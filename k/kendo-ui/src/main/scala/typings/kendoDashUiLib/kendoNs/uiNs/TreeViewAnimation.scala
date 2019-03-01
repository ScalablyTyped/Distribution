package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewAnimation extends js.Object {
  var collapse: js.UndefOr[scala.Boolean | TreeViewAnimationCollapse] = js.undefined
  var expand: js.UndefOr[scala.Boolean | TreeViewAnimationExpand] = js.undefined
}

object TreeViewAnimation {
  @scala.inline
  def apply(
    collapse: scala.Boolean | TreeViewAnimationCollapse = null,
    expand: scala.Boolean | TreeViewAnimationExpand = null
  ): TreeViewAnimation = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewAnimation]
  }
}

