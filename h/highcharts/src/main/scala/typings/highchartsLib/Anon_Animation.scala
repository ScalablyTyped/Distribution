package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  /**
    * Animation for the marker as it moves between values. Set to false to disable animation.
    * @default {duration: 50}
    */
  var animation: js.UndefOr[scala.Boolean | highchartsLib.highchartsMod.Animation] = js.undefined
  /**
    * The color of the marker.
    * @default 'gray'
    */
  var color: js.UndefOr[java.lang.String | highchartsLib.highchartsMod.Gradient] = js.undefined
}

object Anon_Animation {
  @scala.inline
  def apply(
    animation: scala.Boolean | highchartsLib.highchartsMod.Animation = null,
    color: java.lang.String | highchartsLib.highchartsMod.Gradient = null
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animation]
  }
}

