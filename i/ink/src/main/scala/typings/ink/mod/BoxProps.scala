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
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    height: Double | String = null,
    justifyContent: `flex-start` | center | `flex-end` | `space-between` | `space-around` = null,
    margin: Int | Double = null,
    marginBottom: Int | Double = null,
    marginLeft: Int | Double = null,
    marginRight: Int | Double = null,
    marginTop: Int | Double = null,
    marginX: Int | Double = null,
    marginY: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    padding: Int | Double = null,
    paddingBottom: Int | Double = null,
    paddingLeft: Int | Double = null,
    paddingRight: Int | Double = null,
    paddingTop: Int | Double = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    textWrap: wrap | truncate | `truncate-start` | `truncate-middle` | `truncate-end` = null,
    width: Double | String = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (textWrap != null) __obj.updateDynamic("textWrap")(textWrap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

