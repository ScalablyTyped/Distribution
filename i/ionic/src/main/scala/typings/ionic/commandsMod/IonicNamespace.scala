package typings.ionic.commandsMod

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionic.libNamespaceMod.Namespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands", "IonicNamespace")
@js.native
class IonicNamespace protected () extends Namespace {
  def this(hasEnvProject: IonicEnvironmentDeps) = this()
  var _env: IonicEnvironment = js.native
  var _project: js.UndefOr[IProject] = js.native
  @JSName("project")
  var project_IonicNamespace: js.UndefOr[IProject] = js.native
}

