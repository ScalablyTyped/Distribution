package typings.jenkins.mod

import typings.jenkins.AnonAdd
import typings.jenkins.AnonBuild
import typings.jenkins.AnonCallback
import typings.jenkins.AnonCallbackCancel
import typings.jenkins.AnonCallbackConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: AnonCallback
  var job: AnonBuild
  var node: AnonCallbackConfig
  var queue: AnonCallbackCancel
  var view: AnonAdd
  def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: AnonCallback,
    info: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
    job: AnonBuild,
    node: AnonCallbackConfig,
    queue: AnonCallbackCancel,
    view: AnonAdd
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction1(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JenkinsAPI]
  }
}

