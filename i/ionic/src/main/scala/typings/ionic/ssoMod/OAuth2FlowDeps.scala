package typings.ionic.ssoMod

import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2FlowDeps extends js.Object {
  val client: IClient
}

object OAuth2FlowDeps {
  @scala.inline
  def apply(client: IClient): OAuth2FlowDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2FlowDeps]
  }
}

