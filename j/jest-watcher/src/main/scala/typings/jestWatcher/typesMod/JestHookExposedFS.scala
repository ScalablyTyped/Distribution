package typings.jestWatcher.typesMod

import typings.jestWatcher.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHookExposedFS extends js.Object {
  var projects: js.Array[Config] = js.native
}

object JestHookExposedFS {
  @scala.inline
  def apply(projects: js.Array[Config]): JestHookExposedFS = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestHookExposedFS]
  }
  @scala.inline
  implicit class JestHookExposedFSOps[Self <: JestHookExposedFS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectsVarargs(value: Config*): Self = this.set("projects", js.Array(value :_*))
    @scala.inline
    def setProjects(value: js.Array[Config]): Self = this.set("projects", value.asInstanceOf[js.Any])
  }
  
}

