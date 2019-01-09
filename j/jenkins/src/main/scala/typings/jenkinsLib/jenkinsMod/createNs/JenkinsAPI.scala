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

