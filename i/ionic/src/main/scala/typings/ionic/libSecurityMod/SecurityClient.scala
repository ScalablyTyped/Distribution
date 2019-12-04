package typings.ionic.libSecurityMod

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.ResourceClientLoad
import typings.ionic.definitionsMod.SecurityProfile
import typings.ionic.libHttpMod.ResourceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/security", "SecurityClient")
@js.native
class SecurityClient protected ()
  extends ResourceClient
     with ResourceClientLoad[SecurityProfile] {
  def this(hasClientToken: SecurityClientDeps) = this()
  val client: IClient = js.native
  val token: String = js.native
  def load(tag: String): js.Promise[SecurityProfile] = js.native
}

