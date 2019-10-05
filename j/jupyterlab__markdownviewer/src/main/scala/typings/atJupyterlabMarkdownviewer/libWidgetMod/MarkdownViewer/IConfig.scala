package typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  /**
    * User preferred font family for markdown viewer.
    */
  var fontFamily: String | Null
  /**
    * User preferred size in pixel of the font used in markdown viewer.
    */
  var fontSize: Double | Null
  /**
    * Whether to hide the YALM front matter.
    */
  var hideFrontMatter: Boolean
  /**
    * User preferred text line height, as a multiplier of font size.
    */
  var lineHeight: Double | Null
  /**
    * User preferred text line width expressed in CSS ch units.
    */
  var lineWidth: Double | Null
  /**
    * The render timeout.
    */
  var renderTimeout: Double
}

object IConfig {
  @scala.inline
  def apply(
    hideFrontMatter: Boolean,
    renderTimeout: Double,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    lineHeight: Int | Double = null,
    lineWidth: Int | Double = null
  ): IConfig = {
    val __obj = js.Dynamic.literal(hideFrontMatter = hideFrontMatter, renderTimeout = renderTimeout)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

