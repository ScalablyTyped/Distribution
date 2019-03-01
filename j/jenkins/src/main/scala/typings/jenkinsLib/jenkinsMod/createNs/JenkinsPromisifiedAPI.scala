package typings
package jenkinsLib.jenkinsMod.createNs

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
    info: js.Function0[js.Promise[_]],
    job: jenkinsLib.Anon_BuildConfig,
    node: jenkinsLib.Anon_Config,
    queue: jenkinsLib.Anon_Cancel,
    view: jenkinsLib.Anon_AddConfig
  ): JenkinsPromisifiedAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[JenkinsPromisifiedAPI]
  }
}

