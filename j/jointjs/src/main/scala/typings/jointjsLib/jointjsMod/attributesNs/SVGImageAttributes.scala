package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGImageAttributes extends SVGAttributes {
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var x: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var y: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SVGImageAttributes {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes = null,
    height: java.lang.String | scala.Double = null,
    preserveAspectRatio: java.lang.String = null,
    width: java.lang.String | scala.Double = null,
    x: java.lang.String | scala.Double = null,
    y: java.lang.String | scala.Double = null
  ): SVGImageAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGImageAttributes]
  }
}

