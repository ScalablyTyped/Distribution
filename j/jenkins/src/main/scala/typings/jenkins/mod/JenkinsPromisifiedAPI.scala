package typings.jenkins.mod

import typings.jenkins.AnonCopy
import typings.jenkins.AnonCreate
import typings.jenkins.AnonDestroy
import typings.jenkins.AnonItem
import typings.jenkins.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: AnonLog
  var job: AnonCopy
  var node: AnonCreate
  var queue: AnonItem
  var view: AnonDestroy
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: AnonLog,
    info: () => js.Promise[_],
    job: AnonCopy,
    node: AnonCreate,
    queue: AnonItem,
    view: AnonDestroy
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

