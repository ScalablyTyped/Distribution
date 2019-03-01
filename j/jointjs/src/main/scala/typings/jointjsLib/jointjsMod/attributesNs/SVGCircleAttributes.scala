package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGCircleAttributes extends SVGAttributes {
  var cx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var cy: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var r: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SVGCircleAttributes {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes = null,
    cx: java.lang.String | scala.Double = null,
    cy: java.lang.String | scala.Double = null,
    r: java.lang.String | scala.Double = null
  ): SVGCircleAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGCircleAttributes]
  }
}

