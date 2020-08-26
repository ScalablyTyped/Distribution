package typings.jestCore.searchSourceMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSelectionConfig extends js.Object {
  var findRelatedTests: js.UndefOr[Boolean] = js.native
  var input: js.UndefOr[String] = js.native
  var onlyChanged: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[js.Array[Path]] = js.native
  var shouldTreatInputAsPattern: js.UndefOr[Boolean] = js.native
  var testPathPattern: js.UndefOr[String] = js.native
  var watch: js.UndefOr[Boolean] = js.native
}

object TestSelectionConfig {
  @scala.inline
  def apply(): TestSelectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSelectionConfig]
  }
  @scala.inline
  implicit class TestSelectionConfigOps[Self <: TestSelectionConfig] (val x: Self) extends AnyVal {
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
    def setFindRelatedTests(value: Boolean): Self = this.set("findRelatedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindRelatedTests: Self = this.set("findRelatedTests", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setOnlyChanged(value: Boolean): Self = this.set("onlyChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyChanged: Self = this.set("onlyChanged", js.undefined)
    @scala.inline
    def setPathsVarargs(value: Path*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Array[Path]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setShouldTreatInputAsPattern(value: Boolean): Self = this.set("shouldTreatInputAsPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldTreatInputAsPattern: Self = this.set("shouldTreatInputAsPattern", js.undefined)
    @scala.inline
    def setTestPathPattern(value: String): Self = this.set("testPathPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestPathPattern: Self = this.set("testPathPattern", js.undefined)
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
  
}

