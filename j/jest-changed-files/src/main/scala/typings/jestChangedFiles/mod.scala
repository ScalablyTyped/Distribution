package typings.jestChangedFiles

import typings.jestChangedFiles.typesMod.ChangedFiles
import typings.jestChangedFiles.typesMod.Options
import typings.jestChangedFiles.typesMod.Repos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-changed-files", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def findRepos(roots: js.Array[String]): js.Promise[Repos] = js.native
  def getChangedFilesForRoots(roots: js.Array[String], options: Options): js.Promise[ChangedFiles] = js.native
}

