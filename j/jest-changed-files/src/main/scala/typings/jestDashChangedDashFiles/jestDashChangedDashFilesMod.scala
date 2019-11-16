package typings.jestDashChangedDashFiles

import typings.jestDashChangedDashFiles.buildTypesMod.ChangedFiles
import typings.jestDashChangedDashFiles.buildTypesMod.Options
import typings.jestDashChangedDashFiles.buildTypesMod.Repos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-changed-files", JSImport.Namespace)
@js.native
object jestDashChangedDashFilesMod extends js.Object {
  def findRepos(roots: js.Array[String]): js.Promise[Repos] = js.native
  def getChangedFilesForRoots(roots: js.Array[String], options: Options): js.Promise[ChangedFiles] = js.native
}

