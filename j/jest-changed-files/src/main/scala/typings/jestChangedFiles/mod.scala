package typings.jestChangedFiles

import typings.jestChangedFiles.typesMod.ChangedFilesPromise
import typings.jestChangedFiles.typesMod.Options
import typings.jestChangedFiles.typesMod.Repos
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-changed-files", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def findRepos(roots: js.Array[Path]): js.Promise[Repos] = js.native
  def getChangedFilesForRoots(roots: js.Array[Path], options: Options): ChangedFilesPromise = js.native
}

