package typings.jestCore.testSchedulerMod

import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSchedulerOptions extends js.Object {
  def startRun(globalConfig: GlobalConfig): Unit = js.native
}

object TestSchedulerOptions {
  @scala.inline
  def apply(startRun: GlobalConfig => Unit): TestSchedulerOptions = {
    val __obj = js.Dynamic.literal(startRun = js.Any.fromFunction1(startRun))
    __obj.asInstanceOf[TestSchedulerOptions]
  }
  @scala.inline
  implicit class TestSchedulerOptionsOps[Self <: TestSchedulerOptions] (val x: Self) extends AnyVal {
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
    def setStartRun(value: GlobalConfig => Unit): Self = this.set("startRun", js.Any.fromFunction1(value))
  }
  
}

