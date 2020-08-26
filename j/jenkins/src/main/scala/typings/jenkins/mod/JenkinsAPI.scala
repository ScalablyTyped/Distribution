package typings.jenkins.mod

import typings.jenkins.anon.Add
import typings.jenkins.anon.Build
import typings.jenkins.anon.Cancel
import typings.jenkins.anon.Config
import typings.jenkins.anon.Get
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JenkinsAPI extends js.Object {
  var build: Get = js.native
  var job: Build = js.native
  var node: Config = js.native
  var queue: Cancel = js.native
  var view: Add = js.native
  def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: Get,
    info: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
    job: Build,
    node: Config,
    queue: Cancel,
    view: Add
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction1(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsAPI]
  }
  @scala.inline
  implicit class JenkinsAPIOps[Self <: JenkinsAPI] (val x: Self) extends AnyVal {
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
    def setBuild(value: Get): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = this.set("info", js.Any.fromFunction1(value))
    @scala.inline
    def setJob(value: Build): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Config): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: Cancel): Self = this.set("queue", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: Add): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

