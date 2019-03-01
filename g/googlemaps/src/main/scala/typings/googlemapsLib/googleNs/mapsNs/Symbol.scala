package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  /**
    * The position of the symbol relative to the marker or polyline.
    * The coordinates of the symbol's path are translated left and up by the
    * anchor's x and y coordinates respectively. By default, a symbol is
    * anchored at (0, 0). The position is expressed in the same coordinate
    * system as the symbol's path.
    */
  var anchor: js.UndefOr[Point] = js.undefined
  /**
    * The symbol's fill color.
    * All CSS3 colors are supported except for extended named colors. For
    * symbol markers, this defaults to 'black'. For symbols on polylines, this
    * defaults to the stroke color of the corresponding polyline.
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The symbol's fill opacity.
    * @default 0
    */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The symbol's path, which is a built-in symbol path, or a custom path
    * expressed using SVG path notation. Required.
    * @type {(SymbolPath|string)}
    */
  var path: js.UndefOr[SymbolPath | java.lang.String] = js.undefined
  /**
    * The angle by which to rotate the symbol, expressed clockwise in degrees.
    * Defaults to 0.
    * A symbol in an IconSequence where fixedRotation is false is rotated
    * relative to the angle of the edge on which it lies.
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount by which the symbol is scaled in size.
    * For symbol markers, this defaults to 1; after scaling, the symbol may be
    * of any size. For symbols on a polyline, this defaults to the stroke
    * weight of the polyline; after scaling, the symbol must lie inside a
    * square 22 pixels in size centered at the symbol's anchor.
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The symbol's stroke color. All CSS3 colors are supported except for
    * extended named colors. For symbol markers, this defaults to 'black'. For
    * symbols on a polyline, this defaults to the stroke color of the polyline.
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The symbol's stroke opacity. For symbol markers, this defaults to 1.
    * For symbols on a polyline, this defaults to the stroke opacity of the
    * polyline.
    */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** The symbol's stroke weight. Defaults to the scale of the symbol.v*/
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(
    anchor: Point = null,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    path: SymbolPath | java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    strokeColor: java.lang.String = null,
    strokeOpacity: scala.Int | scala.Double = null,
    strokeWeight: scala.Int | scala.Double = null
  ): Symbol = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

