package typings.ionic.libSecurityMod

import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityClientDeps extends js.Object {
  val client: IClient
  val token: String
}

object SecurityClientDeps {
  @scala.inline
  def apply(client: IClient, token: String): SecurityClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SecurityClientDeps]
  }
}

