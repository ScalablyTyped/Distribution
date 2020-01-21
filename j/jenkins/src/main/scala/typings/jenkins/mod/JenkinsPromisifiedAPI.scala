package typings.jenkins.mod

import typings.jenkins.AnonAddConfig
import typings.jenkins.AnonBuildConfig
import typings.jenkins.AnonCancel
import typings.jenkins.AnonConfig
import typings.jenkins.AnonDelayGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: AnonDelayGet
  var job: AnonBuildConfig
  var node: AnonConfig
  var queue: AnonCancel
  var view: AnonAddConfig
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: AnonDelayGet,
    info: () => js.Promise[_],
    job: AnonBuildConfig,
    node: AnonConfig,
    queue: AnonCancel,
    view: AnonAddConfig
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

