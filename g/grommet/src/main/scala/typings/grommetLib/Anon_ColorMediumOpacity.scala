package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorMediumOpacity extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[
    grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean | scala.Double
  ] = js.undefined
}

object Anon_ColorMediumOpacity {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean | scala.Double = null
  ): Anon_ColorMediumOpacity = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorMediumOpacity]
  }
}

