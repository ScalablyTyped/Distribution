package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationsShape extends AnnotationsShapeOptions {
  /**
    * Id of the marker which will be drawn at the final vertex of the path. Custom markers can be defined in defs property.
    * @default undefined
    * @since 6.0.0
    */
  var markerEnd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Id of the marker which will be drawn at the final vertex of the path. Custom markers can be defined in defs property.
    * @default undefined
    * @since 6.0.0
    */
  var markerStart: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This option defines the point to which the shape will be connected.
    * It can be either the point which exists in the series - it is referenced by the point's id
    * - or a new point with defined x, y properties and optionally axes.
    * @since 6.0.0
    */
  var point: js.UndefOr[java.lang.String | AnnotationsPoint] = js.undefined
  /**
    * An array of points for the shape. This option is available for shapes which can use multiple points such as path.
    * A point can be either a point object or a point's id.
    * @default undefined
    * @since 6.0.0
    */
  var points: js.UndefOr[js.Array[java.lang.String | AnnotationsPoint]] = js.undefined
}

