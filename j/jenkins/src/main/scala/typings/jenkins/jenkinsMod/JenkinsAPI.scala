package typings.jenkins.jenkinsMod

import typings.jenkins.Anon_Add
import typings.jenkins.Anon_Build
import typings.jenkins.Anon_Callback
import typings.jenkins.Anon_CallbackCancel
import typings.jenkins.Anon_CallbackConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsAPI extends js.Object {
  var build: Anon_Callback
  var job: Anon_Build
  var node: Anon_CallbackConfig
  var queue: Anon_CallbackCancel
  var view: Anon_Add
  def info(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
}

object JenkinsAPI {
  @scala.inline
  def apply(
    build: Anon_Callback,
    info: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
    job: Anon_Build,
    node: Anon_CallbackConfig,
    queue: Anon_CallbackCancel,
    view: Anon_Add
  ): JenkinsAPI = {
    val __obj = js.Dynamic.literal(build = build, info = js.Any.fromFunction1(info), job = job, node = node, queue = queue, view = view)
  
    __obj.asInstanceOf[JenkinsAPI]
  }
}

