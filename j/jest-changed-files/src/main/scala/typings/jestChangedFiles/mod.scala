package typings.jestChangedFiles

import typings.jestChangedFiles.typesMod.ChangedFilesPromise
import typings.jestChangedFiles.typesMod.Options
import typings.jestChangedFiles.typesMod.Repos
import typings.jestTypes.configMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-changed-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRepos(roots: js.Array[Path]): js.Promise[Repos] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRepos")(roots.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Repos]]
  
  inline def getChangedFilesForRoots(roots: js.Array[Path], options: Options): ChangedFilesPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("getChangedFilesForRoots")(roots.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ChangedFilesPromise]
}
