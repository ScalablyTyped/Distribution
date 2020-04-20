package typings.ionic.userMod

import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserClientDeps extends js.Object {
  val client: IClient
}

object UserClientDeps {
  @scala.inline
  def apply(client: IClient): UserClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserClientDeps]
  }
}

