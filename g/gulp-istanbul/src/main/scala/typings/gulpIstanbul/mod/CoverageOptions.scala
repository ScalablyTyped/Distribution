package typings.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageOptions extends js.Object {
  var branches: js.UndefOr[Double] = js.undefined
  var functions: js.UndefOr[Double] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var statements: js.UndefOr[Double] = js.undefined
}

object CoverageOptions {
  @scala.inline
  def apply(
    branches: js.UndefOr[Double] = js.undefined,
    functions: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    statements: js.UndefOr[Double] = js.undefined
  ): CoverageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(branches)) __obj.updateDynamic("branches")(branches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statements)) __obj.updateDynamic("statements")(statements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageOptions]
  }
}

