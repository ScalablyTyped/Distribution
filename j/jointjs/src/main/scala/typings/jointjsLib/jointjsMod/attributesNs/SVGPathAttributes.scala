package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathAttributes extends SVGAttributes {
  var d: js.UndefOr[java.lang.String] = js.undefined
  var `path-length`: js.UndefOr[scala.Double] = js.undefined
  var pathLength: js.UndefOr[scala.Double] = js.undefined
}

object SVGPathAttributes {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes = null,
    d: java.lang.String = null,
    `path-length`: scala.Int | scala.Double = null,
    pathLength: scala.Int | scala.Double = null
  ): SVGPathAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (d != null) __obj.updateDynamic("d")(d)
    if (`path-length` != null) __obj.updateDynamic("path-length")(`path-length`.asInstanceOf[js.Any])
    if (pathLength != null) __obj.updateDynamic("pathLength")(pathLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathAttributes]
  }
}

