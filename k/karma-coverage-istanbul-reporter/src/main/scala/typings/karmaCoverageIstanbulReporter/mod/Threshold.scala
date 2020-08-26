package typings.karmaCoverageIstanbulReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Threshold extends js.Object {
  /** @default 0 */
  val branches: js.UndefOr[Double] = js.native
  /** @default 0 */
  val functions: js.UndefOr[Double] = js.native
  /** @default 0 */
  val lines: js.UndefOr[Double] = js.native
  /** @default 0 */
  val statements: js.UndefOr[Double] = js.native
}

object Threshold {
  @scala.inline
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  @scala.inline
  implicit class ThresholdOps[Self <: Threshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranches(value: Double): Self = this.set("branches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    @scala.inline
    def setFunctions(value: Double): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setStatements(value: Double): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
  }
  
}

