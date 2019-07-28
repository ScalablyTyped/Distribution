package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Linesabove extends js.Object {
  var lines_above: js.UndefOr[Double] = js.undefined
  var lines_below: js.UndefOr[Double] = js.undefined
}

object Anon_Linesabove {
  @scala.inline
  def apply(lines_above: Int | Double = null, lines_below: Int | Double = null): Anon_Linesabove = {
    val __obj = js.Dynamic.literal()
    if (lines_above != null) __obj.updateDynamic("lines_above")(lines_above.asInstanceOf[js.Any])
    if (lines_below != null) __obj.updateDynamic("lines_below")(lines_below.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Linesabove]
  }
}

