package typings.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.Argv, 'maxWorkers'>> */
@js.native
trait PartialPickArgvmaxWorkersMaxWorkers extends js.Object {
  var maxWorkers: js.UndefOr[js.Any] = js.native
}

object PartialPickArgvmaxWorkersMaxWorkers {
  @scala.inline
  def apply(): PartialPickArgvmaxWorkersMaxWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickArgvmaxWorkersMaxWorkers]
  }
  @scala.inline
  implicit class PartialPickArgvmaxWorkersMaxWorkersOps[Self <: PartialPickArgvmaxWorkersMaxWorkers] (val x: Self) extends AnyVal {
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
    def setMaxWorkers(value: js.Any): Self = this.set("maxWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWorkers: Self = this.set("maxWorkers", js.undefined)
  }
  
}

