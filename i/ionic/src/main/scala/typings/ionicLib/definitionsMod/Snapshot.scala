package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var created: java.lang.String
  var id: java.lang.String
  var note: java.lang.String
  var ref: java.lang.String
  var sha: java.lang.String
  var state: java.lang.String
}

object Snapshot {
  @scala.inline
  def apply(
    created: java.lang.String,
    id: java.lang.String,
    note: java.lang.String,
    ref: java.lang.String,
    sha: java.lang.String,
    state: java.lang.String
  ): Snapshot = {
    val __obj = js.Dynamic.literal(created = created, id = id, note = note, ref = ref, sha = sha, state = state)
  
    __obj.asInstanceOf[Snapshot]
  }
}

