package typings
package jenkinsLib.jenkinsMod.createNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsPromisifiedAPI extends js.Object {
  var build: jenkinsLib.Anon_Delay
  var job: jenkinsLib.Anon_BuildConfig
  var node: jenkinsLib.Anon_Config
  var queue: jenkinsLib.Anon_Cancel
  var view: jenkinsLib.Anon_AddConfig
  def info(): js.Promise[_]
}

