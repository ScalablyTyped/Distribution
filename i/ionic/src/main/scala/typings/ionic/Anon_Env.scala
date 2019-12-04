package typings.ionic

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Env extends js.Object {
  var env: IonicEnvironment
  var project: js.UndefOr[IProject] = js.undefined
}

object Anon_Env {
  @scala.inline
  def apply(env: IonicEnvironment, project: IProject = null): Anon_Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Env]
  }
}

