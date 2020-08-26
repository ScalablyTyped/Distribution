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
@js.native
trait JustifiedLayoutOptions extends js.Object {
  /**
    * Provide a single integer to apply spacing both horizontally and vertically or provide an
    * object to apply individual values to each axis.
    * @default 10
    */
  var boxSpacing: js.UndefOr[Double | Horizontal] = js.native
  /**
    * Provide a single integer to apply padding to all sides or provide an object to apply
    * individual values to each side.
    * @default 10
    */
  var containerPadding: js.UndefOr[Double | Bottom] = js.native
  /**
    * The width that boxes will be contained within irrelevant of padding.
    * @default 1060
    */
  var containerWidth: js.UndefOr[Double] = js.native
  /**
    * Provide an aspect ratio here to return everything in that aspect ratio. Makes the values
    * in your input array irrelevant. The length of the array remains relevant.
    * @default false
    */
  var forceAspectRatio: js.UndefOr[Boolean | Double] = js.native
  /**
    * If you'd like to insert a full width box every n rows you can specify it with this
    * parameter. The box on that row will ignore the targetRowHeight, make itself as wide as
    * `containerWidth - containerPadding` and be as tall as its aspect ratio defines. It'll
    * only happen if that item has an aspect ratio >= 1. Best to have a look at the examples to
    * see what this does.
    * @default false
    */
  var fullWidthBreakoutRowCadence: js.UndefOr[Boolean | Double] = js.native
  /**
    * Will stop adding rows at this number regardless of how many items still need to be laid
    * out.
    * @default Number.POSITIVE_INFINITY
    */
  var maxNumRows: js.UndefOr[Double] = js.native
  /**
    * By default we'll return items at the end of a justified layout even if they don't make a
    * full row. If false they'll be omitted from the output.
    * @default true
    */
  var showWidows: js.UndefOr[Boolean] = js.native
  /**
    * It's called a target because row height is the lever we use in order to fit everything in
    * nicely. The algorithm will get as close to the target row height as it can.
    * @default 320
    */
  var targetRowHeight: js.UndefOr[Double] = js.native
  /**
    * How far row heights can stray from targetRowHeight. `0` would force rows to be the
    * `targetRowHeight` exactly and would likely make it impossible to justify. The value must
    * be between `0` and `1`.
    * @default 0.25
    */
  var targetRowHeightTolerance: js.UndefOr[Double] = js.native
  /**
    * If widows are visible, how should they be laid out?
    * @default "left"
    */
  var widowLayoutStyle: js.UndefOr[left | justify | center] = js.native
}

object JustifiedLayoutOptions {
  @scala.inline
  def apply(): JustifiedLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifiedLayoutOptions]
  }
  @scala.inline
  implicit class JustifiedLayoutOptionsOps[Self <: JustifiedLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoxSpacing(value: Double | Horizontal): Self = this.set("boxSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxSpacing: Self = this.set("boxSpacing", js.undefined)
    @scala.inline
    def setContainerPadding(value: Double | Bottom): Self = this.set("containerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPadding: Self = this.set("containerPadding", js.undefined)
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerWidth: Self = this.set("containerWidth", js.undefined)
    @scala.inline
    def setForceAspectRatio(value: Boolean | Double): Self = this.set("forceAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAspectRatio: Self = this.set("forceAspectRatio", js.undefined)
    @scala.inline
    def setFullWidthBreakoutRowCadence(value: Boolean | Double): Self = this.set("fullWidthBreakoutRowCadence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidthBreakoutRowCadence: Self = this.set("fullWidthBreakoutRowCadence", js.undefined)
    @scala.inline
    def setMaxNumRows(value: Double): Self = this.set("maxNumRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxNumRows: Self = this.set("maxNumRows", js.undefined)
    @scala.inline
    def setShowWidows(value: Boolean): Self = this.set("showWidows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWidows: Self = this.set("showWidows", js.undefined)
    @scala.inline
    def setTargetRowHeight(value: Double): Self = this.set("targetRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRowHeight: Self = this.set("targetRowHeight", js.undefined)
    @scala.inline
    def setTargetRowHeightTolerance(value: Double): Self = this.set("targetRowHeightTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetRowHeightTolerance: Self = this.set("targetRowHeightTolerance", js.undefined)
    @scala.inline
    def setWidowLayoutStyle(value: left | justify | center): Self = this.set("widowLayoutStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidowLayoutStyle: Self = this.set("widowLayoutStyle", js.undefined)
  }
  
}

