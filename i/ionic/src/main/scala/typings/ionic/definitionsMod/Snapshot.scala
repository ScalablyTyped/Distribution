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
    val __obj = js.Dynamic.literal(created = created, id = id, note = note, ref = ref, sha = sha, state = state)
  
    __obj.asInstanceOf[Snapshot]
  }
}

