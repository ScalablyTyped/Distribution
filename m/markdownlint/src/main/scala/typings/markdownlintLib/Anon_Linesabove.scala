package typings
package markdownlintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Linesabove extends js.Object {
  var lines_above: js.UndefOr[scala.Double] = js.undefined
  var lines_below: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Linesabove {
  @scala.inline
  def apply(lines_above: scala.Int | scala.Double = null, lines_below: scala.Int | scala.Double = null): Anon_Linesabove = {
    val __obj = js.Dynamic.literal()
    if (lines_above != null) __obj.updateDynamic("lines_above")(lines_above.asInstanceOf[js.Any])
    if (lines_below != null) __obj.updateDynamic("lines_below")(lines_below.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Linesabove]
  }
}

