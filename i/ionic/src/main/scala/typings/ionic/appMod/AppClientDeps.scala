package typings.ionic.appMod

import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppClientDeps extends js.Object {
  val client: IClient
}

object AppClientDeps {
  @scala.inline
  def apply(client: IClient): AppClientDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppClientDeps]
  }
}

