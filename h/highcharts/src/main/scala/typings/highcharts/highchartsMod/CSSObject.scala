package typings.highcharts.highchartsMod

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.highchartsStrings.contrast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSObject
  extends /* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  /**
    * Background style for the element.
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * Background color of the element.
    */
  var backgroundColor: js.UndefOr[ColorString] = js.undefined
  /**
    * Border style for the element.
    */
  var border: js.UndefOr[String] = js.undefined
  /**
    * Radius of the element border.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * Color used in the element. The 'contrast' option is a Highcharts custom
    * property that results in black or white, depending on the background of
    * the element.
    */
  var color: js.UndefOr[contrast | ColorString] = js.undefined
  /**
    * Style of the mouse cursor when resting over the element.
    */
  var cursor: js.UndefOr[CursorValue] = js.undefined
  /**
    * Font family of the element text. Multiple values have to be in decreasing
    * preference order and separated by comma.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Font size of the element text.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * Font weight of the element text.
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
    * Height of the element.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Width of the element border.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * Opacity of the element.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Space around the element content.
    */
  var padding: js.UndefOr[String] = js.undefined
  /**
    * Behaviour of the element when the mouse cursor rests over it.
    */
  var pointerEvents: js.UndefOr[String] = js.undefined
  /**
    * Positioning of the element.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Alignment of the element text.
    */
  var textAlign: js.UndefOr[String] = js.undefined
  /**
    * Additional decoration of the element text.
    */
  var textDecoration: js.UndefOr[String] = js.undefined
  /**
    * Outline style of the element text.
    */
  var textOutline: js.UndefOr[String] = js.undefined
  /**
    * Line break style of the element text. Highcharts SVG elements support
    * `ellipsis` when a `width` is set.
    */
  var textOverflow: js.UndefOr[String] = js.undefined
  /**
    * Top spacing of the element relative to the parent element.
    */
  var top: js.UndefOr[String] = js.undefined
  /**
    * Animated transition of selected element properties.
    */
  var transition: js.UndefOr[String] = js.undefined
  /**
    * Line break style of the element text.
    */
  var whiteSpace: js.UndefOr[String] = js.undefined
  /**
    * Width of the element.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object CSSObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] = null,
    background: String = null,
    backgroundColor: ColorString = null,
    border: String = null,
    borderRadius: Int | Double = null,
    color: contrast | ColorString = null,
    cursor: CursorValue = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null,
    height: Int | Double = null,
    lineWidth: Int | Double = null,
    opacity: Int | Double = null,
    padding: String = null,
    pointerEvents: String = null,
    position: String = null,
    textAlign: String = null,
    textDecoration: String = null,
    textOutline: String = null,
    textOverflow: String = null,
    top: String = null,
    transition: String = null,
    whiteSpace: String = null,
    width: Int | Double = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textOutline != null) __obj.updateDynamic("textOutline")(textOutline.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (whiteSpace != null) __obj.updateDynamic("whiteSpace")(whiteSpace.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSObject]
  }
}

