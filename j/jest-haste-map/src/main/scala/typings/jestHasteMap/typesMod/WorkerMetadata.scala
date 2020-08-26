package typings.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerMetadata extends js.Object {
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.native
  var id: js.UndefOr[String | Null] = js.native
  var module: js.UndefOr[ModuleMetaData | Null] = js.native
  var sha1: js.UndefOr[String | Null] = js.native
}

object WorkerMetadata {
  @scala.inline
  def apply(): WorkerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMetadata]
  }
  @scala.inline
  implicit class WorkerMetadataOps[Self <: WorkerMetadata] (val x: Self) extends AnyVal {
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
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDependenciesNull: Self = this.set("dependencies", null)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setModule(value: ModuleMetaData): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setModuleNull: Self = this.set("module", null)
    @scala.inline
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    @scala.inline
    def setSha1Null: Self = this.set("sha1", null)
  }
  
}

