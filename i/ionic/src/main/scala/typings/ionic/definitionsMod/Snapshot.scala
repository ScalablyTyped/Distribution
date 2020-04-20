package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var created: String
  var id: String
  var note: String
  var ref: String
  var sha: String
  var state: String
}

object Snapshot {
  @scala.inline
  def apply(created: String, id: String, note: String, ref: String, sha: String, state: String): Snapshot = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

