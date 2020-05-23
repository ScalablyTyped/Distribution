package typings.ink.mod

import typings.ink.inkStrings.`column-reverse`
import typings.ink.inkStrings.`flex-end`
import typings.ink.inkStrings.`flex-start`
import typings.ink.inkStrings.`row-reverse`
import typings.ink.inkStrings.`space-around`
import typings.ink.inkStrings.`space-between`
import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.center
import typings.ink.inkStrings.column
import typings.ink.inkStrings.row
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps extends js.Object {
  val alignItems: js.UndefOr[`flex-start` | center | `flex-end`] = js.undefined
  val flexBasis: js.UndefOr[String | Double] = js.undefined
  val flexDirection: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  val flexGrow: js.UndefOr[Double] = js.undefined
  val flexShrink: js.UndefOr[Double] = js.undefined
  val height: js.UndefOr[Double | String] = js.undefined
  val justifyContent: js.UndefOr[`flex-start` | center | `flex-end` | `space-between` | `space-around`] = js.undefined
  val margin: js.UndefOr[Double] = js.undefined
  val marginBottom: js.UndefOr[Double] = js.undefined
  val marginLeft: js.UndefOr[Double] = js.undefined
  val marginRight: js.UndefOr[Double] = js.undefined
  val marginTop: js.UndefOr[Double] = js.undefined
  val marginX: js.UndefOr[Double] = js.undefined
  val marginY: js.UndefOr[Double] = js.undefined
  val minHeight: js.UndefOr[Double] = js.undefined
  val minWidth: js.UndefOr[Double] = js.undefined
  val padding: js.UndefOr[Double] = js.undefined
  val paddingBottom: js.UndefOr[Double] = js.undefined
  val paddingLeft: js.UndefOr[Double] = js.undefined
  val paddingRight: js.UndefOr[Double] = js.undefined
  val paddingTop: js.UndefOr[Double] = js.undefined
  val paddingX: js.UndefOr[Double] = js.undefined
  val paddingY: js.UndefOr[Double] = js.undefined
  val textWrap: js.UndefOr[wrap | truncate | `truncate-start` | `truncate-middle` | `truncate-end`] = js.undefined
  val width: js.UndefOr[Double | String] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    alignItems: `flex-start` | center | `flex-end` = null,
    flexBasis: String | Double = null,
    flexDirection: row | `row-reverse` | column | `column-reverse` = null,
    flexGrow: js.UndefOr[Double] = js.undefined,
    flexShrink: js.UndefOr[Double] = js.undefined,
    height: Double | String = null,
    justifyContent: `flex-start` | center | `flex-end` | `space-between` | `space-around` = null,
    margin: js.UndefOr[Double] = js.undefined,
    marginBottom: js.UndefOr[Double] = js.undefined,
    marginLeft: js.UndefOr[Double] = js.undefined,
    marginRight: js.UndefOr[Double] = js.undefined,
    marginTop: js.UndefOr[Double] = js.undefined,
    marginX: js.UndefOr[Double] = js.undefined,
    marginY: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    paddingBottom: js.UndefOr[Double] = js.undefined,
    paddingLeft: js.UndefOr[Double] = js.undefined,
    paddingRight: js.UndefOr[Double] = js.undefined,
    paddingTop: js.UndefOr[Double] = js.undefined,
    paddingX: js.UndefOr[Double] = js.undefined,
    paddingY: js.UndefOr[Double] = js.undefined,
    textWrap: wrap | truncate | `truncate-start` | `truncate-middle` | `truncate-end` = null,
    width: Double | String = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(flexGrow)) __obj.updateDynamic("flexGrow")(flexGrow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flexShrink)) __obj.updateDynamic("flexShrink")(flexShrink.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottom)) __obj.updateDynamic("marginBottom")(marginBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeft)) __obj.updateDynamic("marginLeft")(marginLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRight)) __obj.updateDynamic("marginRight")(marginRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTop)) __obj.updateDynamic("marginTop")(marginTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginX)) __obj.updateDynamic("marginX")(marginX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginY)) __obj.updateDynamic("marginY")(marginY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottom)) __obj.updateDynamic("paddingBottom")(paddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTop)) __obj.updateDynamic("paddingTop")(paddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingX)) __obj.updateDynamic("paddingX")(paddingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingY)) __obj.updateDynamic("paddingY")(paddingY.get.asInstanceOf[js.Any])
    if (textWrap != null) __obj.updateDynamic("textWrap")(textWrap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

