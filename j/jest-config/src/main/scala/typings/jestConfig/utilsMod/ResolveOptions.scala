package typings.jestConfig.utilsMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveOptions extends js.Object {
  var filePath: Path = js.native
  var key: String = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var rootDir: Path = js.native
}

object ResolveOptions {
  @scala.inline
  def apply(filePath: Path, key: String, rootDir: Path): ResolveOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveOptions]
  }
  @scala.inline
  implicit class ResolveOptionsOps[Self <: ResolveOptions] (val x: Self) extends AnyVal {
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
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
  
}

