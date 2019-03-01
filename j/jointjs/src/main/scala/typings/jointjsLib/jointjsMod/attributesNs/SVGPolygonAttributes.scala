package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPolygonAttributes extends SVGAttributes {
  var points: js.UndefOr[java.lang.String] = js.undefined
}

object SVGPolygonAttributes {
  @scala.inline
  def apply(SVGAttributes: SVGAttributes = null, points: java.lang.String = null): SVGPolygonAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (points != null) __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[SVGPolygonAttributes]
  }
}

