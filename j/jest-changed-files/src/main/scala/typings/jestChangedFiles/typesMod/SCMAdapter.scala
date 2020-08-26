package typings.jestChangedFiles.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCMAdapter extends js.Object {
  def findChangedFiles(cwd: Path, options: Options): js.Promise[js.Array[Path]] = js.native
  def getRoot(cwd: Path): js.Promise[Path | Null] = js.native
}

object SCMAdapter {
  @scala.inline
  def apply(
    findChangedFiles: (Path, Options) => js.Promise[js.Array[Path]],
    getRoot: Path => js.Promise[Path | Null]
  ): SCMAdapter = {
    val __obj = js.Dynamic.literal(findChangedFiles = js.Any.fromFunction2(findChangedFiles), getRoot = js.Any.fromFunction1(getRoot))
    __obj.asInstanceOf[SCMAdapter]
  }
  @scala.inline
  implicit class SCMAdapterOps[Self <: SCMAdapter] (val x: Self) extends AnyVal {
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
    def setFindChangedFiles(value: (Path, Options) => js.Promise[js.Array[Path]]): Self = this.set("findChangedFiles", js.Any.fromFunction2(value))
    @scala.inline
    def setGetRoot(value: Path => js.Promise[Path | Null]): Self = this.set("getRoot", js.Any.fromFunction1(value))
  }
  
}

