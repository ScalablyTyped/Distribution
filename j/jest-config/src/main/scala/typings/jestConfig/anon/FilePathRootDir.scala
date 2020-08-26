package typings.jestConfig.anon

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePathRootDir extends js.Object {
  var filePath: String = js.native
  var rootDir: Path = js.native
}

object FilePathRootDir {
  @scala.inline
  def apply(filePath: String, rootDir: Path): FilePathRootDir = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePathRootDir]
  }
  @scala.inline
  implicit class FilePathRootDirOps[Self <: FilePathRootDir] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
  }
  
}

