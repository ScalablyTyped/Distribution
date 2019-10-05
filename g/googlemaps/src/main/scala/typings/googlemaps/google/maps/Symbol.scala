package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a symbol, which consists of a vector path with styling. A symbol
  * can be used as the icon of a marker, or placed on a polyline.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol Maps JavaScript API}
  */
trait Symbol extends js.Object {
  /**
    * The position of the symbol relative to the marker or polyline. The
    * coordinates of the symbol's path are translated left and up by the
    * anchor's x and y coordinates respectively. The position is expressed in
    * the same coordinate system as the symbol's path.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.anchor Maps JavaScript API}
    */
  var anchor: js.UndefOr[Point] = js.undefined
  /**
    * The symbol's fill color. All CSS3 colors are supported except for
    * extended named colors. For symbol markers, this defaults to 'black'.
    * For symbols on polylines, this defaults to the stroke color of the
    * corresponding polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.fillColor Maps JavaScript API}
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /**
    * The symbol's fill opacity.
    * @default 1
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.fillOpacity Maps JavaScript API}
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The origin of the label relative to the origin of the path, if label is
    * supplied by the marker. The origin is expressed in the same coordinate
    * system as the symbol's path. This property is unused for symbols on
    * polylines.
    * @default new google.maps.Point(0, 0)
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.labelOrigin Maps JavaScript API}
    */
  var labelOrigin: js.UndefOr[Point] = js.undefined
  /**
    * The symbol's path, which is a built-in symbol path, or a custom path
    * expressed using
    * {@link http://www.w3.org/TR/SVG/paths.html#PathData SVG path notation}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.path Maps JavaScript API}
    */
  var path: SymbolPath | String
  /**
    * The angle by which to rotate the symbol, expressed clockwise in degrees.
    * A symbol in an {@link IconSequence} where
    * {@link IconSequence#fixedRotation fixedRotation} is false is rotated
    * relative to the angle of the edge on which it lies.
    * @default 0
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.rotation Maps JavaScript API}
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The amount by which the symbol is scaled in size. For symbol markers,
    * this defaults to 1; after scaling, the symbol may be of any size. For
    * symbols on a polyline, this defaults to the stroke weight of the
    * polyline; after scaling, the symbol must lie inside a square 22 pixels in
    * size centered at the symbol's anchor.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.scale Maps JavaScript API}
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The symbol's stroke color. All CSS3 colors are supported except for
    * extended named colors. For symbol markers, this defaults to 'black'. For
    * symbols on a polyline, this defaults to the stroke color of the polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeColor Maps JavaScript API}
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /**
    * The symbol's stroke opacity. For symbol markers, this defaults to 1. For
    * symbols on a polyline, this defaults to the stroke opacity of the
    * polyline.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeOpacity Maps JavaScript API}
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The symbol's stroke weight. Defaults to the scale of the symbol.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Symbol.strokeWeight Maps JavaScript API}
    */
  var strokeWeight: js.UndefOr[Double] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(
    path: SymbolPath | String,
    anchor: Point = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    labelOrigin: Point = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null
  ): Symbol = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

