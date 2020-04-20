package typings.jestChangedFiles.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCMAdapter extends js.Object {
  def findChangedFiles(cwd: Path, options: Options): js.Promise[js.Array[Path]]
  def getRoot(cwd: Path): js.Promise[Path | Null]
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
}

