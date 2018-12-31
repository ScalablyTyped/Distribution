package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends js.Object {
  /**
    * Brighten the color
    */
  var brighten: js.UndefOr[js.Function1[/* alpha */ scala.Double, this.type]] = js.undefined
  /**
    * Return the color a specified format
    */
  var get: js.UndefOr[js.Function1[/* format */ java.lang.String, java.lang.String]] = js.undefined
  var linearGradient: js.UndefOr[LinearGradient | js.Array[scala.Double]] = js.undefined
  var radialGradient: js.UndefOr[highchartsLib.Anon_Cy] = js.undefined
  /**
    * The raw input
    */
  var raw: js.UndefOr[java.lang.String] = js.undefined
  /**
    * rgba array
    */
  var rgba: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Set the color's opacity to a given alpha value
    */
  var setOpacity: js.UndefOr[js.Function1[/* alpha */ scala.Double, this.type]] = js.undefined
  var stops: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

