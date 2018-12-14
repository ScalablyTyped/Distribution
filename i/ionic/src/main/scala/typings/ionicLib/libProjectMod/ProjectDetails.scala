package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectDetails")
@js.native
class ProjectDetails protected () extends js.Object {
  def this(hasRootDirectoryArgsE: ProjectDetailsDeps) = this()
  val args: minimistLib.minimistMod.minimistNs.ParsedArgs = js.native
  val e: ProjectDeps = js.native
  val rootDirectory: java.lang.String = js.native
  /* protected */ def determineMultiApp(config: ionicLib.definitionsMod.IMultiProjectConfig): js.Promise[ProjectDetailsMultiAppResult] = js.native
  /* protected */ def determineSingleApp(config: ionicLib.definitionsMod.IProjectConfig): js.Promise[ProjectDetailsSingleAppResult] = js.native
  def getIdFromArgs(): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def getIdFromDefaultProject(config: ionicLib.definitionsMod.IMultiProjectConfig): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def getIdFromPathMatch(config: ionicLib.definitionsMod.IMultiProjectConfig): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def getTypeFromConfig(config: ionicLib.definitionsMod.IProjectConfig): js.Promise[js.UndefOr[ionicLib.definitionsMod.ProjectType]] = js.native
  def getTypeFromDetection(): js.Promise[js.UndefOr[ionicLib.definitionsMod.ProjectType]] = js.native
  def processResult(result: ProjectDetailsResult): scala.Unit = js.native
  def readConfig(p: java.lang.String): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
       * Gather project details from specified configuration.
       *
       * This method will always resolve with a result object, with an array of
       * errors. Use `processResult()` to log warnings & errors.
       */
  def result(): js.Promise[ProjectDetailsResult] = js.native
}

