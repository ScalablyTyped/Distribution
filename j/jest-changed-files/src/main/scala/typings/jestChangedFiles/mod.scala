package typings.jestChangedFiles

import typings.jestChangedFiles.typesMod.ChangedFilesPromise
import typings.jestChangedFiles.typesMod.Options
import typings.jestChangedFiles.typesMod.Repos
import typings.jestTypes.configMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-changed-files", "findRepos")
  @js.native
  def findRepos(roots: js.Array[Path]): js.Promise[Repos] = js.native
  
  @JSImport("jest-changed-files", "getChangedFilesForRoots")
  @js.native
  def getChangedFilesForRoots(roots: js.Array[Path], options: Options): ChangedFilesPromise = js.native
}
