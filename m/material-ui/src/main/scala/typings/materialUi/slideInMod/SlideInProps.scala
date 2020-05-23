package typings.materialUi.slideInMod

import typings.materialUi.MaterialUI.propTypes.direction
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var direction: js.UndefOr[typings.materialUi.MaterialUI.propTypes.direction] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SlideInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: ReactNode = null,
    direction: direction = null,
    enterDelay: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[SlideIn]] = js.undefined,
    style: CSSProperties = null
  ): SlideInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enterDelay)) __obj.updateDynamic("enterDelay")(enterDelay.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
}

