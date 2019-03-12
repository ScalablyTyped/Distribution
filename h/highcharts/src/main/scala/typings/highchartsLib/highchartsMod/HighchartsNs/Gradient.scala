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
  var radialGradient: js.UndefOr[highchartsLib.Anon_Cx] = js.undefined
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

object Gradient {
  @scala.inline
  def apply(
    brighten: /* alpha */ scala.Double => Gradient = null,
    get: /* format */ java.lang.String => java.lang.String = null,
    linearGradient: LinearGradient | js.Array[scala.Double] = null,
    radialGradient: highchartsLib.Anon_Cx = null,
    raw: java.lang.String = null,
    rgba: js.Array[scala.Double] = null,
    setOpacity: /* alpha */ scala.Double => Gradient = null,
    stops: js.Array[js.Array[_]] = null
  ): Gradient = {
    val __obj = js.Dynamic.literal()
    if (brighten != null) __obj.updateDynamic("brighten")(js.Any.fromFunction1(brighten))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (linearGradient != null) __obj.updateDynamic("linearGradient")(linearGradient.asInstanceOf[js.Any])
    if (radialGradient != null) __obj.updateDynamic("radialGradient")(radialGradient)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (rgba != null) __obj.updateDynamic("rgba")(rgba)
    if (setOpacity != null) __obj.updateDynamic("setOpacity")(js.Any.fromFunction1(setOpacity))
    if (stops != null) __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[Gradient]
  }
}

