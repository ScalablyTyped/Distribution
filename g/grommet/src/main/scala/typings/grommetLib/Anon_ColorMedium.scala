package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorMedium extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[
    grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean
  ] = js.undefined
}

object Anon_ColorMedium {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    opacity: grommetLib.grommetLibStrings.weak | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.strong | scala.Boolean = null
  ): Anon_ColorMedium = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorMedium]
  }
}

