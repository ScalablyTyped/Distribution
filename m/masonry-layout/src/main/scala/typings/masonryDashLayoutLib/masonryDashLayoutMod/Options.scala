package typings
package masonryDashLayoutLib.masonryDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var columnWidth: js.UndefOr[js.Any] = js.undefined
  // setup
  var containerStyle: js.UndefOr[js.Object] = js.undefined
  var fitWidth: js.UndefOr[scala.Boolean] = js.undefined
  var gutter: js.UndefOr[js.Any] = js.undefined
  var horizontalOrder: js.UndefOr[scala.Boolean] = js.undefined
  var initLayout: js.UndefOr[scala.Boolean] = js.undefined
  // layout
  var itemSelector: js.UndefOr[java.lang.String] = js.undefined
  var originLeft: js.UndefOr[scala.Boolean] = js.undefined
  var originTop: js.UndefOr[scala.Boolean] = js.undefined
  var percentPosition: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  var stamp: js.UndefOr[java.lang.String] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    columnWidth: js.Any = null,
    containerStyle: js.Object = null,
    fitWidth: js.UndefOr[scala.Boolean] = js.undefined,
    gutter: js.Any = null,
    horizontalOrder: js.UndefOr[scala.Boolean] = js.undefined,
    initLayout: js.UndefOr[scala.Boolean] = js.undefined,
    itemSelector: java.lang.String = null,
    originLeft: js.UndefOr[scala.Boolean] = js.undefined,
    originTop: js.UndefOr[scala.Boolean] = js.undefined,
    percentPosition: js.UndefOr[scala.Boolean] = js.undefined,
    resize: js.UndefOr[scala.Boolean] = js.undefined,
    stamp: java.lang.String = null,
    transitionDuration: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter)
    if (!js.isUndefined(horizontalOrder)) __obj.updateDynamic("horizontalOrder")(horizontalOrder)
    if (!js.isUndefined(initLayout)) __obj.updateDynamic("initLayout")(initLayout)
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector)
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft)
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop)
    if (!js.isUndefined(percentPosition)) __obj.updateDynamic("percentPosition")(percentPosition)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    if (stamp != null) __obj.updateDynamic("stamp")(stamp)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.asInstanceOf[Options]
  }
}

