package typings
package hummusDashRecipeLib.hummusDashRecipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnotOptions extends js.Object {
  var flag: js.UndefOr[
    hummusDashRecipeLib.hummusDashRecipeLibStrings.invisible | hummusDashRecipeLib.hummusDashRecipeLibStrings.hidden | hummusDashRecipeLib.hummusDashRecipeLibStrings.print | hummusDashRecipeLib.hummusDashRecipeLibStrings.nozoom | hummusDashRecipeLib.hummusDashRecipeLibStrings.norotate | hummusDashRecipeLib.hummusDashRecipeLibStrings.noview | hummusDashRecipeLib.hummusDashRecipeLibStrings.readonly | hummusDashRecipeLib.hummusDashRecipeLibStrings.locked | hummusDashRecipeLib.hummusDashRecipeLibStrings.togglenoview
  ] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var icon: js.UndefOr[
    hummusDashRecipeLib.hummusDashRecipeLibStrings.Comment | hummusDashRecipeLib.hummusDashRecipeLibStrings.Key | hummusDashRecipeLib.hummusDashRecipeLibStrings.Note | hummusDashRecipeLib.hummusDashRecipeLibStrings.Help | hummusDashRecipeLib.hummusDashRecipeLibStrings.NewParagraph | hummusDashRecipeLib.hummusDashRecipeLibStrings.Paragraph | hummusDashRecipeLib.hummusDashRecipeLibStrings.Insert
  ] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var richText: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AnotOptions {
  @scala.inline
  def apply(
    flag: hummusDashRecipeLib.hummusDashRecipeLibStrings.invisible | hummusDashRecipeLib.hummusDashRecipeLibStrings.hidden | hummusDashRecipeLib.hummusDashRecipeLibStrings.print | hummusDashRecipeLib.hummusDashRecipeLibStrings.nozoom | hummusDashRecipeLib.hummusDashRecipeLibStrings.norotate | hummusDashRecipeLib.hummusDashRecipeLibStrings.noview | hummusDashRecipeLib.hummusDashRecipeLibStrings.readonly | hummusDashRecipeLib.hummusDashRecipeLibStrings.locked | hummusDashRecipeLib.hummusDashRecipeLibStrings.togglenoview = null,
    height: scala.Int | scala.Double = null,
    icon: hummusDashRecipeLib.hummusDashRecipeLibStrings.Comment | hummusDashRecipeLib.hummusDashRecipeLibStrings.Key | hummusDashRecipeLib.hummusDashRecipeLibStrings.Note | hummusDashRecipeLib.hummusDashRecipeLibStrings.Help | hummusDashRecipeLib.hummusDashRecipeLibStrings.NewParagraph | hummusDashRecipeLib.hummusDashRecipeLibStrings.Paragraph | hummusDashRecipeLib.hummusDashRecipeLibStrings.Insert = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    richText: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): AnotOptions = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(richText)) __obj.updateDynamic("richText")(richText)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnotOptions]
  }
}

