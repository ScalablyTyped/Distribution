package typings.jenkins.mod

import typings.jenkins.AnonBaseUrl
import typings.jenkins.AnonBaseUrlCrumbIssuer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jenkins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): JenkinsAPI = js.native
  def apply(opts: AnonBaseUrl): JenkinsAPI = js.native
  def apply(opts: AnonBaseUrlCrumbIssuer): JenkinsPromisifiedAPI = js.native
}

