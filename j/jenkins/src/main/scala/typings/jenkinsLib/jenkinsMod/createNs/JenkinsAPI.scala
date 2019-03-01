package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: jenkinsLib.Anon_Callback
  var job: jenkinsLib.Anon_Build
  var node: jenkinsLib.Anon_CallbackConfig
  var queue: jenkinsLib.Anon_CallbackCancel
  var view: jenkinsLib.Anon_Add
  def info(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: jenkinsLib.Anon_Callback,
    info: js.Function1[js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit], scala.Unit],
    job: jenkinsLib.Anon_Build,
    node: jenkinsLib.Anon_CallbackConfig,
    queue: jenkinsLib.Anon_CallbackCancel,
    view: jenkinsLib.Anon_Add
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[JenkinsAPI]
  }
}

