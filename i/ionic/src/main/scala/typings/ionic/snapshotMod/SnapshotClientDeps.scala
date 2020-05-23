package typings.ionic.snapshotMod

import typings.ionic.anon.IdString
import typings.ionic.definitionsMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotClientDeps extends js.Object {
  val app: IdString
  val client: IClient
  val token: String
}

object SnapshotClientDeps {
  @scala.inline
  def apply(app: IdString, client: IClient, token: String): SnapshotClientDeps = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotClientDeps]
  }
}

