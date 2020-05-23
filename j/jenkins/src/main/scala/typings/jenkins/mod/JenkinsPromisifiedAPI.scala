package typings.jenkins.mod

import typings.jenkins.anon.Copy
import typings.jenkins.anon.Create
import typings.jenkins.anon.Destroy
import typings.jenkins.anon.Item
import typings.jenkins.anon.Log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: Log
  var job: Copy
  var node: Create
  var queue: Item
  var view: Destroy
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(build: Log, info: () => js.Promise[_], job: Copy, node: Create, queue: Item, view: Destroy): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

