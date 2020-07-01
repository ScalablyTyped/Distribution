package typings.inkDivider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var dividerChar: js.UndefOr[String] = js.undefined
  var dividerColor: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var titlePadding: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    dividerChar: String = null,
    dividerColor: String = null,
    padding: js.UndefOr[Double] = js.undefined,
    title: String = null,
    titleColor: String = null,
    titlePadding: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (dividerChar != null) __obj.updateDynamic("dividerChar")(dividerChar.asInstanceOf[js.Any])
    if (dividerColor != null) __obj.updateDynamic("dividerColor")(dividerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (!js.isUndefined(titlePadding)) __obj.updateDynamic("titlePadding")(titlePadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerProps]
  }
}

