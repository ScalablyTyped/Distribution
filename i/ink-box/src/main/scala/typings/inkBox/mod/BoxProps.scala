package typings.inkBox.mod

import typings.inkBox.anon.BottomLeft
import typings.inkBox.inkBoxStrings.classic
import typings.inkBox.inkBoxStrings.double
import typings.inkBox.inkBoxStrings.doubleSingle
import typings.inkBox.inkBoxStrings.round
import typings.inkBox.inkBoxStrings.single
import typings.inkBox.inkBoxStrings.singleDouble
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps extends js.Object {
  var align: js.UndefOr[Alignment] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderStyle: js.UndefOr[single | double | round | singleDouble | doubleSingle | classic | BottomLeft] = js.undefined
  var dimBorder: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[Alignment] = js.undefined
  var margin: js.UndefOr[Spacing] = js.undefined
  var padding: js.UndefOr[Spacing] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    align: Alignment = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderStyle: single | double | round | singleDouble | doubleSingle | classic | BottomLeft = null,
    dimBorder: js.UndefOr[Boolean] = js.undefined,
    float: Alignment = null,
    margin: Spacing = null,
    padding: Spacing = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dimBorder)) __obj.updateDynamic("dimBorder")(dimBorder.get.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

