package typings.materialUi.scaleInMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInProps extends Props[ScaleIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var maxScale: js.UndefOr[Double] = js.undefined
  var minScale: js.UndefOr[Double] = js.undefined
}

object ScaleInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: ReactNode = null,
    enterDelay: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[ScaleIn]] = js.undefined
  ): ScaleInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(enterDelay)) __obj.updateDynamic("enterDelay")(enterDelay.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInProps]
  }
}

