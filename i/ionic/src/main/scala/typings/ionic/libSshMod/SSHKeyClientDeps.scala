package typings.ionic.libSshMod

import typings.ionic.AnonIdNumber
import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSHKeyClientDeps extends js.Object {
  val client: IClient
  val token: String
  val user: AnonIdNumber
}

object SSHKeyClientDeps {
  @scala.inline
  def apply(client: IClient, token: String, user: AnonIdNumber): SSHKeyClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SSHKeyClientDeps]
  }
}

