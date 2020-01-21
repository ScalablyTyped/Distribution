package typings.masonryLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var columnWidth: js.UndefOr[js.Any] = js.undefined
  // setup
  var containerStyle: js.UndefOr[js.Object] = js.undefined
  var fitWidth: js.UndefOr[Boolean] = js.undefined
  var gutter: js.UndefOr[js.Any] = js.undefined
  var horizontalOrder: js.UndefOr[Boolean] = js.undefined
  var initLayout: js.UndefOr[Boolean] = js.undefined
  // layout
  var itemSelector: js.UndefOr[String] = js.undefined
  var originLeft: js.UndefOr[Boolean] = js.undefined
  var originTop: js.UndefOr[Boolean] = js.undefined
  var percentPosition: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean] = js.undefined
  var stamp: js.UndefOr[String] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    columnWidth: js.Any = null,
    containerStyle: js.Object = null,
    fitWidth: js.UndefOr[Boolean] = js.undefined,
    gutter: js.Any = null,
    horizontalOrder: js.UndefOr[Boolean] = js.undefined,
    initLayout: js.UndefOr[Boolean] = js.undefined,
    itemSelector: String = null,
    originLeft: js.UndefOr[Boolean] = js.undefined,
    originTop: js.UndefOr[Boolean] = js.undefined,
    percentPosition: js.UndefOr[Boolean] = js.undefined,
    resize: js.UndefOr[Boolean] = js.undefined,
    stamp: String = null,
    transitionDuration: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOrder)) __obj.updateDynamic("horizontalOrder")(horizontalOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(initLayout)) __obj.updateDynamic("initLayout")(initLayout.asInstanceOf[js.Any])
    if (itemSelector != null) __obj.updateDynamic("itemSelector")(itemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(originLeft)) __obj.updateDynamic("originLeft")(originLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(originTop)) __obj.updateDynamic("originTop")(originTop.asInstanceOf[js.Any])
    if (!js.isUndefined(percentPosition)) __obj.updateDynamic("percentPosition")(percentPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (stamp != null) __obj.updateDynamic("stamp")(stamp.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

