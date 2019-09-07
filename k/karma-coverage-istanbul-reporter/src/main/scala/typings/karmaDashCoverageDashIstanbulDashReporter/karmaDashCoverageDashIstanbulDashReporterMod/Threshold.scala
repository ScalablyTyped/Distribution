package typings.karmaDashCoverageDashIstanbulDashReporter.karmaDashCoverageDashIstanbulDashReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  /** @default 0 */
  val branches: js.UndefOr[Double] = js.undefined
  /** @default 0 */
  val functions: js.UndefOr[Double] = js.undefined
  /** @default 0 */
  val lines: js.UndefOr[Double] = js.undefined
  /** @default 0 */
  val statements: js.UndefOr[Double] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(
    branches: Int | Double = null,
    functions: Int | Double = null,
    lines: Int | Double = null,
    statements: Int | Double = null
  ): Threshold = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}

