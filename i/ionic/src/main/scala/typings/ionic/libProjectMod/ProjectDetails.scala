package typings.ionic.libProjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.definitionsMod.IMultiProjectConfig
import typings.ionic.definitionsMod.IProjectConfig
import typings.ionic.definitionsMod.ProjectType
import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project", "ProjectDetails")
@js.native
class ProjectDetails protected () extends js.Object {
  def this(hasRootDirectoryArgsE: ProjectDetailsDeps) = this()
  val args: ParsedArgs = js.native
  val e: ProjectDeps = js.native
  val rootDirectory: String = js.native
  /* protected */ def determineMultiApp(config: IMultiProjectConfig): js.Promise[ProjectDetailsMultiAppResult] = js.native
  /* protected */ def determineSingleApp(config: IProjectConfig): js.Promise[ProjectDetailsSingleAppResult] = js.native
  def getIdFromArgs(): js.Promise[js.UndefOr[String]] = js.native
  def getIdFromDefaultProject(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
  def getIdFromPathMatch(config: IMultiProjectConfig): js.Promise[js.UndefOr[String]] = js.native
  def getTypeFromConfig(config: IProjectConfig): js.Promise[js.UndefOr[ProjectType]] = js.native
  def getTypeFromDetection(): js.Promise[js.UndefOr[ProjectType]] = js.native
  def processResult(result: ProjectDetailsResult): Unit = js.native
  def readConfig(p: String): js.Promise[StringDictionary[_]] = js.native
  /**
    * Gather project details from specified configuration.
    *
    * This method will always resolve with a result object, with an array of
    * errors. Use `processResult()` to log warnings & errors.
    */
  def result(): js.Promise[ProjectDetailsResult] = js.native
}

