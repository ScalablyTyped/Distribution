package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternOptionsObject extends js.Object {
  /**
    * For automatically calculated width and height on images, it is possible
    * to set an aspect ratio. The image will be zoomed to fill the bounding
    * box, maintaining the aspect ratio defined.
    */
  var aspectRatio: Double
  /**
    * Background color for the pattern if a `path` is set (not images).
    */
  var backgroundColor: ColorString
  /**
    * Pattern color, used as default path stroke.
    */
  var color: ColorString
  /**
    * Analogous to pattern.width.
    */
  var height: Double
  /**
    * ID to assign to the pattern. This is automatically computed if not added,
    * and identical patterns are reused. To refer to an existing pattern for a
    * Highcharts color, use `color: "url(#pattern-id)"`.
    */
  var id: String
  /**
    * URL to an image to use as the pattern.
    */
  var image: String
  /**
    * Opacity of the pattern as a float value from 0 to 1.
    */
  var opacity: Double
  /**
    * Either an SVG path as string, or an object. As an object, supply the path
    * string in the `path.d` property. Other supported properties are standard
    * SVG attributes like `path.stroke` and `path.fill`. If a path is supplied
    * for the pattern, the `image` property is ignored.
    */
  var path: String | SVGAttributes
  /**
    * Width of the pattern. For images this is automatically set to the width
    * of the element bounding box if not supplied. For non-image patterns the
    * default is 32px. Note that automatic resizing of image patterns to fill a
    * bounding box dynamically is only supported for patterns with an
    * automatically calculated ID.
    */
  var width: Double
  /**
    * Horizontal offset of the pattern. Defaults to 0.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Vertical offset of the pattern. Defaults to 0.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object PatternOptionsObject {
  @scala.inline
  def apply(
    aspectRatio: Double,
    backgroundColor: ColorString,
    color: ColorString,
    height: Double,
    id: String,
    image: String,
    opacity: Double,
    path: String | SVGAttributes,
    width: Double,
    x: Int | Double = null,
    y: Int | Double = null
  ): PatternOptionsObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternOptionsObject]
  }
}

