package typings.jenkins.mod

import typings.jenkins.anon.BaseUrl
import typings.jenkins.anon.CrumbIssuer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jenkins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): JenkinsAPI = js.native
  def apply(opts: BaseUrl): JenkinsAPI = js.native
  def apply(opts: CrumbIssuer): JenkinsPromisifiedAPI = js.native
}
