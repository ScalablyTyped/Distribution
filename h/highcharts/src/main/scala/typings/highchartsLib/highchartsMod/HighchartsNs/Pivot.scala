package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Pivot extends js.Object {
  /**
           * The background color or fill of the pivot.
           * @default 'black'
           * @since 2.3.0
           */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * The border or stroke color of the pivot. In able to change this, the borderWidth must also be set to something
           * other than the default 0.
           * @default 'silver'
           * @since 2.3.0
           */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * The border or stroke width of the pivot.
           * @default 0
           * @since 2.3.0
           */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * The pixel radius of the pivot.
           * @default 5
           * @since 2.3.0
           */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

