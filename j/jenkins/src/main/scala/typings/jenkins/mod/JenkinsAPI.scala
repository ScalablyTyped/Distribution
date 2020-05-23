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

trait JenkinsAPI extends js.Object {
  var build: Get
  var job: Build
  var node: Config
  var queue: Cancel
  var view: Add
  def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
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
}

