package typings.jestSnapshot

import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/SnapshotResolver", JSImport.Namespace)
@js.native
object snapshotResolverMod extends js.Object {
  
  val DOT_EXTENSION: String = js.native
  
  val EXTENSION: /* "snap" */ String = js.native
  
  def buildSnapshotResolver(config: ProjectConfig): SnapshotResolver = js.native
  
  def isSnapshotPath(path: String): Boolean = js.native
  
  @js.native
  trait SnapshotResolver extends js.Object {
    
    def resolveSnapshotPath(testPath: Path): Path = js.native
    def resolveSnapshotPath(testPath: Path, extension: String): Path = js.native
    
    def resolveTestPath(snapshotPath: Path): Path = js.native
    def resolveTestPath(snapshotPath: Path, extension: String): Path = js.native
    
    var testPathForConsistencyCheck: String = js.native
  }
}
