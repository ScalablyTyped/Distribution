package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linesabove extends js.Object {
  var lines_above: js.UndefOr[Double] = js.undefined
  var lines_below: js.UndefOr[Double] = js.undefined
}

object Linesabove {
  @scala.inline
  def apply(lines_above: js.UndefOr[Double] = js.undefined, lines_below: js.UndefOr[Double] = js.undefined): Linesabove = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lines_above)) __obj.updateDynamic("lines_above")(lines_above.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines_below)) __obj.updateDynamic("lines_below")(lines_below.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linesabove]
  }
}

