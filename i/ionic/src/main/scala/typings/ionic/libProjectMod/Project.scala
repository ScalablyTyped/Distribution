package typings.ionic.libProjectMod

import org.scalablytyped.runtime.StringDictionary
import typings.ionic.definitionsMod.IIntegration
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ProjectIntegration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project", "Project")
@js.native
abstract class Project protected () extends IProject {
  def this(details: ProjectDetailsResult, e: ProjectDeps) = this()
  
  @JSName("config")
  def config_MProject: ProjectConfig = js.native
  
  @JSName("directory")
  def directory_MProject: String = js.native
  
  val e: ProjectDeps = js.native
  
  @JSName("filePath")
  def filePath_MProject: String = js.native
  
  /* protected */ def getIntegrations(): js.Promise[js.Array[IIntegration[ProjectIntegration]]] = js.native
  
  var originalConfigFile: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  def packageJsonPath: String = js.native
  
  @JSName("pathPrefix")
  def pathPrefix_MProject: js.Array[String] = js.native
}
