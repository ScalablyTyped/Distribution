package typings.materialUi.MaterialUI.Popover

import typings.materialUi.MaterialUI.propTypes.origin
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverAnimationDefaultProps extends PopoverAnimationProps {
  var className: js.UndefOr[String] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object PopoverAnimationDefaultProps {
  @scala.inline
  def apply(
    open: Boolean,
    className: String = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    zDepth: Int | Double = null
  ): PopoverAnimationDefaultProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverAnimationDefaultProps]
  }
}

