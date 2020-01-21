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
    branches: Int | Double = null,
    functions: Int | Double = null,
    lines: Int | Double = null,
    statements: Int | Double = null
  ): CoverageOptions = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageOptions]
  }
}

