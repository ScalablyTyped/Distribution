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
  def info(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: jenkinsLib.Anon_Callback,
    info: js.Function2[/* err */ stdLib.Error, /* data */ js.Any, scala.Unit] => scala.Unit,
    job: jenkinsLib.Anon_Build,
    node: jenkinsLib.Anon_CallbackConfig,
    queue: jenkinsLib.Anon_CallbackCancel,
    view: jenkinsLib.Anon_Add
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build, info = js.Any.fromFunction1(info), job = job, node = node, queue = queue, view = view)
  
    __obj.asInstanceOf[JenkinsAPI]
  }
}

