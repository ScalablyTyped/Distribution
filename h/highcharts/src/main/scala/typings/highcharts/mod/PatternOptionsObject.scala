package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternOptionsObject extends js.Object {
  /**
    * For automatically calculated width and height on images, it is possible
    * to set an aspect ratio. The image will be zoomed to fill the bounding
    * box, maintaining the aspect ratio defined.
    */
  var aspectRatio: Double = js.native
  /**
    * Background color for the pattern if a `path` is set (not images).
    */
  var backgroundColor: ColorString = js.native
  /**
    * Pattern color, used as default path stroke.
    */
  var color: ColorString = js.native
  /**
    * Analogous to pattern.width.
    */
  var height: Double = js.native
  /**
    * ID to assign to the pattern. This is automatically computed if not added,
    * and identical patterns are reused. To refer to an existing pattern for a
    * Highcharts color, use `color: "url(#pattern-id)"`.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL to an image to use as the pattern.
    */
  var image: String = js.native
  /**
    * Opacity of the pattern as a float value from 0 to 1.
    */
  var opacity: Double = js.native
  /**
    * Either an SVG path as string, or an object. As an object, supply the path
    * string in the `path.d` property. Other supported properties are standard
    * SVG attributes like `path.stroke` and `path.fill`. If a path is supplied
    * for the pattern, the `image` property is ignored.
    */
  var path: String | SVGAttributes = js.native
  /**
    * SVG `patternTransform` to apply to the entire pattern.
    */
  var patternTransform: String = js.native
  /**
    * Width of the pattern. For images this is automatically set to the width
    * of the element bounding box if not supplied. For non-image patterns the
    * default is 32px. Note that automatic resizing of image patterns to fill a
    * bounding box dynamically is only supported for patterns with an
    * automatically calculated ID.
    */
  var width: Double = js.native
  /**
    * Horizontal offset of the pattern. Defaults to 0.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Vertical offset of the pattern. Defaults to 0.
    */
  var y: js.UndefOr[Double] = js.native
}

object PatternOptionsObject {
  @scala.inline
  def apply(
    aspectRatio: Double,
    backgroundColor: ColorString,
    color: ColorString,
    height: Double,
    image: String,
    opacity: Double,
    path: String | SVGAttributes,
    patternTransform: String,
    width: Double
  ): PatternOptionsObject = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternOptionsObject]
  }
  @scala.inline
  implicit class PatternOptionsObjectOps[Self <: PatternOptionsObject] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: ColorString): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: ColorString): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String | SVGAttributes): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatternTransform(value: String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

