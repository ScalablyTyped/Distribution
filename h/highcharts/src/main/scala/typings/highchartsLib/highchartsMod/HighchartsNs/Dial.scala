package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Dial extends js.Object {
  /**
           * The background or fill color of the gauge's dial.
           * @default 'black'
           * @since 2.3.0
           */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * The length of the dial's base part, relative to the total radius or length of the dial.
           * @default '70%'.
           * @since 2.3.0
           */
  var baseLength: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength.
           * @default 3
           * @since 2.3.0
           */
  var baseWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition
           * to a custom border color.
           * @default 'silver'
           * @since 2.3.0
           */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * The width of the gauge dial border in pixels.
           * @default 0
           * @since 2.3.0
           */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
           * @default '80%'
           * @since 2.3.0
           */
  var radius: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the
           * dial's length.
           * @default '10%'
           * @since 2.3.0
           */
  var rearLength: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
           * @default 1
           * @since 2.3.0
           */
  var topWidth: js.UndefOr[scala.Double] = js.undefined
}

