package typings.materialUi.slideInChildMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInChildProps extends Props[SlideInChild] {
  var direction: js.UndefOr[String] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var getLeaveDirection: js.Function
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SlideInChildProps {
  @scala.inline
  def apply(
    getLeaveDirection: js.Function,
    children: ReactNode = null,
    direction: String = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[SlideInChild] = null,
    style: CSSProperties = null
  ): SlideInChildProps = {
    val __obj = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInChildProps]
  }
}

