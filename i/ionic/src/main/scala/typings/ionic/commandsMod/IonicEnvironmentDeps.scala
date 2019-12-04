package typings.ionic.commandsMod

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicEnvironmentDeps extends js.Object {
  val env: IonicEnvironment
  val project: js.UndefOr[IProject] = js.undefined
}

object IonicEnvironmentDeps {
  @scala.inline
  def apply(env: IonicEnvironment, project: IProject = null): IonicEnvironmentDeps = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironmentDeps]
  }
}

