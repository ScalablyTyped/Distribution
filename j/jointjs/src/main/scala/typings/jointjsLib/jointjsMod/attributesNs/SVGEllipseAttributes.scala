package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGEllipseAttributes extends SVGAttributes {
  var cx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var cy: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var ry: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SVGEllipseAttributes {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes = null,
    cx: java.lang.String | scala.Double = null,
    cy: java.lang.String | scala.Double = null,
    rx: java.lang.String | scala.Double = null,
    ry: java.lang.String | scala.Double = null
  ): SVGEllipseAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGEllipseAttributes]
  }
}

