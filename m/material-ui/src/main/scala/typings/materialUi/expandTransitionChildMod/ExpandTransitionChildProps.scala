package typings.materialUi.expandTransitionChildMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandTransitionChildProps extends Props[ExpandTransitionChild] {
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var transitionDelay: js.UndefOr[Double] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object ExpandTransitionChildProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    enterDelay: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[ExpandTransitionChild]] = js.undefined,
    style: CSSProperties = null,
    transitionDelay: js.UndefOr[Double] = js.undefined,
    transitionDuration: js.UndefOr[Double] = js.undefined
  ): ExpandTransitionChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(enterDelay)) __obj.updateDynamic("enterDelay")(enterDelay.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDelay)) __obj.updateDynamic("transitionDelay")(transitionDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandTransitionChildProps]
  }
}

