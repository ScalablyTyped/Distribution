package typings.ionic.commandsMod

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.namespaceMod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands", "IonicNamespace")
@js.native
class IonicNamespace protected () extends Namespace {
  def this(hasEnvProject: IonicEnvironmentDeps) = this()
  var _env: IonicEnvironment = js.native
  var _project: js.UndefOr[IProject] = js.native
  def env_=(env: IonicEnvironment): Unit = js.native
  @JSName("env")
  def env_MIonicNamespace: IonicEnvironment = js.native
  def project_=(p: js.UndefOr[IProject]): Unit = js.native
  @JSName("project")
  def project_MIonicNamespace: js.UndefOr[IProject] = js.native
}

