package typings.jestRunner.typesMod

import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunnerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[Path]] = js.native
}

object TestRunnerContext {
  @scala.inline
  def apply(): TestRunnerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRunnerContext]
  }
  @scala.inline
  implicit class TestRunnerContextOps[Self <: TestRunnerContext] (val x: Self) extends AnyVal {
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
    def setChangedFiles(value: Set[Path]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    @scala.inline
    def setSourcesRelatedToTestsInChangedFiles(value: Set[Path]): Self = this.set("sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcesRelatedToTestsInChangedFiles: Self = this.set("sourcesRelatedToTestsInChangedFiles", js.undefined)
  }
  
}

