package typings.jestHasteMap.anon

import typings.jestHasteMap.typesMod.FileData
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var files: FileData = js.native
  var rootDir: Path = js.native
}

object Files {
  @scala.inline
  def apply(files: FileData, rootDir: Path): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
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
    def setFiles(value: FileData): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
  }
  
}

