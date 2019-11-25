package typings.jenkins.jenkinsMod

import typings.jenkins.Anon_AddConfig
import typings.jenkins.Anon_BuildConfig
import typings.jenkins.Anon_Cancel
import typings.jenkins.Anon_Config
import typings.jenkins.Anon_DelayGet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: Anon_DelayGet
  var job: Anon_BuildConfig
  var node: Anon_Config
  var queue: Anon_Cancel
  var view: Anon_AddConfig
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: Anon_DelayGet,
    info: () => js.Promise[_],
    job: Anon_BuildConfig,
    node: Anon_Config,
    queue: Anon_Cancel,
    view: Anon_AddConfig
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], info = js.Any.fromFunction0(info), job = job.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

