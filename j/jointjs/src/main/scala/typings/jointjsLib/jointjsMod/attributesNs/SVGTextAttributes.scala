package typings
package jointjsLib.jointjsMod.attributesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTextAttributes extends SVGAttributes {
  var dx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var dy: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var `length-adjust`: js.UndefOr[java.lang.String] = js.undefined
  var lengthAdjust: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[java.lang.String] = js.undefined
  @JSName("text-anchor")
  var `text-anchor_SVGTextAttributes`: js.UndefOr[java.lang.String] = js.undefined
  var `text-lenght`: js.UndefOr[scala.Double] = js.undefined
  @JSName("textAnchor")
  var textAnchor_SVGTextAttributes: js.UndefOr[java.lang.String] = js.undefined
  var textLength: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var y: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object SVGTextAttributes {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes = null,
    dx: java.lang.String | scala.Double = null,
    dy: java.lang.String | scala.Double = null,
    `length-adjust`: java.lang.String = null,
    lengthAdjust: java.lang.String = null,
    rotate: java.lang.String = null,
    `text-anchor`: java.lang.String = null,
    `text-lenght`: scala.Int | scala.Double = null,
    textAnchor: java.lang.String = null,
    textLength: scala.Int | scala.Double = null,
    x: java.lang.String | scala.Double = null,
    y: java.lang.String | scala.Double = null
  ): SVGTextAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (dx != null) __obj.updateDynamic("dx")(dx.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (`length-adjust` != null) __obj.updateDynamic("length-adjust")(`length-adjust`)
    if (lengthAdjust != null) __obj.updateDynamic("lengthAdjust")(lengthAdjust)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`)
    if (`text-lenght` != null) __obj.updateDynamic("text-lenght")(`text-lenght`.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor)
    if (textLength != null) __obj.updateDynamic("textLength")(textLength.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextAttributes]
  }
}

