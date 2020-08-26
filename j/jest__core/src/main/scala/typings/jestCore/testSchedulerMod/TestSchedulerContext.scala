package typings.jestCore.testSchedulerMod

import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSchedulerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var firstRun: Boolean = js.native
  var previousSuccess: Boolean = js.native
  var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[Path]] = js.native
}

object TestSchedulerContext {
  @scala.inline
  def apply(firstRun: Boolean, previousSuccess: Boolean): TestSchedulerContext = {
    val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], previousSuccess = previousSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSchedulerContext]
  }
  @scala.inline
  implicit class TestSchedulerContextOps[Self <: TestSchedulerContext] (val x: Self) extends AnyVal {
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
    def setFirstRun(value: Boolean): Self = this.set("firstRun", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSuccess(value: Boolean): Self = this.set("previousSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedFiles(value: Set[Path]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    @scala.inline
    def setSourcesRelatedToTestsInChangedFiles(value: Set[Path]): Self = this.set("sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcesRelatedToTestsInChangedFiles: Self = this.set("sourcesRelatedToTestsInChangedFiles", js.undefined)
  }
  
}

