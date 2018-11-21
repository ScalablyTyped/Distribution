package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JenkinsAPI extends js.Object {
  var build: jenkinsLib.Anon_Term
  var job: jenkinsLib.Anon_Enable
  var node: jenkinsLib.Anon_EnableName
  var queue: jenkinsLib.Anon_Cancel
  var view: jenkinsLib.Anon_Create
  def info(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

