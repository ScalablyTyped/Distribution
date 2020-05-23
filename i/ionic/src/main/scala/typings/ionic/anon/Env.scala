package typings.ionic.anon

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var env: IonicEnvironment
  var project: js.UndefOr[IProject] = js.undefined
}

object Env {
  @scala.inline
  def apply(env: IonicEnvironment, project: IProject = null): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
}

