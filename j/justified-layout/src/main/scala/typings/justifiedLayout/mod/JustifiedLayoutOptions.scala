package typings.justifiedLayout.mod

import typings.justifiedLayout.anon.Bottom
import typings.justifiedLayout.anon.Horizontal
import typings.justifiedLayout.justifiedLayoutStrings.center
import typings.justifiedLayout.justifiedLayoutStrings.justify
import typings.justifiedLayout.justifiedLayoutStrings.left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for configuring the justified layout.
  */
trait JustifiedLayoutOptions extends js.Object {
  /**
    * Provide a single integer to apply spacing both horizontally and vertically or provide an
    * object to apply individual values to each axis.
    * @default 10
    */
  var boxSpacing: js.UndefOr[Double | Horizontal] = js.undefined
  /**
    * Provide a single integer to apply padding to all sides or provide an object to apply
    * individual values to each side.
    * @default 10
    */
  var containerPadding: js.UndefOr[Double | Bottom] = js.undefined
  /**
    * The width that boxes will be contained within irrelevant of padding.
    * @default 1060
    */
  var containerWidth: js.UndefOr[Double] = js.undefined
  /**
    * Provide an aspect ratio here to return everything in that aspect ratio. Makes the values
    * in your input array irrelevant. The length of the array remains relevant.
    * @default false
    */
  var forceAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * If you'd like to insert a full width box every n rows you can specify it with this
    * parameter. The box on that row will ignore the targetRowHeight, make itself as wide as
    * `containerWidth - containerPadding` and be as tall as its aspect ratio defines. It'll
    * only happen if that item has an aspect ratio >= 1. Best to have a look at the examples to
    * see what this does.
    * @default false
    */
  var fullWidthBreakoutRowCadence: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Will stop adding rows at this number regardless of how many items still need to be laid
    * out.
    * @default Number.POSITIVE_INFINITY
    */
  var maxNumRows: js.UndefOr[Double] = js.undefined
  /**
    * By default we'll return items at the end of a justified layout even if they don't make a
    * full row. If false they'll be omitted from the output.
    * @default true
    */
  var showWidows: js.UndefOr[Boolean] = js.undefined
  /**
    * It's called a target because row height is the lever we use in order to fit everything in
    * nicely. The algorithm will get as close to the target row height as it can.
    * @default 320
    */
  var targetRowHeight: js.UndefOr[Double] = js.undefined
  /**
    * How far row heights can stray from targetRowHeight. `0` would force rows to be the
    * `targetRowHeight` exactly and would likely make it impossible to justify. The value must
    * be between `0` and `1`.
    * @default 0.25
    */
  var targetRowHeightTolerance: js.UndefOr[Double] = js.undefined
  /**
    * If widows are visible, how should they be laid out?
    * @default "left"
    */
  var widowLayoutStyle: js.UndefOr[left | justify | center] = js.undefined
}

object JustifiedLayoutOptions {
  @scala.inline
  def apply(
    boxSpacing: Double | Horizontal = null,
    containerPadding: Double | Bottom = null,
    containerWidth: js.UndefOr[Double] = js.undefined,
    forceAspectRatio: Boolean | Double = null,
    fullWidthBreakoutRowCadence: Boolean | Double = null,
    maxNumRows: js.UndefOr[Double] = js.undefined,
    showWidows: js.UndefOr[Boolean] = js.undefined,
    targetRowHeight: js.UndefOr[Double] = js.undefined,
    targetRowHeightTolerance: js.UndefOr[Double] = js.undefined,
    widowLayoutStyle: left | justify | center = null
  ): JustifiedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (boxSpacing != null) __obj.updateDynamic("boxSpacing")(boxSpacing.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(containerWidth)) __obj.updateDynamic("containerWidth")(containerWidth.get.asInstanceOf[js.Any])
    if (forceAspectRatio != null) __obj.updateDynamic("forceAspectRatio")(forceAspectRatio.asInstanceOf[js.Any])
    if (fullWidthBreakoutRowCadence != null) __obj.updateDynamic("fullWidthBreakoutRowCadence")(fullWidthBreakoutRowCadence.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumRows)) __obj.updateDynamic("maxNumRows")(maxNumRows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showWidows)) __obj.updateDynamic("showWidows")(showWidows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRowHeight)) __obj.updateDynamic("targetRowHeight")(targetRowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRowHeightTolerance)) __obj.updateDynamic("targetRowHeightTolerance")(targetRowHeightTolerance.get.asInstanceOf[js.Any])
    if (widowLayoutStyle != null) __obj.updateDynamic("widowLayoutStyle")(widowLayoutStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifiedLayoutOptions]
  }
}

