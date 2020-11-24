package typings.jestReporters.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverageReporterSerializedOptions extends js.Object {
  
  var changedFiles: js.UndefOr[js.Array[Path]] = js.native
  
  var sourcesRelatedToTestsInChangedFiles: js.UndefOr[js.Array[Path]] = js.native
}
object CoverageReporterSerializedOptions {
  
  @scala.inline
  def apply(): CoverageReporterSerializedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageReporterSerializedOptions]
  }
  
  @scala.inline
  implicit class CoverageReporterSerializedOptionsOps[Self <: CoverageReporterSerializedOptions] (val x: Self) extends AnyVal {
    
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
    def setChangedFilesVarargs(value: Path*): Self = this.set("changedFiles", js.Array(value :_*))
    
    @scala.inline
    def setChangedFiles(value: js.Array[Path]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    
    @scala.inline
    def setSourcesRelatedToTestsInChangedFilesVarargs(value: Path*): Self = this.set("sourcesRelatedToTestsInChangedFiles", js.Array(value :_*))
    
    @scala.inline
    def setSourcesRelatedToTestsInChangedFiles(value: js.Array[Path]): Self = this.set("sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesRelatedToTestsInChangedFiles: Self = this.set("sourcesRelatedToTestsInChangedFiles", js.undefined)
  }
}
