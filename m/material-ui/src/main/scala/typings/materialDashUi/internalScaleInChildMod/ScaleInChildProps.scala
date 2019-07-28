package typings.materialDashUi.internalScaleInChildMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
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
    enterDelay: Int | Double = null,
    key: Key = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    ref: LegacyRef[ScaleInChild] = null,
    style: CSSProperties = null
  ): ScaleInChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScaleInChildProps]
  }
}

