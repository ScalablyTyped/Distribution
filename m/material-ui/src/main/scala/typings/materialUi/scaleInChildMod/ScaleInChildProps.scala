package typings.materialUi.scaleInChildMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInChildProps extends Props[ScaleInChild] {
  var enterDelay: js.UndefOr[Double] = js.undefined
  var maxScale: js.UndefOr[Double] = js.undefined
  var minScale: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ScaleInChildProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    enterDelay: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[ScaleInChild]] = js.undefined,
    style: CSSProperties = null
  ): ScaleInChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(enterDelay)) __obj.updateDynamic("enterDelay")(enterDelay.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInChildProps]
  }
}

