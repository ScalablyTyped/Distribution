package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBarAnimation extends js.Object {
  var collapse: js.UndefOr[PanelBarAnimationCollapse] = js.undefined
  var expand: js.UndefOr[PanelBarAnimationExpand] = js.undefined
}

object PanelBarAnimation {
  @scala.inline
  def apply(collapse: PanelBarAnimationCollapse = null, expand: PanelBarAnimationExpand = null): PanelBarAnimation = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBarAnimation]
  }
}

