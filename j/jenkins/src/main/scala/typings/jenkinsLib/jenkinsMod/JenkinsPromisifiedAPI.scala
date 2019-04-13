package typings
package jenkinsLib.jenkinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: jenkinsLib.Anon_DelayGet
  var job: jenkinsLib.Anon_BuildConfig
  var node: jenkinsLib.Anon_Config
  var queue: jenkinsLib.Anon_Cancel
  var view: jenkinsLib.Anon_AddConfig
  def info(): js.Promise[_]
}

object JenkinsPromisifiedAPI {
  @scala.inline
  def apply(
    build: jenkinsLib.Anon_DelayGet,
    info: () => js.Promise[_],
    job: jenkinsLib.Anon_BuildConfig,
    node: jenkinsLib.Anon_Config,
    queue: jenkinsLib.Anon_Cancel,
    view: jenkinsLib.Anon_AddConfig
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal(build = build, info = js.Any.fromFunction0(info), job = job, node = node, queue = queue, view = view)
  
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

