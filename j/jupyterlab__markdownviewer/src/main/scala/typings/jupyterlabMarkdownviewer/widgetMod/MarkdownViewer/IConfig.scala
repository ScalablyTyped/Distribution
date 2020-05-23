package typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewer

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
    fontSize: Double = null.asInstanceOf[Double],
    lineHeight: Double = null.asInstanceOf[Double],
    lineWidth: Double = null.asInstanceOf[Double]
  ): IConfig = {
    val __obj = js.Dynamic.literal(hideFrontMatter = hideFrontMatter.asInstanceOf[js.Any], renderTimeout = renderTimeout.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfig]
  }
}

