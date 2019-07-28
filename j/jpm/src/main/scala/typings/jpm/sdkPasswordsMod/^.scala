package typings.jpm.sdkPasswordsMod

import typings.jpm.Anon_Credentials
import typings.jpm.Anon_Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/passwords", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def remove(options: Credential with Anon_Error): Unit = js.native
  def search(options: Anon_Credentials): Unit = js.native
  def store(options: Credential with Anon_Error): Unit = js.native
}

